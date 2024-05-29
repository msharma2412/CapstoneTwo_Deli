
package com.ps;

import java.util.ArrayList;

public class Order {

   private ArrayList<Product> customerOrder;

   public Order(){
   }



// user logiic should be in thr userinterface
       public void getOrderDetails() {
        //just a method to add to show what items are in the order
       for(Product item: customerOrder){
           System.out.println(customerOrder.toString());
       }
    }

        public void removePrdouct (Product product){
       if(this.customerOrder.remove(product)){
           System.out.println("Item removed from order");
       } else {
           System.out.println("Error. Unknown item.");
       }

    }



    }
        // in the order class. it is a blueprint of sandwiches. You will get info
//from the user to get info from the user and use getters and setters from the
// look up how to