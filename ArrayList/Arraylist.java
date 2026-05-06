public classArraylist{
  public static void swap(ArrayList<Integer> list, int idx1, int idx2){
int temp = list.get(idx1);
list.set(idx1, list.get(idx2));
list.set(idx2, temp);

  }
                 // swap two elements in an arraylist

  // public static void main(String[] args){
  //   ArrayList<Integer> list = new ArrayList<>();
  //   list.add(2);
  //   list.add(3);
  //   list.add(4);
  //   list.add(6);
  //   int idx1 = 1; 
  //   int idx2 = 3;
  //   System.out.println(list);
  //   swap(list, idx1, idx2);
  //   System.out.println(list);
  // }
   

   // Multi dimensional arraylist 

// public static void main(String[] args){
//   ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
// ArrayList<Integer> list = new ArrayList<>();
// list.add(1); list.add(2);
// mainList.add(list);

// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(3); list2.add(4);
// mainList.add(list2);

// for(int i=0; i<mainList.size(); i++){
//   ArrayList<Integer> currList = mainList.get(i);
//   for(int j=0; j<currList.size(); j++){
//     System.out.print(currList.get(j) + " ");
//   }
//   System.out.println();
// }
// }

//  contains with most water (brute force approach) 

public static int storeWater(ArrayList<Integer> height){
  int maxWater = 0;
    // brute force approach
    for(int i=0; i<height.size(); i++){
      for(int j=i+1; j<height.size(); j++){
        int ht = Math.min(height.get(i), height.get(j));
        int width = j-i;
        int currWater = ht*width;
        maxWater = Math.max(maxWater, currWater);
      }
    }
    return maxWater;
}

public static void main(String[] args){
  ArrayList<Integer> height = new ArrayList<>();
height.add(1);
height.add(3);
height.add(4);
height.add(5);
height.add(6);
System.out.println(storeWater(height));
}

}


