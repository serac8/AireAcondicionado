public class AireAcondicionado{


    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int vecesCambioTemperatura;
    private double tempMaxSelec;
    private double tempMinSelec;
   
    public AireAcondicionado(double tempMinima, double tempMaxima){
        temperatura = 15.0;
        min = tempMinima;
        max = tempMaxima;
        incremento = 5.0;
        vecesCambioTemperatura = 0;
        tempMaxSelec = temperatura;
        tempMinSelec = temperatura;
    }
   
    public void subirTemperatura(){
        
        if(temperatura + incremento <= max){
            temperatura = temperatura + incremento;
            vecesCambioTemperatura = vecesCambioTemperatura + 1;
            if(temperatura > tempMaxSelec){
                tempMaxSelec = temperatura;
            }
        }
        
    }
   
    public void bajarTemperatura(){
        
        if(temperatura - incremento >= min){
            temperatura = temperatura - incremento;
            vecesCambioTemperatura = vecesCambioTemperatura + 1;
            if(temperatura < tempMinSelec){
                tempMinSelec = temperatura;
            }
        }
        
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
        
        
        System.out.println("Temperatura actual: " + temperatura + "º" + ". Funcionamineto entre " + max + "º y " + min + "º. Temp. Máx.: " + tempMaxSelec + "º. Temp. Mín.: " + tempMinSelec + "º" + ". Número de cambios de temperatura: " + vecesCambioTemperatura + ".");

       
       
    }

  



}