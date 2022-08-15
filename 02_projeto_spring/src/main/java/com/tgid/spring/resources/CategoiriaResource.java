package com.tgid.spring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoiriaResource {
	
	@RequestMapping(value="mensage", method=RequestMethod.GET)
	public @ResponseBody String listar() {
		return "REST está funcionando";
	}
	
}
