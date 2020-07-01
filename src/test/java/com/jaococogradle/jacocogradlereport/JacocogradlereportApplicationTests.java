package com.jaococogradle.jacocogradlereport;

import com.jaococogradle.jacocogradlereport.service.DataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class JacocogradlereportApplicationTests {

	@Autowired(required = false)
	DataService dataService;
	@Test
	void contextLoads() {
		String s = dataService.dataServiceCall();
		Assertions.assertNotNull(s);
	}

	@Test
	void context() throws InterruptedException {
		String s = dataService.dataServiceCall();
		Assertions.assertNotNull(s);
		Thread.sleep(2000);
	}

}
