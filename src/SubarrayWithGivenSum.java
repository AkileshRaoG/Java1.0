import java.io.*;

public class SubarrayWithGivenSum {
	
	static void obtainSubarray(int tempArray[],int ts){
		int sum=0,start=1,end=0,j=0;
		for(int i=0;i<tempArray.length;i++){
		    sum+=tempArray[i];
		    end++;
		    while(sum>ts){
			sum-=tempArray[j];j++;
			start++;
		    }
		    if(sum==ts){
			System.out.println(start+" "+end);
			return;
		    }
		}
		System.out.println("-1");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufReader= new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(bufReader.readLine());
		for(int j=0;j<testCases;j++){
			String inp[]=new String[1];
			inp=ip.readLine().split(" ");
			int arrayLength = Integer.parseInt(inp[0]);
		    	String inp1[]=new String[arrayLength];
		    	int sum = Integer.parseInt(inp[1]);
		    	int tempArray[] = new int[arrayLength];
		    	inp1=ip.readLine().split(" ");
		    	for(int i=0;i<arrayLength;i++)
		    	{
				tempArray[i]=Integer.parseInt(inp1[i]);
		    	}
		    	obtainSubarray(tempArray,sum);
		}
	}
}
