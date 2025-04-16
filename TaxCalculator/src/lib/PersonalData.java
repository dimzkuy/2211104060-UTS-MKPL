package lib;

public class PersonalData {
    public String firstName;
    public String lastName;
    public String idNumber;
    public String address;
    public boolean isForeigner;
    public Gender gender;

    public PersonalData(String firstName, String lastName, String idNumber, String address, boolean isForeigner,
            Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
}
