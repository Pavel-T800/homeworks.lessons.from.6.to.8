package homework8_phone;

public class Main {

    public static void main(String[] args) {

        Phone phoneNumberOne = new Phone("+10 (656) 100 200", "Phone Lux 10", 233);
        Phone phoneNumberTwo = new Phone("+12 (777) 123 245", "Phone 5 Ultra", 266);
        Phone phoneNumberThree = new Phone("+48 (366) 120 020", "Phone ProPhone", 305);
        System.out.println(phoneNumberOne);
        System.out.println(phoneNumberTwo);
        System.out.println(phoneNumberThree);
        System.out.println(" ");

        String callerNameOne = phoneNumberOne.receiveCall("Name #1");
        String callerNameTwo = phoneNumberTwo.receiveCall("Name #2");
        String callerNameThree = phoneNumberThree.receiveCall("Name #3");
        System.out.println(callerNameOne + " is calling");
        System.out.println(callerNameTwo + " is calling");
        System.out.println(callerNameThree + " is calling");
        System.out.println(" ");

        String namePlusNumberOne = phoneNumberOne.receiveCall("Name #1", "+10 (333) 344 253");
        String namePlusNumberTwo = phoneNumberTwo.receiveCall("Name #2", "+10 (555) 808 020");
        String namePlusNumberThree = phoneNumberThree.receiveCall("Name #3", "+10 (777) 657 800");
        System.out.println(namePlusNumberOne);
        System.out.println(namePlusNumberTwo);
        System.out.println(namePlusNumberThree);
        System.out.println(" ");

        String phoneNumberOneString = phoneNumberOne.getNumber("+10 (333) 344 253");
        String phoneNumberTwoString = phoneNumberTwo.getNumber("10 (555) 808 020");
        String phoneNumberThreeString = phoneNumberThree.getNumber("+10 (777) 657 800");

        String[] phoneNumbers = {phoneNumberOneString, phoneNumberTwoString, phoneNumberThreeString};
        String message = "If you are interested, please contact us!";
        for (String phoneNumber : phoneNumbers) {
            System.out.println("Message: " + "'" + message + "'" + " sent successfully to: " + phoneNumber);
        }
    }
}
