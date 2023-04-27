//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // finding the first occurenece of zero
        int fp = 0;
        int sp = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                fp=i;
                sp=fp+1;
                break;
            }
        }
        
        while(sp<n)
        {
            if(arr[sp]!=0)
            {
                swapElements(arr,fp,sp);
                sp++;
                fp++;
            }
            else{
                sp++;
            }
        }
    }
    void swapElements(int[] arr,int index1,int index2)
    {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}