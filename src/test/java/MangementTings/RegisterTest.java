package MangementTings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RegisterTest {
    CorporateClient corporateClient = new CorporateClient("Eddie", 21, ServiceLevel.PLATINUM);
    PrivateClient privateClient = new PrivateClient("Izzy", 22, ServiceLevel.GOLD);

    List<Client> clients = Arrays.asList(corporateClient, privateClient);

    Register register = new Register(clients);


    @Test
    void listOfContactNamesOfGold() {
        assertTrue(Collections.singletonList("Izzy").containsAll(register.listOfContactNamesOfGold()));
    }

    @Test
     void getClientNameById() {
        assertSame("Eddie", register.getClientNameById(21).get());
    }

    @Test
    void allClientAtGoldServiceLevel() {
        assertEquals(2, register.allClientAtGoldServiceLevel());

    }

    @Test
    void allClientAtPlatinumServiceLevel() {
        assertEquals(1, register.allClientAtPlatinumServiceLevel());

    }

    @Test
    void allClientAtPremiumServiceLevel() {
        assertEquals(0,register.allClientAtPremiumServiceLevel());
    }
}