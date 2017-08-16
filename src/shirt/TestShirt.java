//This class is used to test the implementation  Shirt class and print details

package shirt;

public class TestShirt {

	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();  // Use the default constructor for one Shirt object 
		System.out.println(shirt1);    //printing the object to get the information
		Shirt shirt2 = new Shirt(8,45);  //passing collar size and sleeve length
		//print the required information for each object by having a separate method in TestShirt() that uses the accessor (get) methods of Shirt
System.out.println( "Shirt Collar Size : " + shirt2.getShirtCollarSize() + " Shirt Sleeve Length : " +shirt2.getShirtSleeveLength()+" Material :"+ shirt2.getMaterial());
		Shirt shirt3 = new Shirt(18,44);
System.out.println( "Shirt Collar Size : " + shirt3.getShirtCollarSize() + " Shirt Sleeve Length : " +shirt3.getShirtSleeveLength()+" Material :"+ shirt3.getMaterial());
	}

}
