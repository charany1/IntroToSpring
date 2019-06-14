package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vehicle.Car;
import vehicle.Vehicle;

@Configuration
public class BeanConfig {

    @Bean
    public Vehicle getVehicle(){
        return new Car();
    }




}
