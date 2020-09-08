package Knnclassifier;

public class Instance {

	//File attributes 
	public float plength;
	public float pwidth;
	public float slength;
	public float swidth;
	public String flowertype;
	
	
	
	public Instance(float plength, float pwidth, float slength , float swidth, String flowertype) {
		this.plength = plength;
		this.pwidth = pwidth;
		this.slength = slength;
		this.swidth = swidth;
		this.flowertype = flowertype;
		
	}
	
	
	public float getPetalwidth() {
		return this.pwidth;
	}

	public float getPetallength() {
	
		return this.plength;
	}
	

	public float getSepallength() {
		return this.swidth;
	}

	public float getSepallwidth() {
	
		return this.slength;
	}
	
	public String getclassName() {
		
		return this.flowertype;
	}

	
	public String toString() {
		
		return (this.slength + " " + this.swidth + " " + this.plength + " " + this.pwidth + this.flowertype);
	}
	
	
	
	
}
