package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ventas")
public class ventasControlador {

	@GetMapping
	public String getVentas() {
		return "ventas";
	}
}
