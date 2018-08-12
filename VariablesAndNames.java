public class VariablesAndNames{
    public static void main( String args[] ){
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        // Number of cars is 100.
        cars = 100;
        // Space for people in a car is 4.
        space_in_a_car = 4;
        // Number of drivers is 30.
        drivers = 30;
        // Number of total passengers is 90.
        passengers = 90;
        // Number of empty cars = Number of cars without driver.
        cars_not_driven = cars - drivers;
        // Number of cars driven = Number of drivers.
        cars_driven = drivers;
        // Carpool capacity = Total number of spaces available in all cars.
        carpool_capacity = cars_driven * space_in_a_car;
        // Average number of passengers per car = Total passengers / Number of cars driven.
        average_passengers_per_car = passengers / cars_driven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
    }
}
