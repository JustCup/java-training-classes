import by.gsu.epamlab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        // 1. Create an array of minimum 5 objects (the element with the index 2 should be empty; the last element
        // of the array should be created with the no-arg constructor; other elements are valid and should be created
        // with parameterized constructors).
        BusinessTrip[] trips = {
                new BusinessTrip("Vitaliy Nalivkin", 500, 5),
                new BusinessTrip("Valentin Petuhov", 800, 7),
                null,
                new BusinessTrip("Lilia Agusha", 553, 3),
                new BusinessTrip("Egor Letov", 953, 10),
                new BusinessTrip(),
        };

        BusinessTrip maxCostTrip = trips[0];
        // 2. Output the array content to the console, using show() method, and the business trip with maximum cost.
        for (BusinessTrip trip : trips) {
            if (trip != null) {
                trip.show();
                if (maxCostTrip.getTotal() < trip.getTotal()) {
                    maxCostTrip = trip;
                }
            }
        }
        System.out.println("Max business trip cost: ");
        maxCostTrip.show();

        // 3. Update the employee`s transportation expenses for the last object of the array.
        trips[trips.length - 1].setTransport(624);

        // 4. Output the total duration of two initial trips by the single operator.
        System.out.printf("Duration = %d\n", trips[0].getDays() + trips[1].getDays());

        // 5. Output the array content to the console (one element per line), using toString( ) method implicitly.
        for (BusinessTrip trip : trips) {
            System.out.println(trip);
        }
    }
}
