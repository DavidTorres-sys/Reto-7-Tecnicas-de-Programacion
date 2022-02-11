public class TramoSinAsfaltar extends TramoGenerico{

  private String tipoMateria;
  private float espesor;
  private float coordenadasXInicio;
  private float coordenadasXFinal;
  private float coordenadasYInicio;
  private float coordenadasYFinal;

  public TramoSinAsfaltar(String tipoMateria, float espesor, float coordenadasXInicio, float coordenadasXFinal, float coordenadasYInicio, float coordenadasYFinal) {
    this.tipoMateria = tipoMateria;
    this.espesor = espesor;
    this.coordenadasXInicio = coordenadasXInicio;
    this.coordenadasXFinal = coordenadasXFinal;
    this.coordenadasYInicio = coordenadasYInicio;
    this.coordenadasYFinal = coordenadasYFinal;
  }

  @Override
  public void area() {

  }

  @Override
  public void volumen() {

  }

//  @Override
//  public void longitud() {
//    Math.sqrt((coordenadasXFinal - coordenadasXInicio) * (coordenadasXFinal - coordenadasXInicio) + (coordenadasYFinal - coordenadasYInicio) * (coordenadasYFinal - coordenadasYInicio));
//  }

  public String getTipoMateria() {
    return tipoMateria;
  }

  public void setTipoMateria(String tipoMateria) {
    this.tipoMateria = tipoMateria;
  }

  public float getEspesor() {
    return espesor;
  }

  public void setEspesor(float espesor) {
    this.espesor = espesor;
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
