package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }
        else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger than the last");
        } else {
            for (int iter = 1; iter <= lastInRow; iter++) {
                if (iter <= numberToSkip) {
                    skippedSum += iter;
                    continue;
                }
                countedSum += iter;
            }
        }
        System.out.println("skipped sum is " + skippedSum + "\ncounted sum " + countedSum);
    }
}
