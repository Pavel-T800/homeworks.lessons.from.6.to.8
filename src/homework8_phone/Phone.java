package homework8_phone;

public class Phone {

    private String number;
    private String model;
    private int weight;


    Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    public String receiveCall(String nameOfCaller) {
        return nameOfCaller;
    }

    public String getNumber(String numberOfCaller) {
        return numberOfCaller;
    }
    public String receiveCall(String nameOfCaller, String numberOfCaller) {
        return nameOfCaller + " " + numberOfCaller;
    }

    public String sendMessage(String message) {
        return message;
    }

    @Override
    public String toString() {
        return number + " " + "'" + model + "'" + " " + weight + "g" ;
    }
}

