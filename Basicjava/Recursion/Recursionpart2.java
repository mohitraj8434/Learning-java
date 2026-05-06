class Recursionpart2 {
public static int tilingProblem(int n){
  // base case 
  if(n==0 || n==1){
    return 1;
  }
  // vertical choice 
  int fnm1 = tilingProblem(n-1);
  // horizontal choice 
  int fnm2 = tilingProblem(n-2);
  int fn = fnm1 + fnm2;
  return fn;
}

    // remove duplicates from string 
    
public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
  // base case 
  if(idx == str.length()){
    System.out.println(newStr);
    return;
  }
  char currChar = str.charAt(idx);
  if(map[currChar - 'a'] == true){
    // duplicate 
    removeDuplicates(str, idx+1, newStr, map);
  } else {
    map[currChar - 'a'] = true;
    removeDuplicates(str, idx+1, newStr.append(currChar), map);
  }
}


// friends pairing problem
public static int friendsPairing(int n){

  // base case
  if(n == 1 || n == 2){
    return n;
  }
  // single choice 
  int fnm1 = friendsPairing(n-1);

  // pair choice 
  int fnm2 = friendsPairing(n-2);
  int pairways = (n-1) * fnm2;
  int totalways  = fnm1 + pairways;
  return totalways;
}


// count binary strings without consecutive 0s
public static void printBinaryStrings(int n, int lastplace, StringBuilder str){
  
}


              
              // Divide and conquer  
              // merge sort 

              public static void mergeSort(int arr[], int si, int ei){
                if(si >= ei){
                  return;
                }
                // kaam 
                int mid = si + (ei - si)/2;
                mergeSort(arr, si, mid);   // left part 
                mergeSort(arr, mid+1, ei);  // right part 
                merge(arr, si, mid, ei);

              }

              public static void merge(int arr[], int si, int mid, int ei){
              int temp[] = new int[ei - si + 1];
              int i = si;  // iterator for leftpart 
              int j = mid +1; // iterator for right part 
              int k = 0;  // iterator for temp array

             while(i<= mid && j<= ei){
              if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
              } else {
                temp[k] = arr[j];
                j++;
                k++;
              }
              // left part 
              while(i<= mid){
                temp[k++] = arr[i++];
              }
              // right part 
              while(j<= ei){
                temp[k++] = arr[j++];
              }
              // copy temp to original array 
              for(k=0,i=si; k<temp.length; k++,i++){
                arr[i] = temp[k];
              }
             }

              }

  public static void main(String[] args){
    int arr[] = {6,3,9,5,2,8};
    mergeSort(arr,0,arr.length-1);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }

// System.out.println(friendsPairing(4));
// String str = "appnnacollege";
// boolean map[] = new boolean[26];
// removeDuplicates(str, 0, new StringBuilder(""), map);

  }
}