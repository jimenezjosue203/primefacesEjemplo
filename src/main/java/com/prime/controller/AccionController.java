package com.prime.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "accionController")
@SessionScoped
public class AccionController {

	private String texto;

	@PostConstruct
	public void init() {
		System.out.println("############# texto");
	}

	public void accionBoton() {
		System.out.println(texto);
		try {
			FacesContext contex = FacesContext.getCurrentInstance();
			contex.getExternalContext().redirect("/prime/inicio.xhtml");
		} catch (Exception e) {
			System.out.println("Me voy al carajo, no funciona esta redireccion");
		}
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
