package com.xiao.hessian.service.impl;


import com.xiao.hessian.service.entity.User;
import com.xiao.hessian.service.inter.IService;

/**
 * <p>ClassName: ServiceImpl<p>
 * <p>Description: IService接口的具体实现类<p>
 *
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-8-7 下午05:32:15
 */
public class ServiceImpl implements IService {

    /**
     * (non-Javadoc)
     *
     * @return 返回一个User对象
     * @MethodName getUser
     * @Description 实现IService接口的getUser方法
     * @author xudp
     * @see
     */
    @Override
    public User getUser() {
        User user = new User();
        user.setName("hello，World");
        return user;
    }

    @Override
    public String hello() {
        return "hello";
    }
}