package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LegajoController {

	@Autowired
	private LegajoService legajoService;

	@RequestMapping(value = "/legajo", method = RequestMethod.GET)
	@ResponseBody
	public Iterable<Legajo> getLegajos() {
		return legajoService.findAll();
	}

}
