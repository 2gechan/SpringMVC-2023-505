package com.callor.hello.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BBsDto {
	
	private long b_seq; // bigint
	private long b_pseq; //	bigint
	private String b_date; //	varchar(10)
	private String b_time; //	varchar(10)
	private String b_username; //	varchar(125)
	private String b_subject; //	varchar(125)
	private String b_content; //	text
	private int b_count; //	int
	private String b_image; //	varchar(125)

}
