package modelo;

public class KangarooZone {
	
	//Constantes
	
	public static final double VALUE_MULTIPLY_WATER = 0.75;
	
	//Atributos
	
	private double temperature;
	private double humidity;
	private double filtration;
	private double area;
	
	
	//Relaciones
	
    private Environment en1;
	private Environment en2;
	private Environment en3;
	

	//Metodos
	
	public KangarooZone (double temperature, double humidity, double filtration, double area, Environment en1, Environment en2, Environment en3){
	this.temperature = temperature;
	this.humidity = humidity;
	this.filtration = filtration;
	this.area = area;
	this.en1 = en1;
	this.en2 = en2;
	this.en3 = en3;

	}
	
	//Metodo calcular agua de la zona
	
	public String calculateWaterZoneQuantity (){
	
	String msj ="";

	msj = "La cantidad de agua del primer ambiente es " + "\n" + "\n" + en1.showCalculateWaterQuantity() + "\n";
	msj += "La cantidad de agua del segundo ambiente es " + "\n" + "\n" + en2.showCalculateWaterQuantity() + "\n";
	msj += "La cantidad de agua del tercer ambiente es " + "\n" + "\n" + en3.showCalculateWaterQuantity() + "\n";
	
	return msj;
	}

 
    //Metodo para mostrar la informacion del ambiente 1

    public String showEnvironment1Information (){

    String msj = "";

    msj = ("La informacion del primer ambiente es: " + "\n" + "\n" + en1.showKangarooInformation());
    msj += ("\n");

    return msj; 

    }

  
    //Meotodo para mostrar la informacion del ambiente 2

    public String showEnvironment2Information (){

    String msj = "";

    msj = ("La informacion del segundo ambiente es: " + "\n" + "\n" + en2.showKangarooInformation());
    msj += ("\n");

    return msj; 

    }


     //Metodo para mostrar la informacion del ambiente 3

    public String showEnvironment3Information (){

    String msj = "";

    msj = ("La informacion del tercer ambiente es: " + "\n" + "\n" + en3.showKangarooInformation());
    msj += ("\n");

    return msj; 

    }


    //Metodo para mostrar la informacion de vacuna del ambiente 1

    public String showCalculateEnvironment1VaccineTime (int actualMonth, int actualDay, int actualYear){

    String msj = "";

    msj = ("La informacion sobre las vacunas del primer ambiente es: " + "\n" + "\n" + en1.showCalculateKangarooVaccineTime (actualMonth, actualDay, actualYear) + "\n");
    msj += ("\n");

    return msj;
    }




    //Metodo para mostrar la informacion de vacuna del ambiente 2

    public String showCalculateEnvironment2VaccineTime (int actualMonth, int actualDay, int actualYear){

    String msj = "";

    msj = ("La informacion sobre las vacunas del segundo ambiente es: " + "\n" + "\n" + en2.showCalculateKangarooVaccineTime (actualMonth, actualDay, actualYear) + "\n");
    msj += ("\n");    

    return msj;
    }



    //Metodo para mostrar la informacion de vacuna del ambiente 3

    public String showCalculateEnvironment3VaccineTime (int actualMonth, int actualDay, int actualYear){

    String msj = "";

    msj = ("La informacion sobre las vacunas del tercer ambiente es: " + "\n" + "\n" + en3.showCalculateKangarooVaccineTime (actualMonth, actualDay, actualYear) + "\n");
    msj += ("\n");    

    return msj;
    }


     public String showEnviromentsFoodQuantity (){

    String msj = "";

    msj = ("La cantidad de comida de los canguros del ambiente uno es " + "\n" + "\n" + en1.showFoodQuantity() + "\n");
    msj += ("La cantidad de comida de los canguros del ambiente dos es " + "\n" + "\n" + en2.showFoodQuantity() + "\n");
    msj += ("La cantidad de comida de los canguros del ambiente tres es " + "\n" + "\n" + en3.showFoodQuantity() + "\n");

    return msj;
    }


    //Metodo para mostrar la informacion del indice de masa corporal del ambiente 1

    public String showCalculateEnvironment1BMI (){

    String msj = "";

    msj = ("El indice de masa corporal de los canguros del primer ambiente es " + "\n" + en1.showCalculateKangarooBMI() + "\n");
    msj += ("\n");

    return msj;
    }


     //Metodo para mostrar la informacion del indice de masa corporal del ambiente 2

    public String showCalculateEnvironment2BMI (){

    String msj = "";

    msj = ("El indice de masa corporal de los canguros del primer ambiente es "  + "\n" + en2.showCalculateKangarooBMI() + "\n");
    msj += ("\n");

    return msj;
    }


    //Metodo para mostrar la informacion del indice de masa corporal del ambiente 3
    public String showCalculateEnvironment3BMI (){

    String msj = "";

    msj = ("El indice de masa corporal de los canguros del primer ambiente es " + "\n" + en3.showCalculateKangarooBMI() + "\n");
    msj += ("\n");

    return msj;
    }


    public String showCalculateAreaEn1 (){

    String msj = "";

    msj = ("El area del primer ambiente es " + en1.calculateArea() + "\n");
    msj += ("\n");

    return msj;
    }


