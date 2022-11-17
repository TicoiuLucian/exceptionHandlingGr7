package ro.itschool;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 21)
                throw new CustomException(number + "<21");
        } catch (CustomException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
