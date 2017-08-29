package TestModuleForAttendee;
import ConferenceManagement.*;
import java.util.*;
/**
 * Created by Sandipa on 8/28/2017.
 */
public class TestRegistration {
    private Conference conference;
    private Attendee attendee;
    public TestRegistration(){

    }


    public void performRegistration(Conference conference, String attendeeName, String attendeeEmail, String sessionname){
        this.conference= conference;
        //View Available sessions
        conference.getRegistrationStatus();

        //Fill details of Attendee
        Attendee attendee=new Attendee(attendeeEmail, attendeeName);
        ISession session=conference.getSessionByName(sessionname);

        //Register for a given session
        if(session!=null) {
            if(attendee.Register(session))
            {
                //Print pass for attending the session
                System.out.println("Registration Successfull. Pass details:");
                System.out.println(attendee.toString());
                System.out.println("---------Thank You--------------\n");

            }
            else
                System.out.println("Registration UnSuccessfull. No Seats avaible");
        }
        else
            System.out.println("Incorrect Option Chosen");

    }

    //Register for a given session
    public void cancelRegistration() {
        attendee.UnRegister();
    }
}
