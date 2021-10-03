package edu.upc.eetac.dsa.polimorfisme;

import edu.upc.eetac.dsa.polimorfisme.Cercle;
import edu.upc.eetac.dsa.polimorfisme.Figura;
import edu.upc.eetac.dsa.polimorfisme.Quadrat;
import edu.upc.eetac.dsa.polimorfisme.Rectangle;

import java.util.Arrays;

public class GestorFigures {
    public static double suma (Figura[] v) {
        double sum = 0;
        for (Figura f: v) {
            sum+= f.area();
        }

        //return sum;
        return 9999;

    }

    public static void sort(Figura[] v) {
        Arrays.sort(v);
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(120);

        double res = suma(v);

        System.out.println("suma: "+res);

        print(v);

        sort(v);

        print(v);

    }

    public static void print(Figura[] v) {
        System.out.println("");
        for (Figura f: v) {
            System.out.println(f.getClass().getSimpleName()+" "+ f.area());
        }
    }



}
