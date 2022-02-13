import java.util.ArrayList;
import java.util.List;

public class Carretera {

  List<TramoGenerico> tramo = new ArrayList<>();

  TramoGenerico tramo1 = new TramoAsfaltado();
  TramoGenerico tramo2 = new TramoAsfaltado();
  TramoGenerico tramo3 = new TramoSinAsfaltar();
  TramoGenerico tramo4 = new TramoAsfaltado();
  TramoGenerico tramo5 = new TramoSinAsfaltar();
  TramoGenerico tramo6 = new TramoSinAsfaltar();
  TramoGenerico tramo7 = new TramoAsfaltado();
  TramoGenerico tramo8 = new TramoAsfaltado();
  TramoGenerico tramo9 = new TramoAsfaltado();
  TramoGenerico tramo10 = new TramoSinAsfaltar();




  public float longitudTotalCarretera () {
    for(TramoGenerico longitud : tramo ) {

    }
  }
  public float areaTotalCarretera () {
    return 0;
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
