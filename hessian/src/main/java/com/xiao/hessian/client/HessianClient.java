package com.xiao.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.xiao.hessian.service.entity.User;
import com.xiao.hessian.service.inter.IService;

import java.net.MalformedURLException;

/**
 * @Author: wangxiaodong
 * @Date: Created in 2018/3/21 14:17
 */
public class HessianClient {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://127.0.0.1:8180/hessian/hessianServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        IService service = (IService) factory.create(IService.class, url);
        User user = service.getUser();
        System.out.println(user.getName());
        String res = service.hello();
        System.out.println(res);
    }
}
