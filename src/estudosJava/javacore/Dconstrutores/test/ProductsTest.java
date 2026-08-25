package estudosJava.javacore.Dconstrutores.test;

import estudosJava.javacore.Dconstrutores.domain.Products;

public class ProductsTest {
    public static void main(String[] args) {
        Products product = new Products("Arroz", 11.50, 10);
        product.view();
        product.addStock(10);
        product.view();
        product.removeStock(15);
        product.view();
        product.removeStock(5);
        product.view();
    }
    
}
