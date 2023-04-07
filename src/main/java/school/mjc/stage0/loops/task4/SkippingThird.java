package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted <= 0) {
            System.out.print("none");
        }
        for (int iter = 1; iter <= lastPrinted; iter++) {
            if (iter % 3 == 0) {
                continue;
            }
            System.out.println(iter);
        }
    }
}
