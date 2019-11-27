package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/11/8
 * @Description: com.banyuan.example.UDp
 * @version: 1.0
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        byte[] b = "北京尚学堂".getBytes();
        //必须告诉数据报包要发到哪台计算机的哪个端口，发送的数据以及数据的长度
        DatagramPacket dp = new DatagramPacket(b, b.length, new
                InetSocketAddress("localhost", 8999));
        //创建数据报套接字：指定发送信息的端口
        DatagramSocket ds = new DatagramSocket(9000);
        //发送数据报包
        ds.send(dp);
        //关闭资源
        ds.close();
    }
}

