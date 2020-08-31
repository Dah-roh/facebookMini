public class User {

    public Long id;
    public String username;
    public String fullName;
    public String emailAddress;
    public Long phoneNumber;
    public String birthSign;


    public User() {
    }

    public User(Long id, String username, String fullName, String emailAddress, Long phoneNumber, String birthSign) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.birthSign = birthSign;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthSign() {
        return birthSign;
    }

    public void setBirthSign(String birthSign) {
        this.birthSign = birthSign;
    }
}
