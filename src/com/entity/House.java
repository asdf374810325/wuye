package com.entity;

import java.io.Serializable;

/**
 * 房产
 * 
 * @author Chen
 *
 */
public class House implements Serializable {

	private static final long serialVersionUID = 7515434380337871780L;

	private String id;// 房产表
	private String num;// 门牌号
	private String dep;// 楼号
	private String type;// 类型
	private String area;// 地区
	private String sell;// 出售状况
	private String unit;// 单元
	private String floor;// 楼层
	private String direction;// 朝向
	private String memo;// 备注
	private String ownerid;// 业主编号
	private CustomAccount customAccount;

	public House() {
	}

	public House(String id, String num, String dep, String type, String area, String sell, String unit, String floor,
			String direction, String memo, String ownerid, CustomAccount customAccount) {
		this.id = id;
		this.num = num;
		this.dep = dep;
		this.type = type;
		this.area = area;
		this.sell = sell;
		this.unit = unit;
		this.floor = floor;
		this.direction = direction;
		this.memo = memo;
		this.ownerid = ownerid;
		this.customAccount = customAccount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}

	public CustomAccount getCustomAccount() {
		return customAccount;
	}

	public void setCustomAccount(CustomAccount customAccount) {
		this.customAccount = customAccount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", num=" + num + ", dep=" + dep + ", type=" + type + ", area=" + area + ", sell="
				+ sell + ", unit=" + unit + ", floor=" + floor + ", direction=" + direction + ", memo=" + memo
				+ ", ownerid=" + ownerid + ", customAccount=" + customAccount + "]";
	}

}
