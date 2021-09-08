class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int count=0;
        boolean[]arra =new boolean[properties.length];
        for (int i=0;i<properties.length-1;i++)
        {
            for (int j=i+1;j<properties.length;j++) {
                if (i != j) {
                    if ( properties[i][0] < properties[j][0] && properties[i][1] < properties[j][1]) {
                        count++;
                    }
                }
            }

            }

        return count;

    }
}
