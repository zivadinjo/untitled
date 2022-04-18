package day_29_arrays;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double[] prices = {89.99, 150.0, 399.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};
//
//        for (int i = 0; i < items.length; i++) {
//            System.out.println("Item ID " + itemIds[i] + " are " + items[i] + " and price is $" + prices[i]);
//        }


        int indexOfGLoves = -1; // we set it as -1 as the default value ,so if the gloves is not found in the array it will give - 1
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                indexOfGLoves = i;
                break;
            }
        }
        System.out.println("Index of gloves is "+indexOfGLoves);

        System.out.println();


        double mostExpensive = prices[0];
        String item = "";
        int iD = itemIds[0];

        for (int i = 0; i < prices.length;i++){
            if (prices[i]> mostExpensive){
                mostExpensive = prices[i];
                item = items[i];
                iD = itemIds[i];

            }
        }
        System.out.println("ID of the item is "+iD +",and item is  " + item+ " and price is $"+ mostExpensive);



    }
}
