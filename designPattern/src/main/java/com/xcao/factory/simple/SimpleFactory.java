package com.xcao.factory.simple;

import com.xcao.factory.Books.Book;
import com.xcao.factory.Books.HistoryBook;
import com.xcao.factory.Books.NovelBook;
import com.xcao.factory.Books.TechnologyBook;

/**
 * @Author: Fer
 * @Date: 5/13/2019 6:56 PM
 * @Version 1.0
 * @Description:
 */
public class SimpleFactory {

    public static void main(String[] args) {
        new SimpleFactory().create("tech").read();
    }

    public Book create(String method) {
        Book book = null;
        if ("history".equalsIgnoreCase(method)) {
            book = new HistoryBook();
        } else if ("novel".equalsIgnoreCase(method)) {
            book = new NovelBook();
        } else if ("tech".equalsIgnoreCase(method)) {
            book = new TechnologyBook();
        }
        return book;
    }
}
