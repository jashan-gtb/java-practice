public class adv {
    // PERMUTATIONS
    /*public static void perm(String str, String permutation){
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char current=str.charAt(i);
            String newstr= str.substring(0,i)+ str.substring(i+1);
            perm(newstr, permutation+current);
        }
    }*/

        //COUNTPATHS
    /*public static int count(int i, int j, int n, int m){
        if (i==n || j==m) {
            return 0;
        }
        if (i==n-1 && j==m-1) {
            return 1;
        }
        //move down
        int downpaths= count(i+1, j, n, m);
        //move right
        int sidepaths= count(i, j+1, n, m);
        return downpaths+sidepaths;
    }*/

        // TILE PLACEMENT
    public static int tiles(int n, int m){
        if (n==m) {
            return 2;
            
        }
        if (n<m) {
            return 1;
        }
        //verticle
        int vplacements= tiles(n-m, m);
        //horizontal
        int hplacemens=tiles(n-1,m);
        return vplacements+hplacemens;
    }

    public static void main(String[] args) {
         int n=4, m=2;
         int totalplace= tiles(n, m);
         System.out.println(totalplace);
    }
}