    public String showCalculateAreaEn2 (){

    String msj = "";

    msj = ("El area del segundo ambiente es " + en2.calculateArea() + "\n");
    msj += ("\n");

    return msj;
    }


    public String showCalculateAreaEn3 (){

    String msj = "";

    msj = ("El area del tercer ambiente es " + en3.calculateArea() + "\n");
    msj += ("\n");

    return msj;
    }


    public String showCalculateAreaTotal (){

    String msj = "";
    double areaTotal = 0;
 
    areaTotal = en1.calculateArea() + en2.calculateArea() + en3.calculateArea();
    msj = ("El area total de los ambientes es " + areaTotal);

    return msj;
    }


    public String showInformationCalculateHeartRisk (){

    String msj = "";

    msj = ("La informacion sobre los problemas cardiacos de los canguros del primer ambiente es " + "\n" + "\n" + en1.showCalculateHeartRisk() + "\n");
    msj += ("La informacion sobre los problemas cardiacos de los canguros del segundo ambiente es " + "\n" + "\n" + en2.showCalculateHeartRisk() + "\n");
    msj += ("La informacion sobre los problemas cardiacos de los canguros del tercer ambiente es " + "\n" + "\n" +en3.showCalculateHeartRisk() + "\n");

    return msj;
    }


    public String showAddKangaroo (Kangaroo created, int environmentSelected5){

    String msj = "";

    if (environmentSelected5 == 1){
    msj = (en1.addNewKangaroo(created));
    }

    if (environmentSelected5 == 2){
    msj += (en2.addNewKangaroo(created));
    }

     if (environmentSelected5 == 3){
    msj += (en3.addNewKangaroo(created));
    }
 
    return msj;

}


    public String showEnvironmentAvailable (int environmentSelected6){

    String msj = "";

    if (environmentSelected6 == 1){
     msj = ("Los canguros del primer ambiente son: " + "\n" + en1.showKangarooAvailable2() + "\n");
    }

    else if (environmentSelected6 == 2){
     msj = ("Los canguros del segundo ambiente son: " + "\n" + en2.showKangarooAvailable2() + "\n");
    }

    else if (environmentSelected6 == 3){
     msj = ("Los canguros del tercer ambiente son: " + "\n" + en3.showKangarooAvailable2() + "\n");
    }
 
    return msj;
    }
	

	public String showDeleteKangaroo (int environmentSelected6, String nombre){

	String msj = "";

     if (environmentSelected6 == 1){
     msj = (en1.deleteKangaroo(nombre));
    }

    else if (environmentSelected6 == 2){
     msj = (en2.deleteKangaroo(nombre));
    }

    else if (environmentSelected6 == 3){
     msj = (en3.deleteKangaroo(nombre));
    }
 
    return msj;
	}

 public String showEnvironmentAvailable2 (int environmentSelected7){

    String msj = "";

    if (environmentSelected7 == 1){
     msj = ("Los canguros del primer ambiente son: " + "\n" + en1.showKangarooAvailable() + "\n");
    }

    else if (environmentSelected7 == 2){
     msj += ("Los canguros del segundo ambiente son: " + "\n" + en2.showKangarooAvailable() + "\n");
    }

    else if (environmentSelected7 == 3){
     msj += ("Los canguros del tercer ambiente son: " + "\n" + en3.showKangarooAvailable() + "\n");
    }
 
    return msj;
    }


    //Metodo para obtener el ambiente anterior

    public Environment getOldEnvironment (int environmentSelected7 ){

    Environment old = null;
    

    if (environmentSelected7 == 1 ){
         old = en1;
    }	

    if (environmentSelected7 == 2){
        old = en2;
    }

    if (environmentSelected7 == 3){
    	 old = en3;
    }

    return old;
   }



   //Metodo para obtener el ambiente nuevo

    public Environment getNewEnvironment (int environmentSelected8 ){

    Environment newE = null;
    

    if (environmentSelected8 == 1 ){
         newE = en1;
    }	

    if (environmentSelected8 == 2){
         newE = en2;
    }

    if (environmentSelected8 == 3){
    	 newE = en3;
    }

    return newE;
   }

   //Metodo para cambiar el canguro

   public String changeEnvironment (int environmentSelected8, int environmentSelected7, int kangarooSelected){

   	String msj = "";

   	Environment lastEnvironment = getOldEnvironment(environmentSelected7);
   	Environment newEnvironment = getNewEnvironment (environmentSelected8);

   	Kangaroo x = lastEnvironment.selectKangaroo(kangarooSelected);

    msj = (newEnvironment.addNewKangaroo(x));
   	lastEnvironment.deleteKangarooEnvironment(kangarooSelected);

   return msj;

}

public String showV (){

    String msj = "";

    msj = (en1.showVK() + "\n");
    msj += (en2.showVK() + "\n");
    msj += (en3.showVK() + "\n");

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
	
	public double getArea () {
		return area;
	}

    public void setArea (double area) {
	    this.area = area;
	}
	
	public Environment getEn1() {
		return en1;
	}

	public void setEn1(Environment en1) {
		this.en1 = en1;
	}
	
	public Environment getEn2() {
		return en2;
	}

	public void setEn2(Environment en2) {
		this.en2 = en2;
	}
	
	public Environment getEn3() {
		return en3;
	}

	public void setEn3(Environment en3) {
		this.en3 = en3;
	}
	

}