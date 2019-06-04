package modelo;

public class Environment {
	
	//Constantes
	
	public final static int MULTIPLY_AREA = 8;
	
	//Atributos
	
	private double areaK;
	
	
	//Relaciones
	
	private Kangaroo kangaroo1;
	private Kangaroo kangaroo2;
	private Kangaroo kangaroo3;
	private Kangaroo selected;
	
	
	//Metodo constructor
	
    public Environment (Kangaroo kangaroo1, Kangaroo kangaroo2, Kangaroo kangaroo3) {
	
	     this.kangaroo1 = kangaroo1;
	     this.kangaroo2 = kangaroo2;
	     this.kangaroo3 = kangaroo3;
	     areaK = calculateArea();
    }
	
	//Metodo para calcular el area de los canguros
	
	public double calculateArea (){
	
	     double areaK = 0;
	
	     if (kangaroo1 != null){
	         areaK = kangaroo1.getHeight()*MULTIPLY_AREA;
         }
	
	     if (kangaroo2 != null){
	         areaK += kangaroo2.getHeight()*MULTIPLY_AREA;
	     }
	
	     if (kangaroo3 != null) {
	         areaK += kangaroo3.getHeight()*MULTIPLY_AREA;	
	    }
	
	     return areaK;
	}


    //Metodo para calcular la cantidad de agua
	
	public String showCalculateWaterQuantity (){
	
         String msj = "";

	     if (kangaroo1 != null){
		
	         msj = ("La cantidad de agua que necesita " + kangaroo1.getName() + " es " + kangaroo1.calculateWaterQuantity() + "\n");
	     }
	
	     if (kangaroo2 != null){
	
	         msj += ("La cantidad de agua que necesita " + kangaroo2.getName() + " es " + kangaroo2.calculateWaterQuantity() + "\n");
         }
	
	     if (kangaroo3 != null){
	
	         msj += ("La cantidad de agua que necesita " + kangaroo3.getName() + " es " + kangaroo3.calculateWaterQuantity() + "\n");
	     }
	
	     return msj;
	}
	

	//Metodo para mostrar la informacion de los canguros

	public String showKangarooInformation(){
    
         String msj = "";


         if (kangaroo1 != null){

    	     msj = "El nombre del canguro es " + kangaroo1.getName() + "\n";
    	     msj += "El peso del canguro es " + kangaroo1.getWeight() + "\n";
    	     msj += "La altura del canguro es " + kangaroo1.getHeight() + "\n";
    	     msj += "El sexo del canguro es " + kangaroo1.getGender() + "\n";
    	     msj += "El tipo de sangre del canguro es " + kangaroo1.getBloodType() + "\n";
    	     msj += "\n";
         }

         if (kangaroo2 != null){

    	     msj += "El nombre del canguro es " + kangaroo2.getName() + "\n";
    	     msj += "El peso del canguro es " + kangaroo2.getWeight() + "\n";
    	     msj += "La altura del canguro es " + kangaroo2.getHeight() + "\n";
    	     msj += "El sexo del canguro es " + kangaroo2.getGender() + "\n";
    	     msj += "El tipo de sangre del canguro es " + kangaroo2.getBloodType() + "\n";
    	     msj += "\n";
         }

         if (kangaroo3 != null){

    	     msj += "El nombre del canguro es " + kangaroo3.getName() + "\n";
    	     msj += "El peso del canguro es " + kangaroo3.getWeight() + "\n";
    	     msj += "La altura del canguro es " + kangaroo3.getHeight() + "\n";
    	     msj += "El sexo del canguro es " + kangaroo3.getGender() + "\n";
    	     msj += "El tipo de sangre del canguro es " + kangaroo3.getBloodType() + "\n";
         }

         return msj;

	}


    public String showCalculateHeartRisk (){

         String msj ="";

         if (kangaroo1 != null){

             msj = ("Para " + kangaroo1.getName() + kangaroo1.calculateHeartRisk()) + "\n";
         }

         if (kangaroo2 != null){

             msj += ("Para " + kangaroo2.getName() + kangaroo2.calculateHeartRisk() + "\n");
         }

         if (kangaroo3 != null){

             msj += ("Para " + kangaroo3.getName() + kangaroo3.calculateHeartRisk() + "\n");
        }

    
         return msj;
    }

