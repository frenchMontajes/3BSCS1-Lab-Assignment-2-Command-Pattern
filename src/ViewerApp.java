import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        CentralHub rc = new CentralHub();
        Tv tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer music = new MusicPlayer();
        boolean stop = false;

        while (!stop){
            System.out.println("1. Turn on TV");
            System.out.println("2. Turn off TV");
            System.out.println("3. Turn on Lights");
            System.out.println("4. Turn off lights");
            System.out.println("5. Increase room Temperature");
            System.out.println("6. Decrease room Temperature");
            System.out.println("7. Play The Music");
            System.out.println("8. Pause The Music");
            System.out.println("9. Increase Music Volume");
            System.out.println("10.Decrease Music Volume");
            System.out.println("11.Exit");
            System.out.println("Select An Option:");
            int choice = scan.nextInt();

            switch (choice){
                case 1: rc.setCommand(new PowerOn(tv));
                        break;
                case 2: rc.setCommand(new PowerOff(tv));
                        break;
                case 3: rc.setCommand(new LightOn(light));
                        break;
                case 4: rc.setCommand(new LightOff(light));
                    break;
                case 5: rc.setCommand(new IncreaseTemp(thermostat));
                    break;
                case 6: rc.setCommand(new DecreaseTemp(thermostat));
                    break;
                case 7: rc.setCommand(new MusicPlay(music));
                    break;
                case 8: rc.setCommand(new MusicStop(music));
                    break;
                case 9: rc.setCommand(new IncreaseMusicVol(music));
                    break;
                case 10: rc.setCommand(new DecreaseMusicVol(music));
                    break;
                case 11: stop = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
            System.out.println(rc.clickButton());
            System.out.println();
        }

    }
}
