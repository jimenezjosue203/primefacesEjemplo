package com.prime.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "inicioController")
@RequestScoped
public class InicioController {
	
	@ManagedProperty("#{accionController}")
	private AccionController accionController;
	
	private String texto;
	
	@PostConstruct
	private void init() {
		System.out.println("########## inicio");
		System.out.println(accionController.getTexto());
		texto = accionController.getTexto();
	}

	public AccionController getAccionController() {
		return accionController;
	}


	public void setAccionController(AccionController accionController) {
		this.accionController = accionController;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
