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
//          System.out.println(countSymbol("34ggaerg4"));
//          int arrrr[]={4,4,5,6,64,42};
//          sort2(arrrr);
//
//        reverstext("description");

        dictionary("for for for for for dude gier gierg");
//        System.out.println(comportext("121"));
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
//    public static boolean comportext (String text){
//
//
//        if (textcomp.toString().equals(textcomp.reverse().toString())){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public static int countSymbol (String text){
        int counter = 0;
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) >= 48 && text.charAt(i) <= 58) {
                counter++;
            }
        }
        return counter;
    }
    public static void sort1(int[] array){
        Arrays.sort(array);
        for( int ar: array){
            System.out.print(ar + " ");
        }
    }
    public static void sort2(int[] array){
        for (int i = 0; i < array.length-1; i++){
            for( int j = 0; j < array.length-1 -i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for( int ar: array){
            System.out.print(ar + " ");}

    }

    public static void dictionary(String text){
        int count = 1;
        String[] textsplit = text.split(" ");
        HashMap<String, Integer> dictionary = new HashMap<String , Integer>();
        ArrayList<String> list = new ArrayList <String>();
        for (String item : textsplit) {
            list.add(item);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            dictionary.put(list.get(i), count);
            count = 1;
            }
        for (Map.Entry<String, Integer> mapE : dictionary.entrySet()) {
            System.out.println("слово " + mapE.getKey() + " - количество вхождений " + mapE.getValue());
        }

    }


}
