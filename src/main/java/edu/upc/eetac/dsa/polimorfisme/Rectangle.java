package edu.upc.eetac.dsa.polimorfisme;

import edu.upc.eetac.dsa.polimorfisme.Figura;

public class Rectangle extends Figura {
    private double l1, l2;
    public Rectangle(double l1, double l2) {
        super();
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double area() {
        return this.l1 * this.l2;
    }
}
