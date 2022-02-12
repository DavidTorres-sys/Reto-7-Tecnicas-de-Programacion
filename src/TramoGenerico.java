import java.util.Scanner;

public abstract class TramoGenerico  {

    Scanner entrada = new Scanner(System.in);

    protected double x; //INICIA EL TRAMO
    protected double y; //FINALIZA EL TRAMO

    //AREA = LARGO*ANCHO
    //VOLÚMEN = LARGO*ANCHO*ALTURA
    protected double largo;
    protected double ancho;
    protected double altura; //PROFUNDIDAD


    //CONSTRUCTORES
    public TramoGenerico(){
    }
    public TramoGenerico(double x, double y, double largo, double ancho, double altura){
      this.x=x;
      this.y=y;
      this.largo=largo;
      this.ancho=ancho;
      this.altura=altura;
    }

    //MÉTODOS

    public double longitud(){
      double longitud = y-x;
      if(longitud<0){
        longitud = longitud*(-1);
      }
      System.out.println("La longitud de su carretera es: "+longitud);
      return longitud;
    }

    public abstract double area();
    public abstract double volumen();


    //GET AND SET

    public double getX(){
      return this.x;
    }
    public void setX(){
      System.out.println("Ingresar la coordenada de inicio");
      x = entrada.nextDouble();
    }

    public double getY(){
      return this.y;
    }
    public void setY(){
      System.out.println("Ingresar la coordenada de finalización");
      y = entrada.nextDouble();
    }

    public double getLargo(){
      return this.largo;
    }
    public void setLargo(){
      System.out.println("Ingrese el largo de la carretera");
      largo = entrada.nextDouble();
    }

    public double getAncho(){
      return this.largo;
    }
    public void setAncho(){
      System.out.println("Ingrese el ancho de la carretera");
      ancho = entrada.nextDouble();
    }

    public double getAltura(){
      return this.altura;
    }
    public void setAltura(){
      System.out.println("Ingrese el altura de la carretera");
      altura = entrada.nextDouble();
    }


    //TO STRING
    @Override
    public String toString() {
      return "TramoGen{" + "entrada=" + entrada + ", x=" + x + ", y=" + y + ", largo=" + largo + ", ancho=" + ancho + ", altura=" + altura + '}';
    }
}