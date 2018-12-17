package com.app.coordinate.data;

import java.util.ArrayList;
import java.util.List;

public class MyData {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public MyData(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static List<MyData> getData() {

        List<MyData> myData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            myData.add(new MyData("Name " + i, "Address " + i));
        }
        return myData;
    }
}
