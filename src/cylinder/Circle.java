package cylinder;

public class Circle {
    double radius;

    Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
        radius = 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

