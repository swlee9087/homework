package math.service;

import math.domain.CalculatorDTO;
//second
public interface CalculatorService {
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiply(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remainder(CalculatorDTO calculator);
}
