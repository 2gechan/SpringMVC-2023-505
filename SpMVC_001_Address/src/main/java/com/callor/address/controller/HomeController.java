package com.callor.address.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.address.models.AddrDto;
import com.callor.address.service.AddrService;

/*
 * Controller class
 * @Controller Annotation이 부착된 class
 * Client 로 부터 Request(요청)이 다다르면, 어디로 요청을 전달할지
 * Routing 역할을 하는 class
 */
@Controller
public class HomeController {

	protected final AddrService addrService;

	public HomeController(AddrService addrService) {
		this.addrService = addrService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(String message , Model model) {

		model.addAttribute("MSG", message);
		List<AddrDto> addrList = addrService.selectAll();
		model.addAttribute("ADDRS", addrList);

		return "home";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<AddrDto> list() {
		List<AddrDto> addrList = addrService.selectAll();
		return addrList;

	}

	/*
	 * localhost:8080/address/insert 로 요청이 오면 addr/input.jsp 파일을 열어서 Response 하도록
	 * method 생성
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model) {

		model.addAttribute("BODY", "INPUT");

		/*
		 * Controller 의 문자열 method에서 문자열을 return하면 "/views/문자열.jsp" 파일을 rendering하여
		 * Client로 Response를 하라 라는 의미
		 */
		return "home";
	}

	/*
	 * produces Server가 Browser에 데이터를 응답할 때 한글이 포함되어 있으면 Encoding을 하여서 보내라 View에
	 * rendering을 할 때는 의미가 없다
	 * 
	 * @ResponseBody가 설정되어 있을 때
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	/*
	 * Controller의 method에 @ResponseBody Annotation이 부착되면 문자열을 그대로(direct) Client로
	 * Response하라 라는 의미 JSP파일을 rendering하지 않는다. 단순하게 데이터를 확인하기 위한 용도로 사용할 수 있다.
	 */
	// @ResponseBody
	/*
	 * public String insert(String a_id, String a_name, String a_tel, String a_addr)
	 * {
	 * 
	 * return String.format("이름 : %s, 전화번호 : %s, 주소 : %s", a_name, a_tel, a_addr); }
	 */
	public String insert(@ModelAttribute AddrDto addrDto) {

		addrService.insert(addrDto);

		// 데이터를 만들고 view를 생성하여 client에게 response 하는
		// URL이 이미 있으니 client에게 해당 URL 주소로 재요청을 하도록 리다이렉트
		return "redirect:/";
		// return String.format("이름 : %s, 전화번호 : %s, 주소 : %s", addrDto.getA_name(),
		// addrDto.getA_tel(), addrDto.getA_addr());
	}

	@RequestMapping(value = "/insert/test", method = RequestMethod.GET)
	public String insert() {

		return "addr/input";
	}

	@RequestMapping(value = "/id_check", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(String id) {

		return addrService.idCheck(id);

		/*
		 * AddrDto addrDto = addrService.findById(id); if(addrDto == null ) { return
		 * "OK"; } else if(addrDto.getA_id().equals(id)) { return "FAIL"; } else {
		 * return "FAIL"; }
		 */
	}

	/*
	 * localhost:8080/addr/detail?id=A0001 형식으로 request가 오면 id=A0001에 설정된 A0001 값을
	 * id 매개변수로 받는다. URL : localhost:8080/addr queryString : detail?id=A0001
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model, String id) {
		// request에 설정된 id 값으로 DB table에서 주소 정보를 Select
		AddrDto addrDto = addrService.findById(id);

		// select된 주소를 model에 담아서 view로 전달
		model.addAttribute("ADDR", addrDto);

		// home.jsp에 include되어 보여질 화면 세팅
		model.addAttribute("BODY", "DETAIL");
		return "home";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String id) {

		int result = addrService.delete(id);

		if (result > 0) {
			return "redirect:/";
		} else {
			// 삭제에 실패했을 경우
			// 현재 id의 detail 화면으로 되돌아 가라
			return "redirect:/detail?id=" + id;
		}

	}

	// 데이터 Update할 화면 보여주기
	// Spring에서는 RequestMapping을 참조하여
	// update Getter method라고 부른다.
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String id, Model model) {

		// 변경할 주소 데이터 Select하여 model에 담기
		AddrDto dto = addrService.findById(id);
		model.addAttribute("ADDR", dto);
		model.addAttribute("BODY", "UPDATE");

		return "home";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute AddrDto dto) {

		int result = addrService.update(dto);
		String id = dto.getA_id();
		if (result > 0) {
			return "redirect:/detail?id=" + id;
		} else {
			return "redirect:/update?id=" + id;
		}
	}

}
