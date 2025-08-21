class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map1=new HashMap<>();
       for(int i=0;i<nums1.length;i++){
        if(map1.containsKey(nums1[i])){
            map1.put(nums1[i],1+map1.get(nums1[i]));
        }
        else{
            map1.put(nums1[i],1);
        }
      }
         ArrayList<Integer> arr=new ArrayList<>();
         for(int i=0;i<nums2.length;i++){
     if(map1.containsKey(nums2[i]) && (map1.get(nums2[i])>0)){
        arr.add(nums2[i]);
        map1.put(nums2[i],map1.get(nums2[i])-1);
     }

      }

int[] a=new int[arr.size()];
for(int i=0;i<arr.size();i++){
    a[i]=arr.get(i);
}
return a;
    }
}