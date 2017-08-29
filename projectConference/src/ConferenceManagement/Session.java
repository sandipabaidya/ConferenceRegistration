package ConferenceManagement;

import java.sql.Time;
import java.util.*;

/**
 * Created by Sandipa on 8/28/2017.
 */
public class Session implements ISession {

    private int ID;
    private String name;
    private int totalSeats;
    private String speaker;
    private String venue;
    private Map<String, Attendee> attendees;

    public Session(String name, int totalSeats, String speaker, String venue) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.speaker = speaker;
        this.venue = venue;
        attendees = new HashMap<String, Attendee>();
    }

    @Override
    public int getTotalSeats() {
        return totalSeats;
    }

    @Override
    public int seatsBooked() {
        return attendees.size();
    }

    @Override
    public int seatLeft() {
        return totalSeats - attendees.size();
    }

    @Override
    public Map<String, Attendee> getAttendees() {
        return attendees;
    }

    @Override
    public void addAttendees(String id, Attendee attendee) {
        attendees.put(id,attendee);
    }
    @Override
    public String bookingStatus() {
        return "Session: " + getName() + "\t" + "Total Seats: " + getTotalSeats() + "\t"
                + "Seats Booked: " + seatsBooked()+ "\t"+ "Seats Left: " + seatLeft();
    }

    public String getName(){
        return name;
    }
}