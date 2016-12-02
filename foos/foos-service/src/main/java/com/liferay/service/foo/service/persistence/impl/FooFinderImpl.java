package com.liferay.service.foo.service.persistence.impl;

import com.liferay.service.foo.service.persistence.FooFinder;

/**
 * User: Romeo Sheshi <a href="mailto:romeo.sheshi@sourcesence.com">Romeo Sheshi</a>
 * Date: 02/12/2016
 * Time: 17:14
 */
public class FooFinderImpl extends FooFinderBaseImpl implements FooFinder {

    public String getFooFinderInfo(){
        return "Hello world from FooFinder";
    }
}
