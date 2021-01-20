package com.udacity.pricing.tests;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.net.URI;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // use SpringRunner of Junit to run test cases
@WebMvcTest(PricingController.class) // use WebMvc of Spring Boot Test to test PricingController class
public class PricingControllerUnitTest {
    @Autowired
    private MockMvc mockMvc; // use MockMvc to quickly test MVC Controller without Http Server

    /**
     * @Mockbean: mocks Service layer Bean
     * @Mockbean: creates Mockito mock of the services which are dependence of Controller
     * */
    @MockBean
    PricingService priceService;

    @Test
    public void getPriceOfAVehicle() throws Exception {
        this.mockMvc.perform(get("/services/price?vehicleId=1"))
                .andExpect(status().isOk()); // set Expectations on HTTP responses status received from Controller class

        // verifies the times (1 time) a mock method has been called
        verify(this.priceService, times(1)).getPrice(1L);
    }

    // TEST WITH JUNIT AND JUPITER WORKS
//    @Test
//    public void getPriceOfAVehicle() throws Exception {
//        get(new URI("/services/price?vehicleId=1" ))
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .accept(MediaType.APPLICATION_JSON_UTF8);
//        andExpect(status().isOk());
//}
//    private void andExpect(ResultMatcher ok) {
//    }
}
