package math.service;
//third
//add sub mult div rem
import math.domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiply(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remainder(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }
}
