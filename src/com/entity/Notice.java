package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 公告
 * 
 * @author Chen
 *
 */
public class Notice implements Serializable {

	private static final long serialVersionUID = 7515434380337871780L;

	private String id;// 公告表id
	private String content;// 公告内容
	private Date ndate;// 发布日期
	private String title;// 公告题目
	private String uper;// 公告发布者
	private Admin admin;

	public Notice() {
	}

	public Notice(String id, String content, Date ndate, String title, String uper, Admin admin) {
		this.id = id;
		this.content = content;
		this.ndate = ndate;
		this.title = title;
		this.uper = uper;
		this.admin = admin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getNdate() {
		return ndate;
	}

	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUper() {
		return uper;
	}

	public void setUper(String uper) {
		this.uper = uper;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", content=" + content + ", ndate=" + ndate + ", title=" + title + ", uper=" + uper
				+ ", admin=" + admin + "]";
	}

}
