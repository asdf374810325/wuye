package com.action;

import com.entity.Admin;
import com.entity.Maintain;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class AdminAction extends ActionSupport implements ModelDriven {

    private Admin admin;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(Admin.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("admins", list);
        return "adminList";
    }

    public String add() throws Exception {
        service.save(admin);
        return "adminToList";
    }

    public String update() throws Exception {
        service.update(admin);
        return "adminToList";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(Admin.class, admin.getAdminid());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("admin1", object);
        return "adminListToEdit";
    }

    public String delete() throws Exception {
        service.delete(admin);
        return "adminToList";
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public Object getModel() {
        return admin;
    }

}
