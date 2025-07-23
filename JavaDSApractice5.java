import java.util.*;
public class Main{
    //Method to Print Array
    static void PrintArr(int[]arr){
       int n= arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //Method to swap 2 elemets in an array
    static void swap(int arr[], int i, int j){
        int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
    }
    //Method to Reverse a given Array
    static void RevArr(int[] arr){
        System.out.print("Given Array: ");
        PrintArr(arr);
        int n= arr.length;
        int swap=0;
        int j=n-1;
        for(int i=0; i<n/2;i++){
            swap(arr,i,j);
            j--;
        }
        System.out.print("Reversed Array: ");
        PrintArr(arr);
    }
    
    // Rotate Array by k
    static void rotatebyk(int[]arr,int  k){
        System.out.print("given array: ");
        PrintArr(arr);
        int n= arr.length;
        k=k%n;
        int[] ans= new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        System.out.print("roatetd array: ");
        PrintArr(ans);
        }
        
        // Print all subarrays
        static void printallsubarray(int []arr){
            int n=arr.length;
           
            for(int st=0;st<n;st++){
                for(int end=st;end<n;end++){
                    for(int i=st;i<=end;i++){
                         System.out.print(arr[i]);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        
         // Find max sum of any subarray (brute force)
        static void findmaxsumofsubarray(int[] arr){
            System.out.println("Given Array: ");
            PrintArr(arr);
            int maxsum= Integer.MIN_VALUE;
            int n=arr.length;
            for(int st=0;st<n;st++){
                int csum=0;
                for(int end=st;end<n;end++){
             csum+=arr[end];
             maxsum=Math.max(csum,maxsum);
                }
            }
            System.out.println("Max subarray sum = " + maxsum);
        }
        
        // Tower Height Problem
        static void TowerheightProblem(int arr[], int k){
            System.out.println("Given Array: ");
            PrintArr(arr);
            int n=arr.length;
            Arrays.sort(arr);
            int max=arr[n-1]-k;
            int min=arr[0]+k;
            int diff=max-min;
            for(int i=1;i<n;i++){
                 if (arr[i] - k < 0)continue;
                min = Math.min(arr[0] + k, arr[i] - k);
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                diff = max - min;
            }
            System.out.println(diff);
        }
        
        // Element that appears only once
        static void ElementthatAppearsOnlyOnce(int arr[]){
            System.out.println("Given Array: ");
            PrintArr(arr);
            int n=arr.length;
            
            for(int i=0;i<n;i++){
                 int count=0;
                for(int j=0;j<n;j++){
                   
                    if(arr[i]==arr[j]){
                        count++;
                    }
                    
                    }
                    if(count==1){
                        System.out.println("unique elemt: "+ arr[i]);
                        break;
                }
            }
        }
        
        // Minimum number of jumps to reach end (Greedy)
    static void Minjump(int[]arr){
            int n = arr.length;

    if (n <= 1) {
        System.out.println(0);
        return;
    }

    if (arr[0] == 0) {
        System.out.println(-1);
        return;
    }
        int jump=0;
        int pos=0;
        int des=0;
        for(int i=0; i<n;i++){
            des=Math.max(des,arr[i]+i);
            
            if(pos==i){
                 jump++;
                pos=des;
            }
        }
       
        System.out.println("no of jumps: "+ jump);
        }
        
        // Find duplicate element
        static void FindDuplicateinArray(int[]arr){
            System.out.println("Given Array: ");
            PrintArr(arr);
            int n=arr.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = arr[i];
    }
            Arrays.sort(ans);
            for(int i=1;i<n;i++){
                if(ans[i]==ans[i-1]){
                    System.out.println("Duplicate Elemet is: "+ ans[i]);
                }
            }
            
        }
        
        // Best time to buy and sell stock
        static void BestbuySellstock(int[]arr){
           System.out.println("Given Array: ");
            PrintArr(arr);
            int n=arr.length;
            int maxprofit=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                   int profit = arr[j] - arr[i];  
                     if (profit > maxprofit) {
                            maxprofit = profit;
                }
            }
                  }
         System.out.println("Max Profit: "+ maxprofit);
  
        }
        
        // Count pairs with given sum
        static void pairsum(int arr[],int k){
             System.out.println("Given Array: ");
            PrintArr(arr);
            int count=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==k){
                        count++;
                    }
                }
            }
            System.out.println("Tota such Pairs are: "+count);
        }
        
    public static void main(String args[]){
      int arr[]= {1,2,3,4,5};
      int arr2[]={1,0,2,0,1,0,2,1};
      int arr3[]={-1,2,-3,4,-5,6};
      int arr4[] = {1, 1, 2, 2, 3, 4, 4};
      int[] arr5 = {2, 3, 1, 1, 4};
      int arr6[]= {1,2,3,4,5,2};
      int [] arr7 = {7, 1, 5, 3, 6, 4};
      int[] arr8={1, 4, 5, 3, 2}; 

      rotatebyk(arr,3);
      printallsubarray(arr);
      findmaxsumofsubarray(arr);
      TowerheightProblem(arr,2);
    ElementthatAppearsOnlyOnce(arr4);
     Minjump(arr5);
     FindDuplicateinArray(arr6);
     BestbuySellstock(arr7);
     pairsum(arr8,6);
         
         
     
    }
}