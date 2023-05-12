public class Job4 {
    public static void main(String[] args) {
        int[] ref = {3, 7, 3, 9, 8};
        int[][] res = new int [4][2];
        int tmp_res = 0;

        for (int i = 0; i < ref.length; i+=1) {
            boolean is_in = false;
            for (int j = 0; j < res.length; j += 1) {
                if (ref[i] == res[j][0]) {
                    res[j][1] += 1;
                    is_in = true;
                    break;
                }
            }
            if (is_in == false) {
                res[tmp_res][0] = ref[i];
                res[tmp_res][1] = 1;
                tmp_res += 1; 
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " occure " + res[i][1]);            
        }
    }
}
