package modelo;

public class DragonZone {
	
	
	//Atributos
	
	 private double temperature;
	 private double humidity;
	 private double filtration;
	 private double foodQuantity;
	
	
	 //Relaciones
	
	 private BDragons dragon1;
	 private BDragons dragon2;
	
     //Metodo constructor
	
	public DragonZone(double temperature, double humidity, double filtration, double area, double foodQuantity, BDragons dragon1, BDragons dragon2){
	
	     this.temperature = temperature;
	     this.humidity = humidity;
	     this.filtration = filtration;
	     this.dragon1 = dragon1;
	     this.dragon2 = dragon2;
	}


    //Metodo para calcular la cantidad de agua
	
	public String calculateZoneWaterQuantity(){
	
	String msj = "";
	double totalWater = 0;
	
	if (dragon1 != null){
		
	msj = ("La cantidad de agua de " + dragon1.getName() + " es " + dragon1.calculateWaterQuantity() + "\n");
	}
	
	if (dragon2 != null){
	
	msj += ("La cantidad de agua de " + dragon2.getName() + " es " + dragon2.calculateWaterQuantity() + "\n");
	totalWater = dragon1.calculateWaterQuantity() + dragon2.calculateWaterQuantity();
	msj += ("La cantidad de agua total de los dos dragones es " + totalWater);
	}
	
	
	return msj;
	}
	
	
	//Metodo para mostrar el resultado de calculateBMI
	
	public String showCalculateDragonBMI (){
	
	String msj = "";
	
	if (dragon1 != null){
	
	msj = (dragon1.getName() + " tiene un IMC de " + dragon1.calculateDragonBMI() + "\n");
	
	}if (dragon2 != null){
	
	msj += (dragon2.getName() + " tiene un IMC de " + dragon2.calculateDragonBMI() + "\n");
	}
	
	return msj;
    }

   
    //Metodo para mostrar la informacion de los dragones

    public String showDragonsInformation (){

        String msj = "";

        if (dragon1 != null){

             msj = "La informacion del primer dragon es:" + "\n";
             msj += "\n";
             msj += "El nombre del dragon es " + dragon1.getName() + "\n";
    	     msj += "El peso del dragon es " + dragon1.getWeight() + "\n";
    	     msj += "La altura del dragon es " + dragon1.getHeight() + "\n";
    	     msj += "El sexo del dragon es " + dragon1.getGender() + "\n";
             msj += "El tipo de sangre del dragon es " + dragon1.getBloodType() + "\n";
  	         msj += "\n";
        }

        if (dragon2 != null){

             msj += "La informacion del segundo dragon es:" + "\n";
             msj += "\n";
             msj += "El nombre del dragon es " + dragon2.getName() + "\n";
    	     msj += "El peso del dragon es " + dragon2.getWeight() + "\n";
    	     msj += "La altura del dragon es " + dragon2.getHeight() + "\n";
    	     msj += "El sexo del dragon es " + dragon2.getGender() + "\n";
             msj += "El tipo de sangre del dragon es " + dragon2.getBloodType() + "\n";
  	         msj += "\n";
        }
        
        return msj;
    }
	

	//Metodo alerta comida 
	
	public String foodAlert() {
		
	String alertMessage = "";
	
	if (foodQuantity < 5.0) {
	
	alertMessage = ("Los dragones barbados tienen " + foodQuantity + "kg, hay que alimentarlos");
	
	}

	else if (foodQuantity > 5.0){

	alertMessage = ("Los dragones barbados tienen " + foodQuantity + "kg, no hay que alimentarlos aun");
	}

	return alertMessage;
    }

    
    public String showV (){

    String msj = "";

    msj = ("El nombre del dragon " + dragon1.getName() + dragon1.showVowels() + "\n");
    msj += ("El nombre del dragon " + dragon2.getName() + dragon2.showVowels() + "\n");

    return msj;
    }

	public double getTemperature () {
		return temperature;
	}

    public void setTemperature (double temperature) {
	    this.temperature = temperature;
	}
	
	
	public double getHumidity () {
		return humidity;
	}

    public void setHumidity (double humidity) {
	    this.humidity = humidity;
	}
	
	public double getFiltration () {
		return filtration;
	}

    public void setFiltration (double filtration) {
	    this.filtration = filtration;
	}

    public double getFoodQuantity () {
		return foodQuantity;
	}

    public void setFoodQuantity (double foodQuantity) {
	    this.foodQuantity = foodQuantity;
	}	
	
	public BDragons getDragon1() {
		return dragon1;
	}

	public void setDragon1(BDragons dragon1) {
		this.dragon1 = dragon1;
	}
	
	public BDragons getDragon2() {
		return dragon2;
	}

	public void setDragon2(BDragons dragon2) {
		this.dragon2 = dragon2;
	}

}