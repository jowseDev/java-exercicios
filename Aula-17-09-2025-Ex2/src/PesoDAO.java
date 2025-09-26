public class PesoDAO {

    public String calcularPS(PesoDTO pesoDTO) {

        int ps = pesoDTO.getPeso();
        int alt = pesoDTO.getAltr();

        if (alt <= 120) {
            if (ps < 60) {
                return "Categoria: A ";
            } else if (ps >= 60 && ps <= 90) {
                return "Categoria: D ";
            } else if (ps > 90) {
                return "Categoria: G ";
            }
        }
        if (alt > 120 && alt <= 170) {
            if (ps < 60) {
                return "Categoria: B ";
            } else if (ps >= 60 && ps <= 90) {
                return "Categoria: E ";
            } else if (ps > 90) {
                return "Categoria: H ";
            }
        }
        if (alt > 170) {
            if (ps < 60) {
                return "Categoria: C ";
            } else if (ps >= 60 && ps <= 90) {
                return "Categoria: F ";
            } else if (ps > 90) {
                return "Categoria: I ";
            }
        }
        return "";
    }
}