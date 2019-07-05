package com.sopra.spring.ejemplo02spring.ej02;



import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ej02.xml");
		List<Chorizo> ristraDeChorizos = context.getBean("miLista", List.class);
		for (int i = 0; i < 10; i++) {
			ristraDeChorizos.add(context.getBean("chorizo",Chorizo.class));
		}
		ristraDeChorizos.get(3).setMarca("Ezequiel");
		System.out.println(ristraDeChorizos);
		((AbstractApplicationContext)context).close();
	}

}
