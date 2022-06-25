package Lesson8;

import javax.swing.*;

import java.awt.*;

public class Cell {
    private int x;
    private int y;
    private int size;
    private Color color;



    public Cell (int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;

    }

    public void set (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void paint (Graphics2D grafic){
        grafic.setColor(color);
        grafic.fillOval(x * size, y*size, size, size);

    }


}
