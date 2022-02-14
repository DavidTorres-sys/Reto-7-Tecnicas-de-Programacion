import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Carretera {

  static double areaTotal = 0;
  static double longitudTotal = 0;
  static double volumenAsfalto = 0;

  static List<TramoGenerico> tramo = new LinkedList<>();

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
  public static double volumenMaterialesCarretera() {
    for(TramoGenerico volumen : tramo){
      volumenAsfalto += volumen.volumen();
    }
    return volumenAsfalto;
  }
  public static double volumenAsfaltoCarretera () {
    return 0;
  }
//  public float volumenMaterialTramoSinAsfaltar () {
//    if(tramo instanceof TramoSinAsfaltar) {
//      for(){
//
//      }
//    }
 // }
  public void tramosConectados () {

  }
}
