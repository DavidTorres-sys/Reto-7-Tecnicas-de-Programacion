import java.util.Objects;

public class TramoSinAsfaltar extends TramoGenerico{

  String materiales;
  String [] tipoMaterial = {"piedra", "arena", "balastro" };

  private double coordenadasXInicio;
  private double coordenadasXFinal;
  private double coordenadasYInicio;
  private double coordenadasYFinal;

  public final int ANCHO = 6;
  public final double ESPESOR_PIEDRA = 0.25;
  public final double ESPESOR_ARENA = 0.20;
  public final double ESPESOR_BALASTRO = 0.30;

  public TramoSinAsfaltar(double coordenadasXInicio, double coordenadasXFinal,
                          double coordenadasYInicio, double coordenadasYFinal) {
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
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

  public double getCoordenadasXInicio() {
    return coordenadasXInicio;
  }

  public void setCoordenadasXInicio(double coordenadasXInicio) {
    System.out.println("Ingresar la coordenada X de inicio");
    coordenadasXInicio = entrada.nextDouble();
  }

  public double getCoordenadasXFinal() {
    return coordenadasXFinal;
  }

  public void setCoordenadasXFinal(double coordenadasXFinal) {
    System.out.println("Ingresar la coordenada X de final");
    coordenadasXFinal = entrada.nextDouble();
  }

  public double getCoordenadasYInicio() {
    return coordenadasYInicio;
  }

  public void setCoordenadasYInicio(double coordenadasYInicio) {
    System.out.println("Ingresar la coordenada Y de inicio");
    coordenadasYInicio = entrada.nextDouble();
  }

  public double getCoordenadasYFinal() {
    return coordenadasYFinal;
  }

  public void setCoordenadasYFinal(double coordenadasYFinal) {
    System.out.println("Ingresar la coordenada Y de final");
    coordenadasYFinal = entrada.nextDouble();
  }
}
