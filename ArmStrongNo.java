
public class ArmStrongNo {

	public static void main(String[] args) {
		int i=0;
				int j=10;
		int k=100;
		for(i=0;i<10;++i)
		if(i*i*i==i)
		System.out.print(i +" ");
			
			for(j=10;j<100;++j)
				{
				int a=j/10;
				int b=j%10;
				if (((a*a*a)+(b*b*b))==j)
				System.out.print(j+" ");
				}
				for(k=100;k<1000;++k)
				{
					int m=k/100;
					int z=k/10;
					int n=z%10;
					int o=k%10;
					if ((m*m*m)+(n*n*n)+(o*o*o)==k)
					System.out.print(k+" ");
							
				}
	}
}