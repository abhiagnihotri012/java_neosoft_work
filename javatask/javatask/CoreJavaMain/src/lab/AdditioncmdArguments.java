package lab;

public class AdditioncmdArguments {

	public static void main(String[] args) {
		int sum=0;
		int invalid=0;
		for(int i=0;i<args.length;i++) {
			try {
				sum += Integer.parseInt(args[i]);
			}catch(NumberFormatException e) {
				invalid++;
			}
		}
		System.out.println(sum);
		System.out.println("Invalid no is :"+invalid);

	}

}
