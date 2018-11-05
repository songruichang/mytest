package cn.heima.test;

import cn.heima.dao.IBookDao;
import cn.heima.domain.Book;
import cn.heima.domain.Kind;
import cn.heima.domain.SaleInfoVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseTest {
    public static void main(String[] args) {
        //读取配置文件
        InputStream is = CaseTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
//        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //根据配置文件 进行相关接口实现
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //返回build对象 用于执行xml中的sql语句
        SqlSession session = build.openSession(true);
        //生成接口对象用于方法调用
        IBookDao mapper = session.getMapper(IBookDao.class);

//        //执行方法
//        Book book = new Book();
//        book.setPrice(26.40);
//        book.setAuthor("宋");
//        book.setBookname("宋");
//        book.setCompany("人民文学");
//        book.setKind_id("3");
//
//        mapper.add(book);

//
//        Book book = new Book();
//         book.setPrice(1.0);
//         book.setId(10);

//        List<Book> list = mapper.findByCom("%文艺%");
//        for (Book book : list) {
//            System.out.println(book.getSong());
//        }

//
//        List<Book> list = mapper.find();
//        for (Book book : list) {
//            System.out.println(book.getBookname());
//            System.out.println(book.getKind().getKind_name());
//            System.out.println(book.getAuthor());
//        }


//        Book book1 = new Book();
//        book1.setCompany("%文艺%");
//        List<Book> list = mapper.find(book1);
//        for (Book book : list) {
//            System.out.println(book.getCompany());
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        List<Book> byId = mapper.findById(list);
//        for (Book book : byId) {
//            System.out.println(book.getBookname());
//        }
//
//        int[] array = new int[2];
//            array[0]=11;
//            array[1]=12;
//            mapper.deletById(array);

//          Book book1 = new Book();
//        book1.setCompany("%文艺%");
//        List<Book> list = mapper.findAll2(book1);
//        for (Book book : list) {
//            System.out.println(book);
//        }

//        Kind kind = new Kind();
//        kind.setKind_name("古典类");
//        Book book2 = new Book();
//        book2.setKind(kind);
//        List<Book> find = mapper.findgd(book2);
//        for (Book book : find) {
//            System.out.println(book);
//        }

//        ArrayList<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("price",200);
//        map.put("idd",list);
//        mapper.updateById(map);

//        SqlSession session1 = build.openSession();
//       IBookDao mapper1 = session1.getMapper(IBookDao.class);
//        Kind kind = new Kind();
//
//        kind.setKind_name("古典类");
//        List<Kind> list1 = mapper1.find(kind);


//        List<Book> all = mapper.findA();
//        for (Book book : all) {
//            System.out.println(book);
//        }


//        mapper.Save("情色类");
//
//
//        Kind kind = new Kind();
//        kind.setId(5);
//        mapper.del(kind);

//
//        List<Book> list = mapper.find1();
//        for (Book book : list) {
//            System.out.println(book);
//        }

//        List<Kind> kind = mapper.findByKind();
//        System.out.println(kind);

        List<SaleInfoVo> list = mapper.findByInfo();
        for (SaleInfoVo info : list) {
            System.out.println( info.getBook().getBookname()+"..."+info.getBook().getPrice()+"..."+info.getNums()+"..."+info.getTotal());

        }
// bookname,price,nums,(nums*price) as total

    }
}
