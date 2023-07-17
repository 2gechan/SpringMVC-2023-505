package com.callor.bbs.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileDto {
	private long i_seq;
	private long i_bseq;
	private String i_originalName;
	private String i_uploadName;

}
