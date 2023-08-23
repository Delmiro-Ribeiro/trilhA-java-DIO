public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA? = " + smartTv.ligada);
        System.out.println("CANAL = " + smartTv.canal);
        System.out.println("VOLUME = " + smartTv.volume);

        smartTv.ligarTv();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();


        smartTv.aumentarVolume();
        System.out.println("------------------------");

        System.out.println("TV LIGADA? = " + smartTv.ligada);
        System.out.println("CANAL = " + smartTv.canal);
        System.out.println("VOLUME = " + smartTv.volume);

    }
    
}
