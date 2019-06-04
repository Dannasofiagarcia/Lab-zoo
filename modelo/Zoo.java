package modelo;

public class Zoo {

     //Atributos

     private String nameZoo;

     //Relaciones

     private DragonZone zoneD;
     private KangarooZone zoneK;


     //Metodo constructor

    public Zoo (String nameZoo, DragonZone zoneD, KangarooZone zoneK) {
	
	     this.nameZoo = nameZoo;
	     this.zoneD = zoneD;
	     this.zoneK = zoneK;
    }
	
	
	public String getNameZoo() {
	     return nameZoo;
	}
	
	public void setNameZoo(String nameZoo) {
		 this.nameZoo = nameZoo;
	}
	
	public DragonZone getZoneD() {
		 return zoneD;
	}
		
	public void setZoneD(DragonZone zoneD) {
		 this.zoneD = zoneD;
	}
		
    public KangarooZone getZoneK() {
		 return zoneK;
	}

	public void setZoneK(KangarooZone zoneK) {
		 this.zoneK = zoneK;
	}
		
		
}
