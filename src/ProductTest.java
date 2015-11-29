/**
 * Created by Тимакс on 29.11.2015.
 */
public class ProductTest {
    public void updatePrice(Product product, double price) {
        price = price * 2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        ProductTest productTest = new ProductTest();
        productTest.updatePrice(prt, newPrice);
        System.out.println(prt.price + " " + newPrice);

//separated example
        Short s1 =200;
        Integer s2 =400;
        Long s3 = (long)s1+s2;
//        String s4 = (String)(s3*s2);//cannot convert long to String
//        System.out.println(s4);
    }
}

class Product {
    double price;
}