import java.util.Scanner;


class DebugTrip {
    private String destinationCity;
    private String departureCity;
    private String mode;

    
    public DebugTrip(String destinationCity) {
        this.destinationCity = destinationCity;
        this.departureCity = "Unknown"; 
        this.mode = "Unknown";  
    }

    
    public DebugTrip(String destinationCity, String departureCity) {
        this.destinationCity = destinationCity;
        this.departureCity = departureCity;
        this.mode = "Unknown";  
    }

   
    public DebugTrip(String destinationCity, String departureCity, String mode) {
        this.destinationCity = destinationCity;
        this.departureCity = departureCity;
        this.mode = mode;
    }

   
    public String getDestination() {
        return destinationCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getMode() {
        return mode;
    }
}

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        String destinationCity;
        String departureCity;
        String mode;

       
        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();
        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();
        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

        
        DebugTrip trip1 = new DebugTrip(destinationCity);                 
        DebugTrip trip2 = new DebugTrip(destinationCity, departureCity);  
        DebugTrip trip3 = new DebugTrip(destinationCity, departureCity, mode); 

       
        display(trip1);
        display(trip2);
        display(trip3);
    }

  
    public static void display(DebugTrip trip) {
        System.out.println("Going to " + trip.getDestination());
        System.out.println("Leaving from " + trip.getDepartureCity());
        System.out.println("Going by " + trip.getMode());
        System.out.println();
    }
}
