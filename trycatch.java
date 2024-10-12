import java.util.Scanner; 
  

public class TryCatchExample { 
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        try {  
              System.out.print("Digite um número: ");   
              int numero = scanner.nextInt();                
  
              int resultado = 10 / numero;   
              System.out.println("Resultado: " + resultado); 
  
          } catch (Exception e) {   
              System.out.println("Ocorreu um erro: " + e.getMessage()); 
  
          } finally {   
              scanner.close(); // Fecha o scanner, mesmo que ocorra uma exceção 
            } 
        } 
    } 

         
