package com.adilenver;

import java.awt.*;

public class Object {
    //coordinates
    int x ;
    int y ;
    //width-height
    int width ;
    int height ;
    //image
    Image img;

    void paintSelf(Graphics g){
        g.drawImage(img,x,y,null);
    }

}