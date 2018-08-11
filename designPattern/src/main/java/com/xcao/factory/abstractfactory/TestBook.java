package com.xcao.factory.abstractfactory;

import java.lang.management.ManagementFactory;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:59 2018/8/6
 * @Modified By;
 */
public class TestBook {
    public static void main(String[] args) throws Exception {
        // get name representing the running Java virtual machine.
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        // get pid
        String pid = name.split("@")[0];
        System.out.println("Pid is:" + pid);

        Thread.sleep(100000);
        BookFactory history = new HistoryBookFactory();
        history.createBook().read();

        BookFactory novel = new NovelBookFactory();
        novel.createBook().read();

        BookFactory technology = new TechnologyBookFactory();
        technology.createBook().read();
    }
}