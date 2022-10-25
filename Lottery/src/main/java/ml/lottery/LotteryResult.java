package ml.lottery;

import java.util.List;

public class LotteryResult {
    private List<Integer> userNumbers;
    private List<Integer> lotteryDraw;
    private List<Integer> winnerNumbers;

    public LotteryResult(List<Integer> userNumbers, List<Integer> lotteryDraw, List<Integer> winnerNumbers) {
        this.userNumbers = userNumbers;
        this.lotteryDraw = lotteryDraw;
        this.winnerNumbers = winnerNumbers;
    }

    public List<Integer> getLotteryDraw() {
        return lotteryDraw;
    }

    public void setLotteryDraw(List<Integer> lotteryDraw) {
        this.lotteryDraw = lotteryDraw;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }

    public void setWinnerNumbers(List<Integer> winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }
}
