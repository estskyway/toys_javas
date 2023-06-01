import Pollsus.PollInitialArrays_us;
import Pollsus.PollScanners_us;
import Pollsus.PollStatistics_us;

public class PollsWithMethod_us {
    public static void main(String[] args) {
        try {
            PollInitailArrays_us pollInitailArrays_us = new PollInitailArrays_us();
            polls = pollInitailArrays_us.init();    //설문 내용 초기화
            new PollScanners_us();
            new PollStatistics_us();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // return 0;
    }
}
