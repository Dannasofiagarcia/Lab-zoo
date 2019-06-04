package modelo;

public class Kangaroo {
    
	//Constantes
	
	public final static String A = "A bloodType";
	public final static String AB = "AB bloodType";
    public final static String B = "B bloodType";
	public final static String O = "O bloodType";
    public final static int ACTUAL_YEAR = 2019;
    public final static String MALE = "Male";
    public final static String FEMALE = "Female";

    //Atributos
	
	private String name;
	private double weight;
	private double height;
	private String gender;
	private String bloodType;
	private double indexBM;
	private double kangarooFoodQuantity;
	private String heartRisk;
	
	
	//Relaciones
	
	private Date birth;
	
	
	//Metodos
	
	public Kangaroo (String name, double weight, double height, String gender, String bloodType, int month, int day, int year) {
	     
	this.name = name;
	this.weight = weight;
	this.height = height;
    this.gender = gender;
	this.bloodType = bloodType;
	this.birth = new Date(month, day, year);
	indexBM = calculateKangarooBMI();
	kangarooFoodQuantity = foodQuantity();
	heartRisk = calculateHeartRisk();
	
	}
	
	
   //Metodo calcular la cantidad de alimento de los canguros
	
	public double foodQuantity(){
		
	double kangarooFoodQuantity = 0;
	
	if (weight < 30){
	kangarooFoodQuantity = weight * 0.8;
    }
	
	else if (weight >= 30 && weight <= 48){
	kangarooFoodQuantity = weight *(1+0.10);
	}
	
	else {
		
	kangarooFoodQuantity = 40+(weight-48*0.4);
	}
	
	return kangarooFoodQuantity;
}
    
		 
	//Metodo para calcular IMC (indice de masa corporal)
	
	public double calculateKangarooBMI (){
 
    double indexBM = 0;

	indexBM = weight/height*height;
	
	return indexBM;

}


    //Metodo para calcular la cantidad de agua
	
	public double calculateWaterQuantity (){
	
	double waterQuantity = 0;
		
	waterQuantity = indexBM * 1.5;
	
	return waterQuantity;
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

    //Metodo para calcular tendencia a enfermedades cardiacas	
	
	public String calculateHeartRisk (){
	
	String heartRisk = "";
	
	if (indexBM < 18 && bloodType .equals ("A") || indexBM < 18 && bloodType .equals ("AB")){
		
	heartRisk = " el riesgo de enfermedades cardiacas es bajo";
	}
	
	else if (indexBM < 18 && bloodType != "A" || indexBM < 18 && bloodType != "AB"){
		
	heartRisk = " el riesgo de enfermedades cardiacas es moderado";
	}

	else if (indexBM > 18 && indexBM < 25){

	heartRisk = " el riesgo de enfermedades cardicas es bajo";
	}
	
	else if (indexBM > 25 && bloodType .equals ("A") || indexBM > 25 && bloodType .equals ("B") || indexBM > 25 && bloodType .equals ("O")){

    heartRisk = " el riesgo de enfermedades cardiacas es alto";
    }

    else if (indexBM > 25 && bloodType .equals ("AB")){

    heartRisk = " el riesgo de enfermedades cardiacas es moderado";
    }

	return heartRisk;
    }


    //Metodo para calcular el tiempo de vacuna 

    public String calculateVaccineTime(int actualYear, int actualDay, int actualMonth){

    String msj = "";
    int days = 0;
    int daysItLife =0;
    boolean vaccine = false;


    daysItLife = (360 - ((birth.getMonth() - 1)*30) + birth.getDay()) + (((actualMonth -1)*30) + actualDay);


    if (daysItLife == 360){

    vaccine = true;
    msj = " ha vivido " + daysItLife + " dias, por lo tanto tiene un ano de edad y debe ser vacunado";
    }

    else if (daysItLife < 360){

    vaccine =false;
    msj = " ha vivido " + daysItLife + " dias, no tiene mas de un ano de edad y por lo tanto no debe ser vacunado";
    } 

    else if (daysItLife > 360){
    msj = " ha vivido " + daysItLife + " dias, tiene mas de un ano de edad y por lo tanto no debe ser vacunado" + "\n" + "\n";
    }

    return msj;

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
	
	public double getIndexBM () {
		return indexBM;
	}

    public void setIndexBM (double indexBM) {
	    this.indexBM = indexBM;
	}
	
	public double getWeight () {
		return weight;
	}

    public void setWeight (double weight) {
	    this.weight = weight;
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

    public void setBloodType (String bloodType){
	    this.bloodType = bloodType;
    }
	
	public Date getBirth() {
		return birth;
	}

    public void setBirth (Date birth){
	    this.birth = birth;
    }
	
	public double getKangarooFoodQuantity() {
		return kangarooFoodQuantity;
	}

    public void setKangarooFoodQuantity (double kangarooFoodQuantity){
	    this.kangarooFoodQuantity = kangarooFoodQuantity;
    }

	public String getHeartRisk() {
		return heartRisk;
	}

    public void setHeartRisk (String heartRisk){
	    this.heartRisk = heartRisk;
    }
}