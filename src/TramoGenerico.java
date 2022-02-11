public abstract class TramoGenerico  {

  protected double x;
  protected double y;

  public TramoGenerico(){
  }

  public TramoGenerico(double X, double Y){
  }

  public abstract void area();
  public abstract void volumen();

  //MÉTODOS VACÍOS
  public void ubicaPunto2(){
  }
  public void setX(double x){
    this.x= x;
  }
  public void setY(double y){
    this.y=y;
  }
  //MÉTODOS QUE RETORNAN

  public double longitud(TramoGenerico a, TramoGenerico b){
    double cateto1 = a.x-b.x;
    double cateto2 = a.y-b.y;
    double hipotenusa = Math.sqrt(cateto1*cateto1+cateto2*cateto2);
    return hipotenusa;
  }
}