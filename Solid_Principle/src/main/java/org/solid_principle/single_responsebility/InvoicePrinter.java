package org.solid_principle.single_responsebility;

public class InvoicePrinter {

    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }

    public void print(){
        // print the invoice
    }
}
