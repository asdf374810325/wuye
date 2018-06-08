package com.action;

import com.entity.Notice;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class NoticeAction extends ActionSupport implements ModelDriven {

    private Notice notice;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(Notice.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("notice", list);
        return "noticeList";
    }

    public String add() throws Exception {
        service.save(notice);
        return "noticeToList";
    }

    public String update() throws Exception {
        service.update(notice);
        return "noticeToList";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(Notice.class, notice.getId());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("notice", object);
        return "noticeListToEdit";
    }

    public String delete() throws Exception {
        service.delete(notice);
        return "noticeToList";
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public Object getModel() {
        return notice;
    }
}
