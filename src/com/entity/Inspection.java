package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 巡查
 * 
 * @author Chen
 *
 */
public class Inspection implements Serializable {

	private static final long serialVersionUID = 7515434380337871780L;

	private String id;// 巡查表id
	private String person;// 巡查人
	private String type;// 类别
	private Date itime;// 时间
	private String conductor;// 处理人
	private String party;// 当事人
	private String result;// 巡查结果
	private String memo;// 备注
	private Admin admin;

	public Inspection() {
	}

	public Inspection(String id, String person, String type, Date itime, String conductor, String party, String result,
			String memo, Admin admin) {
		this.id = id;
		this.person = person;
		this.type = type;
		this.itime = itime;
		this.conductor = conductor;
		this.party = party;
		this.result = result;
		this.memo = memo;
		this.admin = admin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getItime() {
		return itime;
	}

	public void setItime(Date itime) {
		this.itime = itime;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "InspectionAction [id=" + id + ", person=" + person + ", type=" + type + ", itime=" + itime + ", conductor="
				+ conductor + ", party=" + party + ", result=" + result + ", memo=" + memo + ", admin=" + admin + "]";
	}

}
