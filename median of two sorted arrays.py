class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        
        arr = nums1+nums2
        arr.sort()
        count=0.0
        median=0.0
    
        if len(arr)%2!=0:
            c=(len(arr)-1)/2
            median = arr[c]
            return median
       
        if len(arr) ==0:
            return "empty"
        if len(arr) ==1:
            return arr[0]
        if len(arr)==2:
            c = 2.0
            count=(arr[0]+arr[1])
            median = count/c
            return median
        if len(arr) == 3:
             median = arr[1]
        if len(arr)>3:
            while len(arr) !=2:
                arr.pop(0)
                arr.pop()
            median = (arr[0]+arr[1])/2.0

            
        return median

       
        
       
        
            
            