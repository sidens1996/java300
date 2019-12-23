package zyx.world.cooperation;

/**
 * @ClassName: Product
 * @Description: 产品类
 * @Author: Achilles
 * @Date: 23/12/2019  15:05
 * @Version: 1.0
 **/ //商品
class Product {
    private String factory;
    private int id;

    public Product(String factory, int id) {
        this.factory = factory;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "factory='" + factory + '\'' +
                ", id=" + id +
                '}';
    }
}
