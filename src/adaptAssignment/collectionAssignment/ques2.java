package adaptAssignment.collectionAssignment;

import java.util.TreeSet;

class Product  {
    int productId;
    String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductId : " + productId + " ProductName : " + productName;
    }

}

public class ques2 {
    public static void main(String[] args) {
        TreeSet<Product> set = new TreeSet<>((o1, o2) -> {
            if (o1.productId == o2.productId) { // means duplicate products with same productId
                return 0;
            }
            if (o1.productId > o2.productId) {
                return 1;
            }
            return -1;
        });

        set.add(new Product(10, "aa"));
        set.add(new Product(10, "aa"));
        set.add(new Product(20, "bb"));
        set.add(new Product(20, "bb"));
        for (Product p : set) {
            System.out.println(p.toString());
        }
    }
}
