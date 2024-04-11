package travelPlanner;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class MyTravelPlannerTestCases {

    @Test
    public void testSunnyWeekdayWithinTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertEquals("Please take the 06:00 train to go to the city, and 23:00 train to get back home on 2024-04-11.", result);
    }

    @Test
    public void testSunnyWeekdayOutsideTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(4, 0), LocalTime.of(18, 0));
        assertEquals("Please drive on 2024-04-11, and leave the house at your convenience.", result);
    }

    @Test
    public void testRainyWeekday() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Rainy", LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-04-11.", result);
    }


    @Test
    public void testSunnyWeekendWithinTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(11, 0), LocalTime.of(19, 0));
        assertEquals("Please take the 10:00 train to go to the city, and 22:00 train to get back home on 2024-04-14.", result);
    }

    @Test
    public void testSunnyWeekendOutsideTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(8, 0), LocalTime.of(20, 0));
        assertEquals("Please drive on 2024-04-14, and leave the house at your convenience.", result);
    }

    @Test
    public void testSnowyWeekend() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 15), "Snowy", LocalTime.of(10, 0), LocalTime.of(18, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-04-15.", result);
    }

    @Test
    public void testSunnyWeekdayWithinTrainHoursA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertEquals("Please take the 06:00 train to go to the city, and 23:00 train to get back home on 2024-04-11.", result);
    }

    @Test
    public void testSunnyWeekdayOutsideTrainHoursA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(4, 0), LocalTime.of(18, 0));
        assertEquals("Please drive on 2024-04-11, and leave the house at your convenience.", result);
    }

    @Test
    public void testRainyWeekdayA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Rainy", LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-04-11.", result);
    }

    @Test
    public void testSunnyWeekendWithinTrainHoursA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(11, 0), LocalTime.of(19, 0));
        assertEquals("Please take the 10:00 train to go to the city, and 22:00 train to get back home on 2024-04-14.", result);
    }

    @Test
    public void testSunnyWeekendOutsideTrainHoursA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(8, 0), LocalTime.of(20, 0));
        assertEquals("Please drive on 2024-04-14, and leave the house at your convenience.", result);
    }

    @Test
    public void testSnowyWeekendA() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 15), "Snowy", LocalTime.of(10, 0), LocalTime.of(18, 0));
        assertEquals("Please cancel or reschedule your appointments on 2024-04-15.", result);
    }


    @Test
    public void testCloudyWeekdayWithinTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 12), "Cloudy", LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertEquals("Please take the 06:00 train to go to the city, and 23:00 train to get back home on 2024-04-12.", result);
    }

    @Test
    public void testCloudyWeekdayOutsideTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 12), "Cloudy", LocalTime.of(4, 0), LocalTime.of(18, 0));
        assertEquals("Please drive on 2024-04-12, and leave the house at your convenience.", result);
    }

    @Test
    public void testSunnyWeekdayBeforeFirstTrain() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(5, 0), LocalTime.of(9, 0));
        assertEquals("Please drive on 2024-04-11, and leave the house at your convenience.", result);
    }

    @Test
    public void testSunnyWeekdayAfterLastTrain() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 11), "Sunny", LocalTime.of(23, 30), LocalTime.of(23, 59));
        assertEquals("Please drive on 2024-04-11, and leave the house at your convenience.", result);
    }

    @Test
    public void testSunnyWeekendBeforeFirstTrain() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(7, 0), LocalTime.of(10, 0));
        assertEquals("Please drive on 2024-04-14, and leave the house at your convenience.", result);
    }

    @Test
    public void testSunnyWeekendAfterLastTrain() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 14), "Sunny", LocalTime.of(22, 0), LocalTime.of(23, 59));
        assertEquals("Please drive on 2024-04-14, and leave the house at your convenience.", result);
    }

    @Test
    public void testCloudyWeekendWithinTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 15), "Cloudy", LocalTime.of(12, 0), LocalTime.of(18, 0));
        assertEquals("Please take the 10:00 train to go to the city, and 22:00 train to get back home on 2024-04-15.", result);
    }

    @Test
    public void testCloudyWeekendOutsideTrainHours() {
        MyTravelPlanner planner = new MyTravelPlanner();
        String result = planner.getPlan(LocalDate.of(2024, 4, 15), "Cloudy", LocalTime.of(8, 0), LocalTime.of(20, 0));
        assertEquals("Please drive on 2024-04-15, and leave the house at your convenience.", result);
    }

}
