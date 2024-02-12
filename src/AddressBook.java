public class AddressBook {
    private Person[] contactList;
    private int numContacts;
    private final int DEFAULT_MAX_CONTACTS = 10; // the use of 'final' keyword specifies that this var is a constant

    // constructor for specified number of contacts
    public AddressBook(int maxNumber) {
        contactList = new Person[maxNumber];
        numContacts = 0;
    }

    // constructor for default number of contacts
    public AddressBook() {
        contactList = new Person[DEFAULT_MAX_CONTACTS];
        numContacts = 0;
    }

    // add contacts to contactList
    public void add(Person newContact) {
        if (numContacts == contactList.length) {
            expandCapacity();
            contactList[numContacts] = newContact;
            ++numContacts;
        }
    }

    // helper method to copy contactList to larger array
    private void expandCapacity() {
        Person[] largerList = new Person[2*contactList.length];
        for (int i = 0; i < contactList.length; ++i) {
            largerList[i] = contactList[i];
        } contactList = largerList;
    }

    public boolean remove(Person target) {
        int i = 0;
        while ((i < numContacts) && !contactList[i].equals(target)) {
            i++;
        }
        if (i == numContacts) {
            return false;
        } else {
            contactList[i] = contactList[numContacts - 1];
            numContacts = numContacts - 1;
            return true;
        }
    }
}
