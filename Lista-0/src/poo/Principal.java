package poo; //primeira linha tem que ter isso, package nomeDoPacote

public class Principal { // o nome da classe tem que ter o mesmo nome do arquivo

    public static void main(String[] args) { //tem que dizer que é publico e estatico 
                            // dentro dos parenteses tem os argumentos, vetor de istring   
// essas tres primeiras linhas sao importantes
        
        int a = 10;
        int b = 30;
        
        if ( (a > 10) && (b < 30)){
            System.out.println("Maior que 10");
        } else {
            System.out.println("Menor que 10");
        }
        
    }
    
}
