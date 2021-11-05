/**
 * @author nae (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Nov 5, 2021
 */

package computer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import computer.beans.Computer;
import computer.repository.ComputerRepository;

@Controller
public class WebController {
	@Autowired
	ComputerRepository repo;
	
	@GetMapping("/addComputer")
	public String addComputer(Model model) {
		Computer computer = new Computer();
		model.addAttribute("newComputer", computer);
		return "add_computer";
	}
	
	@PostMapping("/update/{id}")
	public String updateComputer(Computer computer, Model model) {
		repo.save(computer);
		return viewComputerList(model);
	}
	
	@GetMapping({ "/", "viewList" })
	public String viewComputerList(Model model) {
		if (repo.findAll().isEmpty()) {
			return addComputer(model);
		}
		
		model.addAttribute("computers", repo.findAll());
		return "computer_list";
	}
	
	@GetMapping("/edit/{id}")
	public String editComputer(@PathVariable("id") long id, Model model) {
		Computer computer = repo.findById(id).orElse(null);
		model.addAttribute("newComputer", computer);
		return "add_computer";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Computer computer = repo.findById(id).orElse(null);
		repo.delete(computer);
		return viewComputerList(model);
	}
}
