package com.callor.bus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private String u_id; 		//	nVARCHAR2(25)
	private String u_password;  //	nVARCHAR2(30)
	private String u_name;		// nVARCHAR2(30)
	private String u_tel;	// VARCHAR2(13)
	private String u_gender;	//	nVARCHAR2(2)


}
