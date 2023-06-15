import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import presenters.View;
import views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        BookingView bookingView = new BookingView();// отображение
        TableModel tableModel = new TableModel();// столики
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);//система взаимодействия
        bookingPresenter.showTables();
        bookingView.reservationTable(new Date(), 13, "MyName");
        bookingPresenter.showTables();
        bookingView.changeReservationTable(1001, new Date(), 13, "MyName");
        bookingPresenter.showTables();
    }

}
