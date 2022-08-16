package org.solid_principle.single_responsebility;

public class Invoice {

    private  Marker marker;
    private  int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;

    }

    public int calculateTotal(){
        int price=((marker.price)*this.quantity);
        return price;
    }

    //in this class there is 3 reason to change so it is not follow single responsibility principle
//    public void printInvoice(){
//        //print the invoice;
//    }
//
//    public void saveToDB(){
//        //save the data into DB
//    }
}
