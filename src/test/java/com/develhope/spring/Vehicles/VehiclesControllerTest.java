package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.Car;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static com.develhope.spring.Vehicles.EntityofVehicles.Status.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VehiclesControllerTest {

	@Mock
	private VehiclesController vehiclesController;
	@Mock
	private VehiclesRepository vehiclesRepository;
	@Mock
	private ObjectMapper objectMapper = new ObjectMapper();

	private MockMvc mockMvc;

	@Test
	public void testCreateUser() throws Exception {
		Vehicles car = new Car(1L, "Audi", "Q7", 2967, "Red", "171 kW", "Mechanical",
				2001, "Diesel", 59700.00, 55900.00, "No", "Used", DISPONIBILE);
		mockMvc.perform(post("/vehicles/create")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(car)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").exists())
				.andExpect(jsonPath("$.brand").value("Audi"))
				.andExpect(jsonPath("$.model").value("Q7"))
				.andExpect(jsonPath("$.displacement").value(2967))
				.andExpect(jsonPath("$.color").value("Red"))
				.andExpect(jsonPath("$.power").value("171 kW"))
				.andExpect(jsonPath("$.transmissionType").value("Mechanical"))
				.andExpect(jsonPath("$.LocalDate").value(LocalDate.parse("2001-01-03")))
				.andExpect(jsonPath("$.fuelType").value("Diesel"))
				.andExpect(jsonPath("$.price").value(59700.00))
				.andExpect(jsonPath("$.discountPrice").value(55900.00))
				.andExpect(jsonPath("$.accessories").value("No"))
				.andExpect(jsonPath("$.condition").value("Used"))
				.andExpect(jsonPath("$.Status").value(DISPONIBILE));
	}
}