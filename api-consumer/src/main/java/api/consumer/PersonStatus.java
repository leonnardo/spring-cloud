package api.consumer;

/**
 * Created by leonnardo on 16/01/17.
 */
public class PersonStatus {

    private Person person;
    private String status;

    public PersonStatus(Person person) {
        this.person = person;
        this.status = person.getAge() > 25 ? "Old" : "New";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
