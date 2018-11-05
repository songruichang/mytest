package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao dao;

    public void saveBook() {
        System.out.println("执行了保存");
    }

    public void updateBook(Book book) {

    }

    public Book findById(int id) {



        return null;
    }

    public void trans(int id, int id2, double price) {

    }
//
//    public void updateBook(int i) {
//        System.out.println("执行了更新"+i);
//    }
//
//    public int deleteBook() {
//        System.out.println("执行了删除");
//        return 0;
//    }



}
