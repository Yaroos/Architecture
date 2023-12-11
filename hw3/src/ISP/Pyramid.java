package ISP;

public class Pyramid  implements iShape, iShape3D {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public double getVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }

    public double getArea() {
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        double baseArea = baseLength * baseWidth;
        double lateralArea = baseLength * slantHeight + baseWidth * slantHeight;
        return baseArea + lateralArea;
    }

    public double getPerimeter() {
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        return baseLength + baseWidth + (2 * slantHeight);
    }
}
