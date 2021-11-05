package computer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import computer.beans.Computer;
import computer.beans.Cpu;
import computer.controller.BeanConfiguration;
import computer.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}
	
	@Autowired
	ComputerRepository repo;
	
	public void run(String...args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer powerfulComputer = appContext.getBean("computer", Computer.class);
		powerfulComputer.setIsWaterCooled(true);
		repo.save(powerfulComputer);
		
		Computer averageComputer = new Computer("ACER-COMPUTER-222", 16, 799.99, false);
		Cpu averageCpu = new Cpu("AMD", "Ryzen 7", "1700x", 8);
		averageComputer.setCpu(averageCpu);
		repo.save(averageComputer);
		
		List<Computer> allComputers = repo.findAll();
		for (Computer computer : allComputers) {
			System.out.println(computer.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
