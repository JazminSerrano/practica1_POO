public class Validacion{
    public static boolean validarNumero(String str){
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
}
