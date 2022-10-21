
public class Main {
  public static void main(String[] args) {
  
 //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[]=new Serie[5];
        VideoJuego listaVideojuegos[]=new VideoJuego[5];
  
       
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("La casa del papel",5, "Accion", "Raul hernandez");
        listaSeries[2]=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        listaSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie( "Los Simpsons", 25, "Humor", "Matt Groening");
       
        listaVideojuegos[0]=new VideoJuego();
        listaVideojuegos[1]=new VideoJuego("Assasin creed 2", 30, "Aventura", "EA");
        listaVideojuegos[2]=new VideoJuego("Just Dance 2", 12, "Aventura", "Nintendo switch");
        listaVideojuegos[3]=new VideoJuego("Mario party", 10, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new VideoJuego("Uncharted creed", "Ubisoft");
  

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
    
        Serie serieMayor=listaSeries[0];
        VideoJuego videojuegoMayor=listaVideojuegos[0];
  
    
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==VideoJuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
   System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
  
}



