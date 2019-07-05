package com.sopra.spring.ejemplo02spring.ej03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ej03.xml");
		Cubata cerveza = context.getBean("cubataDeCerveza", Cubata.class);
		System.out.println(cerveza);
		Cubata vinate = context.getBean("copaDeVino",Cubata.class);
		System.out.println(vinate);
		Cubata miVaso = context.getBean("vasoDeStas",Cubata.class);
		miVaso.setLicor(context.getBean("vinate",Licor.class));
		System.out.println(miVaso); 
	}

}
