class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> final_list = new ArrayList<List<Integer>>();
        
        // for each row
        for (int i=1; i <= numRows; i++){
            // create a row_list
            List<Integer> row_list = new ArrayList<Integer>();
            
            // calculate the row_list
            for (int j=1; j<=i ; j++){
                if (j==1 || j==i){
                    row_list.add(1);
                } else {
                    row_list.add(final_list.get(i-2).get(j-2)+final_list.get(i-2).get(j-1));                    
                }
            }
            // add the row_list created to final_list
            final_list.add(row_list);
        }
        return final_list;
    }
}
