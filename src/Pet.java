
public class Pet extends Animal{
	private String name;
	private int age;
	private double weight;
	
	//오버라이딩
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
		
		super(iniGender);  // 부모 클래스 생성자 초기화
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
	}

	public String toString(){
		return ("Nmae : " + name + " Age : " + age + " years"
				+ "\nWeight : " + weight + " pounds");
	}
	
	
	public Pet(String initialName, int initialAge, double initialWeight){
		//구현하시오.
		if(initialAge < 0 && initialWeight < 0)
			System.exit(0);
	
		name = initialName;
		age = initialAge;
		weight = initialWeight;
	}
	//오버로딩
	public Pet(String initialName){
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public Pet( int initialAge) {
		name = "No name yet.";
		weight = 0;
		if(initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	public Pet(){
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	public void set(String newName, int newAge, double newWeight){
		//구현하시오.
		name = newName;
		age = newAge;
		weight = newWeight;
	}
	
	public void setAge(int newAge){
		//구현하시오.
		age = newAge;
	}
	
	public void setWeight( double newWeight){
		//구현하시오.
		weight = newWeight;
	}
	
	public String getName(){
		//구현하시오.
		return name;
	}
	
	public int getAge(){
		//구현하시오.
		return age;
	}
	
	public double getWeight(){
		//구현하시오.
		return weight;
	}
}