	 //Metodo para calcular el tiempo de vacuna de los canguros

    public String showCalculateKangarooVaccineTime (int actualMonth, int actualDay, int actualYear){
    
         String msj = "";

         if (kangaroo1 != null){
    
             msj = (kangaroo1.getName() + kangaroo1.calculateVaccineTime(actualYear, actualDay, actualMonth));
         }

         if (kangaroo2 != null){
    
             msj += (kangaroo2.getName() + kangaroo2.calculateVaccineTime(actualYear, actualDay, actualMonth));
         }

         if (kangaroo3 != null){
    
             msj += (kangaroo3.getName() + kangaroo3.calculateVaccineTime(actualYear, actualDay, actualMonth));
         }

         return msj;
	}


	//Metodo para mostrar el indice de masa corporal de los canguros 

	public String showCalculateKangarooBMI (){

	String msj = "";

	if (kangaroo1 != null){

	msj = (kangaroo1.getName() + " tiene un IMC de " + kangaroo1.calculateKangarooBMI() + "\n");
    }

	if (kangaroo2 != null){

	msj += (kangaroo2.getName() + " tiene un IMC de " + kangaroo2.calculateKangarooBMI() + "\n");
	}

	if (kangaroo3 != null){

	msj += (kangaroo3.getName() + " tiene un IMC de " + kangaroo3.calculateKangarooBMI() + "\n");
	}

    return msj;

	}


    //Metodo para mostrar la cantidad de comida de los canguros

    public String showFoodQuantity(){

    	String msj = "";

         if (kangaroo1 != null){
         msj = ("La cantidad de comida que necesita el canguro " + kangaroo1.getName() +  "es " + kangaroo1.foodQuantity() + "\n");
         }

         if (kangaroo2 != null){
         msj += ("La cantidad de comida que necesita el canguro " + kangaroo2.getName() +  "es " + kangaroo2.foodQuantity() + "\n");
         }

         if (kangaroo3 != null){
         msj += ("La cantidad de comida que necesita el canguro " + kangaroo3.getName() +  "es " + kangaroo3.foodQuantity() + "\n");
         }

         return msj;
    }


    public boolean calculateMale (){

    boolean male = false;

    if (kangaroo1 != null && kangaroo1.getGender() .equals ("MALE")){
    male = true;
    }

    else if (kangaroo2 != null && kangaroo2.getGender() .equals ("MALE")){
    male = true;
    }

    else if (kangaroo1 != null && kangaroo3.getGender() .equals ("MALE")){
    male = true;
    }

    return male;

    }


    public String addNewKangaroo (Kangaroo created){
    String msj = "";

    if (kangaroo1 == null || kangaroo2 == null || kangaroo3 == null){
    	if (created.getGender() .equals ("MALE")){
    		if (calculateMale ()){
    			msj = "En el ambiente hay más machos, no se puede agregar el canguro";
    		}

    	}

                 if (kangaroo1 == null){
                 kangaroo1 = created;
                 msj = "Se pudo agregar el canguro";
                 }

                 else if (kangaroo2 == null){
                 kangaroo2 = created;
                 msj = "Se pudo agregar el canguro";
                 }

                 else if (kangaroo3 == null){
                 kangaroo3 = created;
                 msj = "Se pudo agregar el canguro";
                 }

                     else {

                     msj = "No se pudo agregar porque el ambiente se encuentra lleno";
                     }
    }
    return msj;
    
}

