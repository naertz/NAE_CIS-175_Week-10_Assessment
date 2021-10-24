/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Oct 23, 2021
 */

package computer.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import computer.beans.Computer;
import computer.beans.Cpu;

@Configuration
public class BeanConfiguration {
    @Bean
    public Computer computer() {
        Computer bean = new Computer("GIGABYTE-WORKSTATION-234");
        //bean.setRam(128);
        //bean.setValue(7000.00);
        //bean.setIsWaterCooled(false);
        return bean;
    }
    
    @Bean
    public Cpu cpu() {
        Cpu bean = new Cpu("AMD", "Ryzen Threadripper", "3990x", 64);
        return bean;
    }
}
