package com.callor.bbs.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.bbs.config.QualifierConfig;
import com.callor.bbs.models.FileDto;

import lombok.extern.slf4j.Slf4j;

/*
 * V1 클래스에는 fileUp(), filesUp(), delete() method가 있다
 * 이 method 들을 상속받아서 사용하겠다.
 * 
 * V1 클래스에 protected로 선언된 2개의 변수(객체)를 여기에서
 * 상속받아서 사용하겠다.
 * 
 * 클래스를 상속받을 때 V1 클래스의 생성자는 상속받지 않는다.
 */
@Slf4j
// Spring
@Service(QualifierConfig.SERIVCE.FILE_V2)
public class FileServiceImplV2 extends FileServiceImplV1 {

	// fileup-context.xml에 선언된 2개의 String bean 값을
	// 사용할 수 있도록 주입해달라
	protected final String windowsPath;
	protected final String winPath;
	protected final String macPath;
	protected final String macHome;

	public FileServiceImplV2(ResourceLoader resource, String windowsPath, String winPath, String macPath,
			String macHome) {
		/*
		 * super() 상속받은 클래스의 생성자에게 무언가 전달할 때
		 * 사용하는 method 일종의 전달자 V1 클래스의 생성자에게 resource
		 * 객체를 전달하여 final로 선언된 2개의 변수(객체)를 초기화 해달라라고 요청
		 */
		super(resource);

		this.windowsPath = windowsPath;
		this.winPath = winPath;
		this.macPath = macPath;
		this.macHome = macHome;
	}

	/*
	 * V1.fileUp() method를 다시 정의 하겠다.
	 */
	@Override
	public String fileUp(MultipartFile file) throws Exception {

		log.debug("winPath : {}", winPath);
		log.debug("macPath : {}", macPath);

//		String fileUpPath = winPath;
//		File path = new File(macHome);
//		// macHome 폴더가 있는지
//		if(path.exists()) {
//			fileUpPath = macHome + macPath;
//		}
		String fileUpPath = macHome + macPath;
		File path = new File(windowsPath);
		if (path.exists()) {
			fileUpPath = winPath;
		}

		// 만약 System에 Upload할 path가 없으면 생성하라
		path = new File(fileUpPath);
		if (!path.exists()) {
			path.mkdirs();
		}

		// 실제 업로드될 파일 이름
		String fileName = file.getOriginalFilename();

		// Java 제공하는 UUID 생성하는 코드
		String strUUID = UUID.randomUUID().toString();
		// image.jpg0000-0000-0000

		// UUID 키값을 파일이름 앞에 부착하여 새로운 이름으로 변형
		fileName = String.format("%s-%s", strUUID, fileName);
		File upLoadFile = new File(fileUpPath, fileName);
		file.transferTo(upLoadFile);

		return fileName;
	}
	
	@Override
	public List<FileDto> filesUp(MultipartHttpServletRequest files) throws Exception {
		
		/*
		 * 멀티파일을 각 파일로 분리하여 fileUp() 에게 파일을 업로드하도록
		 * 요청하고, 원본이름과 변경된 이름을 받아서 returnFiles를 만들기
		 */
		List<MultipartFile> fileList = files.getFiles("b_images");
		
		List<FileDto> returnFiles = new ArrayList<FileDto>();
		for(MultipartFile file : fileList) {
			FileDto fileDto = FileDto.builder()
			.i_originalName(file.getOriginalFilename())
			.i_uploadName(this.fileUp(file)).build();
			
//			fileDto.setI_originalName(file.getOriginalFilename());
//			fileDto.setI_uploadName(this.fileUp(file));
			returnFiles.add(fileDto);
		}
		return returnFiles;
	}

}
