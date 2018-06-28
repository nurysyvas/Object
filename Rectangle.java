package Circle;

public class Rectangle {
    private int a;
    private int b;
    Rectangle(int h, int a) throws RadiusExseption {
        if(a < 0 || h < 0) throw new RadiusExseption("can't be minus");
        this.b=h;
        this.a=a;
    }
    public int getH(){
        return b;
    }
    public void setH(int b){
        this.b=b;
    }
    public int getA(){
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public float S(){
        return a*b;
    }
    public float P(){
        return 2*a+2*b;
    }
}
