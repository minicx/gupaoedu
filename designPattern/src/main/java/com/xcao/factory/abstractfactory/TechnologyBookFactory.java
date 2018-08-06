package com.xcao.factory.abstractfactory;

import com.xcao.factory.Books.Book;
import com.xcao.factory.Books.TechnologyBook;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:58 2018/8/6
 * @Modified By;
 */
public class TechnologyBookFactory implements BookFactory {
    @Override
    public Book createBook() {
        return new TechnologyBook();
    }
}