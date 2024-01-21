package homework7_figures;

public class Circle extends Figures{

    private final double numberPi = 3.14;

    Circle(double radiusOfCircle) {
        super.perimeterOfFigure = numberPi * (radiusOfCircle * radiusOfCircle); //A = π * r2
        super.areaOfFigure = 2 * numberPi * radiusOfCircle; //C = 2 * π * r
        System.out.println("P of the Circle = " + perimeterOfFigure);
        System.out.println("S of the Circle = " + areaOfFigure);
        System.out.println(" "); // для разделения информации между фигурами

    }
}