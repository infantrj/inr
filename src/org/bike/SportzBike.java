package org.bike;

public class SportzBike {
public void Bikeinfo(String name) {
	System.out.println("Bike name is:"+name);
}
public void Bikeinfo(int cc) {
	System.out.println("bike cc is:"+cc);
}
public void Bikeinfo(long chnum) {
	System.out.println("bike chnum is:"+chnum);
}
public void Bikeinfo(String address,int pincode) {
	System.out.println("owner address is"+address);
	System.out.println("owner pincode is"+pincode);
}
public void Bikeinfo(int pincode,String address) {
	System.out.println("owner alternate address is"+address);
	System.out.println("owner alternate pincode is"+pincode);
}
public static void main(String[] args) {
	SportzBike s=new SportzBike();
	s.Bikeinfo("ktm duke");
	s.Bikeinfo(1000);
	s.Bikeinfo(234564321678l);
	s.Bikeinfo("north street,Aranthangai",879654);
	s.Bikeinfo(879654,"north street,Aranthangai");
	
}
}
