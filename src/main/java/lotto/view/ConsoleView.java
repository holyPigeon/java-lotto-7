package lotto.view;
import lotto.dto.LottoResponse;
import lotto.dto.PrizeResponse;

import java.util.List;

public class ConsoleView {
    private final InputView inputView;
    private final OutputView outputView;

    private ConsoleView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    private static class ConsoleViewHolder {
        private static final ConsoleView CONSOLE_VIEW = new ConsoleView(InputView.getInstance(), OutputView.getInstance());
    }

    public static ConsoleView getInstance() {
        return ConsoleViewHolder.CONSOLE_VIEW;
    }

    public int readPurchaseAmountInput() {
        outputView.promptPurchaseAmount();

        return inputView.readPurchaseAmountInput();
    }

    public String readWinningLottoNumbersInput() {
        outputView.promptLottoNumbers();

        return inputView.readLottoNumbersInput();
    }

    public int readBonusNumberInput() {
        outputView.promptBonusNumber();

        return inputView.readBonusNumberInput();
    }

    public void printPurchasableLottoCount(int lottoCount) {
        outputView.printPurchasableLottoCount(lottoCount);
    }

    public void printFormattedLottoNumbers(List<LottoResponse> lottoResponses) {
        outputView.printFormattedLottoNumbers(lottoResponses);
    }

    public void printWinningResult(List<PrizeResponse> prizeResponses) {
        outputView.printWinningResult(prizeResponses);
    }

    public void printProfitRate(double profitRate) {
        outputView.printProfitRate(profitRate);
    }
}