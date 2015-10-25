package com.github.mylibrary.module;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by xyzyx on 25.10.2015.
 */
public class DBdriver {

    private Connection connect;
    private Statement statement;
    private Driver driver = null;
    private boolean msg = false;


    public DBdriver(){
        try {
            driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean connect(String url, String user, String pass){

        try {
            connect = DriverManager.getConnection(url, user, pass);
            statement = connect.createStatement();
            if(!connect.isClosed()){
                msg = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            msg = false;
        }

        return msg;
    }

    public boolean close(){
        try {
            connect.close();
            if (connect.isClosed()) {
                msg = true;
            }
        } catch (SQLException e) {
            msg = false;
            e.printStackTrace();
        }

        return msg;
    }

    public boolean add(String album, String artist){
        return true;
    }

}
