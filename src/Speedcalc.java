public class Speedcalc {

    public float mps(){
        float timpSecunde;
        float mps,kmph,mlph;
        float ora = 1;
        float minut = 58;
        float secunda = 35;
        float distanta = 2345;
        timpSecunde = (ora*3600) + (minut*60) + secunda;
        mps = distanta / timpSecunde;
        kmph = (distanta/1000.0f) / (timpSecunde/3600.0f);
        mlph = kmph / 1.609f;
        System.out.println("Viteza in mps = " + mps);
        System.out.println("Viteza in kmps = " + kmph);
        System.out.println("Viteza in mlph = " + mlph);
        return mps;

    }



}
