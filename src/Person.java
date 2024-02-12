public class Person {
    private int age;
    private String lastName;
    private String firstName;
    private String email;

    public Person(int theAge, String first, String last, String theEmail) {
        age = theAge;
        firstName = first;
        lastName = last;
        email = theEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public boolean equals(Person other) {
        if (this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)) {
            return true;
        } else {
            return false;
        }
    }
}
