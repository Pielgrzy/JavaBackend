package ml.lottery;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LotteryDraw {
    static List<Integer> getLotteryDraw() {

        final int RANGE = 49;
        final int NUMBERS_TO_DRAW = 6;

        Random random = new Random();
        List<Integer> randomNumber = new ArrayList<>();

        LinkedList<Integer> numbersTableToDraw = new LinkedList<>();
        for (int i = 1; i <= RANGE; i++) {
            numbersTableToDraw.add(i);
        }
        for (int i = 0; i < NUMBERS_TO_DRAW; i++) {
            int randNumber = numbersTableToDraw.indexOf(random.nextInt(numbersTableToDraw.size()));
            randomNumber.add(randNumber);
            numbersTableToDraw.remove(randNumber-1);
        }
        return randomNumber;
    }
}
