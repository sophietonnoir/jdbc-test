package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EleveProfilRespoController {
	
	@Autowired
	
	@RequestMapping("/eleve_profilRespo")
	public String Profil_respo(){
		return "eleve_profilRespo";
	}

}
