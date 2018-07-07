package Circle;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.*;

public class Main {

    public static void main(String args[]) throws ValueCantbeMinusExseption {

//        Scanner reduct = new Scanner(System.in);
//        String reduction = reduct.nextLine();
//        System.out.println(reduction);
//        IFigure rr = creatureFigure(reduction);
//        System.out.println(rr.S());
//
//        reverstext("description");

        dictionary("we are fo fore wolk");
        System.out.println(comportext("121"));
//        System.out.println(countSymbol("abt t"));
//        ArrayList<IFigure> figures = new ArrayList <IFigure>();
//        IFigure circlee = new Circle(5,5,100);
//        IFigure rectangle = new Rectangle(3, 4);
//        IFigure triangle = new Triangle(4,5,5);
//        figures.add(circlee);
//        figures.add(triangle);
//        figures.add(rectangle);

//
//        Rectangle rectanglecom = new Rectangle(1000,100 );
//        System.out.println(rectanglecom.comparison(figures.get(0).S()));
//        Rectangle rec =new Rectangle(1, 2);
//        Rectangle rrg =(Rectangle)(figures.get(2));
//        System.out.println(rrg.comparison(figures.get(1)));
//        Circle[] ar = new Circle[10];
//        float eps = 0.01f;
//        for (int i=0 ; i<ar.length; i++){
//            float x =((float) (( Math.random() * 4)));
//            int y =(int) (Math.random() * 4);
//            int R =(int) (Math.random() * 8);
//            Circle circle = new Circle(x,y,R);
//            ar[i] = circle;
//            ar[i].S();
//        }

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
    public static StringBuffer reverstext (String text){
        StringBuffer textt= new StringBuffer(text);
        StringBuffer reverText = (textt.reverse());
        return reverText;
    }
    public static int comportext (String text){
        StringBuffer textcomp = new StringBuffer(text);
        if (textcomp.toString().equals(textcomp.reverse().toString())){
            return 1;
        }else {
            return -1;
        }
    }

    public static int countSymbol (String text){
        int counter = 0;
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) != ' ') {
                counter++;
            }
        }
        return counter;
    }
    public static void dictionary(String text){
        String[] textsplit = text.split(" ");
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        for (int i = 0; i<textsplit.length; i++){
            dictionary.put(i, textsplit[i]);
        }
        for(Map.Entry<Integer, String> item : dictionary.entrySet()){
            System.out.printf("key %d Value: %s \n", item.getKey(), item.getValue());
        }
    }


}
