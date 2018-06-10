package com.action;

import com.entity.House;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.Service;

import java.util.List;

public class HouseAction extends ActionSupport implements ModelDriven {

    private House house;
    private Service service;

    public String query() throws Exception {
        List list = service.queryAllObject(House.class);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("houses", list);
        return "houseList";
    }

    public String add() throws Exception {
        service.save(house);
        return "houseToList";
    }

    public String update() throws Exception {
        service.update(house);
        return "houseToList";
    }

    public String get() throws Exception {
        Object object = service.queryOneObject(House.class, house.getId());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("house", object);
        return "houseListToEdit";
    }

    public String delete() throws Exception {
        service.delete(house);
        return "houseToList";
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public Object getModel() {
        return house;
    }
}
