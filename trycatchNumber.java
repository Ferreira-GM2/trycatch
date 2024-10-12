import java.util.Scanner; 
 
public class TryCatchString { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try { 
            System.out.print("Digite um número: "); 
            String numeroString = scanner.nextLine(); 
 
            // Tentando converter a string para um número inteiro 
            int numero = Integer.parseInt(numeroString); 
 
            System.out.println("O número digitado foi: " + numero); 
        } catch (NumberFormatException e) { 
            System.out.println("Você não digitou um número válido."); 
        } finally { 
            scanner.close(); // Fecha o scanner, independentemente de ocorrer uma exceção 
        } 
    } 
} 
