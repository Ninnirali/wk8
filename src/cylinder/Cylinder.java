package cylinder;

 public class Cylinder extends Circle {

        double height;

        Cylinder(double height, double radius) {
            super(radius);

            this.height = height;
            if (height < 0)
                this.height = 0;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {
            return this.height * this.height;
        }
}
