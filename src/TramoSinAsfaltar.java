import java.util.Objects;

public class TramoSinAsfaltar extends TramoGenerico{

  String [] tipoMaterial = {"piedra", "arena", "balastro" };

  private int coordenadasXInicio;
  private int coordenadasXFinal;
  private int coordenadasYInicio;
  private int coordenadasYFinal;

  public final int ANCHO = 6;
  public final double ESPESOR_PIEDRA = 0.25;
  public final double ESPESOR_ARENA = 0.20;
  public final double ESPESOR_BALASTRO = 0.30;

  public TramoSinAsfaltar(int coordenadasXInicio,int coordenadasYInicio,
                          int coordenadasXFinal, int coordenadasYFinal) {
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
  }

  @Override
  public double longitud() {
    double longitud = y-x;
    if(longitud < 0){
      longitud = longitud*(-1);
    }
    System.out.println("La longitud del tramo es: "+longitud);
    return longitud;
  }

  @Override
  public double area() {
    return longitud() * ANCHO;
  }

  @Override
  public double volumen() {
    for(int i = 0 ; i < tipoMaterial.length ; i++) {
      if (Objects.equals(tipoMaterial[i], tipoMaterial[0])) {
        return area() * ESPESOR_PIEDRA;
      }
      if (Objects.equals(tipoMaterial[i], tipoMaterial[1])) {
        return area() * ESPESOR_ARENA;
      }
      if (Objects.equals(tipoMaterial[i], tipoMaterial[2])) {
        return area() * ESPESOR_BALASTRO;
      }
    }
    return volumen();
  }

  public int getCoordenadasXInicio() {
    return coordenadasXInicio;
  }

  public void setCoordenadasXInicio(int coordenadasXInicio) {
    this.coordenadasXInicio = coordenadasXInicio;
  }

  public int getCoordenadasXFinal() {
    return coordenadasXFinal;
  }

  public void setCoordenadasXFinal(int coordenadasXFinal) {
    this.coordenadasXFinal = coordenadasXFinal;
  }

  public int getCoordenadasYInicio() {
    return coordenadasYInicio;
  }

  public void setCoordenadasYInicio(int coordenadasYInicio) {
    this.coordenadasYInicio = coordenadasYInicio;
  }

  public int getCoordenadasYFinal() {
    return coordenadasYFinal;
  }

  public void setCoordenadasYFinal(int coordenadasYFinal) {
    this.coordenadasYFinal = coordenadasYFinal;
  }
}
