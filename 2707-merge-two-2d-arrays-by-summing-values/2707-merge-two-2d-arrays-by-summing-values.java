class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int[] i: nums1){
            map.put(i[0], i[1]);
        }
        for(int[] i:nums2){
            if(map.containsKey(i[0])){
                map.put(i[0],(map.get(i[0])+i[1]));
            }else{
                map.put(i[0], i[1]);
            }
        }
        System.out.println(map.get(4));
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        int [][] result = new int[map.size()][2];
        int j=0;
        for(int i: map.keySet()){
            result[j][0] = i;
            result[j][1] = map.get(i);
            j++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}