public class TramoAsfaltado extends TramoGenerico{

  private String nombreProvedor;
  private int velocidadMaxima;
  private boolean adelantar;

  final double ANCHO = 8;
  final double ALTURA = 0.25;


  //METEDOS PADRE
  public double longitud() {
    double longitud = y-x;
    if(longitud < 0){
      longitud = longitud*(-1);
    }
    System.out.println("La longitud del tramo es: "+longitud);
    return longitud;
  }

  public double area() {
    double area = largo* ANCHO;
    System.out.println("El area de su carretera es: "+area);
    return area;
  }


  public double volumen() {
    double volumen = largo * ANCHO * ALTURA;
    System.out.println("El volumen de su carretera es: "+volumen);
    return volumen;
  }


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

  public double getANCHO(){
    return this.largo;
  }
  public void setANCHO(){
  }

  public double getALTURA(){
    return this.ALTURA;
  }
  public void setALTURA(){
  }

  public String getNombreProvedor(){
    return this.nombreProvedor;
  }
  public void setNombreProvedor(){
    System.out.println("Ingrese el nombre del provedor del asfalto: ");
    nombreProvedor = entrada.nextLine();
  }

  public int getVelocidadMaxima(){
    return this.velocidadMaxima;
  }
  public void setVelocidadMaxima(){
    System.out.println("La velocidad máxima en esta carretera asfalta es 80km/h");
  }

  public boolean isAdelantar(){
    return this.adelantar;
  }

  public void setAdelantar(boolean adelantar) {
    System.out.println("Se puede adelantar en esta carretera asfaltada");
    this.adelantar = false;
  }
}
