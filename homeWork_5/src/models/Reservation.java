package models;

import java.util.Date;

public class Reservation {
    private Date date;
    private String name;


    private static int counter = 1000;
    private final int id; // номер резерва


    {//    инициализатор start
        id = ++counter;
    }//    инициализатор finish


    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }


}