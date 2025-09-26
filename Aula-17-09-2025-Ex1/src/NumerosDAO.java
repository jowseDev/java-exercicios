public class NumerosDAO {
    public String calcularNumeros(NumerosDTO numerosDTO){

        int v1 = numerosDTO.getN1();
        int v2 = numerosDTO.getN2();
        int v3 = numerosDTO.getN3();

        if (v1 >= v2 && v1 >= v3) {
            if (v2 >= v3) {
               return "A Sequencia é: " + v1 + " - " + v2 + " - " + v3;
            } else {
                return "A Sequencia é: " + v1 + " - " + v3 + " - " + v2;
            }
        } else if (v2 >= v1 && v2 >= v3) {
            if (v1 >= v3) {
                return "A Sequencia é: " + v2 + " - " + v1 + " - " + v3;
            } else {
                return "A Sequencia é: " + v2 + " - " + v3 + " - " + v1;
            }
        } else {
            if (v1 >= v2) {
                return "A Sequencia é: " + v3 + " - " + v1 + " - " + v2;
            } else {
                return "A Sequencia é: " + v3 + " - " + v2 + " - " + v1;
            }
        }
    }
}

