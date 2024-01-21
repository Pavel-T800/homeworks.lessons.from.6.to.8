package homework7_figures;

public class Triangle extends Figures {

    Triangle(double aSideOfTriangle, double bSideOfTriangle, double cSideOfTriangle) {
        double perimeterOfTriangle = aSideOfTriangle + bSideOfTriangle + cSideOfTriangle;
        super.perimeterOfFigure = perimeterOfTriangle; // P = a + b + c
        super.areaOfFigure =  Math.sqrt(perimeterOfTriangle * (perimeterOfTriangle - aSideOfTriangle) * (perimeterOfTriangle - bSideOfTriangle) * (perimeterOfTriangle - cSideOfTriangle)); // S = √p · (p — a)(p — b)(p — c)
        System.out.println("P of the Triangle = " + perimeterOfFigure);
        System.out.println("S of the Triangle = " + areaOfFigure);
        System.out.println(" "); // для разделения информации между фигурами
    }
}
