
public class Program {

	public void GrestestNumber()
	{
		int []a= {20,50,60,70,100,250,150};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max number="+max)
	}
	public static void main(String[] args) {
		
		Program p=new Program();
		p.GrestestNumber();

	}

}
