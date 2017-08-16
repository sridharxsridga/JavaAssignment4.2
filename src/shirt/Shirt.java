/*Create a class named Shirt. Make all the member variables private. You will need a class
variable for the shirt collar size, the shirt sleeve length, and the shirt material. You will
need to use the following code to declare the material variable private String material:
a. Make all the member methods public. The methods will not be static. Add accessor (get) and
mutator (set) methods for each member variable. Make sure you have a constructor for the
class that accepts arguments for the collar size and sleeve length. The constructor can set
the material to cotton for all objects by using the following code:
material = "Cotton";
b. You can use some variation of the following code to print the material member variable:
System.out.println("The material is " + material); The code will only work, if it is part of the
Shirt class. If you print from main() in TestShirt, you will need to use an accessor (get)
method of the class Shirt.
c. Also create a "default" constructor that takes no arguments. You may initialize the
sleeve length and collar size to any value you wish in this constructor. Initialize the
material to cotton.
d. Create a source file named TestShirt.java. This class will have the main( ) method in it. You will
need to instantiate three Shirt objects. Use the default constructor for one Shirt object and the
overloaded constructor for the other two Shirt objects. You may print the required information
for each object by having a separate method in TestShirt() that uses the accessor
(get) methods of Shirt or you may add another public method to Shirt that prints all
the information required.
 * 
 * 
 */

package shirt;

public class Shirt {
	
	private static int shirtCollarSize;   // a class variable for the shirt collar size, the shirt sleeve length
	private static int shirtSleeveLength;
	private String material;   //need to use the following code to declare the material variable private String material:

	Shirt() {
		this.shirtCollarSize = 13;
		this.shirtSleeveLength = 30;
		material = "Cotton";
	}

	Shirt(int shirtCollarSize, int shirtSleeveLength) {  //a constructor for that accepts arguments for the collar size and sleeve length
		this.shirtCollarSize = shirtCollarSize;
		this.shirtSleeveLength = shirtSleeveLength;
		material = "Cotton";   //constructor can set the material to cotton for all objects by using the following code: material = "Cotton"
	}

	// Make all the member methods public. The methods will not be static. Add accessor (get) and	mutator (set) methods for each member variable
	public  int getShirtCollarSize() {
		return shirtCollarSize;
	}

	public  void setShirtCollarSize(int shirtCollarSize) {
		Shirt.shirtCollarSize = shirtCollarSize;
	}

	public  int getShirtSleeveLength() {
		return shirtSleeveLength;
	}

	public  void setShirtSleeveLength(int shirtSleeveLength) {
		Shirt.shirtSleeveLength = shirtSleeveLength;
	}

	public String getMaterial() {
		
		return material;
	}
	
	public void printShirtMaterial(){
		System.out.println("The material is " + material);  //use some variation of the following code to print the material member variable: System.out.println("The material is " + material)
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

	public String toString(){  // add another public method to Shirt that prints all the information required.
		return "Shirt Collar Size : " + getShirtCollarSize() + " Shirt Sleeve Length : " +getShirtSleeveLength()+" Material :"+ getMaterial();
	}

}
