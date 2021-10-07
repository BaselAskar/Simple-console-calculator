package se.lexicon;

/**
 * Simple-calculator
 * @author Basel-Askar
 */
public class App 
{
    public static void main( String[] args ){

        // insert first number
        double number1 = UserInput.inputNumber("First number: ");

        //insert the operator
        String operator = UserInput.inputOperator();

        //insert second number
        double number2 = UserInput.inputNumber("Second number: ");

        // result
        switch (operator){
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
    }

}
