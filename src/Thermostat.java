public class Thermostat {
    int level = 26;
    public String increaseTemp(){
        return "Increasing Temperature " + ++level;
    }

    public String decreaseTemp(){
        return "Decreasing Temperature " + --level;
    }
}
