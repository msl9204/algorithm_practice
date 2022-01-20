package lecture.L07;

public class L0706 {

    static int n;
    static int[] ch;

    private int DFS(int L) {
        if (L ==n+1) {
            String tmp = "";
            for (int i = 1; i <=n; i++) {
                if (ch[i] == 1) tmp +=(i + " ");
            }

            if (tmp.length()>0) System.out.println(tmp);

        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }

        return 0;
    }


    public static void main(String[] args) {

        L0706 T = new L0706();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);

    }


}
