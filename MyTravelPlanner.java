package travelPlanner;
	
import java.time.LocalDate;
import java.time.LocalTime;

public class MyTravelPlanner {

    public String getPlan(LocalDate date, String weather, LocalTime firstAppointment, LocalTime lastAppointment) {
        if (weather.equalsIgnoreCase("Rainy") || weather.equalsIgnoreCase("Snowy")) {
            return "Please cancel or reschedule your appointments on " + date.toString() + ".";
        }
        
        LocalTime firstTrain;
        LocalTime lastTrain;
        if (date.getDayOfWeek().getValue() >= 1 && date.getDayOfWeek().getValue() <= 5) {
            firstTrain = LocalTime.of(6, 0);
            lastTrain = LocalTime.of(23, 0);
        } else { 
            firstTrain = LocalTime.of(10, 0);
            lastTrain = LocalTime.of(22, 0);
        }
        
        if (firstAppointment.isAfter(firstTrain) && lastAppointment.isBefore(lastTrain)) {
            return "Please take the " + firstTrain.toString() + " train to go to the city, and " +
                    lastTrain.toString() + " train to get back home on " + date.toString() + ".";
        } else {
            return "Please drive on " + date.toString() + ", and leave the house at your convenience.";
        }
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
