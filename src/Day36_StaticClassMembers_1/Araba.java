package Day36_StaticClassMembers_1;

import java.util.ArrayList;

public class Araba {
  private String name;
  private String model;

    Araba(String name, String model){
       setName(name);
      setModel(model);
    }
    static ArrayList<Araba> arabalar = new ArrayList<>();

    static {
        //Default data from file or some other sources
        Araba araba1 = new Araba("Toyota","Corolla");
        Araba araba2 = new Araba("Honda","Civic");
        Araba araba3 = new Araba("Mercedes","E220");

        arabalar.add(araba1);
        arabalar.add(araba2);
        arabalar.add(araba3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        for (Araba araba :Araba.arabalar ){
            System.out.println("Araba markası : " + araba.getName());
            System.out.println("Araba modeli  : " + araba.getModel());
            System.out.println();
        }
    }
}
