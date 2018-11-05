package cn.heima.dao;

import cn.heima.domain.Book;
import cn.heima.domain.Kind;
import cn.heima.domain.SaleInfoVo;
import cn.heima.domain.Saleinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@CacheNamespace(blocking = true)
public interface IBookDao {
    //List<Book> findAll();
    int findByCount();
      List<Map<String,Double>> findByCount1();

     void add (Book book);
   //  void del (int id);
     void modify (Book book);
     List<Book> findByCom (String name);
     //List<Book> find ();
    //List<Book> find (Book book);
    List<Book>findById(List<Integer>a);
    void deletById(int[] a);
    List<Book> findAll2 (Book book);
    List<Book> findgd (Book book);
    void updateById (Map<String,Object> a);



    List<Kind> find(Kind kind);

    @Select("select*from book")
    List<Book> findA();

   @Insert("insert into kind values(null,#{?})" )
  void Save(String name);
   @Delete("delete from kind where id=#{id}")
    void del(Kind kind);


    @Select("select bookname,kind_name from book b,kind k where b.kind_id=k.id")
    @Results(@Result(column = "kind_name",property = "kind.kind_name"))
     List<Book> find1();

     List<Kind>findByKind();

     List<SaleInfoVo> findByInfo();


}
