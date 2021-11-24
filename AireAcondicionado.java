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
        if(temperatura < max){
            temperatura = temperatura + incremento;
            if(temperatura > max){
                temperatura = max;
            }
        }
        else{
            System.out.println("Introducir un valor válido");
        }
    }
    
    public void bajarTemperatura(){
        if(temperatura > min){
            temperatura = temperatura - incremento;
            if(temperatura < min){
                temperatura = min;
            }
        }
        else{
            System.out.println("Introducir un valor válido");
        }
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setIncremento(double incrementoDeTemperatura){
        incremento = incrementoDeTemperatura;
        if(incrementoDeTemperatura < 0){
           incrementoDeTemperatura = incremento;
           System.out.println("Introducir un valor válido");
        }
        
        
        
        
    }


















}