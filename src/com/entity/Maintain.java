package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 报修
 *
 * @author Chen
 */
public class Maintain implements Serializable {

    private static final long serialVersionUID = 7515434380337871780L;

    private String id;// 报修单ID
    private String thing;// 报修物品
    private String status;// 报修单状态
    private String homesnumber;// 房门号
    private Date sdate;// 报修时间
    private Date rdate;// 维修时间
    private String tcost;// 预计花费
    private String scost;// 实际花费
    private String maintainer;// 报修人
    private String smemo;// 报修详情

    private CustomAccount customAccount;

    public Maintain() {
        super();
    }

    public Maintain(String id, String thing, String status, String homesnumber, Date sdate, Date rdate, String tcost,
                    String scost, String maintainer, String smemo, CustomAccount customAccount) {
        super();
        this.id = id;
        this.thing = thing;
        this.status = status;
        this.homesnumber = homesnumber;
        this.sdate = sdate;
        this.rdate = rdate;
        this.tcost = tcost;
        this.scost = scost;
        this.maintainer = maintainer;
        this.smemo = smemo;
        this.customAccount = customAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHomesnumber() {
        return homesnumber;
    }

    public void setHomesnumber(String homesnumber) {
        this.homesnumber = homesnumber;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getTcost() {
        return tcost;
    }

    public void setTcost(String tcost) {
        this.tcost = tcost;
    }

    public String getScost() {
        return scost;
    }

    public void setScost(String scost) {
        this.scost = scost;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getSmemo() {
        return smemo;
    }

    public void setSmemo(String smemo) {
        this.smemo = smemo;
    }

    public CustomAccount getCustomAccount() {
        return customAccount;
    }

    public void setCustomAccount(CustomAccount customAccount) {
        this.customAccount = customAccount;
    }

    @Override
    public String toString() {
        return "Maintain [id=" + id + ", thing=" + thing + ", status=" + status + ", homesnumber=" + homesnumber
                + ", sdate=" + sdate + ", rdate=" + rdate + ", tcost=" + tcost + ", scost=" + scost + ", maintainer="
                + maintainer + ", smemo=" + smemo + ", customAccount=" + customAccount + "]";
    }

}
