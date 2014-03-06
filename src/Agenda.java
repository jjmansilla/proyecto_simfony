/**
 *@author Julio
 * @version v2.3 13/04/3056
 */

public class Agenda 
{
    
     String[] nombre;
     int[] telefonos;
     int siguiente = 0;
    
     /**
      * 
      * @return 
      */
    public int getSiguiente()
    {
        return siguiente;
    }
    
    /**
     * 
     * @param num 
     */
    public Agenda(int num)
    {
        nombre = new String[num];
        telefonos = new int[num];
    }
    
    /**
     * 
     * @param n
     * @param t
     * @return 
     */
    public boolean añadir(String n, int t)
    {
        boolean estado;
        if(getSiguiente()<nombre.length && getSiguiente()<telefonos.length)
        {
            nombre[siguiente]=n;
            telefonos[siguiente]=t;
            siguiente++;
            estado = true;
        }
        else
        {
            estado = false;
        }
        return estado;
    }
    
    public int buscar(String n)
    {
        int posicion = 0;
        for (int fila = 0; fila < nombre.length; fila++) 
        {
            if(nombre[fila] == n)
            {
                posicion = fila;
            }
            else
            {
                posicion = -1;
            }
        }
        return posicion;
    }
    
    public int buscar(int t)
    {
        int posicion = 0;
        for (int fila = 0; fila < telefonos.length; fila++) 
        {
            if(telefonos[fila]==t)
            {
                posicion = fila;
            }
            else
            {
                posicion = -1;
            }
        }
        return posicion;
    }
    
    public int getTelefono(String n)
    {
        int telefono = 0;
        if(buscar(n)!=-1)
        {
            telefono = telefonos[buscar(n)];
        }
        else
        {
            telefono = 0;
        }    
        return telefono;
    }
    
    public String getNombre(int t)
    {
        String n = " ";
        if(buscar(t)!=-1)
        {
            n = nombre[buscar(t)];
        }
        else
        {
            n = "No hay nombre para este teléfono";
        }
        return n;
    }
    
    public void mostrar()
    {
        int cont = 0;
        System.out.println("Nombres: ");
        for (String f : nombre) 
        {
            System.out.println(nombre[cont]);
            cont++;
        }
    }
}
