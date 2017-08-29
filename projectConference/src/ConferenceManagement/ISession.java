package ConferenceManagement;

import java.util.*;

/**
 * Created by Sandipa on 8/28/2017.
 */
public interface ISession {
    int getTotalSeats();
    int seatsBooked();
    int seatLeft();
    String getName();
    String bookingStatus();
    void addAttendees(String id, Attendee attendee);
    Map<String, Attendee> getAttendees();

}


