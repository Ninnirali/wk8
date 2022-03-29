package poolarea;

public class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
        this.length = length;
        if (length < 0) {
            this.length = 0;
        }
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
