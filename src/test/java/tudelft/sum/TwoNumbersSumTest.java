package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void bothPositive(){
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(7);
        first.add(1);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(6);
        second.add(1);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first,second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(1);
        exp.add(3);
        exp.add(2);
        Assertions.assertEquals(exp,result);
    }

    @Test
    public void positiveAndZero() {
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(0);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(0);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first, second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(1);
        exp.add(0);
        Assertions.assertEquals(exp, result);
    }

    @Test
    public void zeroAndPositive() {
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(0);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(5);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first, second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(1);
        exp.add(5);
        Assertions.assertEquals(exp, result);
    }

    @Test
    public void bothZero() {
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(0);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(0);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first, second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(0);
        Assertions.assertEquals(exp, result);
    }

    @Test
    public void negativeAndPositive() {
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(-1);
        first.add(0);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(5);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first, second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(0);
        exp.add(5);
        Assertions.assertEquals(exp, result);
    }
    @Test
    public void positiveAndNEgative() {
        TwoNumbersSum example = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(0);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(-1);
        second.add(5);
        ArrayList<Integer> result = new ArrayList<>();
        result = example.addTwoNumbers(first, second);
        ArrayList<Integer> exp = new ArrayList<>();
        exp.add(-5);
        Assertions.assertEquals(exp, result);
    }
}
