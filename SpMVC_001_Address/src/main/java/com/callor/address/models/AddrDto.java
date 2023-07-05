package com.callor.address.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*
 * Spring Project 에서 DB와 연동되는 경우
 * Dto(VO)변수는 snake case로 설정한다
 * DB에서 각 칼럼명(속성명)은 대소문자 구분이 없다
 * 그래서 Camel Case 이름을 명명하면 구분이 애매해진다.
 * DB에서 칼럼명은 보통 snake case로 붙이는데
 * Dto의 변수도 같은 형식으로 만든다.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor // NoArgs, 매개변수가 없다 -> Super 생성자
@AllArgsConstructor // AllArgs, 모든 매개변수 -> 매개변수 생성자
public class AddrDto {
	
	private String a_id;
	private String a_name;
	private String a_tel;
	private String a_addr;

	private List<HobbyByAidVO> hobbyList;
}
