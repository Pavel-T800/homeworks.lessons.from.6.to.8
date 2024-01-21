//        Написать иерархию классов «Фигуры».
//        Фигура - Треугольник - Прямоугольник - Круг.
//        Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
//        Создать массив из 5 фигур.
//        Вывести на экран сумму периметра всех фигур в массиве.

package homework7_figures;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(11,20);
        Triangle triangle = new Triangle(23, 13, 35);

        Figures[] arrayOfFigures = new Figures[]{circle, square, rectangle, triangle};
        System.out.println("Sum of figure perimeters = " + (arrayOfFigures[0].perimeterOfFigure + arrayOfFigures[1].perimeterOfFigure + arrayOfFigures[2].perimeterOfFigure + arrayOfFigures[3].perimeterOfFigure));
        System.out.println("Sum of figure ares  = " + (arrayOfFigures[0].areaOfFigure + arrayOfFigures[1].areaOfFigure + arrayOfFigures[2].areaOfFigure + arrayOfFigures[3].areaOfFigure));

    }
}

