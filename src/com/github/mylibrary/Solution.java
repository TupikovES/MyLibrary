package com.github.mylibrary;

import com.github.mylibrary.module.ArrayObject;

/**
 * Created by x3mib_000 on 21.10.2015.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayObject a = new ArrayObject();
        ArrayObject b = new ArrayObject();
        ArrayObject c = new ArrayObject();
        a.addElem("Номер");
        a.addElem(1);



        b.addElem(a);
        b.addElem(a);
        b.addElem(a);


        c = (ArrayObject)b.getArrObject(0);

        System.out.println(c.getArrObject(1));

    }
}
