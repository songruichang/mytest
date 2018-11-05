package cn.itcast.dao.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private QueryRunner runner;
    @Autowired
    private Connection conn;


    public void updateBook(Book book) {
        try {
            runner.update(conn,"update book set price=? where id=?",book.getPrice(),book.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book findById(int id) {
        return null;
    }

    public void trans(int id, int id2, double price) {

    }
}
