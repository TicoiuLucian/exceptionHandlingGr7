package ro.itschool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // try with resources - orice clasa care implementeaza interfata AutoCloseable
        //se va inchide la final de try-catch
        // try normal - in clauza finally trebuie sa inchidem manual resursele deschise

        try (Scanner scanner = new Scanner(System.in)) {
            Integer x = Integer.parseInt(scanner.next().trim());
            System.out.println(x);
            File file = new File("ceva.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (NullPointerException e) {
            System.out.println("NULL POINTER EXCEPTION");
        } catch (IOException e) {
            System.out.println("RUNTIME EXCEPTION");
        } catch (RuntimeException ex) {
            System.out.println("IO EXCEPTION");
        } catch (Exception e) {
            System.out.println("BIGGEST EXCEPTION");
        }


    }
}
