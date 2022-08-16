package org.solid_principle.dependency_inversion;

import java.awt.event.MouseListener;

public class MacBook {

    //instead of taking concrete class we should create Interface and use that interface
//    private  final WiredKeyword keyword;
//    private final WiredMouse mouse;
//
//    public MacBook(){
//        keyword=new WiredKeyword();
//        mouse=new WiredMouse();
//    }

    private final Keyword keyword;
    private final Mouse mouse;

    public MacBook(Keyword keyword,Mouse mouse){
        this.keyword=keyword;
        this.mouse=mouse;
    }

}
