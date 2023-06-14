package models;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

public class TableModel {
    private Collection<Table> tables;


//    получаем список столиков
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                tables.add(new Table());
            }
        }
        return tables;
    }

    private int resrevationTable(Date reserationData, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reserationData, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

}
