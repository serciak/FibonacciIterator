package main;

public class FibonacciIterator {
    private int curr;
    private int prev;

    public FibonacciIterator() {
        curr = 1;
        prev = 1;
    }

    public boolean next() {
        int temp = curr;
        curr += prev;
        prev = temp;

        return true;
    }

    public boolean previous() {
        if(prev == 1 || curr == 1) {
            return false;
        }

        int temp = curr;
        curr = prev;
        prev = temp - prev;

        return true;
    }

    public int current() {
        return curr;
    }

    public boolean first() {
        curr = 1;
        prev = 1;
        return true;
    }

    public String toString(int length) {
        StringBuilder sb = new StringBuilder();

        first();
        sb.append(curr + "\s" + curr + "\s");

        for(int i = 1; i < length; i++) {
            next();
            sb.append(curr + "\s");
        }

        return sb.toString();
    }
}
