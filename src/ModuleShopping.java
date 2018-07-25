public class ModuleShopping {
    Product[] products;

    void insert_product(int product_code, String name, int price){
        if (products.length == 0) {
            products[0] = new Product(product_code,name,price);
        } else {

        }
    }
}
