package vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import tyre.Tyre;

@Component("car")
public class Car  implements Vehicle{


    @Autowired
    private Tyre tyre;

    public void drive(){
        tyre.setBrand("MRF");
        System.out.println("Car "+ tyre.getBrand() + "pe chal rhi he!");
    }
}
