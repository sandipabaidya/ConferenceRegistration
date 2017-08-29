package ConferenceManagement;
import java.util.*;
/**
 * Created by Sandipa on 8/28/2017.
 */
public class Attendee {
    private String email;
    private String name;
    private ISession session;
    public Attendee(String email,String name){
        this.email=email;
        this.name=name;
    }

    public boolean Register(ISession session){
        if(session.seatLeft() <= 0)
            return false;

        this.session= session;
        this.session.addAttendees(this.email, this);

        return true;
    }

    public void UnRegister(){
        this.session.getAttendees().remove(this.email);
    }

    public String toString(){
        return "Attendee: " + this.name + "\n" + "email: " + this.email + "\n"
                + "Session: " + this.session.getName();

    }

    public String getName(){
        return this.name;

    }

    public String getEmail(){
        return this.email;
    }


}
