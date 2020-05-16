package testyantra;

public class Cha {

	static int count(String s1)
	{
		char [] ch =s1.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' )
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a = count("this is my name");
		System.out.println(a);
		

	}

}
