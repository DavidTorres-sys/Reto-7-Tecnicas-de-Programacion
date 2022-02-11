public class TramoSinAsfaltar extends TramoGenerico{

  String [] tipoMaterial = {piedra, arena,balastro };

  private float coordenadasXInicio;

  private float coordenadasXFinal;
  private float coordenadasYInicio;
  private float coordenadasYFinal;

  private final int ANCHO = 6;
  private final double ESPESOR_PIEDRA = 0.25;
  private final double ESPESOR_ARENA = 0.20;
  private final double ESPESOR_BALASTRO = 0.30;

  public TramoSinAsfaltar(float coordenadasXInicio, float coordenadasXFinal,
                          float coordenadasYInicio, float coordenadasYFinal) {
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
    this.piedra = piedra;
    this.arena = arena;
    this.balastro = balastro;
  }

  @Override
  public double area() {
    return longitud()  * ANCHO;
  }


  @Override
  public double volumen() {
    for(int i = 0 ; i < tipoMaterial.length ; i ++  ) {
      if (tipoMaterial.equals(piedra)) {
        return area() * ESPESOR_PIEDRA;
      }
      if (tipoMaterial.equals(arena)) {
        return area() * ESPESOR_ARENA;
      }
      if (tipoMaterial.equals(balastro)) {
        return area() * ESPESOR_BALASTRO;
      }
    }
    return 0;
  }

  public float getCoordenadasXInicio() {
    return coordenadasXInicio;
  }

  public void setCoordenadasXInicio(float coordenadasXInicio) {
    this.coordenadasXInicio = coordenadasXInicio;
  }

  public float getCoordenadasXFinal() {
    return coordenadasXFinal;
  }

  public void setCoordenadasXFinal(float coordenadasXFinal) {
    this.coordenadasXFinal = coordenadasXFinal;
  }

  public float getCoordenadasYInicio() {
    return coordenadasYInicio;
  }

  public void setCoordenadasYInicio(float coordenadasYInicio) {
    this.coordenadasYInicio = coordenadasYInicio;
  }

  public float getCoordenadasYFinal() {
    return coordenadasYFinal;
  }

  public void setCoordenadasYFinal(float coordenadasYFinal) {
    this.coordenadasYFinal = coordenadasYFinal;
  }
}
