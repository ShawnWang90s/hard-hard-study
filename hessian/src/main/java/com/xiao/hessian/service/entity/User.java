package com.xiao.hessian.service.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>ClassName: User<p>
 * <p>Description: 创建一个User类，实现序列化接口，
 * User实现了序列化接口后就可以进行序列化，
 * 然后就可以通过网络将序列化后的user传输到另一台计算机上<p>
 *
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-8-7 下午05:25:09
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1692800630322115854L;
    //name属性
    private String name;


}