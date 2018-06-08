package com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 管理员个人信息
 *
 * @author Chen
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = -1745759410428302260L;

    private String adminid;// 管理员个人信息表id
    private String name; // 姓名
    private String password;// 密码
    private String sex; // 性别
    private Integer age; // 年龄
    private String tel; // 电话
    private String phone; // 手机
    private String addr; // 地址
    private String memo; // 备注

    // 巡查表
    private Set<Inspection> inspection = new HashSet<Inspection>();

    // 公告表
    private Set<Notice> notice = new HashSet<Notice>();

    public Admin() {
    }

    public Admin(String adminid, String name, String password, String sex, Integer age, String tel, String phone,
                 String addr, String memo, Set<Inspection> inspection, Set<Notice> notice) {
        this.adminid = adminid;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.phone = phone;
        this.addr = addr;
        this.memo = memo;
        this.inspection = inspection;
        this.notice = notice;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Set<Inspection> getInspection() {
        return inspection;
    }

    public void setInspection(Set<Inspection> inspection) {
        this.inspection = inspection;
    }

    public Set<Notice> getNotice() {
        return notice;
    }

    public void setNotice(Set<Notice> notice) {
        this.notice = notice;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid='" + adminid + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                ", memo='" + memo + '\'' +
                ", inspection=" + inspection +
                ", notice=" + notice +
                '}';
    }
}
