package org.solid_principle.single_responsebility;

public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDB(){
        //save into the DB
    }
}


