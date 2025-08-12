import java.util.Scanner;

public class ShopperStop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerItem = 10;

        System.out.print("Enter number of customers: ");
        int numCustomers = sc.nextInt();

        for (int customer = 1; customer <= numCustomers; customer++) {
            System.out.print("Enter number of items for Customer " + customer + ": ");
            int itemCount = sc.nextInt();

            int total = 0;
            int afterdiscount = 0;
            for (int item = 1; item <= itemCount; item++) {
                int itemCost = item * pricePerItem;
                total += itemCost;

                int discount = (total * 10 / 100);
                afterdiscount = (total - discount);
            }

            //System.out.println("Customer " + customer + " Total Price: ₹" + total);
            System.out.println("Customer " + customer + " Total Price: ₹" + afterdiscount);
        }

        sc.close();
    }
}

