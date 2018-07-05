package Circle;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuffer;
public class Main {

    public static void main(String args[]) throws ValueCantbeMinusExseption {


//        Scanner reduct = new Scanner(System.in);
//        String reduction = reduct.nextLine();
//        System.out.println(reduction);
//        IFigure rr = creatureFigure(reduction);
//        System.out.println(rr.S());
//
//        reverstext("description");

        ArrayList<IFigure> figures = new ArrayList <IFigure>();
        IFigure circlee = new Circle(5,5,100);
        IFigure rectangle = new Rectangle(3, 4);
        IFigure triangle = new Triangle(4,5,5);
        figures.add(circlee);
        figures.add(triangle);
        figures.add(rectangle);


        Rectangle rectanglecom = new Rectangle(1000,100 );
        System.out.println(rectanglecom.comparison(figures.get(0).S()));
//        Rectangle rec =new Rectangle(1, 2);
//        Rectangle rrg =(Rectangle)(figures.get(2));
//        System.out.println(rrg.comparison(figures.get(1)));
        Circle[] ar = new Circle[10];
        float eps = 0.01f;
        for (int i=0 ; i<ar.length; i++){
            float x =((float) (( Math.random() * 4)));
            int y =(int) (Math.random() * 4);
            int R =(int) (Math.random() * 8);
            Circle circle = new Circle(x,y,R);
            ar[i] = circle;
            ar[i].S();
        }

//        double k = ((ar[1].getY()-ar[0].getY())/(ar[1].getX()-ar[0].getX()));
//        double b = ar[0].getY()-k * ar[0].getX();
//
//        for (Circle i : ar){
//            if (Math.abs(i.getY() - k * i.getX()-b) < eps){
//
//                System.out.println("centers of circles coincide");
//            }else {
//                System.out.println("centers of circles not coincide");
//            }
//        }
//        Scanner r = new Scanner(System.in);
//        float numb = r.nextFloat();
//        ar[1].setR(numb);

    }
    public static IFigure creatureFigure (String reduction) throws ValueCantbeMinusExseption {
//        if (reduction == "cir"){
//            IFigure firure1 = new Circle(1,2,4);
//            return  firure1;
//        }else if(reduction == "rec"){
//            IFigure rectandle1 = new Rectangle(2,4);
//            return  rectandle1;
//        }else if (reduction == "tri"){
//            IFigure triangle1 = new Triangle(3,5,6);
//            return triangle1;
//        } else {
//            System.out.println("u need enter cir rec tri");
//        }
        switch (reduction){
            case "circ" : IFigure circle1 = new Circle(1,1,3);
            return circle1;
            case "trian" : IFigure triangle1 = new Triangle(1, 2,4);
            return triangle1;
            case "recta" : IFigure rectangle1 = new Rectangle(4, 5);
            return rectangle1;
        }
        return null;
    }
    public static void reverstext (String text){
        StringBuffer textt= new StringBuffer(text);
        System.out.println(textt.reverse());
    }

}
