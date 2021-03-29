package Composite;
/**
O exemplo a seguir, escrito em Java, implementa uma classe gráfica, 
na qual, pode ser uma elipse ou um círculo ou uma composição de diversas outras formas 
geometrias, que, todas podem ser representadas no gráfico.

Ele pode ser estendido para implementar diversos outras formas
 (círculo, quadrado, etc.) no gráfico. 
**/

import java.util.List;
import java.util.ArrayList;

/** "Component" **/
interface Graphic {

    //Printa o grafico.
    public void print();
    public double area();
    public double perimeter();
}

/** "Composite" **/

class CompositeGraphic implements Graphic {

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    // área total juntando todos os gráficos
    public double area() {
        double area_todo = 0;
        for (Graphic graphic : childGraphics) {
            area_todo += graphic.area();
        }
        return(area_todo);
    }
    
    // perímetro total juntando todos os gráficos
    public double perimeter() {
        double perimetro_total = 0;
        for (Graphic graphic : childGraphics) {
            perimetro_total += graphic.perimeter();
        }
        return(perimetro_total);
    }
    
    //Adiciona o grafico a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

}

/** "Leaf" **/
class Ellipse implements Graphic {

    //Printa o grafico.
    public void print() {
        System.out.println("Ellipse");
    }
    public double area() {
        return(2);
    }
    public double perimeter() {
        return(5);
    }
}

/** "Leaf" **/
class Circle implements Graphic {
    
    //Printa o grafico.
    public void print() {
        System.out.println("Circle");
    }
    public double area() {
        return(3.1415);
    }
    public double perimeter() {
        return(2 * 3.1415);
    }
}

/** "Leaf" **/
class Square implements Graphic {

    public void print() {
        System.out.println("Square");
    }
    public double area() {
        return(4);
    }
    public double perimeter() {
        return(8);
    }
}

/** "Leaf" **/
class Triangle implements Graphic {

    public void print() {
        System.out.println("Triangle");
    }
    public double area() {
        return(4.5);
    }
    public double perimeter() {
        return(9);
    }
}

/** Client **/
public class ClienteComposite {

    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();
        
        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        System.out.println("Graphic1 Area: " + graphic1.area());
        System.out.println("Graphic1 Perimeter: " + graphic1.perimeter());

        graphic2.add(ellipse4);

        System.out.println("Graphic2 Area: " + graphic2.area());
        System.out.println("Graphic2 Perimeter: " + graphic2.perimeter());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Circle());
       // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());
        System.out.println("Graphic Perimeter: " + graphic.perimeter());
        
        graphic3.add(graphic);
        graphic3.add(new Square());
        graphic3.add(new Triangle());
        graphic3.print();
        System.out.println("Graphic3 Area: " + graphic3.area());
        System.out.println("Graphic3 Perimeter: " + graphic3.perimeter());
        
        graphic3.remove(graphic);
        graphic3.print();
        System.out.println("Graphic3 Area: " + graphic3.area());
        System.out.println("Graphic3 Perimeter: " + graphic3.perimeter());

    }
}
