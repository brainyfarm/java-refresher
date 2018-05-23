package printing;

public class Printer {
    public boolean isOn = false;

    public void togglePowerSwitch() {
        if(isOn) {
            isOn = false;
            System.out.println("Power Off");
        } else {
            isOn = true;
            System.out.println("Power On");
        }
    }
    public void print(String[] data) {
        // System.out.println(data);
        if(isOn) {
            for(int i = 0; i < data.length; i++) {
                System.out.println("Printing " + data[i]);
            }
        } else {
            System.out.println("Printer is off");
        }
    }

}
