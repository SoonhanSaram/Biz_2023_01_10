package com.kyoungmin.contact.models;

/*
 * 주소록 관리
 * id, 이름, 전화번호, 주소, 관계
 */
public class AddrVO {
	private String ad_id;
	private String ad_name;
	private String ad_tel;
	private String ad_addr;
	private String ad_relation;
	
	// private 으로 설정된 속성변수(멤버변수)들에
	// 접근하기 위한 getter, setter method
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_tel() {
		return ad_tel;
	}
	public void setAd_tel(String ad_tel) {
		this.ad_tel = ad_tel;
	}
	public String getAd_addr() {
		return ad_addr;
	}
	public void setAd_addr(String ad_addr) {
		this.ad_addr = ad_addr;
	}
	public String getAd_relation() {
		return ad_relation;
	}
	public void setAd_relation(String ad_relation) {
		this.ad_relation = ad_relation;
	}
	
}
