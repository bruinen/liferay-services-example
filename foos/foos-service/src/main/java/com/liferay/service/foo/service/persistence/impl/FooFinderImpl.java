package com.liferay.service.foo.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.service.foo.service.persistence.FooFinder;

/**
 * User: Romeo Sheshi <a href="mailto:romeo.sheshi@sourcesence.com">Romeo Sheshi</a>
 * Date: 02/12/2016
 * Time: 17:14
 */
public class FooFinderImpl extends FooFinderBaseImpl implements FooFinder {

    public String findFooFinderInfo(){


        Session session = null;
        try {
            session = openSession();

            String sql = CustomSQLUtil.get(getClass(),FIND_TEST);

            SQLQuery q = session.createSQLQuery(sql);
            return (String) q.uniqueResult();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            closeSession(session);
        }

        return "Hello world from FooFinder";
    }




    public static final String FIND_TEST =
            FooFinder.class.getName() +
                    ".findTest";
}
