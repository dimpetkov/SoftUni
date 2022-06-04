package Encapsulation_Exercise.ClassBox;

public class Box {
    //fields -> characteristics
    private double length;
    private double width;
    private double height;

    public Box (double length, double width, double height){
        setLength(length); //controlled assigning, will go through setter validation
        setHeight(height);
        setWidth(width);
    }

    private void setLength(double length) {
        //validate: > 0;
        if (length > 0) {
            this.length = length;
        } else {
            // length <= 0
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
    return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
    return 2 * this.height * (this.width + this.length);
    }

    public double calculateVolume() {
        return this.height * this.length * this.width;

    }
}
