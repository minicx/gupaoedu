package com.xcao.factory.abstractfactory;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:59 2018/8/6
 * @Modified By;
 */
public class TestBook {
    public static void main(String[] args) {
        BookFactory history = new HistoryBookFactory();
        history.createBook().read();

        BookFactory novel = new NovelBookFactory();
        novel.createBook().read();

        BookFactory technology = new TechnologyBookFactory();
        technology.createBook().read();
    }
}