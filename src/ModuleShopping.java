public class ModuleShopping {
    private Node root;
    public ModuleShopping(){
        root = null;
    }

    public void insert_product(int product_code, String product_name, int product_price){
        Product newProduct = new Product(product_code,product_name,product_price);
        Node newNode = new Node(newProduct);
        if(root==null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(product_code < current.product.product_code){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else if (product_code > current.product.product_code) {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
                else
                    return;
            }

        }
    }
    public Product find_product(int product_code){
        Node current = root;
        while (current.product.product_code != product_code){
            if(product_code < current.product.product_code)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
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
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.product.product_code != product_code){
            parent = current;
            if(product_code < current.product.product_code){
                isLeftChild = true;
                current = current.leftChild;
            }
            else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null){
                return;
            }

            if(current.leftChild == null && current.rightChild == null){
                if(current == root)
                    root = null;

                else if(isLeftChild)
                    parent.leftChild = null;

                else
                    parent.rightChild = null;
            }
            else if(current.rightChild== null){
                if(current == root)
                    root = null;

                else if(isLeftChild)
                    parent.leftChild = current.leftChild;

                else
                    parent.rightChild = current.leftChild;
            }
            else if(current.leftChild == null){
                if(current == root)
                    root = null;

                else if(isLeftChild)
                    parent.leftChild = current.rightChild;

                else
                    parent.rightChild = current.rightChild;
            }
            else {

            }

        }
    }
}