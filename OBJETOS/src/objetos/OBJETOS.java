/*
Practica objetos piezas
 */
package objetos;
public class OBJETOS {
    
    public static void main(String[]args){
        
        piezas p1=new piezas("x000","Constructor",10,"zzz");     //Llamamos las propiezas de la clase piezas y metemos datos
//        p1.Codpieza="x001";
//        p1.Descrip="Recambio cojinete";
//        p1.Cant=10;
//        p1.Codprov="xfs";
        
//        p1.SetCodpieza("x001");         //Insertamos datos en las propiedades con Set
//        p1.SetDescrip("Recambio cojinete");
//        p1.SetCant(10);
//        p1.SetCodprov("xfs");
        
        //Imprimir con Get (no es obligatorio pero recomendable para alguien que lo vea por primera vez)
        System.out.println("Código de pieza: "+p1.GetCodpieza()+
            "\n"+"Descripción: "+p1.GetDescrip()+
            "\n"+"Cantidad: "+p1.GetCant()+
            "\n"+"Código de proveedor: "+p1.GetCodprov());
    }
}
