package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class AlikeDao extends HibernateDaoSupport {

    /**
     * 获取所有对象
     *
     * @param aClass 对象的类型
     * @return 对象的list集合
     */
    public List queryAllObject(Class<?> aClass) {
        return this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(aClass));
    }

    /**
     * 按条件获取部分或所有对象
     *
     * @param hql       hql语句
     * @param parameter hql中的参数，只限一个
     * @return 对象的list集合
     */
    public List quertManyObject(String hql, Object parameter) {
        return this.getHibernateTemplate().execute(new HibernateCallback<List>() {
            @Override
            public List doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery(hql);
                query.setParameter(0, parameter);
                return query.list();
            }
        });
    }

    /**
     * 按ID查询一个对象
     *
     * @param aClass 实体类型
     * @param id     实体ID
     * @return 实体对象
     */
    public Object queryOneObject(Class<?> aClass, String id) {
        return this.getHibernateTemplate().get(aClass, id);
    }

    /**
     * 按hql查询一个对象
     *
     * @param hql       hql语句
     * @param parameter 参数，只限一个
     * @return 实体对象
     */
    public Object queryOneObject(String hql, String parameter) {
        return this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery(hql);
                query.setParameter(0, parameter);
                return query.uniqueResult();
            }
        });
    }

    /**
     * 保存一个对象
     *
     * @param obj 要保存的对象
     */
    public void saveObject(Object obj) {
        this.getHibernateTemplate().save(obj);
    }

    /**
     * 修改一个对象
     *
     * @param obj 要修改的对象
     */
    public void updateObject(Object obj) {
        this.getHibernateTemplate().update(obj);
    }

    /**
     * 删除一个对象
     *
     * @param obj 要删除的对象
     */
    public void deleteObject(Object obj) {
        this.getHibernateTemplate().delete(obj);
    }

}
