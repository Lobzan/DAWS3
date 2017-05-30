/*
Declaramos las propiedades de piezas
 */
package objetos;
public class piezas {
    String Codpieza;    //private para que no se pueda acceder a esta informacion
    String Descrip;
    int Cant;
    String Codprov;
    
    public piezas(){
        Codpieza="";
    }
    
//    public piezas(){        
//        Codpieza="x001";
//        Descrip="Recambio cojinete";
//        Cant=10;
//        Codprov="xfs";
//    }
                            //Inicio constructor
    public piezas(String Codpieza, String Descrip, int Cant, String Codprov){
        this.Codpieza=Codpieza;
        this.Descrip=Descrip;
        this.Cant=Cant;
        this.Codprov=Codprov;
    }                       //Cierre constructor
    
    public void SetCodpieza (String Codpieza){
        this.Codpieza=Codpieza;		//Si es el mismo nombre
        //codigopieza=pieza			Si no es el mismo nombre
    }
    public void SetDescrip (String Descrip){
        this.Descrip=Descrip;		//Si es el mismo nombre
        //descripcion=descrip			//Si no es el mismo nombre
    }
    public void SetCant (int Cant){
        this.Cant=Cant;			//Si es el mismo nombre
        //cantidad=cant                         Si no es el mismo nombre
    }
    public void SetCodprov (String Codprov){
        this.Codprov=Codprov;		//Si es el mismo nombre
        //codigoproveedor=codproveedor		Si no es el mismo nombre
    }
    
	public String GetCodpieza(){
            return Codpieza;
	}
	public String GetDescrip(){
            return Descrip;
	}
	public int GetCant(){
            return Cant;
	}
	public String GetCodprov(){
            return Codprov;
	}
}
