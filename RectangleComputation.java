public class RectangleComputation {
    public static void main(String[] args){
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double area = height*width;
        double perimeter = 2*(height+width);
        double ratio = height/width;
        double epsilon = 0.01;
        if (Math.abs(1 - ratio) < epsilon) {
            System.out.println("shape: square");
        } else {
            System.out.println("shape: rectangle");
        }
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);    
    }
}