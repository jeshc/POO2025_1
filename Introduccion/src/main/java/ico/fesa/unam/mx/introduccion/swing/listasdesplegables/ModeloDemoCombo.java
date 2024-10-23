package ico.fesa.unam.mx.introduccion.swing.listasdesplegables;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModeloDemoCombo implements ComboBoxModel<String> {
    private ArrayList<String> data;
    private String seleccionado;


    public ModeloDemoCombo(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return seleccionado;
    }

    @Override
    public int getSize() {
        return this.data.size();
    }

    @Override
    public String getElementAt(int index) {
        return this.data.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
