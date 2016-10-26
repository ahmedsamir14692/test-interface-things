
package testoneiterfacething;


public interface three {
    int x=5;
    
    public static void asd (){
        System.out.println(x);
        
        
       // static methodes must have body even in interface 
       // it is beloning to the interface itself no to its instances
    }
      
    public  void adsd ();
    /*
     default void deflet (){
    
    this methode is acopy of defualt methode deflet in three interface
          this will make error in one inter face witc inherit two and three
    
        
          // defaulet methode
      }
    */
}
