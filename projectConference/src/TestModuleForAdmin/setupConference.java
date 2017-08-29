package TestModuleForAdmin;

import ConferenceManagement.Attendee;
import ConferenceManagement.Conference;
import ConferenceManagement.Session;

/**
 * Created by Sandipa on 8/28/2017.
 */
public class setupConference {
    public Conference conference;
    public setupConference(){
        //Create new Conference
        conference=new Conference("SummerSeries");

        //Create new Conference (with List of sessions)
        conference.sessions.add(new Session("Aaa", 2 ,"sandipa", "H01"));
        conference.sessions.add(new Session("Bbb", 18 ,"riddhi", "H02"));
        conference.sessions.add(new Session("Ccc", 13 ,"vidya", "H03"));


    }



    public void ViewAndPrint()
    {
        //View status of registration
        conference.getRegistrationStatus();
    }
    public void PrintAttendeeList()
    {
        //Print list of Attendees for each session
        conference.printAttendees();
    }
}
