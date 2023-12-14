
public class Lista extends Nodo
{
   private Nodo top;//Debe de ser privado ya que no debe de poder acceder al objeto
   private Nodo back;
  
     public Lista ()
     {//Constructor de la clase
      top = null;
      back = null;
    //Para agregar un nodo antes, debemos de usar un nodo temporal llamado temp
   }
   
   //Metodo para crear los nodos de la lista (Agregar)
    public void add (int dato){
       Nodo temp = new Nodo();
       temp.dato = dato;
       if (top == null) {
         top = temp;
         back = temp;
        }
        temp.next = top;
        top.prev = temp; 
        top = temp;
    }
    

    //Metodo para mostrar la lista
    @Override//Indica que sobreescribiremos un metodo, el metodo de abajo del override,
             //es el que sera sobreescrito al ya existente. Si no hicieramos esto, al momento
             //de imprimir la lista, nos daria valores almacenados en memoria y no los que nosotros queremos
    public String toString ()
    {
        String S = ""; //Creamos una variable de tipo string y le asignamos un valor nulo
        Nodo temp = top; //Lo cambiamos para verifiar que este correcto
        while (temp !=null)
        {
          S += temp.dato + ", "; //Concatenamos, esto nos dice que en S se almacenan todos los valores de la lista
          temp = temp.next;

        }
        return S; //S va a devolver todos los valores de la lista
    }
    
    //  (1)
    //Metodo para BUSCAR un nodo por el valor de su campo clave y devolver una referencia. (1)
     public Nodo buscar (int dato) 
     {   
      Nodo temp = top; //Decimos que el nodo temp es igual a top
      while (temp != null) //ciclo para decir que mientras temp no sea igual a null, vamos a recorrer la lista
      {
       if(temp.dato == dato) //Si el dato dentro de temp es igual al dato que nosotros damos como parametro, devolvemos temp
       {
        return temp;
       }
      temp = temp.next; //Se recorre toda la lista 
      }
        return temp;
    }

    
    // Agregar despues (2)
    //Metodo para buscar un nodo por su campo clave e insertar un nuevo nodo después de él. (2)
    public void despuesDe (int buscar, int dato) throws Exception //Buscar es el numero a buscar y dato es el numero a ingresar despues, en ese orden
    {
        Nodo temp = new Nodo(); 
        temp.dato = dato;
        Nodo temp2 = this.buscar(buscar); //El this se sale del void y hace referencia al metodo buscar, se reinicia y va de arriba hasta abajo hasta encontrar ese metodo
        //temp2 sera igual al valor que nosotros pidamos buscar 
        if (temp2 == null) { //Si pedimos buscar un nodo inexistente, nos debe de dar un error el codigo
         throw new Exception ("No existe nodo a buscar :(");
        }
        
        temp.next = temp2.next;
        //Enlace doble
        temp2.next.prev= temp; //Cuando regrese, no volvera a donde salio, si no que regresara al nuevo temp . es el enlace de 3 a 2 
        temp2.next = temp;
        temp.prev = temp2;
        }
        
        
    //(3)
    //Metodo para intercambiar un nodo por otro buscado(3)
    public void intercambio (int dato1, int dato2) 
    {
        Nodo temp1 = this.buscar(dato1);
        Nodo temp2 = this.buscar(dato2);
        int apoyo = temp1.dato; //Para intercambiar el valor de 2 variables, usamos una variable de apoyo que almacenara el valor de la primera variable para que esta no se pierda
        temp1.dato = temp2.dato; //Lo que esta en el 2 se va al 1, pero ya guardamos el valor de 1 previamente en la linea de codigo anterior 
        temp2.dato = apoyo; //el valor de 2 es el valor de 1 que previamente esta guardado en apoyo
    }
    }