package models;

import java.util.ArrayList;

public class Table {
    private static int counter = 10;
    private final int no; // номер столика

    {//    инициализатор start
        no = ++counter;
    }//    инициализатор finish

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return no;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d, резерв #%s", no, reservations);
    }
}
