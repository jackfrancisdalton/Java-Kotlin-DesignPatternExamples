package Java.Behavioral.Strategy;

import Java.Behavioral.Strategy.DispatchStrategy.DispatchStrategy;

/**
 * Created by Jack F. Dalton on 0029 29 08 2016.
 */
public class UserDetails {

    private String fullName;
    private DispatchStrategy preferedFormOfContact;

    public UserDetails(String fullName, DispatchStrategy preferedFormOfContact) {
        this.fullName = fullName;
        this.preferedFormOfContact = preferedFormOfContact;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DispatchStrategy getPreferedFormOfContact() {
        return preferedFormOfContact;
    }

    public void setPreferedFormOfContact(DispatchStrategy preferedFormOfContact) {
        this.preferedFormOfContact = preferedFormOfContact;
    }
}
