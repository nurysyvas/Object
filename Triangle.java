package Circle;

public class Triangle {
    private int a;
    private int b;
    Triangle(int h, int a) throws RadiusExseption {
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
}
