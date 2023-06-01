import Pollsus.PollInitialArrays_us;
import Pollsus.PollScanners_us;
import Pollsus.PollStatistics_us;

public class PollsWithMethod_us {
    public static void main(String[] args) {
        try {
            String[] answers;
            String[][] polls;

            PollInitialArrays_us pollInitailArrays_us = new PollInitialArrays_us();
            polls = pollInitailArrays_us.init();    //설문 내용 초기화
            PollScanners_us pollScanners_us = new PollScanners_us();
            answers = pollScanners_us.PollsWithAnswers(polls);
            PollStatistics_us pollStatistics_us = new PollStatistics_us();
            pollStatistics_us.printAnswers(answers);
        } catch (Exception e) {
            // TODO: handle exception
        }

        // return 0;
    }
}
