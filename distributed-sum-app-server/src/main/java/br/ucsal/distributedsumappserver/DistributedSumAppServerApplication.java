package br.ucsal.distributedsumappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DistributedSumAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedSumAppServerApplication.class, args);
	}

}
