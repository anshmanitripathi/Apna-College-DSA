public class c_getter_setter{
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("RED");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        p1.setColor("Green");

        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}