package com.example.demo;

import com.example.demo.models.UserReviewModelDTO;
import com.example.demo.services.UserReviewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserReviewService userService;

    @Test
    public void find() throws Exception {

        UserReviewModelDTO newuser = new UserReviewModelDTO();
        newuser.setid(1);
        newuser.setFirst_name("ashan");
        newuser.setLast_name("pramod");
        newuser.setage("20");
        newuser.setEmail("ashanpro@gmail.com");



        List<UserReviewModelDTO> userDTOS = Arrays.asList(newuser);
        given(userService.allUser()).willReturn(userDTOS);

        this.mockMvc.perform((get("http://localhost:8080//api/User/all")))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'user_id': 1, 'first_name': 'ashan', 'last_name': 'pramod','age':'20', 'email': 'ashanpro@gmail.com',}]"));
    }
}


    @Test
    public void contextLoads() {
    }

}
