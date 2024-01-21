package homework7_figures;

public class Rectangle extends Figures {

    Rectangle(double aSideOfQuadrilateral, double bSideOfQuadrilateral) {
        super.perimeterOfFigure = 2 * (aSideOfQuadrilateral * bSideOfQuadrilateral); // P = 2 * (a + b)
        super.areaOfFigure = aSideOfQuadrilateral + bSideOfQuadrilateral; // S = a * b
        System.out.println("P of the Rectangle = " + perimeterOfFigure);
        System.out.println("S of the Rectangle = " + areaOfFigure);
        System.out.println(" "); // для разделения информации между фигурами
    }
}