package com.xcao.factory.TestFactory;

import com.xcao.factory.Books.Book;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:36 2018/8/6
 * @Modified By;
 */
public abstract class AbstractBookFactory {

    public abstract <T extends Book>T createBook(Class<T> c);
}
