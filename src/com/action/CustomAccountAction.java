package com.action;

import com.entity.CustomAccount;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class CustomAccountAction extends ActionSupport implements ModelDriven {

    private CustomAccount customAccount;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(CustomAccount.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("customAccounts", list);
        return "customAccountList";
    }

    public String add() throws Exception {
        service.save(customAccount);
        return "customAccountToList";
    }

    public String update() throws Exception {
        service.update(customAccount);
        return "customAccountToList";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(CustomAccount.class, customAccount.getAccountid());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("customAccount", object);
        return "customAccountListToEdit";
    }

    public String delete() throws Exception {
        service.delete(customAccount);
        return "customAccountToList";
    }

    public void setCustomAccount(CustomAccount customAccount) {
        this.customAccount = customAccount;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public Object getModel() {
        return customAccount;
    }
}
