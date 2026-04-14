import java.util.Scanner;

public class SimuladorBetoneira{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ciclo = 0;
        double pesoAlvo = 500.0;
        double pesoAtual = 0.0;     
        
       do{ 
        System.out.println("digite o peso da brita 1 adicionada (kg):");
        double pesoAdicionado = sc.nextDouble();
        pesoAtual += pesoAdicionado;
        ciclo++;
        System.out.println("Peso atual: " + pesoAtual + " kg");

        if(pesoAtual >= pesoAlvo){
            System.out.println("meta atingida em " + ciclo + " ciclos.");
            break;
        }
    } while (true);

       if(pesoAtual > pesoAlvo * 1.05){
        System.out.println("cudado! você ultrapassou a meta em mais de 5%.");
        System.out.println("Pode estar scom problema de estabilidade");
      
       }else {
        System.out.println("peso dentro do limite aceitável.");
       }
    
    
    sc.close();
} 
}