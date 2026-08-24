class Solution {
        public int stoneGameVIII(int[] stones) {
                int n = stones.length;
                        
                                // Convert stones array in-place into prefix sums
                                        for (int i = 1; i < n; i++) {
                                                    stones[i] += stones[i - 1];
                                                            }
                                                                    
                                                                            // dp represents the best score difference for the player to move,
                                                                                    // starting with the case where all stones are taken (largest cut)
                                                                                            int dp = stones[n - 1];
                                                                                                    
                                                                                                            // Move backwards; at each cut point either take it or defer to dp (i+1)
                                                                                                                    for (int i = n - 2; i >= 1; i--) {
                                                                                                                                dp = Math.max(dp, stones[i] - dp);
                                                                                                                                        }
                                                                                                                                                
                                                                                                                                                        return dp;
                                                                                                                                                            }
                                                                                                                                                            }
