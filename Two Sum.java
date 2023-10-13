//o(n*2) solution

/*class Solution {
    public boolean containsNum(int x,int[] arr){
        boolean f = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                f=true;
            }
        }
        return f;
    }
   
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int rest = 0;
        int[] result = new int[2];
        

         for(int i=0;i<nums.length;i++){
             for(int j=0;j<nums.length;j++){
                 if (i!=j && nums[i]+nums[j]==target){
                     l.add(i);
                     l.add(j);
                 }
             }
         }

         result[0] = l.get(0);
         result[1] = l.get(1);
    return result;
        
        
    }
}*/

//o(n) solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int [2];
        ans[0] = ans[1] = -1;
        HashMap<Integer , Integer>mapp = new HashMap<>();
        for(int i =0 ; i<nums.length ; i++){
            
            int R = target - nums[i] ;
        if(mapp.containsKey(R)){
            ans[0] = i;
            ans[1] = mapp.get(R);

            return ans;
        }


        mapp.put(nums[i],i);
        }
        return ans;
    }
}