package ico.fesa.unam.mx.introduccion.swing.tablas;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaCompras implements TableModel {
    private ArrayList<Compra> datos;

    public ModeloTablaCompras(ArrayList<Compra> datos) {
        this.datos = datos;
    }

    public ArrayList<Compra> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Compra> datos) {
        this.datos = datos;
    }


    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Cantidad";
            case 2:
                return "Nombre";
            case 3:
                return "Tipo de Producto";
            case 4:
                return "Precio $";
            default:
                return "NA";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Float.class;
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
        Compra tmp = this.datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getCantidad();
            case 2:
                return tmp.getNombre();
            case 3:
                return tmp.getTipoProducto();
            case 4:
                return tmp.getPrecio();
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

    public void agregarCompra(Compra compra){
        this.datos.add(compra);
    }
}
