/**
 *
 * @author leomoraes
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet1; // Definição do ponteiro (Nome da Classe antes do ponteiro)
        objRet1 = new Retangulo(); // Instanciando um Objeto da Classe Retângulo
        
        objRet1.setAltura(5.0);
        objRet1.setBase(8.0);
        
        System.out.println("Área: " + objRet1.calcArea());
        System.out.println("Perímetro: " + objRet1.calcPerimetro());
    }    
}
