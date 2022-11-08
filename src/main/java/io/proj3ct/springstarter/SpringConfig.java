package io.proj3ct.springstarter;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class SpringConfig {

    @Bean("carBean")
    public Car getCar(){
        return new Car();
    }
//h g h gv gjhh kj cv
    @Bean("carWithModelValue")
    public Car getCarWithModel(@Value("${car.model}") String model){
        return new Car(model);
    }


}
