package ui;

import modelo.*;
import java.util.Scanner;

    public class Main {
	
	     //Relaciones
	
	     private Zoo caliZoo;
	
	     private Scanner reader;


         public Main() {
		     init ();
		     reader = new Scanner (System.in);
	    }	
	

	     public static void main(String[] args) {
		     Main m = new Main (); 
		     m.showMenu();

	     }
	
	    //Creamos los objetos
	
	     public void init() {    
	
	     caliZoo = new Zoo ("Zoologico de Cali",  
	         new DragonZone (34.2, 45.0, 20.0, 700.0, 40.0, new BDragons ("Charmander", 443.7, 0.58, "MALE", "B", new Date (6, 15, 2014)), new BDragons ("Charmilion", 440.2, 0.55, "FEMALE", "AB", new Date (1, 28, 2015))),
             new KangarooZone (25.8, 65.1, 14.8, 800.0, new Environment (new Kangaroo ("Lucy", 18.6, 75.5, "FEMALE", "A", 12, 28, 2017), new Kangaroo ("Adam", 70.8, 120.3, "MALE", "B", 8, 10, 2010), new Kangaroo ("Alice", 23.3, 83.4, "FEMALE", "O", 5, 23, 2014)),
											              new Environment (new Kangaroo ("Chloe", 32.2, 109.3, "FEMALE", "O", 2, 28, 2016), new Kangaroo ("Dulce", 29.9, 100.5, "FEMALE", "O", 28, 1, 2015), new Kangaroo ("Chiara", 27.8, 95.2, "FEMALE", "AB", 11, 20, 2011)),
													      new Environment (new Kangaroo ("Pia", 31.5, 104.6, "FEMALE", "B", 12, 31, 2015), new Kangaroo ("Stella", 23.4, 78.3, "FEMALE", "A", 7, 3, 2013), new Kangaroo ("Moad", 60.2, 120.6, "MALE", "O", 4, 1, 2009)))
	                     
					            );
					 
	
        }   
	
	
	     //Mostramos las opciones del menu
	
	     public void showOptions() {
		
	         System.out.println ("Bienvenido al zoologico de Cali");

	         System.out.println ("Por favor, digite la opcion que desea ver");

             System.out.println ("1. Para ver la informacion de los canguros");

	         System.out.println ("2. Para ver la informacion de los dragones barbados");

	         System.out.println ("3. Para calcular si se debe vacunar un canguro");

	         System.out.println ("4. Para calcular el indice de masa corporal (IMC) de los canguros");

             System.out.println ("5. Para calcular el indice de masa corporal (IMC) de los dragones");

	         System.out.println ("6. Para calcular la cantidad de comida que necesitan los canguros");

	         System.out.println ("7. Para notificar a los biologos la cantidad de comida de los dragones");

	         System.out.println ("8. Para calcular la cantidad de agua de la zona de los dragones");

	         System.out.println ("9. Para calcular la cantidad de agua de la zona de los canguros");

	         System.out.println ("10. Para calcular el area de los ambientes de los canguros");

	         System.out.println ("11. Para ver si el nombre de los animales empieza o termina en vocal");

	         System.out.println ("12. Para calcular el riesgo de enfermedades cardiacas en los canguros");  

	         System.out.println ("13. Agregar un canguro");

	         System.out.println ("14. Eliminar un canguro");

	         System.out.println ("15. Cambiar a un canguro de ambiente");

	         System.out.println ("16. Salir");
    
	     }
	
	
	//Metodo para mostrar el menu y decidir que sucede en cada opcion
	
	public void showMenu (){
		
	     int userInput = 0;
	  
	     while(userInput != 16){
	
		     showOptions();	
	         userInput = reader.nextInt();
	         reader.nextLine();
	
	     switch (userInput){
		
	         case 1:
	  
	             System.out.println ("Seleccione el ambiente en el que desea ver la informacion");
	             System.out.println ("1. Ambiente numero uno");
	             System.out.println ("2. Ambiente numero dos");
	             System.out.println ("3. Ambiente numero tres");
	             System.out.println ("4. Todos los ambientes");
                 int environmentSelected = reader.nextInt();

                 if (environmentSelected == 1){
	                 System.out.println (caliZoo.getZoneK().showEnvironment1Information());
                 }

                 else if (environmentSelected == 2){
                     System.out.println (caliZoo.getZoneK().showEnvironment2Information());
                 }

                 else if (environmentSelected == 3){
                     System.out.println (caliZoo.getZoneK().showEnvironment3Information());
                 }
              
                 else if (environmentSelected == 4){
                     System.out.println (caliZoo.getZoneK().showEnvironment1Information() + "\n");
                     System.out.println (caliZoo.getZoneK().showEnvironment2Information() + "\n");
                     System.out.println (caliZoo.getZoneK().showEnvironment3Information() + "\n");
                }

                else {
                     System.out.println ("Por favor, digite una opcion valida");
                     System.out.println ("\n");
                }
	  
	            break;

	         case 2:

	             System.out.println (caliZoo.getZoneD().showDragonsInformation());

	             break;

	         case 3:

	             System.out.println ("Digite el dia actual");
	             int actualDay = reader.nextInt();
	             reader.nextLine();

	             System.out.println ("Digite el mes actual");
	             int actualMonth = reader.nextInt();
	             reader.nextLine();

	             System.out.println ("Digite el año actual");
	             int actualYear = reader.nextInt();
	             reader.nextLine();

	             Date actualDate = new Date (actualMonth, actualDay, actualYear);

	             System.out.println ("Seleccione el ambiente al que desea calcularle el tiempo de vacuna de los canguros");
	             System.out.println ("1. Ambiente uno");
	             System.out.println ("2. Ambiente dos");
	             System.out.println ("3. Ambiente tres");


                 int environmentSelected2 = reader.nextInt();
                 reader.nextLine();

            
            
                 if (environmentSelected2 == 1){
	             System.out.println (caliZoo.getZoneK().showCalculateEnvironment1VaccineTime (actualMonth, actualDay, actualYear));
                 }

                 else if (environmentSelected2 == 2){
	             System.out.println (caliZoo.getZoneK().showCalculateEnvironment2VaccineTime (actualMonth, actualDay, actualYear));
                 }

                 else if (environmentSelected2 == 3){
	             System.out.println (caliZoo.getZoneK().showCalculateEnvironment3VaccineTime (actualMonth, actualDay, actualYear));
                 }

                 break;

             case 4:

                 System.out.println ("Seleccione el ambiente que desea ver su IMC");
                 System.out.println ("1. Ambiente uno");
                 System.out.println ("2. Ambiente dos");
                 System.out.println ("3. Ambiente tres");
                 int environmentSelected3 = reader.nextInt();
                 reader.nextLine ();

                 if (environmentSelected3 == 1){
                 System.out.println (caliZoo.getZoneK().showCalculateEnvironment1BMI ());
                 }

                 else if (environmentSelected3 == 2){
                 System.out.println (caliZoo.getZoneK().showCalculateEnvironment2BMI());
                 }

                 else if (environmentSelected3 == 3){
                 System.out.println (caliZoo.getZoneK().showCalculateEnvironment3BMI());
                 }

                 break;

             case 5:

                 System.out.println (caliZoo.getZoneD().showCalculateDragonBMI());
              
                 break;

             case 6:

                 System.out.println (caliZoo.getZoneK().showEnviromentsFoodQuantity());

             case 7:

                 System.out.println (caliZoo.getZoneD().foodAlert());
                 
                 break;

             case 8:

                 System.out.println (caliZoo.getZoneD().calculateZoneWaterQuantity());

                 break;

             case 9:

                 System.out.println (caliZoo.getZoneK().calculateWaterZoneQuantity());

                 break;

             case 10:

                 System.out.println ("Seleccione el ambiente que desea ver su area");
                 System.out.println ("1. Ambiente uno");
                 System.out.println ("2. Ambiente dos");
                 System.out.println ("3. Ambiente tres");
                 System.out.println ("4. El area total de los ambientes");
                 int environmentSelected4 = reader.nextInt();


                 if (environmentSelected4 == 1){
                 System.out.println (caliZoo.getZoneK().showCalculateAreaEn1());
                 }

                 else if (environmentSelected4 == 2){
                 System.out.println (caliZoo.getZoneK().showCalculateAreaEn2());
                 }

                 else if (environmentSelected4 == 3){
                 System.out.println (caliZoo.getZoneK().showCalculateAreaEn3());
                 }

                 else if (environmentSelected4 == 4){
                 System.out.println (caliZoo.getZoneK().showCalculateAreaTotal());
                 }

                 break;

             case 11:

                 System.out.println (caliZoo.getZoneD().showV());
                 System.out.println (caliZoo.getZoneK().showV());

                 break;


             case 12: 

                 System.out.println (caliZoo.getZoneK().showInformationCalculateHeartRisk());

                 break;

             case 13:

                 System.out.println ("Ingrese el nombre del canguro nuevo");
                 String name = reader.nextLine();

                 System.out.println ("Ingrese el peso del canguro nuevo");
                 double weight = reader.nextDouble();
                 reader.nextLine();

                 System.out.println ("Ingrese el altura del canguro nuevo");
                 double height = reader.nextDouble();
                 reader.nextLine();

                 System.out.println ("Por favor digite el genero \n 1.Masculino \n 2.Femenino");
                 int selectionGender = reader.nextInt();
                 reader.nextLine();

                 String gender = selectionGender ==1 ? Kangaroo.MALE : Kangaroo.FEMALE;

                 System.out.println ("Ingrese el tipo de sangre del canguro nuevo");
                 String bloodType = reader.nextLine();

                 System.out.println ("Ingrese el dia de nacimiento del canguro nuevo");
                 int birthDay = reader.nextInt();
                 reader.nextLine();

                 System.out.println ("Ingrese el mes de nacimiento del canguro nuevo");
                 int birthMonth = reader.nextInt();
                 reader.nextLine();

                 System.out.println ("Ingrese el año de nacimiento del canguro nuevo");
                 int birthYear = reader.nextInt();
                 reader.nextLine();
               
                 Kangaroo created = new Kangaroo (name, weight, height, gender, bloodType, birthMonth, birthDay, birthYear);

                 System.out.println ("Seleccione en que ambiente desea agregar el canguro nuevo");
                 System.out.println ("1. Primer ambiente");
                 System.out.println ("2. Segundo ambiente");
                 System.out.println ("3. Tercer ambiente");
                 int environmentSelected5 = reader.nextInt();
                 reader.nextLine();

                 System.out.println (caliZoo.getZoneK().showAddKangaroo(created, environmentSelected5));


                 break;

             case 14:

                 System.out.println ("Seleccione el ambiente del canguro que desea eliminar");
                 System.out.println ("1. Ambiente uno");
                 System.out.println ("2. Ambiente dos");
                 System.out.println ("3. Ambiente tres");
                 int environmentSelected6 = reader.nextInt();
                 reader.nextLine();
                 System.out.println (caliZoo.getZoneK().showEnvironmentAvailable(environmentSelected6));

                 System.out.println ("Escriba el nombre del canguro que desea eliminar");
                 String nombre = reader.nextLine();

                 System.out.println (caliZoo.getZoneK().showDeleteKangaroo(environmentSelected6, nombre));

                 break;


             case 15:

                 System.out.println ("Seleccione el ambiente del canguro que desea cambiar");
                 System.out.println ("1. Ambiente uno");
                 System.out.println ("2. Ambiente dos");
                 System.out.println ("3. Ambiente tres");
                 int environmentSelected7 = reader.nextInt();
                 reader.nextLine();

                 System.out.println ("Seleccione el nunmero del canguro que desea cambiar de ambiente");
                 System.out.println (caliZoo.getZoneK().showEnvironmentAvailable2(environmentSelected7));
                 int kangarooSelected = reader.nextInt();

                 System.out.println ("Seleccione el ambiente al que desea cambiar el canguro");
                 System.out.println ("1. Ambiente uno");
                 System.out.println ("2. Ambiente dos");
                 System.out.println ("3. Ambiente tres");
                 int environmentSelected8 = reader.nextInt();
                 reader.nextLine();

                 System.out.println (caliZoo.getZoneK().changeEnvironment(environmentSelected8, environmentSelected7, kangarooSelected));

            break;



                 

                 

                 

                 
















	        
            }   
        }
    }
}




	
	
	//System.out.println (caliZoo.getZoneD().showCalculateDragonBMI());
	
	
	
	
	
	
	
