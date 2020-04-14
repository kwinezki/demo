package de.infomotion.kw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "AbfrageMitHibernate")
@ComponentScan(basePackages = "de.infomotion.kw.demo")
//@EntityScan(basePackages =  "AbfrageMitHibernate")
@EntityScan(basePackages =  "de.infomotion.kw.demo")
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}