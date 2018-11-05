package cn.heima.domain;

public class info {
    private Double price;
    private Integer id ;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "info{" +
                "price=" + price +
                ", id=" + id +
                '}';
    }
}
