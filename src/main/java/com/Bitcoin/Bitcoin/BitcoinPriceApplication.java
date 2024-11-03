package com.Bitcoin.Bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Bitcoin.Bitcoin.Service.PriceService;

@SpringBootApplication
public class BitcoinPriceApplication implements CommandLineRunner {
	@Autowired
	PriceService priceService;

	public static void main(String[] args) {
		SpringApplication.run(BitcoinPriceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running!............");
		System.out.println(priceService.getPrice());
	}

}
