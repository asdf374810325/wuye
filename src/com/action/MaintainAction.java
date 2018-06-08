package com.action;

import com.entity.Maintain;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class MaintainAction extends ActionSupport implements ModelDriven {

    private Maintain maintain;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(Maintain.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("maintains", list);
        return "maintainsList";
    }

    public String add() throws Exception {
        service.save(maintain);
        return "maintainsToList";
    }

    public String update() throws Exception {
        service.update(maintain);
        return "maintainsToList";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(Maintain.class, maintain.getId());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("maintain", object);
        return "maintainsListToEdit";
    }

    public String delete() throws Exception {
        service.delete(maintain);
        return "maintainsToList";
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setMaintain(Maintain maintain) {
        this.maintain = maintain;
    }

    @Override
    public Object getModel() {
        return maintain;
    }
}
