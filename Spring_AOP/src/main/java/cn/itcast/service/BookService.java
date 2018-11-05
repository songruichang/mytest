package cn.itcast.service;

import cn.itcast.domain.Book;

public interface BookService {

    void saveBook();

     void  updateBook(Book book);
//
//
//    int  deleteBook();
     Book findById(int id);
     void  trans(int id,int id2,double price);









}
