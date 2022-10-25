package ml.lottery;

import java.util.List;

public class LotteryNumbers {
    private List<Integer> numbers;

    public LotteryNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
