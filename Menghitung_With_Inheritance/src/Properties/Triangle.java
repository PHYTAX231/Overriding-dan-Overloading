package Properties;

public class Triangle extends Shapes_Attributes{

    public Triangle(float height, float width, float side) {
       this.height = height;
       this.width = width;
       this.side = side;
    }

    public float count(float side){
        System.out.println("Calculate the Perimeter of the Triangle");
        this.sum = side + side + side;
        return sum;
    }
    public float count(float height, float width){
        System.out.println("Calculate the Area of the Triangle");
        this.sum = height * width / 2;
        return sum;
    }

    public void Display(){
        System.out.println("Total Triangle sum : " + sum);
    }
}
