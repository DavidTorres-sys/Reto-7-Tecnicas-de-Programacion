import java.util.Scanner;

public abstract class TramoGenerico  {

  Scanner entrada = new Scanner(System.in);

  protected double x; //INICIA EL TRAMO
  protected double y; //FINALIZA EL TRAMO

  //AREA = LARGO*ANCHO
  //VOLÚMEN = LARGO*ANCHO*ALTURA
  protected double largo;
  private double ancho;
  private double altura; //PROFUNDIDAD/ESPESOR


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

  //MÉTODOS ABSTRACTOS

  public abstract double longitud();
  public abstract double area();
  public abstract double volumen();




  //TO STRING
  @Override
  public String toString() {
    return "TramoGen{" + "entrada=" + entrada + ", x=" + x + ", y=" + y + ", largo=" + largo + ", ancho=" + ancho + ", altura=" + altura + '}';
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}