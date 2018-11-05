package cn.heima.domain;

import java.io.Serializable;

public class Book implements Serializable {
  private Integer id       ;
  private String bookname ;
  private String kind_id  ;
  private String author   ;
  private String company  ;
  private Double price    ;
  private String song;

  private Kind kind;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getKind_id() {
        return kind_id;
    }

    public void setKind_id(String kind_id) {
        this.kind_id = kind_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", kind_id='" + kind_id + '\'' +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", song='" + song + '\'' +
                ", kind=" + kind +
                '}';
    }
}
