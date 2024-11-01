package mx.unam.fes.is.modelo;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaPelis implements TableModel {
    private ArrayList<Pelicula> datos;

    public ModeloTablaPelis(ArrayList<Pelicula> datos) {
        this.datos = datos;
    }

    public ArrayList<Pelicula> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Pelicula> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        System.out.println("rpintando");
        switch (columnIndex){
            case 0:
                return "ID:";
            case 1:
                return "Título";
            case 2:
                return "Director";
            case 3:
                return "Casificacion";
            default:
                return "NA";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pelicula peli = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return peli.getId();
            case 1:
                return peli.getTitulo();
            case 2:
                return peli.getDirector();
            case 3:
                return peli.getClasficacion();
            default:
                return "NA";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }


}
