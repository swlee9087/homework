package math.controller;

import math.domain.CalculatorDTO;
import math.service.CalculatorService;
import math.service.CalculatorServiceImpl;
import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println("first number");
        calculator.setNum1(scanner.nextInt());
        System.out.println("operator");
        calculator.setOpcode(scanner.next());
        System.out.println("second number");
        calculator.setNum2(scanner.nextInt());

        int result = 0;
        switch (calculator.getOpcode()){
            case"+": result= calculatorService.add(calculator); break;
            case"-": result= calculatorService.subtract(calculator); break;
            case"*": result= calculatorService.multiply(calculator); break;
            case"/": result= calculatorService.divide(calculator); break;
            case"%": result= calculatorService.remainder(calculator); break;
        }
        System.out.printf("%d %s %d = %d", calculator.getNum1(), calculator.getOpcode(), calculator.getNum2(), result);
    }
}
