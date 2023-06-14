package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter = 10;
    private final int no; // номер столика

    {//    инициализатор start
        no = ++counter;
    }//    инициализатор finish

    private final Collection<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
