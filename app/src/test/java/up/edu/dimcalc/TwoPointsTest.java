package up.edu.dimcalc;

import android.graphics.Point;

import static org.junit.Assert.*;

/**
 * Created by Jason on 3/22/2018.
 */
public class TwoPointsTest {
    @org.junit.Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);

    }

    @org.junit.Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);

    }

    @org.junit.Test
    public void randomValue() throws Exception {
        //assertEquals(1,2);

        TwoPoints testPoints = new TwoPoints();
        testPoints.randomValue(0);
        testPoints.randomValue(1);

    }

    @org.junit.Test
    public void setOrigin() throws Exception {

    }

    @org.junit.Test
    public void copy() throws Exception {

    }

    @org.junit.Test
    public void distance() throws Exception {

    }

    @org.junit.Test
    public void slope() throws Exception {

    }

}