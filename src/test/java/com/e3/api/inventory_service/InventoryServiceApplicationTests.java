package com.e3.api.inventory_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("unit")
class InventoryServiceApplicationTests {

	// @Test
	// void contextLoads() {
	// }

	@Test
	void testMain() {
		System.setProperty("spring.profiles.active", "unit");

		InventoryServiceApplication.main(new String[] {});
	}

}
