package presenters;

import models.Table;

import java.util.ArrayList;

public interface View {
    void setObserver(ViewObserver observer);
    void updateTablesView(ArrayList<Table> tables);
    void updateReservationTableResalt(int reservationNo);
}
