package Circle;

public class Rectangle {
    private int h;
    private int a;
    Rectangle(int h, int a) throws RadiusExseption {
        if(a < 0 || h < 0) throw new RadiusExseption("can't be minus");
        this.h=h;
        this.a=a;
    }
    public int getH(){
        return h;
    }
    public void setH(int h){
        this.h=h;
    }
    public int getA(){
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
