package homework7_figures;

public class Square extends Figures {

    private double aSideOfQuadrilateral;

    Square(double aSideOfQuadrilateral) {
        this.aSideOfQuadrilateral = aSideOfQuadrilateral;
        super.perimeterOfFigure = 4 * aSideOfQuadrilateral; // Р = 4 * а
        super.areaOfFigure = aSideOfQuadrilateral * aSideOfQuadrilateral; //S = a2
        System.out.println("P of the Square = " + perimeterOfFigure);
        System.out.println("S of the Square = " + areaOfFigure);
        System.out.println(" "); // для разделения информации между фигурами
    }
}
