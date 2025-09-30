import java.util.Scanner;


class DebugPen {
    private String point;
    private String color;

    public DebugPen() {
        this.color = "Black";  
        this.point = "Medium"; 
    }

    public DebugPen(String point, String color) {
        this.point = point;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;

      
        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();
        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

    
        pen1 = new DebugPen();  
        pen2 = new DebugPen(point, color);  

        System.out.println("Default value pen:");
        display(pen1);
        System.out.println("User value pen:");
        display(pen2);
    }

    public static void display(DebugPen p) {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}
