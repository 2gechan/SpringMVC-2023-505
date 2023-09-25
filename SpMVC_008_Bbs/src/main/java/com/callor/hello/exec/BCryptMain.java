package com.callor.hello.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class BCryptMain {
	
	public static void main(String[] args) {
		
		// 시스템 환경변수를 불러온다.
		Map<String, String> envList = System.getenv();
		
		// Map 데이터에서 key 만 List로 추출하기
//		List<String> envKeys = new ArrayList<>(envList.keySet());
//		
//		for(String env : envKeys) {
//			System.out.printf("%s : %s\n", env, envList.get(env));
//		}
		
		System.out.println(envList.get("callor.com"));
		
		String saltKey = envList.get("callor.com");
		
		// 암호문을 만드는 도구
		StandardPBEStringEncryptor pbe = new StandardPBEStringEncryptor();
		
		// MD5와 DES 방식으로 암호화를 하겠다.
		pbe.setAlgorithm("PBEWithMD5AndDES");
		pbe.setPassword(saltKey);
		
		// plan Text를 암호화 시키는 method
		String encString = pbe.encrypt("callor");
		System.out.println(encString);
		
		String s1 = "r/Yn6vrKM9L5lQFrxWMKRQ==";
		String s2 = "GiOtjA2ya8IygBJJ4wivNQ==";
		String s3 = "FQjcz0UL8xN+wzne8+bYww==";
		
		// 암호화된 키를 복호화
		System.out.println(pbe.decrypt(s1));
		System.out.println(pbe.decrypt(s2));
		System.out.println(pbe.decrypt(s3));
		
		String savePath = "./src/main/webapp/WEB-INF/spring/properties/db_info.properties";
		
		try {
			PrintWriter out = new PrintWriter(savePath);
			out.println("username=callor");
			out.println("password=12345");
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
