public class GarbageCollectorClass {
    protected void finalize(){
        System.out.println("GC will remove unused objects");
            }
    public static void main (String args[]){
        GarbageCollectorClass c1=new GarbageCollectorClass();
        GarbageCollectorClass c2 = new GarbageCollectorClass();
        c1=c2;
        //c2=null;
        System.gc();
    }
}
