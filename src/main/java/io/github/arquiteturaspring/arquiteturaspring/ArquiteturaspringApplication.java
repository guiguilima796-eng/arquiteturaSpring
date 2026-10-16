package io.github.arquiteturaspring.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {

//		SpringApplication.run(ArquiteturaspringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("guigol");
		builder.run(args);
//		ExemploValue exemploValue = builder.context().getBean(ExemploValue.class);
//		exemploValue.imprimirVariable();
		AppPropieties appPropieties = builder.context().getBean(AppPropieties.class);
		System.out.println("Valor da variável do AppPropieties: " + appPropieties.getVariable());
		System.out.println("Valor do valor do AppPropieties: " + appPropieties.getValor());
	}

}
