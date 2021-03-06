package com.service;

import com.dao.AlikeDao;
import com.entity.Admin;

import java.util.List;

public class Service {

    protected AlikeDao alikeDao;

//    public abstract List queryManyObject(Class<?> aClass, Object obj);

    public Object queryOneObject(Class<?> aClass, String id) {
        return alikeDao.queryOneObject(aClass, id);
    }

    public Object queryOneObject(String hql, String parameter) {
        return alikeDao.queryOneObject(hql, parameter);
    }

    public List queryAllObject(Class<?> aClass) {
        return alikeDao.queryAllObject(aClass);
    }


    public Object login(String username, String password, String usertype) {
        Object object = null;
        if ("admin".equals(usertype)) {
            object = alikeDao.queryOneObject("from Admin where name=?", username);
            if (!password.equals(((Admin) object).getPassword())) {
                throw new RuntimeException("密码不正确");
            }
        } else if ("user".equals(usertype)) {
            object = alikeDao.queryOneObject("from CustomAccount where username=?", username);
            if (!password.equals(((Admin) object).getPassword())) {
                throw new RuntimeException("密码不正确");
            }
        }
        if (object == null) {
            throw new RuntimeException("用户名不正确");
        }
        return object;
    }

    public void update(Object obj) {
        alikeDao.updateObject(obj);
    }

    public void delete(Object obj) {
        alikeDao.deleteObject(obj);
    }

    public void save(Object obj) {
        alikeDao.saveObject(obj);
    }

    public void setAlikeDao(AlikeDao alikeDao) {
        this.alikeDao = alikeDao;
    }
}
