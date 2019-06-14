import config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vehicle.Vehicle;

public class Application {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) context).register(BeanConfig.class);
        ((AnnotationConfigApplicationContext) context).refresh();
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.drive();


    }



}
