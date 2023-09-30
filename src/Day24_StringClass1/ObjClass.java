package Day24_StringClass1;

public class ObjClass {
    String name;

    public ObjClass(){

    }
    public ObjClass(String isim){
        this.name = isim;
    }
    public boolean esitMidir(ObjClass objClass){
        if (objClass.name == this.name){
            return true;
        }else return false;
    }
}
