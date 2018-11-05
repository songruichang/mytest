package cn.heima.dao.impl;

import cn.heima.dao.BookDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BookDaoImpl implements BookDao {
    public static void main(String[] args) {
        InputStream in=BookDaoImpl.class.getClassLoader().getResourceAsStream("beans.properties");
        Properties pro = new Properties();
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Object bookDaoImpl = pro.get("BookDaoImpl");

        try {
            Object o = Class.forName(bookDaoImpl.toString()).newInstance();
            BookDao dao = (BookDao) o;
            dao.findAll();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void findAll() {

    }
}
