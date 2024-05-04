import java.time.LocalDateTime;

public class showTime {

  public static void main(String[] args) {
    // Get the current date and time
    LocalDateTime now = LocalDateTime.now();

    // Format and display the date and time
    System.out.println("Current Date and Time: " + now.toString());
  }
}