package se.lexicon;


import java.util.Objects;
import java.util.Scanner;

public class UserInput {

    final static Scanner SCANNER = new Scanner(System.in);

    public static double  inputNumber(String numberMassage){
        boolean inValidNumber;
        double number = 0;
        do{
            try{
                System.out.print(numberMassage);
                number = Double.parseDouble(SCANNER.nextLine());
                inValidNumber = false;
            }catch (NumberFormatException ex){
                System.out.println("Please insert number format");
                inValidNumber = true;
            }
        }while(inValidNumber);

        return number;
    }


    public static String inputOperator(){

        String operator;

        boolean inValidOperator;

        do {
            System.out.print("operator: ");
            operator = SCANNER.nextLine();
            if (!Objects.equals(operator, "+") && !Objects.equals(operator, "-") && !Objects.equals(operator, "*") && !Objects.equals(operator, "/")){
                System.out.println("This operator is not supported");
                inValidOperator = true;
            }else {
                inValidOperator = false;
            }
        }while(inValidOperator);

        return operator;
    }
}
