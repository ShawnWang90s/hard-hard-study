package com.xiao.hessian.service.inter;


import com.xiao.hessian.service.entity.User;

/**
 * <p>ClassName: IService<p>
 * <p>Description: 定义对外提供服务的接口<p>
 *
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-8-7 下午05:29:23
 */
public interface IService {

    User getUser();

    String hello();
}