class PermutationDiff {
    public static int findPermutationDifference(String s, String t) {

        int res =0;

        for(int i=0; i<s.length(); i++){
            res += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return res;
    }

    public static void main(String [] args){
        System.out.println(findPermutationDifference("abc", "bca"));
    }
}