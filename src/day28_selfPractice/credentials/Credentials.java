package day28_selfPractice.credentials;

public class Credentials {


    private String userName, password;

    public Credentials(String userName, String password) {
       setUserName(userName);
       setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if (password == null) {
            System.err.println("Enter a Password");
            System.exit(1);
        }
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password)) {
            System.err.println("MUST be a strong password: It must contain at least one letter, one digit and one special characters." +
                    " Must be at least 8 characters long , and should not contain space");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassword(String password) {
        char[] pwChar = password.toCharArray();

        int countLetter = 0;
        for (char ch : pwChar) {
            if (Character.isLetter(ch)) {
                countLetter++;
            }
        }
        int countDigit = 0;
        for (char ch : pwChar) {
            if (Character.isDigit(ch)) {
                countDigit++;
            }
        }
        int countSpecialChar = 0;
        for (char ch : pwChar) {
            if (!(Character.isLetterOrDigit(ch))) {

                countSpecialChar++;
            }
        }
        int countSpace = 0;
        for (char ch : pwChar) {
            if (Character.isSpaceChar(ch)) {
                countSpace++;
            }
        }
        return pwChar.length >= 8 && countLetter >= 1 && countDigit >= 1 && countSpecialChar >= 1 && countSpace >= 0;

    }

    public String toString() {
        return "Credentials{" +
                "userName='" + getUserName() + '\'' +
                ", password='" +getPassword()+
                '}';
    }
}

/*
create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()


 */