   public boolean addNewKangarooEnvironment (){
    String msj = "";
    boolean add = false;

    if (kangaroo1 == null || kangaroo2 == null || kangaroo3 == null){
    	if (selected.getGender() .equals ("MALE")){
    		if (calculateMale ()){
    			msj = "En el ambiente hay más machos, no se puede agregar el canguro";
    			add = false;
    		}

    	}

                 if (kangaroo1 == null){
                 kangaroo1 = selected;
                 msj = "Se pudo agregar el canguro";
                 add = true;
                 }

                 else if (kangaroo2 == null){
                 kangaroo2 = selected;
                 msj = "Se pudo agregar el canguro";
                 add = true;
                 }

                 else if (kangaroo3 == null){
                 kangaroo3 = selected;
                 msj = "Se pudo agregar el canguro";
                 add = true;
                 }

                     else {

                     msj = "No se pudo agregar porque el ambiente se encuentra lleno";
                     add = false;
                     }
    }
    return add;
    
}
	

public Kangaroo selectKangaroo (int kangarooSelected){


if (kangarooSelected == 1 && kangaroo1 != null){
	     selected = kangaroo1;
}

if (kangarooSelected == 2 && kangaroo2 != null){
	     selected = kangaroo2;
}

if (kangarooSelected == 3 && kangaroo3 != null){
	     selected = kangaroo3;

}

return selected;

}

//Metoodo para ver los canguros disponibles 

 public String showKangarooAvailable2 (){

 String msj = "";

 if (kangaroo1 != null){

 msj = (kangaroo1.getName() + "\n");
 }

 if (kangaroo2 != null){

 msj += (kangaroo2.getName() + "\n");
 }

 if (kangaroo3 != null){

 msj += (kangaroo3.getName() + "\n");

}

return msj;
}


//Metoodo para ver los canguros disponibles 

 public String showKangarooAvailable (){

 String msj = "";

 if (kangaroo1 != null){

 msj = ("1. " + kangaroo1.getName() + "\n");
 }

 if (kangaroo2 != null){

 msj += ("2. " + kangaroo2.getName() + "\n");
 }

 if (kangaroo3 != null){

 msj += ("3. " + kangaroo3.getName() + "\n");

}

return msj;
}

//Metodo para eliminar un canguro

public String deleteKangaroo (String nombre){

String msj = "";

if (nombre .equals (kangaroo1.getName()) && kangaroo1 != null){

	kangaroo1 = null;
    msj = ("El canguro fue eliminado");
}

else if (nombre .equals (kangaroo2.getName()) && kangaroo2 != null){

	kangaroo2 = null;
    msj = ("El canguro fue eliminado");
}


else if (nombre .equals (kangaroo3.getName()) && kangaroo3 != null){

	kangaroo3 = null;
    msj = ("El canguro fue eliminado");
}

else {

	msj= "Nombre incorrecto, no se encuentra el canguro que se desea eliminar";
}

return msj;
}


//Metodo para eliminar el canguro cuando lo agrego a otro ambiente
public String deleteKangarooEnvironment (int kangarooSelected){

String msj = "";

if (kangarooSelected == 1 && kangaroo1 != null && addNewKangarooEnvironment() == true){

	kangaroo1 = null;
    msj = ("El canguro fue eliminado");
}

if (kangarooSelected == 2 && kangaroo2 != null && addNewKangarooEnvironment() == true){

	kangaroo2 = null;
    msj = ("El canguro fue eliminado");
}

if (kangarooSelected == 3 && kangaroo3 != null && addNewKangarooEnvironment() == true){

	kangaroo3 = null;
    msj = ("El canguro fue eliminado");
}


return msj;
}

public String showVK (){

	String msj ="";

	msj = ("El nombre del canguro " + kangaroo1.getName() + kangaroo1.showVowels() + "\n");
	msj += ("El nombre del canguro " + kangaroo2.getName() + kangaroo2.showVowels() + "\n");
	msj += ("El nombre del canguro " + kangaroo3.getName() + kangaroo3.showVowels() + "\n");

	return msj;
}


	public Kangaroo getKangaroo1 () {
		return kangaroo1;
	}

    public void setKangaroo1 (Kangaroo kangaroo1) {
	    this.kangaroo1 = kangaroo1;
	}

    public Kangaroo getKangaroo2 () {
		return kangaroo2;
	}

    public void setKangaroo2 (Kangaroo kangaroo2) {
	    this.kangaroo2 = kangaroo2;
    }
	
    public Kangaroo getKangaroo3 () {
		return kangaroo3;
	}

    public void setKangaroo3 (Kangaroo kangaroo3) {
	    this.kangaroo3 = kangaroo3;  
	}
	
	public double getAreaK() {
		return areaK;
	}

    public void setAreaK(double areaK) {
	    this.areaK = areaK;  
	}

}

	
   