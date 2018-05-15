package fr.hidjic.proxiTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.hidjic.proxiTest.domain.Conseiller;

@Controller
public class IndexController {
	
	@Autowired
	private Conseiller unConseiller;

	public Conseiller getUnConseiller() {
		return unConseiller;
	}

	public void setUnConseiller(Conseiller unConseiller) {
		this.unConseiller = unConseiller;
	}
	
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public ModelAndView displayWelcome() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	
}
