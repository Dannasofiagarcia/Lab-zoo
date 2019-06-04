package modelo;

public class BDragons {


    //Constantes
	
	public static final double VALUE_MULTIPLY_WATER = 0.75;


    //Atributos
	
	private String name;
	private double weight;
	private double height;
	private String gender;
	private String bloodType;
	private double indexBM;
	private String alertMessage;
	private double waterQuantity;
	
	
	//Relaciones
	
	private Date birth;
	
	
	//Metodo constructor 
	
	public BDragons (String name, double weight, double height, String gender, String bloodType, Date birth) {
	      
	this.name = name;
    this.weight = weight;
	this.height = height;
	this.gender = gender;
	this.bloodType = bloodType;
	this.birth = birth;
	indexBM = calculateDragonBMI();
	waterQuantity = calculateWaterQuantity();
	
	}


	 //Metodo para calcular la cantidad de agua
	
	public double calculateWaterQuantity(){
	
	double water = 0;
		
	waterQuantity = indexBM * VALUE_MULTIPLY_WATER;
	
	return water;
	}


    //Metodo para calcular IMC (indice de masa corporal)
	
	public double calculateDragonBMI (){
		
    double indexBM = 0;
		
	indexBM = weight/height*height;
	
	return indexBM;
    }
	
    public String whoVowel()
	{
		String msg = "";

		if (vowel())
		{
			msg += name + ".\n";
		}
		return msg;
	}


    public boolean vowel()
	{
		boolean vowel = false;
		int x = 0, x1 = name.length()-1;

		if((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U')) 
		{
			x = x1;
			if((name.charAt(x)=='a') || (name.charAt(x)=='e') || (name.charAt(x)=='i') || (name.charAt(x)=='o') || (name.charAt(x)=='u' || name.charAt(x)=='A') || (name.charAt(x)=='E') || (name.charAt(x)=='I') || (name.charAt(x)=='O') || (name.charAt(x)=='U'))
			{
				vowel = true;			
			}
		}
		return vowel;
	}


	public String showVowels()
	{
		String msg = "";

		if (vowel())
		{
			msg += " empieza y termina en vocal\n";	
		}else
		{	
			msg += " no empieza y termina en vocal\n";
		}

		return msg;

	}
		
	
	public String getName () {
		return name;
	}

    public void setName (String name) {
	    this.name = name;
	}
	
	public double getWeight () {
		return weight;
	}

    public void setWeight (double weight) {
	    this.weight = weight;
	}	
	
	public double getIndexBM () {
		return indexBM;
	}

    public void setIndexBM (double indexBM) {
	    this.indexBM = indexBM;
	}
		
	public String getAlertMessage () {
		return alertMessage;
	}

    public void setAlertMessage (String alertMessage){
	    this.alertMessage = alertMessage;
    }
		
	public double getHeight () {
		return height;
	}

    public void setHeight (double height){
	    this.height = height;
    }
	
	public String getGender () {
		return gender;
	}

    public void setGender (String gender){
	    this.gender = gender;
    }
	
	public String getBloodType() {
		return bloodType;
	}

    public void setBloodType(String bloodType){
	    this.bloodType = bloodType;
    }
	
	public Date getBirth() {
	   return birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	
	}

	public double getWaterQuantity () {
		return waterQuantity;
	}

    public void setWaterQuantity (double waterQuantity) {
	    this.waterQuantity = waterQuantity;
	}
}
