package kg.alatoo.midtermproject;

import kg.alatoo.midtermproject.controllers.ClientsController;
import kg.alatoo.midtermproject.entities.Clients;
import kg.alatoo.midtermproject.services.ClientsService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;


@WebMvcTest(ClientsController.class)
public class ClientsControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientsService clientService;

    @Test
    public void testGetAllClients() throws Exception {
        List<Clients> clients = Arrays.asList(new Clients(), new Clients());
        Mockito.when(clientService.getAllClients()).thenReturn(clients);

        mockMvc.perform(MockMvcRequestBuilders.get("/clients"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }
}
