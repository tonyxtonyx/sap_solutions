public class Main {
    public static void main(String[] args) {
        ModuleShopping moduleShopping = new ModuleShopping();
        moduleShopping.insert_product(50,"test",23);
        moduleShopping.insert_product(25,"test1",23412);
        moduleShopping.insert_product(21,"test2",34);
        moduleShopping.insert_product(26,"test2",34);

        moduleShopping.insert_product(80,"test3",42);
        moduleShopping.insert_product(95,"test4",3524);

        moduleShopping.remove_product(25);

        System.out.println(moduleShopping.get_product_price(25));
        System.out.println(moduleShopping.get_product_name(80));
        moduleShopping.insert_product(95,"test324",24);
        System.out.println(moduleShopping.get_product_name(95));

    }
}
