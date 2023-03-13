package Tools;

import Entities.Article;
import Entities.Magazine;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    // A compléter ici
    public void loadDatasMagasines(ArrayList<Magazine> desMagasines)
    {
        columns = new String[]{"Numéro","Nom"};
        rows = new Object[desMagasines.size()][2];
        int i = 0;

        for(Magazine mnu : desMagasines)
        {
            rows[i][0] = mnu.getNumMagazine();
            rows[i][1] = mnu.getNomMagazine();
            i++;
        }
        fireTableChanged(null);
    }
    public void loadDatasArticles(ArrayList<Article> desArticles)
    {
        columns = new String[]{"Nom","Nombre de pages","nom du pigiste"};
        rows = new Object[desArticles.size()][3];
        int i = 0;

        for(Article artl : desArticles)
        {
            rows[i][0] = artl.getTitreArticle();
            rows[i][1] = artl.getNbPages();
            rows[i][2] = artl.getLePigiste().getNomPigiste();

            i++;
        }
        fireTableChanged(null);
    }

}

