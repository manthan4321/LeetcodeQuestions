class Solution { 
    public List<Integer> findDuplicates(int[] arr) { 
        int n = arr.length; 
        ArrayList<Integer> res = new ArrayList<>(); 

        for(int i = 0; i < n; i++) { 

            if(arr[i] == i + 1) {
                continue;
            }

            else { 
                int temp = arr[i] - 1; 
                int x = arr[i]; 

                if(arr[temp] == arr[i]) { 
                    continue;  // agar mil gya toh aage skip kardo (i++ ka dusra version)
                }  
                else { 
                    arr[i] = arr[temp]; 
                    arr[temp] = x; 

                    i--;       // sirf swap ke baad
                } 
            } 
        }
        // fir laast me jab sara sort ho jaega to apne ap mil jayenge elements
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                res.add(arr[i]);
            }
        }
        return res; 
    } 
}