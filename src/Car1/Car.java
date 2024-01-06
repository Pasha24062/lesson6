package Car1;

public class Car {
    private String engine;

    public Car(Engine engine) {
        this.engine = engine.toString().toString();
    }
    void ПочатиРух(){
        System.out.println("Автомобіль поїхав");
    }
    void ЗупинитиРух(){
        engine.strip();
        System.out.println("Автомобіль зупинився");
    }
}
