public class PerimeterAndArea {

    private double width;
    private double length;
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double calculatePerimeter() {
        return 2 * (this.width + this.length);
    }
    
    public double calculateArea() {
        return this.width * this.length;
    }
    
    @Override
    public String toString() {
    return "Width: " + this.getWidth()
         + "\nLength: " + this.getLength()
         + "\nPerimeter calculation result: " + this.calculatePerimeter()
         + "\nArea calculation result: " + this.calculateArea();
   }
}   