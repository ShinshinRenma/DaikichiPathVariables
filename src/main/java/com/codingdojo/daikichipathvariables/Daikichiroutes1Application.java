package com.codingdojo.daikichipathvariables;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
public class Daikichiroutes1Application {

	public static void main(String[] args) {
		SpringApplication.run(Daikichiroutes1Application.class, args);
	}
	
	@RequestMapping("/")
    // 3. Method that maps to the request route above
    public String welcome() { // 3
            return "Welcome!";
    }
	@RequestMapping("/daikichi/today")
    // 3. Method that maps to the request route above
    public String findLuck() { // 3
            return "Today you will find luck in all of your endeavors!";
    }
	@RequestMapping("/daikichi/tomorrow")
    // 3. Method that maps to the request route above
    public String tomorrow() { 
            return "Tomorrow, an opportunity will rise, so be sure to be open to new ideas!";
    }
	@RequestMapping("/daikichi/travel/{destination}")
	public String travel(@PathVariable("destination") String destination) {
		return "Congratulations!  You will soon travel to " + destination;
	}
	
	@RequestMapping("/daikichi/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if(num % 2 == 0) {
			return "You will take a great journey in the near future, but be wary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}

}


