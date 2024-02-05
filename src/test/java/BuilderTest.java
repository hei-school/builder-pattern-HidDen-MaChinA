import org.example.builder.Builder;
import org.example.model.Car;
import org.example.builder.CarBuilder;
import org.example.builder.Director;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BuilderTest {
    @Test
    public void createCarUsingDirector(){
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        Car utilityCar = director.buildUtilityCar(builder);
        Car powered = director.buildSportCar(builder);
        assertEquals("Standard", utilityCar.getEngine());
        assertEquals("High power", powered.getEngine());
    }
    @Test
    public void createCarUsingBuilder(){
        Builder builder = new CarBuilder();
        Car expected = new Car(4,"Standard","Standard",false);
        CarBuilder myCarBuilder = (CarBuilder) builder.setEngine("Standard").setSeats(4).setTripComputer("Standard");
        assertEquals(expected.haveGPS(), myCarBuilder.build().haveGPS());
    }
}
