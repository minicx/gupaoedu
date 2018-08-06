package com.xcao.factory.TestFactory;

import com.xcao.factory.Books.Book;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:37 2018/8/6
 * @Modified By;
 */
public class BookFactory extends AbstractBookFactory {
    @Override
    public <T extends Book>T createBook(Class<T> c) {
        try {
            return (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}