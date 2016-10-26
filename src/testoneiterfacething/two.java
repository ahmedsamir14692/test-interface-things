
package testoneiterfacething;


public interface two {
    
    public int average ();
    public boolean trueornot ();
 //   default void deflet (); error 
    
      default void deflet (){
          
        average()  ;
          // defaulet methode
      }
}
