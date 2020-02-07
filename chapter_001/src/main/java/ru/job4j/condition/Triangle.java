package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double period(double a, double b, double c) {
        double reslt;
        reslt = (a + b + c) / 2;
        return reslt;
    }

    private boolean exist(double a, double c, double b) {
        return  ((a + b) > c && (a + c) > b && (b + c) > a);
    }


    public double area() {
        double rsl = -1;
        double a = this.a.distance(this.b);
        double b = this.b.distance(this.c);
        double c = this.c.distance(this.a);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
