package com.action;

import com.entity.Inspection;
import com.entity.Notice;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class InspectionAction extends ActionSupport implements ModelDriven {

    private Inspection inspection;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(Inspection.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("inspections", list);
        return "inspectionList";
    }

    public String add() throws Exception {
        service.save(inspection);
        return "inspectionToEdit";
    }

    public String update() throws Exception {
        service.update(inspection);
        return "inspectionToEdit";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(Inspection.class, inspection.getId());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("inspection", object);
        return "inspectionListToEdit";
    }

    public String delete() throws Exception {
        service.delete(inspection);
        return "inspectionToEdit";
    }

    public void setInspection(Inspection inspection) {
        this.inspection = inspection;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public Object getModel() {
        return inspection;
    }
}
