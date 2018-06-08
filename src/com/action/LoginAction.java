package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Service;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginAction extends ActionSupport {

    private Service service;

    public String login() throws Exception {
        System.out.println("loginAction.execute");
        ActionContext context = ActionContext.getContext();
        HttpServletRequest request =
                (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usertype = request.getParameter("usertype");
        System.out.println(username + password + usertype);
        Object object = service.login(username, password, usertype);
        if (object != null) {
            if ("admin".equals(usertype)) {
                ActionContext.getContext().getSession().put("admin", object);
                return "admin";
            } else if ("user".equals(usertype)) {
                ActionContext.getContext().getSession().put("customAccount", object);
                return "user";
            }
        }
        return ERROR;
    }

    public String exit() throws Exception {
        ActionContext.getContext().getSession().clear();
        return ERROR;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
