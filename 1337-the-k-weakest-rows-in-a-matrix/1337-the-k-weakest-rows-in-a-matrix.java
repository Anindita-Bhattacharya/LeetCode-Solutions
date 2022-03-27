class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];

		// will store sum as key and all indexes as they occur in an ArrayList as values
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        if (mat.length == 0) return ans;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
			
			// if sum exists as key then just putting the new index as a new value in the existing arraylist
			// else creating ans arraylist and adding current index and then adding the new sum as key and arraylist as the value
			
            ArrayList<Integer> temp;
            if (map.containsKey(sum)) {
                temp = map.get(sum);
            } else {
                temp = new ArrayList<>();
            }
            temp.add(i);
            map.put(sum, temp);
        }

		// This priority queue gives the keys in increasing order 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(map.keySet());

		// checking if size of ans has become greater than k or all keys have been exhausted
        int index = 0;
        while (!pq.isEmpty() && index<k){
		// adding all indexes of same sum in increasing order 
            ArrayList<Integer> temp = map.get(pq.poll());
            for (int i = 0;i<temp.size();i++){
                ans[index++] = temp.get(i);
				// returning ans as soon as all k weakest rows have been discovered 
                if(index==k){
                    return ans;
                }
            }
        }

        return ans;
    }
}