package dmit2015.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class GreetingBean {

    //define a field to track the first name
    private String firstName;
    private String lastName;
    //we need to be able to get/set

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //action method when user clicks on the submit button
    public String getGreetingMessage(){
        if(firstName == null || firstName.isBlank()){
            return "";
        }
        if (lastName == null || lastName.isBlank())
        {
            return "";
        }
        return "Welcome " + firstName + " " + lastName  + " to DMIT2015";
        //return String.format("Welcome %s to SMIT2015!", firstName); <- dis one is better

    }

}


