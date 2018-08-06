package com.xcao.factory.abstractfactory;

import com.xcao.factory.Books.Book;
import com.xcao.factory.Books.NovelBook;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:57 2018/8/6
 * @Modified By;
 */
public class NovelBookFactory implements  BookFactory {
    @Override
    public Book createBook() {
        return new NovelBook();
    }
}