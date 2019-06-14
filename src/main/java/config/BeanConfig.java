package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tyre.Tyre;
import vehicle.Car;
import vehicle.Vehicle;

@Configuration
@ComponentScan(basePackages = "vehicle,tyre")
public class BeanConfig {

   /* @Bean
    public Vehicle getVehicle(){
        return new Car();
    }
*/

/*

   @Bean
    public Tyre getTyre(){
       Tyre tyre =  new Tyre();
       tyre.setBrand("MRF");
       return tyre;
   }
*/


}
