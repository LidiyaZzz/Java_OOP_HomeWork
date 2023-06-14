package views;

import models.Table;
import presenters.View;

import java.util.Collection;

public class BookingView implements View {
    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }
}
