
public class Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		buildTree(10);
	}
		
		
		public static void buildTree(int num)
		{
		for (int i = 1; i < num; i++)
		{
			for (int j =0 ; j < i; j++)
			{
				System.out.print(i);
				
			}
			System.out.println("");
		}
	}

}
