import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner strSC = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String inputTitel, inputInfo;
        int x = 1;
        ArrayList<String> toDoList = new ArrayList();
        ArrayList<String> infoList = new ArrayList();
        boolean run = true;
        int menyInput;
        boolean run2 = true;

        while (run) {
            System.out.println("1. Skapa ToDo\n2. Ta bort ToDo\n3. Srkiv ut ToDo\n4. Avsluta");
            try{
                menyInput = sc.nextInt();
                switch (menyInput) {
                    case 1:
                        System.out.println("Skapa en ToDo: ");
                        System.out.println("Titel: ");
                        inputTitel = strSC.nextLine();
                        toDoList.add(inputTitel);

                        System.out.println("Beskrivning ");
                        inputInfo = strSC.nextLine();
                        infoList.add(inputInfo);
                        break;
                    case 2:
                        if (toDoList.size() == 0) {
                            System.out.println("Listan är tom.");
                        } else {
                            System.out.println("Nuvarande lista:");
                            for (String s : toDoList) {
                                System.out.println(x + ". " + s);
                                x++;
                            }
                            x = 1;
                            while (run2) {
                                System.out.print("Välj: ");
                                int choice = sc.nextInt();
                                if (choice > 0) {
                                    toDoList.remove((choice - 1));
                                    run2 = false;
                                } else {
                                    System.out.println("Ogiltig input");
                                }
                            }
                        }


                        break;
                    case 3:
                        if (toDoList.size() == 0) {
                            System.out.println("Listan är tom.");
                        } else {
                            System.out.println("Nuvarande lista:");
                            for (String s : toDoList) {
                                System.out.println(x + ". " + s);
                                x++;
                            }
                        }
                        x = 1;
                        run2=true;
                        while (run2) {
                            System.out.print("Välj: ");
                            int choice = sc.nextInt();
                            if (choice > 0) {
                                System.out.println(infoList.get(choice - 1));
                                run2 = false;
                            } else {
                                System.out.println("Ogiltig input");
                            }
                        }
                        x = 1;
                        break;
                    case 4:
                        System.out.println("Programmet har avslutat");
                        run=false;
                        break;
                    default:
                        System.out.println("Ogiltigt val.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Bokstäver godkännes ej");
                sc.nextLine();
            }


        }


    }
}