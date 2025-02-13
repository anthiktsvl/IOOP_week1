public class Rectangle {

    private double height;
    private double width;


    public Rectangle(double height, double width){
        this.height= height;
        this.width= width;

    }
    public double calcPerimeter(){
       return 2 * (this.height + this.width);
    }

    public double calcArea(){
        return (this.height * this.width);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
