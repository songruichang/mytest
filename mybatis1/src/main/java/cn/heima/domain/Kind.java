package cn.heima.domain;

import java.io.Serializable;
import java.util.List;

public class Kind  implements Serializable{
    private Integer id;
    private String kind_name;
    private List<Book>list;

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind_name() {
        return kind_name;
    }

    public void setKind_name(String kind_name) {
        this.kind_name = kind_name;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "id=" + id +
                ", kind_name='" + kind_name + '\'' +
                ", list=" + list +
                '}';
    }
}
