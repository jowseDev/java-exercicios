public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();

    public String imprimiDadosCarro(CarroDTO carroDTO) {
        return carroDAO.imprimiDadosCarro(carroDTO);
    }
}
