package travelPlanner;
	
import java.time.LocalDate;
import java.time.LocalTime;

public class MyTravelPlanner {

    public String getPlan(LocalDate date, String weather, LocalTime firstAppointment, LocalTime lastAppointment) {

        return "Invalid plan"; 
    }

    public static void main(String[] args) {
        MyTravelPlanner planner = new MyTravelPlanner();
        LocalDate date = LocalDate.of(2024, 4, 11);
        String weather = "Sunny";
        LocalTime firstAppointment = LocalTime.of(9, 0);
        LocalTime lastAppointment = LocalTime.of(17, 0);
        System.out.println(planner.getPlan(date, weather, firstAppointment, lastAppointment));
    }
}
