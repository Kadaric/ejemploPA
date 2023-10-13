public class Coso
{
  int size;
  String nombre;
  String color;
  String forma;

  Coso()
  {
      this.size = 0;
      this.nombre = "computador";
      this.color="Negro";
  }
  
  Coso(int size, String nombre, String color, String forma)
  {
      this.size = size;
      this.nombre = nombre;
      this.color=color;
      this.forma = forma;
  }

  public void funcionalidad(String funcion)
  {
      System.out.println("El coso esta funcionando con la siguiente funcion: "+funcion);
  }
  
  public void golpear()
  {
      System.out.println("Te han golpeado con el coso");
  }
  
  public void setSize(int size)
  {
      this.size=size;
  }

  public void setNombre(String nombre)
  {
      this.nombre=nombre;
  }

  public int getSize()
  {
      return this.size;
  }

  public String getNombre()
  {
      return this.nombre;
  }
}
