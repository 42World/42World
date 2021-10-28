package com.world.domain.minihome.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoVO {
	
	private int photoNo;
	private String memberNo;
	private Date uploadDate;
	private String title;
	private String filename;
	private String photoContent;
	private int cnt;
	private String folder;
	private String value;
	@Override
	public String toString() {
		return "PhotoVO [photoNo=" + photoNo + ", userId=" + memberNo + ", uploadDate=" + uploadDate + ", title=" + title
				+ ", filename=" + filename + ", photoContent=" + photoContent + ", cnt=" + cnt + ", folder=" + folder
				+ ", value=" + value + "]";
	}
	public PhotoVO() {}
	public PhotoVO(int photoNo,String memberNo,String value,Date uploadDate,int cnt,String filename,String title,String photoContent,String folder) {
		this.photoContent=photoContent;
		this.photoNo=photoNo;
		this.memberNo=memberNo;
		this.value=value;
		this.uploadDate=uploadDate;
		this.cnt=cnt;
		this.filename=filename;
		this.title=title;
		this.folder=folder;
		
	}


	
	
	
	
}
