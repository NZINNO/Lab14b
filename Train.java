import java.awt.*;
import java.util.ArrayList;
import java.applet.*;

public class Train{

  int xPos;
  int yPos;
  int startX;
  ArrayList<RailCar> cars;

  public Train (int x, int y){
  xPos = x;
  yPos = y:
  cars = new ArrayList<RailCar>();
  }
  public void addCar(String type, Color color)
  {
    switch (type)
    {
      case "Locomotive"    : cars.add(new Locomotive(color, x, y)); break;
      case "PassengerCar"  : cars.add(new PassengerCar(color, x, y));break;
      case "FreightCar"    : cars.add(new FreightCar(color, x, y)); break;
      case "Caboose"       : cars.add(new Caboose(color, x, y)); break;
    }
  }
}
