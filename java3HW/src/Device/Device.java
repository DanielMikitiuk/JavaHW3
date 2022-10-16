package Device;

import java.util.Scanner;

public class Device {
    private String name;
    private String voice = "";
    private String decript;

    public Device(String name, String decript) {
        this.name = name;
        this.decript = decript;
    }

    public void Sound() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter voice " + name);
            voice = sc.nextLine();
        }
        System.out.println(voice);
    }

    public void Show() {
        System.out.println(name);
    }

    public void Dect() {
        System.out.println("\nName: " + name + "\nVoice: " + voice + "\nDecript: " + decript);
    }

}
