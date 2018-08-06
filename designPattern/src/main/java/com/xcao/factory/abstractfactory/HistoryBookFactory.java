package com.xcao.factory.abstractfactory;


import com.xcao.factory.Books.Book;
import com.xcao.factory.Books.HistoryBook;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:55 2018/8/6
 * @Modified By;
 */
public class HistoryBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        return new HistoryBook();
    }
}