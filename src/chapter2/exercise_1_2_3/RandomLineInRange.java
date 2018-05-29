package chapter2.exercise_1_2_3;

import java.awt.*;

public class RandomLineInRange {
    private double x0, y0, x1, y1;

    public RandomLineInRange(double min, double max) {


        double tempx0 = Math.floor(1000 * ((max - min) * Math.random() + min))/1000.0;
        double tempx1 = Math.floor(1000 * ((max - min) * Math.random() + min))/1000.0;


        //set x0 < x1 to make next calculation easier
        if (tempx0 < tempx1) {
            this.x0 = tempx0;
            this.x1 = tempx1;
        } else {
            this.x0 = tempx1;
            this.x1 = tempx0;
        }

        this.y0 = Math.floor(1000 * ((max - min) * Math.random() + min))/1000.0;

        this.y1 = Math.floor(1000 * ((max - min) * Math.random() + min))/1000.0;
    }

    public double getX0() {
        return x0;
    }

    public double getY0() {
        return y0;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public void drawThisLine(){
        StdDraw.setPenColor(Color.black);
        StdDraw.line(this.x0, this.y0, this.x1, this.y1);
    }

    public double angleCoef() {
        if (this.y0 == this.y1) return 0.0;
        else return (this.y1 - this.y0 )/(this.x1 - this.x0);
    }

    public boolean isIntercepting(RandomLineInRange l) {
        double v1 = (l.getX1() - l.getX0())*(this.getY0()-l.getY0())
                - (l.getY1()-l.getY0())*(this.getX0()-l.getX0());
        double v2 = (l.getX1() - l.getX0())*(this.getY1()-l.getY0())
                - (l.getY1()-l.getY0())*(this.getX1()-l.getX0());

        double v3 = (this.getX1() - this.getX0())*(l.getY0()-this.getY0())
                - (this.getY1()-this.getY0())*(l.getX0()-this.getX0());
        double v4 = (this.getX1() - this.getX0())*(l.getY1()-this.getY0())
                - (this.getY1()-this.getY0())*(l.getX1()-this.getX0());

        return (v1 * v2 < 0) && (v3 * v4 < 0);

    }

    public boolean hasPoint(double x, double y) {
        return (((x - this.getX0())/(this.getX1()-this.getX0())) == (y-this.y0)/(this.y1 - this.y0));
    }

    public boolean isAlligning(RandomLineInRange l) {
        if (this.angleCoef() != l.angleCoef()) return false;
        else {
            if (this.hasPoint(l.getX0(), l.getY0()) && this.hasPoint(l.getX1(), l.getY1())) return true;
            else if (l.hasPoint(this.getX0(), this.getY0()) && l.hasPoint(this.getX1(), this.getY1())) return true;
            else return false;
        }
    }



    public String toString() {
        return "x0 =" + this.x1 + ", y0 = " + this.y0 + "; x1 = " + this.x1 + ", y1 = " + this.y1;
    }

//    public static void main(String[] args) {
//        double min = 0.2;
//        double max = 0.8;
//
//        RandomLineInRange l1 = new RandomLineInRange(min,max);
//        RandomLineInRange l2 = new RandomLineInRange(min,max);
//        l1.drawThisLine();
//        l2.drawThisLine();
//
//
//    }

}
