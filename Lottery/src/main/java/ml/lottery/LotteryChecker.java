package ml.lottery;

import java.util.ArrayList;
import java.util.List;

public class LotteryChecker {
    static List<Integer> lotteryWinNumbers(List<Integer> userNumbers, List<Integer> drawNumbers) {
        List<Integer> winNumbers = new ArrayList<>(userNumbers);
        winNumbers.retainAll(drawNumbers);
        return winNumbers;
    }
}
