
/**
 *En el taller de coches DAW hay precios especiales para cambiar el aceite y las
ruedas a los coches. Este taller tiene en el almacén el aceite y las ruedas para
realizar dichos cambios.
En el taller se necesita saber en un momento dado cuantos coches será capaz de
atender en función de las existencias de ruedas y aceite que tiene en el taller.
Además, se quiere llevar el registro de los ingresos producidos en el taller por
haber realizado los cambios de ruedas y aceite.

Para ello hay que crear una clase Taller con los atributos aceite,
ruedas, contadorCambiosTotales, contadorCambiosParciales.
Como métodos tiene:
1.- Constructor(int, int): recibirá el número de bidones de aceite y el número de
ruedas que hay en el almacén. Los bidones de aceite son de 5 litros cada uno. 
* Los contadores se inicializan a 0.
2.- addAceite(int): incrementa los litros nuevos de aceite en función de los bidones
que se pasan como parámetro.
3.- addRuedas(int): incrementa el número de ruedas indicado para el almacén.
* 
* 
* 
* 
4.- getCambioCompletos(): devuelve el número de coches al que se puede hacer
un cambio completo con las existencias que tenemos en el almacén. Se utilizan 3
litros de aceite por coche y se cambian las cuatro ruedas del coche.
5.- getCambioParcial(): devuelve el número de coches al que se puede hacer un
cambio parcial con las existencias que tenemos en el almacén. Se utilizan 3 litros
de aceite por coche y se cambian solo dos ruedas del coche.
5.- cambioCompleto(): disminuye el número de litros de aceite y de ruedas del
almacén porque se ha hecho el cambio completo a un coche en el taller e
incrementa el contador correspondiente.
6.- cambioParcial(): disminuye el número de litros de aceite y de ruedas del
almacén porque se ha hecho el cambio parcial a un coche en el taller, e
incrementa el contador correspondiente.

7.- getRuedas(): devuelve el número de ruedas que hay en el taller.
8.-getAceite(): devuelve el número de litros de aceite que hay en el taller.

9.-toString(): devuelve un string con la siguiente información y con el siguiente formato:

TALLER EXISTENCIAS:
Ruedas: 50 unidades.
Aceite: 230 litros.
INGRESOS: Total: 245,45 €
Los ingresos se calculan de la siguiente manera: los cambios parciales se
facturan a 5 euros el litro de aceite y 60 euros por rueda, y los cambios completos
se facturan a 4,5 euros el litro de aceite y 50 euros por rueda.

En el programa principal crea un taller y prueba todos sus métodos.

Modifica la clase Taller para que tenga un constructor copia. 
En el programa principal crea un segundo objeto de tipo Taller haciendo uso de ese constructor.

Comprueba que los datos de ambos talleres son iguales.

 */
 
 
 
public class Taller {
   
    int ruedas;
    int aceite;
   // int coches;
    int contadorCambiosTotales; 
    int contadorCambiosParciales;

     //public Taller(){}
     
 public Taller(int ruedas, int aceite ){ // 1.- Constructor
 this.ruedas=ruedas;  
 this.aceite+=aceite*5; // incrementa con + y lo que venga x5.. el numero de bidones
 contadorCambiosTotales=0; //lo pide el problema  a cero
 contadorCambiosParciales=0;
 }

 public void addAceite(int aceite) // incrementa los litros nuevos de aceite en función de los bidones que se pasan como parámetro.
 {
 this.aceite+=aceite*5; 
 }
 public void addRuedas(int ruedas)
 {
 this.ruedas+=ruedas; // incrementarrrrrrrrrrrrrrr
 }
 
  
  public int getRuedas(int ruedas)
 {
 this.ruedas=ruedas; 
   return ruedas;
 } 
 public int getAceite(int aceite)
 {
 this.aceite=aceite; 
    return aceite;
 }

 
 /*  BOTON DERECHO : insertar codigo............
 
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
 
    }*/
 
 
 public int getCambioCompletos()
 {
     int aux=(aceite/3<=ruedas/4)?aceite/3:ruedas/4;
     return aux;
 }   
   
 public int getCambioParcial()
 {
 int aux=(aceite/3<=ruedas/2)?aceite/3:ruedas/2;
     return aux;
 }   
     
 public void cambioCompleto(){
 /*boolean aux=(get.cambioCompleto()>0);
 ruedas-=aux? 4:0;
 aceite-=aux? 3:0;
 contadorCambiosTotales+=aux?1:0;
 */
 if(getCambioCompletos()>0){
 ruedas-=4;
 aceite-=3;
 contadorCambiosTotales++;
 }
 
 }

 public boolean CambioParcial(){
 boolean aux=(getCambioParcial()>0);
 ruedas-=aux?2:0;
 aceite-=aux?3:0;
 contadorCambiosTotales+=aux?1:0;
 return aux;
 }
 
      
 public int setRuedasInicial(int ruedas)
 {
//this.ruedas=ruedas; 
 return ruedas;
 }
 public int setAceiteInicial(int aceite)
 {`+ç
 public int getAceite()
 {
 return aceite;
 }
 */
   
 
  public String  toString()
     {
         double ingresos=contadorCambiosTotales*4*50+contadorCambiosTotales*3*4.5;
           ingresos+=contadorCambiosParciales*2*60+contadorCambiosParciales*3*5;
         
     //return "TALLER ESXISTENCIAS\n ruedas: "+ruedas+" aceite: "+aceite+";
        return String.format("TALLER exis"+" );  
                /* MISMO QUE PRINT F es STRING.format*/
     }
  
 
 
  /* 
  TALLER EXISTENCIAS:
Ruedas: 50 unidades.
Aceite: 230 litros.
INGRESOS: Total: 245,45 €
Los ingresos se calculan de la siguiente manera: los cambios parciales se
facturan a 5 euros el litro de aceite y 60 euros por rueda, y los cambios completos
se facturan a 4,5 euros el litro de aceite y 50 euros por rueda. */

         
 
 
 
}
 
   
 