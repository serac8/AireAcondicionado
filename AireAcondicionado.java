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
        }
        else{
            System.out.println("Introducir un valor válido");
        }
    }
    
    public void bajarTemperatura(){
        if(temperatura > min){
            temperatura = temperatura - incremento;
        }
        else{
            System.out.println("Introducir un valor válido");
        }
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setIncremento(double incremento){
        if(incremento < 0){
            System.out.println("Introducir un valor válido");
            incremento = 0;
        }
        
    }


















}