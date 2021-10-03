package edu.upc.eetac.dsa.polimorfisme;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestorFiguresTest {
    Figura[] v ;

    @Before
    public void setUp() {
        this.v = new Figura[4];

        this.v[0] = new Rectangle(5,3);
        this.v[1] = new Cercle(5);
        this.v[2] = new Quadrat(5);
        this.v[3] = new Cercle(120);
    }

    @After
    public void tearDown() {
        this.v= null;
    }

    @Test
    public void testSuma(){
        Assert.assertEquals(15, this.v[0].area(),0);
        Assert.assertEquals(78.5, this.v[1].area(),0.5);
        Assert.assertEquals(25, this.v[2].area(),0.5);
        Assert.assertEquals(45238, this.v[3].area(),1);
        Assert.assertEquals(45357, GestorFigures.suma(this.v),1 );
    }


    @Test
    public void testSort() {
        Figura[] expected1 = {this.v[0],
                              this.v[1],
                              this.v[2],
                              this.v[3]};

        Figura[] expected2 = {this.v[0],
                this.v[2],
                this.v[1],
                this.v[3]};

        Assert.assertArrayEquals(expected1, this.v);
        GestorFigures.sort(this.v);
        Assert.assertArrayEquals(expected2,this.v);

    }

}
