public class CalcularTriangulo {
    public static void main(String[] args){

        int lA = 20, lB = 10, lC = 25;

        if(lA + lB > lC &&
        lB + lA > lB &&
        lB + lC > lA ){
            if(lA == lB && lB == lC){
                System.out.println("É um triangulo Equilatero");
            }
            else{
                if((lA == lB) ||(lA == lC ) || lB == lC){
                    System.out.printf("O Triangulo é isoceles");
                }
                else{
                    System.out.println("O Triangulo é Escaleno");
                }
            }
        }else{
            System.out.println("Não é im triangulo");
        }

    }
}
