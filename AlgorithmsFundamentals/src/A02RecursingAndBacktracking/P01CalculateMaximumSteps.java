package A02RecursingAndBacktracking;

public class P01CalculateMaximumSteps {
    public static void main(String[] args) {
        class Calculate {
            long getOperationCount(long n) {
                long counter = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        counter++;
                    }
                }

                return counter;
            }

            @Override
            public String toString() {
                return super.toString();
            }
        }

        Calculate cal = new Calculate();
        System.out.println(cal.getOperationCount(200L));

    }
}
