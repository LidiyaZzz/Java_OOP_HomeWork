package presenters;

import models.Table;

import java.util.Collection;

public class BookingPresenter {
    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void showTables() {
        bookingView.updateTablesView(loadTables());
    }



}
