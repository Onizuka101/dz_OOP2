
public class ServiceStation {
    public void check(Car car) {
        checkWheeledTransport(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        checkWheeledTransport(bicycle);
        bicycle.updateTyre();
    }

    public void check(Truck truck) {
        checkWheeledTransport(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void checkWheeledTransport(WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }
}
