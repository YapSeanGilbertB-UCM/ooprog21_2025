import java.util.Scanner;

class DebugBox {
    private int width;
    private int length;
    private int height;

  
    public DebugBox() {
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

   
    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    
    public void showData() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }

    public double getVolume() {
        return width * length * height;
    }
}

public class DebugFour3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w, l, h;

        System.out.print("Enter width of box >> ");
        w = input.nextInt();
        System.out.print("Enter length of box >> ");
        l = input.nextInt();
        System.out.print("Enter height of box >> ");
        h = input.nextInt();


        DebugBox box1 = new DebugBox();               
        DebugBox box2 = new DebugBox(w, l, h);        

     
        System.out.println("The dimensions of the first box are:");
        box1.showData();
        System.out.print("The volume of the first box is ");
        showVolume(box1);

        System.out.println("The dimensions of the second box are:");
        box2.showData();
        System.out.print("The volume of the second box is ");
        showVolume(box2);
    }

   
    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
