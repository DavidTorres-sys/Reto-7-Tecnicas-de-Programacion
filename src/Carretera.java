import java.util.ArrayList;
import java.util.List;

public class Carretera {

  static double areaTotal = 0;
  static double longitudTotal = 0;

  static List<TramoGenerico> tramo = new ArrayList<>();

  public static double longitudTotalCarretera() {
    for(TramoGenerico longitud : tramo ) {
      longitudTotal += longitud.longitud();
    }
    return longitudTotal;
  }
  public static double areaTotalCarretera() {
    for(TramoGenerico area : tramo ) {
      areaTotal += area.area();
    }
    return areaTotal;
  }
  public float volumenMaterialesCarretera () {
    return 0;
  }
  public float volumenAsfaltoCarretera () {
    return 0;
  }
  public float volumenMaterialTramoSinAsfaltar () {
    return 0;
  }
  public void tramosConectados () {

  }
}
