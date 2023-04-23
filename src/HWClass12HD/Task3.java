package HWClass12HD;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
names and if they're expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/


                Scanner scanner = new Scanner(System.in);


                System.out.print("Mom's first name? ");
                String momName = scanner.nextLine();


                System.out.print("Dad's first name? ");
                String dadName = scanner.nextLine();


                System.out.print("Boy or Girl? ");
                String babyGender = scanner.nextLine();


                String suggestedName;
                if (babyGender.equalsIgnoreCase("boy")) {
                    suggestedName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
                } else if (babyGender.equalsIgnoreCase("girl")) {
                    suggestedName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
                } else {
                    System.out.println("Invalid input!");
                    return;
                }


                System.out.println("Suggested baby name: " + suggestedName);
            }
        }

