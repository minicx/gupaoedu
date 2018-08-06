package com.xcao.factory.TestFactory;

import com.xcao.factory.Books.HistoryBook;
import com.xcao.factory.Books.NovelBook;
import com.xcao.factory.Books.TechnologyBook;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 22:41 2018/8/6
 * @Modified By;
 */
public class BookFactoryTest {
    public static void main(String[] args) {
        AbstractBookFactory factory = new BookFactory();

        factory.createBook(HistoryBook.class).read();

        factory.createBook(NovelBook.class).read();

        factory.createBook(TechnologyBook.class).read();

    }
}