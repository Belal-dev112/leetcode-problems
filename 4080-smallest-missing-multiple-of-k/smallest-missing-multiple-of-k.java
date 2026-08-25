import java.util.Arrays;

class Solution {
    public int missingMultiple(int[] nums, int k) {
            Arrays.sort(nums);
                    
                            int multiple = k;
                                    int i = 0;
                                            int n = nums.length;
                                                    
                                                            while (true) {
                                                                        // Skip over array values smaller than the current multiple
                                                                                    while (i < n && nums[i] < multiple) {
                                                                                                    i++;
                                                                                                                }
                                                                                                                            
                                                                                                                                        // If we've run out of array elements, or the current element
                                                                                                                                                    // doesn't match, this multiple is missing
                                                                                                                                                                if (i == n || nums[i] != multiple) {
                                                                                                                                                                                return multiple;
                                                                                                                                                                                            }
                                                                                                                                                                                                        
                                                                                                                                                                                                                    // Otherwise this multiple was found, move to the next one
                                                                                                                                                                                                                                multiple += k;
                                                                                                                                                                                                                                            i++;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }