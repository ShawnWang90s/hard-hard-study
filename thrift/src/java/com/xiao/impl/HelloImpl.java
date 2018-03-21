package com.xiao.impl;

import com.xiao.interf.Hello;
import org.apache.thrift.TException;

/**
 * @Author: wangxiaodong
 * @Date: Created in 2018/3/20 14:16
 */
public class HelloImpl implements Hello.Iface {
    @Override
    public String helloString(String para) throws TException {
        System.out.println("I accept:" + para);
        return "I accept:" + para;
    }
}
