package presenters;

import models.Table;

import java.util.Collection;

public interface View {
    void updateTablesView(Collection<Table> tables);
}
