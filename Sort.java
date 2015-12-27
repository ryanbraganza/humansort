import java.util.*;
import java.io.*;

public class Sort {
    private static BufferedReader BR;
    private static final Comparator<String> COMP = new Comparator<String>(){
        @Override
        public int compare(String a, String b) {
            try {
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                while (true) {
                    String answer = BR.readLine();
                    if (answer.equals("a")) {
                        return -1;
                    } else if (answer.equals("b")) {
                        return 1;
                    } else {
                        System.out.println("try again");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("", e);
            }
        }
    };
    public static void main (String[] args) throws IOException{
        List<String> lines = new ArrayList<>();
        BR = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = BR.readLine();
            while (!line.equals("EOF")) {
                lines.add(line);
                line = BR.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("", e);
        }

        Collections.sort(lines, COMP);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
