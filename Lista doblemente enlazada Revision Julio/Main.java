public class Main extends Lista
{
     public static void main(String[] args) throws Exception 
     {
         //Creamos el objeto lista
         Lista lista1 = new Lista();
         
         //Agregamos nodos a la lista mediante el metodo add que se encuentra en la clase lista
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        //Se agregan de derecha a izquierda, o sea, cuando lo imprimimos dara 4, 3, 2, 1
        
        //Imprimimos la lista
        System.out.print("Lista doblemente enlazada: ");
        System.out.println(lista1);

        
        //el 1 es el de buscar y el 5 es el dato a agregar despues de ese, entonces deberia 
        //quedar 4, 3, 2, 4, 1
        lista1.despuesDe(1,5);
        System.out.println("Se usa el metodo de buscar y se agrega a la derecha, se busca el 1 y se agrega el 5 despues de el");

        
        //Imprimimos la lista despues de la modificacion
        System.out.println(lista1);
        
        System.out.println("Cambiar el 1 y 5 de lugar");
        lista1.intercambio(1,5);
        System.out.println(lista1);     
     }
    }
