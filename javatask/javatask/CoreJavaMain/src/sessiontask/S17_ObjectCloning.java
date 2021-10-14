package sessiontask;


public class S17_ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pulsar Pulsar1 = new Pulsar("Petrol",2,"Red");
		Pulsar Pulsar2 = (Pulsar) Pulsar1.clone();
		Pulsar Pulsar3 = (Pulsar) Pulsar2.clone();
		Pulsar Pulsar4 = (Pulsar) Pulsar2.clone();
		Pulsar Pulsar5 = (Pulsar) Pulsar2.clone();
		Pulsar iphone = (Pulsar) Pulsar2.clone();

		System.out.println("---------Pulsar2---------");
		System.out.println("Pulsar Fuel : "+Pulsar2.fuelType);
		System.out.println("Pulsar Color : "+Pulsar2.Color);
		System.out.println("No. of Tyres : "+Pulsar2.Tyres);
		
		System.out.println("---------Pulsar3---------");
		System.out.println("Pulsar Fuel : "+Pulsar3.fuelType);
		System.out.println("Pulsar Color : "+Pulsar3.Color);
		System.out.println("No. of Tyres : "+Pulsar3.Tyres);
	}
}

class Pulsar implements Cloneable {
	String fuelType;
	int Tyres;
	String Color;

	public Pulsar(String fuelType, int Tyres, String Color) {
		super();
		this.fuelType = fuelType;
		this.Tyres = Tyres;
		this.Color = Color;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
