/**
 * Classe responsável pela criação e escrita de arquivos no formado CSV.
 * Aqui deve ser relacionado todas as bibliotecas relacionadas a CSV.
 */
public class Csv implements Persistencia{
    
    @Override
    public boolean salvar(String texto) {
        //Código para salvar um texto no arquivo CSV

        System.out.println("Salvando em CSV");
        return true;
    }
}
