package mx.unam.fes.is.modelo;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModeloComboPelis implements ComboBoxModel {
    private ArrayList<Pelicula> datos;
    private String selectedItem;

    public ArrayList<Pelicula> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Pelicula> datos) {
        this.datos = datos;
    }

    public ModeloComboPelis(ArrayList<Pelicula> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selectedItem = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index).getTitulo() + " - " +datos.get(index).getDirector() ;
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

}
