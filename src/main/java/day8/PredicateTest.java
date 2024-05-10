package day8;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = x -> x < 100;
        Predicate<Integer> predicate2 = x -> x > 0;
        Predicate<Integer> predicate3 = x -> x % 2 == 0;
        Predicate<Integer> predicate4 = x -> x == 0;
        Predicate<Integer> notPredicate4 = predicate4.negate();

        System.out.println("predicate1.test(100) : " + predicate1.test(100));
        System.out.println("predicate1.test(90) : " + predicate1.test(90));
        System.out.println("predicate2.test(80) : " + predicate2.test(80));
        System.out.println("predicate3.test(81) : " + predicate3.test(81));
        System.out.println("predicate4.test(0) : " + predicate4.test(0));
        System.out.println("notPredicate4.test(0) : " + notPredicate4.test(0));
    }
}
