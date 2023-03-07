
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoHidalgoPerezJoaquin2223 miVehiculoHIdalgoPerezJoaquin2223;
        int stockActual;
        
        miVehiculoHIdalgoPerezJoaquin2223 = new VehiculoHidalgoPerezJoaquin2223("Seat",18000,100);
        operativaVehiculosHidalgoPerezJoaquin2223(miVehiculoHIdalgoPerezJoaquin2223, 50); 
    }

    private static void operativaVehiculosHidalgoPerezJoaquin2223(VehiculoHidalgoPerezJoaquin2223 miVehiculoHIdalgoPerezJoaquin2223, java.lang.Integer cantidad) {
        int stockActual;
        INT 
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoHIdalgoPerezJoaquin2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoHIdalgoPerezJoaquin2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoHIdalgoPerezJoaquin2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
