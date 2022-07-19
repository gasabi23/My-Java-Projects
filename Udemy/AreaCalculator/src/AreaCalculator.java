public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0){
            System.out.println("Invalid value");
            return -1;
        }
        double area = Math.PI * radius * radius;
        System.out.println(area);
        return area;

    }

    public static double area (double x, double y) {
        if ((x < 0 || y < 0)|| (x < 0 && y < 0)){
            return -1;
        }
        double areaOfRectangle = x * y;
        System.out.println(areaOfRectangle);
        return x * y;

    }


}
