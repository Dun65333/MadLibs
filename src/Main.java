import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter a place");
        String place = response.nextLine();
        System.out.println("Enter an animal");
        String animal = response.nextLine();
        System.out.println("Enter a height");
        String height = response.nextLine();
        System.out.println("Enter a food");
        String food = response.nextLine();
        System.out.println("One day you were walking to " + place + " with your pet " + animal + " who was a whopping " + height + " in height. When your pet " + animal + " got hungry on the walk, you tried to feed it its' favorite, " + food + " . Unfortunately, it wanted to eat you instead. RIP.");
    }
}
