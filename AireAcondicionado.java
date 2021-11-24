public class AireAcondicionado{


    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    
    
    public AireAcondicionado(double tempMinima, double tempMaxima){
        temperatura = 15.0;
        min = tempMinima;
        max = tempMaxima;
        incremento = 5.0;
    }
    
    public void subirTemperatura(){
        
        if(temperatura + incremento > max){
            temperatura = temperatura;
                      
        }
        else{
          
            temperatura = temperatura + incremento;
        }
    }
    
    public void bajarTemperatura(){
        if(temperatura - incremento < min){
            temperatura = temperatura;
            
        }
        else{
            temperatura = temperatura - incremento;
        }
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setIncremento(double incrementoDeTemperatura){
        if(incrementoDeTemperatura > 0){
            incremento = incrementoDeTemperatura;

        }
        else {
            incrementoDeTemperatura = incremento;
            
        }
        
        
        
        
    }


















}