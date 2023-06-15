package presenters;

import models.Table;

import java.util.ArrayList;
import java.util.Date;

public interface Model {

    //    получаем список столиков
    ArrayList<Table> loadTables();
    int resrevationTable(Date reserationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
