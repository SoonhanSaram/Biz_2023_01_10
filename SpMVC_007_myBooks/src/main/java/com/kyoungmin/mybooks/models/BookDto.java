package com.kyoungmin.mybooks.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	private String title; //	String	
	private String link;//	String	
	private String image;//	String	
	private String author;//	String	
	private String discount;//	Integer	
	private String publisher;//	String	
	private String isbn;//	Integer	ISBN
	private String description;//	String	
	private String pubdate;//	dateTime
}
