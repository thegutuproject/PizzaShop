package com.thegutuproject.pizzashop;

import com.thegutuproject.pizzashop.domain.OrderLog;
import com.thegutuproject.pizzashop.helper.OrderSorterHelper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzashopApplication {

	public static void main(String[] args) {


		if (args.length == 2 && !("").equals(args[0]) && !("").equals(args[1])) {

			OrderSorterHelper orderSorterHelper = new OrderSorterHelper();

			String fileInput = args[0];
			String fileOutput = args[1];

			OrderLog orderLog = orderSorterHelper.createOrderLog(fileInput);
			orderSorterHelper.sortOrderLog(orderLog);
			orderSorterHelper.writeOrderLogToFile(orderLog, fileOutput);

		}

		/**
		 * @TODO
		 * write unit tests
		 * expand structure for possible web use/db use
		 * stub out resource, service, data provider, etc
		 */


//		SpringApplication.run(PizzashopApplication.class, args);
	}
}
