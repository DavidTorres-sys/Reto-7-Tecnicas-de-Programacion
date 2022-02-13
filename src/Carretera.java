import java.util.ArrayList;
import java.util.List;

public class Carretera {

  double areaTotal = 0;
  double longitudTotal = 0;

  List<TramoGenerico> tramo = new ArrayList<>();

  TramoGenerico tramo1 = new TramoAsfaltado();
  TramoGenerico tramo2 = new TramoAsfaltado();
  TramoGenerico tramo3 = new TramoSinAsfaltar(7,6,9,7);
  TramoGenerico tramo4 = new TramoAsfaltado();
  TramoGenerico tramo5 = new TramoSinAsfaltar(12,5,12,1);
  TramoGenerico tramo6 = new TramoSinAsfaltar(12,1,10,1);
  TramoGenerico tramo7 = new TramoAsfaltado();
  TramoGenerico tramo8 = new TramoAsfaltado();
  TramoGenerico tramo9 = new TramoAsfaltado();
  TramoGenerico tramo10 = new TramoSinAsfaltar(3,1,0,2);




  public double longitudTotalCarretera () {
    for(TramoGenerico longitud : tramo ) {
      longitudTotal += longitud.longitud();
    }
    return longitudTotal;
  }
  public double areaTotalCarretera () {
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
