package poolarea;

    public class Cuboid extends Rectangle {
        double height;

        Cuboid(double height, double width, double length) {
            super(width, length);

            this.height = height;
            if (height < 0) this.height = 0;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {
            return getArea() * this.height;
        }
}
