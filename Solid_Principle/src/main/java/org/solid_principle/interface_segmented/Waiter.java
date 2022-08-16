package org.solid_principle.interface_segmented;


public class Waiter implements WaiterInterface{

    @Override
    public void serveCustomer() {
        System.out.println("serving the customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking the order");
    }
}
//here we see that Waiter have features only for serveCustomers so do not need to cookFood and washDishes

//public class Waiter implements RestaurantEmployee{
//
//    @Override
//    public void cookFood() {
//
//    }
//
//    @Override
//    public void washDishes() {
//
//    }
//
//    @Override
//    public void serveCustomers() {
//        System.out.println("Serving the Country");
//    }
//}
