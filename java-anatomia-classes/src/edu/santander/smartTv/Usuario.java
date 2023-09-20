package edu.santander.smartTv;

public class Usuario {
    
    public static void main(String[] args) throws Exception{

        SmartTv smartTv =  new SmartTv();
        //primeiro status
        smartTv.printStatus();
        
        smartTv.ligar();

        //segundo status
        smartTv.printStatus();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();


        //terceiro status
        smartTv.printStatus();

        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.printStatus();
        
        smartTv.mudarCanal(13);

        smartTv.printStatus();
    }
}
