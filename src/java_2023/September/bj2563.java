import java.util.*;
import java.io.*;
public class bj2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = 0;
        int n = Integer.parseInt(br.readLine());  //색종이 개수
        boolean[][] arr = new boolean[100][100];  //도화지
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
    }
}
