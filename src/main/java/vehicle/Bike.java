package vehicle;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{
    public void drive(){
        System.out.println("Bike bhaag rhi he!");
    }
}
