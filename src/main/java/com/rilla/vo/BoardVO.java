package com.rilla.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardVO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int hit;

}
