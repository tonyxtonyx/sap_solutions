public class ModuleShopping {
    private Link first;
    public ModuleShopping(){
        first = null;
    }

    public void insert_product(int product_code, String product_name, int product_price){
        if(find_product(product_code) != null){
            return;
        }

        Product product = new Product(product_code,product_name,product_price);
        Link newLink = new Link(product);
        newLink.next = first;
        first = newLink;
    }
    public Product find_product(int product_code){
        if(first == null){
            return null;
        }
        Link current = first;
        while(current.product.product_code != product_code){
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current.product;
    }

    public int get_product_price(int product_code){
        Product product = find_product(product_code);
        if(product == null)
            return -1;
        else
            return product.product_price;
    }

    public String get_product_name(int product_code){
        Product product = find_product(product_code);
        if(product == null)
            return null;
        else
            return product.product_name;
    }

    public void remove_product(int product_code){
        Link current = first;
        Link previous = first;

        while (current.product.product_code != product_code){
            if(current.next == null)
                return;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
    }
}
