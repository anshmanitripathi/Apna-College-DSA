public class a_basics {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.color = "Red";
        p1.tip = 5;
        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.setColor("Green");

        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}