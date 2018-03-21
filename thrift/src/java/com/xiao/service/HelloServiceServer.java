package com.xiao.service;

import com.xiao.impl.HelloImpl;
import com.xiao.interf.Hello;
import org.apache.thrift.TProcessor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * @Author: wangxiaodong
 * @Date: Created in 2018/3/20 14:17
 */
public class HelloServiceServer {
    public static void main(String[] args) {
        System.out.println("start......");
        TProcessor tProcessor = new Hello.Processor<Hello.Iface>(new HelloImpl());

        //单线程
        try {
            TServerSocket tServerSocket = new TServerSocket(9987);
            TServer.Args tArgs = new TServer.Args(tServerSocket);
            tArgs.processor(tProcessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer tServer = new TSimpleServer(tArgs);
            tServer.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }

        System.out.println("over......");
    }
}
