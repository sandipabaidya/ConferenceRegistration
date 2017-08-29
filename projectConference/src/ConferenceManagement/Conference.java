package ConferenceManagement;

import java.util.*;

/**
 * Created by Sandipa on 8/28/2017.
 */
public class Conference {
    private Conference conference = null;
    private String name;
    public ArrayList<ISession> sessions;

    public Conference(String name){
        this.name=name;
        sessions = new ArrayList<ISession>();
    }


    public void addSession(ISession session) {
        sessions.add(session);
    }

    public ISession getSessionByName(String sessionName) {
        for (ISession session:sessions
                ) {
            if(session.getName().toLowerCase().equals(sessionName.toLowerCase())){
                return session;
            }
        }
        return null;
    }

    public void getRegistrationStatus() {
        System.out.println("Registration Status");
        for (ISession session:sessions
             ) {
            System.out.println(session.bookingStatus());
        }
        System.out.println("----------------------------\n");
    }


    public void printAttendees() {
        for (ISession session:sessions
                ) {
            System.out.println("People registered for Session: " + session.getName());
            for (Map.Entry<String, Attendee> entry:session.getAttendees().entrySet()
                 ) {
                System.out.println(entry.getValue().getName());
            } ;

        }
    }
}
