package com.github.mylibrary;


import com.github.mylibrary.module.DBdriver;

/**
 * Created by x3mib_000 on 21.10.2015.
 */
public class Solution {

    public static void main(String[] args) {
        DBdriver db = new DBdriver();

        if (db.connect("jdbc:mysql://localhost:3306/disklibrary", "root", "root")){
            System.out.println("Connect successful!");
        }

        while (true){
            break;
        }

        if (db.close()){
            System.out.println("Connect close!");
        }
    }
}