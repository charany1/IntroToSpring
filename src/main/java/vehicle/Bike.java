package vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tyre.Tyre;

@Component("bike")
public class Bike implements Vehicle{

    @Autowired
    private Tyre tyre;

    public void drive(){
        tyre.setBrand("CEAT");
        System.out.println("Bike "+ tyre.getBrand()+ " pe bhaag rhi he!");
    }
}
