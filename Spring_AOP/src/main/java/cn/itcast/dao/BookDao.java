package cn.itcast.dao;

import cn.itcast.domain.Book;

public interface BookDao {
    void  updateBook(Book book);
    Book findById(int id);
    void  trans(int id,int id2,double price);
}
