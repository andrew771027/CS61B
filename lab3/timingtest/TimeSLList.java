package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        int N = 1000;
        int LIMIT = 12800;
        int M = 10000;
        AList<Integer> Ns = new AList<Integer>();
        AList<Double> times = new AList<Double>();
        AList<Integer> opCounts = new AList<Integer>();

        while (N < LIMIT) {
            SList<Integer> s = new SList<Integer>();
            

            for (int i = 1; i <= N; i++) {
                s.addLast(i);
            }

            Stopwatch sw = new Stopwatch();

            s.getLast();

            double timeInSeconds = sw.elapsedTime();
            
            Ns.addLast(N);
            time.addLast(timeInSeconds);
            opCounts.addLast(M);

            N *= 2;
        }

        printTimingTable(Ns, times, opCounts);
    }
}
