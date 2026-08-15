class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int[] res = new int[2];

        for(int i = 0; i < n; i++) {

            if(arr[i] == i + 1) {
                continue;
            }

            int temp = arr[i] - 1;

            if(arr[temp] == arr[i]) {
                continue;
            }

            int x = arr[i];
            arr[i] = arr[temp];
            arr[temp] = x;

            i--;
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                res[0] = arr[i];  // duplicate
                res[1] = i + 1;   // missing
                break;
            }
        }

        return res;
    }
}