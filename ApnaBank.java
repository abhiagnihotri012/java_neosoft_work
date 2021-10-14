package Console_Based_Application;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ApnaBank {
	ArrayList<Register> accounts = new ArrayList<Register>();
	Register register;
	int accountNo = 1000;
	
	
	
	void choice() {
		System.out.println("--------------------");
		System.out.println("Welcome To Apna Bank");
		System.out.println("--------------------");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Update Accounts");
		System.out.println("4. Exit");
		System.out.println(" ");
		System.out.println("Enter your choice by number :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		this.options(choice);
	}
	
	void homePage() {
		System.out.println("--------");
		System.out.println("WELCOME");
		System.out.println("--------");
		System.out.println("1. Deposit");
		System.out.println("2. Transfer");
		System.out.println("3. Last Five Transactions");
		System.out.println("4. User Information");
		System.out.println("5  Show Balance");
		System.out.println("6. Logout");
		System.out.println(" ");
		System.out.println("Enter your choice by number :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		this.options2(choice);
	}
	void options2(int choice) {
		switch (choice) {
		case 1:
			System.out.println("-----Deposit-----");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Amount to deposit");
			int amount = sc.nextInt();
			register.depositAmount(amount);
			System.out.println("Deposited sucessfully"+ register.transaction);
			this.homePage();
			break;
        case 2:
        	System.out.println("-----Transfer-----");
    		Scanner sck = new Scanner(System.in);
    		System.out.println("Enter payee Account No: ");
    		int acNo = sck.nextInt();
    		System.out.println("Enter amount: ");
    		int amm = sck.nextInt();
    		boolean chec = acNo == register.accountNo;
    		System.out.println(chec);
    		while(chec) {
    				System.out.println("Enter payee Account No , Not Yours: ");
    				acNo = sck.nextInt();
    				chec = acNo == register.accountNo;
    				
    		}
    		
    		for (Register regis : accounts) {
    			System.out.println(regis.accountNo);
    			System.out.println(acNo);
    			boolean c = acNo == regis.accountNo;
    			System.out.println(c);
				if (acNo == regis.accountNo) {
					regis.transaction.add(amm);
					register.transaction.add(-amm);
					this.homePage();
					break;
				}
				
				
			}

    	
			break;
        case 3:
        	System.out.println("3");
        	int temp=0;
        	for (int i = register.transaction.size()-1; i>=0; i--) {
        		temp = temp+register.transaction.get(i);
        		if(register.transaction.get(i)>0) {
        			System.out.println("Rs. " + register.transaction.get(i) + ", credited to your account ");	
        		}
        		else {
        			System.out.println("Rs. " + register.transaction.get(i) + ", Debitted from your account ");	
        		}
			}
        	
        	System.out.println("Initial deposit - "+ register.initialDepo + ", Balance Amount: "+temp);
        	this.homePage();
	        break;
        case 4:
        	System.out.println("Accountholder name: " + register.name);
        	System.out.println("Accountholder Nuber: " + register.accountNo);
        	System.out.println("Accountholder Contact No: " + register.contactNo);
        	System.out.println("Accountholder Address: " + register.address);
        	this.homePage();
	        break;
        case 5:
        	int tempp =0;
        	for (int i = register.transaction.size()-1; i>=0; i--) {
        		tempp = tempp+register.transaction.get(i);
			}
        	System.out.println("Balance Amount: "+tempp);
        	this.homePage();
	        break;
        case 6:
        	this.choice();
	        break;

		default:
			break;
		}
	}
	void login() {
		System.out.println("-----Login-----");
		Scanner tc = new Scanner(System.in);
		System.out.println("Enter Username");
		String name = tc.nextLine();
		System.out.println("Enter Password");
		String pass = tc.nextLine();
		for (Register regi : accounts) {
			if (name.equals(regi.name)) {
				System.out.println("username matched");
				if (pass.equals(regi.password)) {
					System.out.println("----Login Successfull-----");
					register = regi;
					this.homePage();
//					break;
				}else {
						System.out.println("Incorrect Password, Login Again");
						this.login();
				}
			}
		}
		
	}
	void options(int choice) {
		switch (choice) {
		case 1:
			System.out.println("-----Registering An account-----");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Address");
			String address = sc.nextLine();
			System.out.println("Enter Contact Number");
			String contactNo = sc.nextLine();
			if(!(contactNo.length()>=10)) {
				while(!(contactNo.length()>=10)) {
					System.out.println("Enter valid phone Number");
					contactNo=sc.nextLine();
					
				}
			}
			System.out.println("Set Username");
			String username = sc.nextLine();
			if(!(username.length()>=4)) {
				while(!(username.length()>=4)) {
					System.out.println("Enter minmum 4 character username");
					username=sc.nextLine();
					
				}
			}
			System.out.println("Enter Password");
			String password = sc.nextLine();
			boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,14}$", password);
			System.out.println(check);
			while(!check) {
					System.out.println("Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 \r\n"
							+ "uppercase, 1 special character[!@#$%^&*_]) :");
					password = sc.nextLine();
					check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,14}$", password);
			}
		
			System.out.println("Enter Initial Deposit");
			String initialDepo = sc.nextLine();
			accountNo++;
			register = new Register(accountNo,name, address, username, password, contactNo, initialDepo);
			register.display();
			accounts.add(register);
//			String r  = "kajal";
//			boolean j = r.equals(name);
//			boolean c = name.equals(register.name);
//			System.out.println(c);
//			System.out.println(j);
			
			
			this.choice();
			break;
        case 2:
        	this.login();
			break;
        case 3:
        	System.out.println("3");
	        break;
        case 4:
        	System.out.println("4");
	        break;

		default:
			break;
		}

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApnaBank apnaBank = new ApnaBank();
		apnaBank.choice();
}
}

class Register{
	String name = "", address ="" , username="" , password;
	String contactNo , initialDepo;
	ArrayList<Integer> transaction= new ArrayList<Integer>();
	int accountNo;
	public Register(int accountNo,String name, String address, String username, String password, String contactNo, String initialDepo) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.address = address;
		this.username = username;
		this.password = password;
		this.contactNo = contactNo;
		this.initialDepo = initialDepo;
		this.transaction.add(Integer.parseInt(initialDepo));
	}
	void display(){
		System.out.println(name + " with username: " + username +" with account no"+ accountNo+ " and password: "+password+" having initial deposit: "+initialDepo+" with contact no" + contactNo+" residing in " + address);
	}
	void depositAmount(int amount) {
		this.transaction.add(amount);
	}
	
}

