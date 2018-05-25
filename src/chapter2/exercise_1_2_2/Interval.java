package chapter2.exercise_1_2_2;

public class Interval {

    private double startPoint;
    private double endPoint;

    public Interval(double a, double b) {
        if (a > b) {
            this.endPoint = a;
            this.startPoint = b;
        } else {
            this.startPoint = a;
            this.endPoint = b;

        }
    }

    public double getStartPoint() {
        return startPoint;
    }

    public double getEndPoint() {
        return endPoint;
    }

    public boolean areOnInterval(double a) {
        if (a > this.getStartPoint() && a < this.getEndPoint()) return true;
        else return false;
    }

    public boolean intersect(Interval o){
        if (this.areOnInterval(o.getStartPoint()) || this.areOnInterval(o.getEndPoint())) return true;
        else return false;
    }

    public int equals(Interval o) {
        if (this.getStartPoint() == o.getStartPoint() && this.getEndPoint() == o.getEndPoint()) return 1;
        else return 0;
    }

    public String toString() {
        return "Interval: " + this.getStartPoint() + ", " + this.getEndPoint();
    }


}
