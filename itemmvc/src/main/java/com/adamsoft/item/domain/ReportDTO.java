package com.adamsoft.item.domain;

import org.springframework.web.multipart.MultipartFile;

public class ReportDTO {
	private String name;
	//file  은 MultipartFile로 생성
	private MultipartFile pictureurl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getPictureurl() {
		return pictureurl;
	}
	public void setPictureurl(MultipartFile pictureurl) {
		this.pictureurl = pictureurl;
	}
	@Override
	public String toString() {
		return "ReportDTO [name=" + name + ", pictureurl=" + pictureurl + "]";
	}
	
	
}
