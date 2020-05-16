package homework;

public class Bubble_sort {

	public static void main(String[] args) {
		int [] arr ={20,15,17,8,5};
		int temp;
		int no =arr.length;
		for(int i=0;i<=no;i++)
		{
			for(int j=1;j<i-no;j++)
			{
				if(arr[j-1]>=arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		for(int k=0;k<=no;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
