package cn.heima.domain;

public class SaleInfoVo extends Saleinfo {
    private Double total;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "SaleInfoVo{" +
                "total=" + total +
                '}';
    }
}
