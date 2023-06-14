package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    //    получаем список столиков
    Collection<Table> loadTables();
    int resrevationTable(Date reserationData, int tableNo, String name);
}
