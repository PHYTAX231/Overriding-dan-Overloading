package Properties;

public class Circle extends Shapes_Attributes{

    public Circle(float Diameter){
        this.diameter = Diameter;
    }

    public float count(float diameter){
        System.out.println("Calculating the Area of the Circle");
        this.sum = (float) (Math.PI * diameter);
        return sum;
    }

    public float count(){
        System.out.println("Calculate the Perimeter of the Circle");
        float rad = diameter / 2;
        this.sum = (float) (Math.PI * Math.pow(rad, 2));
        return sum;
    }

    public void Display(){
        System.out.println("Total Circle sum : " + sum);
    }
}
