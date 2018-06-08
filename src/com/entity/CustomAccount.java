package com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 业主账户表
 *
 * @author Chen
 */
public class CustomAccount implements Serializable {

    private static final long serialVersionUID = 7515434380337871780L;

    private String accountid;// 业主账户表id
    private String username;// 用户名
    private String password;// 密码
    private String ownerid;// 业主编号
    private String carid;// 车牌号

    // 房产表
    private Set<House> house = new HashSet<House>();

    // 报修表
    private Set<Maintain> maintain = new HashSet<Maintain>();

    public CustomAccount() {
    }

    public CustomAccount(String accountid, String username, String password, String ownerid, String carid,
                         Set<House> house, Set<Maintain> maintain) {
        this.accountid = accountid;
        this.username = username;
        this.password = password;
        this.ownerid = ownerid;
        this.carid = carid;
        this.house = house;
        this.maintain = maintain;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public Set<House> getHouse() {
        return house;
    }

    public void setHouse(Set<House> house) {
        this.house = house;
    }

    public Set<Maintain> getMaintain() {
        return maintain;
    }

    public void setMaintain(Set<Maintain> maintain) {
        this.maintain = maintain;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "CustomAccount [accountid=" + accountid + ", username=" + username + ", password=" + password
                + ", ownerid=" + ownerid + ", carid=" + carid + ", house=" + house + ", maintain=" + maintain + "]";
    }

}
