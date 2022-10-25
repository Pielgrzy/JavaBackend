package ml.lottery;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/lottery")
public class LotteryController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Integer> userNumbers = getNumbers(request);
        List<Integer> lotteryDraw = LotteryDraw.getLotteryDraw();
        List<Integer> winnNumbers = LotteryChecker.lotteryWinNumbers(userNumbers, lotteryDraw);

        LotteryResult lotteryResult = new LotteryResult(userNumbers, lotteryDraw, winnNumbers);

        request.setAttribute("lotteryResult", lotteryResult);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(request, response);

    }

    private List<Integer> getNumbers(HttpServletRequest request) {
        String[] numbers = request.getParameterValues("number");
        List<Integer> userNumbers = new ArrayList<>();
        for (String number : numbers) {
            userNumbers.add(Integer.parseInt(number));
        }
        return userNumbers;
    }
}
