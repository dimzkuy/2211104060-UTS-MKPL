package lib;

public class PersonalData {
    public String firstName;
    public String lastName;
    public String idNumber;
    public String address;
    public boolean isForeigner;
    public boolean gender; // true = Laki-laki, false = Perempuan

    public PersonalData(String firstName, String lastName, String idNumber, String address, boolean isForeigner,
            boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
}
