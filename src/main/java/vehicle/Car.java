package vehicle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car")
public class Car  implements Vehicle{


    public void drive(){
        System.out.println("Car chal rhi he!");
    }
}
