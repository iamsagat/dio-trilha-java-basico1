public class FormatadorCepExemplo {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatarCep("2376506");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        System.err.println("O cep precisa ser preenchido com 8 números");
    } 
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
 }

