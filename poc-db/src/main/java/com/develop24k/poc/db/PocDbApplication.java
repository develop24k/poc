package com.develop24k.poc.db;

import com.develop24k.poc.db.entity.EntityHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@SpringBootApplication
public class PocDbApplication implements CommandLineRunner {

	@Autowired
	EntityHelper entityHelper;

	public static void main(String[] args) {
		SpringApplication.run(PocDbApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		entityHelper.RunQuery();


	}
}
