package train;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void getPriceTicket() {
        Ticket ticket = new Ticket(25,100);
        assertEquals(21.0,ticket.getPriceTicket());
    }

    @Test
    void getPriceTicketUnder() {
        Ticket ticket = new Ticket(15,100);
        assertEquals(16.8,ticket.getPriceTicket());
    }

    @Test
    void getPriceTicketOver() {
        Ticket ticket = new Ticket(75,100);
        assertEquals(12.6,ticket.getPriceTicket());
    }


}