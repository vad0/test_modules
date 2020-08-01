package app;

import org.HdrHistogram.Histogram;

public class RunHdr {
    public static void main(String[] args) {
        final Histogram histogram = new Histogram(5);
        System.out.println(histogram);
    }
}
