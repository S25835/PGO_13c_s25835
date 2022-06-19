package PGO_06;

import java.util.ArrayList;
import java.util.Collections;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        if (a > b) {
            throw new Error("A cannot have higher value than B");
        }
        ArrayList<Double> results = new ArrayList<>();
        while (a < b) {
            results.add(func.f(a));
            a += alpha;
        }
        return Collections.min(results);
    }

}


