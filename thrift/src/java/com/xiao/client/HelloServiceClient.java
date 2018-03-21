package com.xiao.client;

import com.xiao.interf.Hello;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @Author: wangxiaodong
 * @Date: Created in 2018/3/20 14:27
 */
public class HelloServiceClient {
    public static void main(String[] args) {
        System.out.println("client start.....");
        long st = System.currentTimeMillis();
        TTransport transport = null;
        try {
            transport = new TSocket("127.0.0.1", 9987, 30000);
            TProtocol protocol = new TBinaryProtocol(transport);
            Hello.Client client = new Hello.Client(protocol);
            transport.open();
            String res = client.helloString("xxdcdf");
            System.out.println(res);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            transport.close();
        }
        System.out.println("client end....." + (System.currentTimeMillis() - st));
    }
}
