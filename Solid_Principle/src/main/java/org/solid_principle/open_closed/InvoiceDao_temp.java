package org.solid_principle.open_closed;

public class InvoiceDao_temp {

    Invoice invoice;

    public InvoiceDao_temp(Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDB(){
        //save into the DB
    }

    //if we want to save the file with given name we should extends another class rather we add
    // in the same class

//    public void saveToFile(String fileName){
//        // save Invoice in the file with the given name
//    }

    // so we create a interface to implements saveToDB() and saveToFile if we add another
    // feature we create another class so we cannot break the rule of open-closed principle
}


