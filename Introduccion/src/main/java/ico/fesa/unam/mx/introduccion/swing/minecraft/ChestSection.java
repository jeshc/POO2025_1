package ico.fesa.unam.mx.introduccion.swing.minecraft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ChestSection extends JPanel {
    private int rens;
    private int cols;
    private String title;
    private JButton[] content;
    private GridLayout layout;

    public ChestSection(int rens, int cols, String title) {
        this.rens = rens;
        this.cols = cols;
        this.title = title;
        this.setBorder(BorderFactory.createTitledBorder(this.title));
        this.layout = new GridLayout(this.rens, this.cols);
        this.setLayout(layout);
        content = new JButton[rens*cols];
        for (int i = 0; i < rens*cols; i++) {
            JButton tmp = new JButton("O");
            tmp.setBackground(Color.GREEN);
            tmp.setOpaque(true);
            content[i] = tmp;
            //this.add(content[i],i);
            this.add(tmp,i);
            this.content[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Toolkit.getDefaultToolkit().beep();
                }
            });
        }



    }

    public ChestSection(LayoutManager layout, boolean isDoubleBuffered, int rens, int cols, String title, JButton[] content, GridLayout layout1) {
        super(layout, isDoubleBuffered);
        this.rens = rens;
        this.cols = cols;
        this.title = title;
        this.content = content;
        this.layout = layout1;
    }

    public int getRens() {
        return rens;
    }

    public void setRens(int rens) {
        this.rens = rens;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JButton[] getContent() {
        return content;
    }

    public void setContent(JButton[] content) {
        this.content = content;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    @Override
    public String toString() {
        return "ChestSection{" +
                "rens=" + rens +
                ", cols=" + cols +
                ", title='" + title + '\'' +
                ", content=" + Arrays.toString(content) +
                ", layout=" + layout +
                '}';
    }
}
