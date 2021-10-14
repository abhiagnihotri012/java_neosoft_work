package sessiontask;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;


public class S20_BankApplicationConsole {
	static String name;
	static String add;
	static String cno;
	static String uname;
	static String pwd;
	static int dep;
	static int amt;
	static String type;

	public S20_BankApplicationConsole(String name, String add, String cno, String uname, String pwd, int dep, String type) {
		super();
		this.name = name;
		this.add = add;
		this.cno = cno;
		this.uname = uname;
		this.pwd = pwd;
		this.dep = dep;
		this.type = type;
	}

	public S20_BankApplicationConsole(int amt) {
		this.amt = amt;
	}

	public static void main1() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("BANK   OF  MYBANK");
		System.out.println("-----------------------------");

		System.out.println("1. Register Account");
		System.out.println("2. Login");
		System.out.println("3. Update accounts");
		System.out.println("4. Exit");
		System.out.println();

		// User Action
		System.out.print("Enter Your Choice :");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.print("Enter name :");
			String name = sc.next();
			

			System.out.print("Enter address :");
			String add = sc.next();

			System.out.print("Enter Contact Number :");
			String cno = sc.next();
			/*
			 * while(!tempNo.matches("a") ||!tempNo.matches("b") ) {
			 * System.out.println("Invalid Choice! Try again : "); tempNo = sc.nextLine(); }
			 * 
			 * if (tempNo == "a") { type = "SAVING"; } else if (tempNo == "b") { type =
			 * "BUSINESS"; }
			 */

			System.out.print("Set Username :");
			String uname = sc.next();

			System.out.print("set password :");
			String pwd = sc.next();
			while (!pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,30}$")) {
				System.out.println("Invalid Password");
				System.out.print("Enter Password again :");
				pwd = sc.next();
			}
			String pwd1 = pwd;

			/*
			 * if(pwd.matches(
			 * "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,30}$")
			 * ) { System.out.println("good password is strong");
			 * 
			 * }else { System.out.print("Invalid Password");
			 * System.out.print("Enter Password again :"); String pwd1=sc.next(); }
			 */

			System.out.print("Enter Initial Deposit :");
			int dep = sc.nextInt();

			S20_BankApplicationConsole b1 = new S20_BankApplicationConsole(name, add, cno, uname, pwd, dep,type);
			main1();

			S20_BankApplicationConsole[] bankRecords = { b1 };
		}
		String UnameCopy = uname;
		if (choice == 2) {

			System.out.print("Enter Username :");
			String uname1 = sc.next();

			System.out.print("Enter password :");
			String pwd1 = sc.next();

			while (!pwd1.equals(pwd) || !UnameCopy.matches(uname1)) {
				System.out.println("Invalid Username and Password! \r\n");

				System.out.print("Enter Username :");
				uname1 = sc.next();

				System.out.print("Enter password :");
				pwd1 = sc.next();
			}
			System.out.println("Login Successfully");
			S20_BankApplicationConsole.main2();

			/*
			 * if((pwd1.equals(pwd))||pwd1.equals("\\d\\w[a-z]\\[!@#$%^&*_]")) {
			 * System.out.println("Login Successfully"); ConsoleBasedProject.main2(); }else
			 * { System.out.println("Invalid Username and Password");
			 * System.out.print("Enter password :"); String pwd2=sc.next();
			 * ConsoleBasedProject.main2(); }
			 */

		}
		if (choice == 3) {
			System.out.println("Update Account");
		}
		if (choice == 3) {
			System.out.println("Thank You! Visit again!");
		} else {
			System.out.println("Invalid entry!");
		}
	}

	public static void main2() {
		Scanner sc = new Scanner(System.in);
		amt = dep;
		System.out.println("-----------------");
		System.out.println("WELCOME");
		System.out.println("-----------------");

		System.out.println("1. Deposit");
		System.out.println("2. Transfer");
		System.out.println("3. Last 5 Transactions");
		System.out.println("4. User Information");
		System.out.println("5. Log out");

		System.out.println();
		System.out.print("Enter Your Choice : ");
		int choice1 = sc.nextInt();
		if (choice1 == 1) {
			System.out.print("Enter amount : ");
			int tempAmt = sc.nextInt();
			amt += tempAmt;
			System.out.println(amt);
			S20_BankApplicationConsole.main2();
		}
		if (choice1 == 4) {
			System.out.println("Accountholder Name :" + name);
			System.out.println("Accountholer Address :" + add);
			System.out.println("Accountholder Contact :" + cno);
			System.out.println("Account Type : " + type);
			S20_BankApplicationConsole.main2();
		}
		if (choice1 == 3) {
			System.out.println("Rs. " + amt + " credited to your account. Balance Rs. " + amt + " as on " + new Date().getDate());
			System.out.println("Initial Deposit - Rs " + amt + " as on " + new Date().getDate() );
			S20_BankApplicationConsole.main2();
		}
		if (choice1 == 2) {
			System.out.println("Enter Payee Username :");
			String pusername = sc.next();
			System.out.println("Enter Amount : ");
			amt = sc.nextInt();
			System.out.println("Username does not exist.");
			S20_BankApplicationConsole.main2();
		}
		if (choice1 == 5) {
			main1();
		}

	}

	public static void main(String[] args) {

		S20_BankApplicationConsole.main1();
		
		
		

	}

}

