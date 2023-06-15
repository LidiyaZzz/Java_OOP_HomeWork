package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(ArrayList<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResalt(int reservationNo) {
        System.out.println("Столик успешно забранирован. Номер брони: " + reservationNo);
    }

    public void reservationTable(Date reservationDate, int tableNo, String name) {
//        пользователь нажал на кнопку бронирования
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    //        пользователь нажал на кнопку изменения бронирования
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.changeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
