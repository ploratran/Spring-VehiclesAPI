package com.udacity.pricing.tests;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // use SpringRunner of Junit to run test cases
@WebMvcTest(PricingController.class) // use WebMvc of Spring Boot Test to test PricingController class
public class PricingControllerUnitTest {
    @Autowired
    private MockMvc mockMvc; // use MockMvc to quickly test MVC Controller without Http Server

    /**
     *
     * */
    @Mock
    PricingService priceService;

    @Test
    public void getPriceOfAVehicle() throws Exception {
        this.mockMvc.perform(get("/services/price?vehicleId=1"))
                .andExpect(status().isOk()); // set Expectations on HTTP responses status received from Controller class

        // verifies the times (1 time) a mock method has been called
        Mockito.verify(this.priceService, times(1)).getPrice(1L);
    }
}
