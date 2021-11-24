public class AireAcondicionado{


    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int vecesCambioTemperatura;
   
    public AireAcondicionado(double tempMinima, double tempMaxima){
        temperatura = 15.0;
        min = tempMinima;
        max = tempMaxima;
        incremento = 5.0;
        vecesCambioTemperatura = 0;
        
    }
   
    public void subirTemperatura(){
        
        if(temperatura + incremento <= max){
            temperatura = temperatura + incremento;
                     
        }
        vecesCambioTemperatura = vecesCambioTemperatura + 1;
    }
   
    public void bajarTemperatura(){
        
        if(temperatura - incremento >= min){
            temperatura = temperatura - incremento;
           
        }
        vecesCambioTemperatura = vecesCambioTemperatura + 1;
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setIncremento(double incrementoDeTemperatura){
        if(incrementoDeTemperatura > 0){
            incremento = incrementoDeTemperatura;

        }
   
    }

    public void mostrarEstadisticas(){
        System.out.println("Temperatura actual: " + temperatura + "�" + ". Funcionamineto entre " + max + "� y " + min + "�. Temp. M�x.: " + max + "�. Temp. M�n.: " + min + "�" + ". N�mero de cambios de temperatura: " + vecesCambioTemperatura + ".");

       
       
    }

   



}