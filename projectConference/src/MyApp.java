import TestModuleForAdmin.setupConference;
import TestModuleForAttendee.TestRegistration;

/**
 * Created by Sandipa on 8/28/2017.
 */
public class MyApp {
    public static void main(String[] args)
    {
        setupConference setupconference=new setupConference();
        setupconference.ViewAndPrint();

        TestRegistration testregistration=new TestRegistration();
        testregistration.performRegistration(setupconference.conference, "sk", "ksbs@gmail.com", "Bbb");
        testregistration.performRegistration(setupconference.conference, "js", "jb@gmail.com", "Aaa");
        testregistration.performRegistration(setupconference.conference, "pb", "pb@gmail.com", "Aaa");
        testregistration.performRegistration(setupconference.conference, "sb", "sb@gmail.com", "Aaa");
        testregistration.performRegistration(setupconference.conference, "cd", "cd@gmail.com", "Ccc");
        setupconference.ViewAndPrint();
        setupconference.PrintAttendeeList();
    }
}
