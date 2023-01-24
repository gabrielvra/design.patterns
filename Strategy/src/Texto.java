/**
 * Classe responsável pela criação e escrita de arquivos no formado TXT.
 * Aqui deve ser relacionado todas as bibliotecas relacionadas a TXT.
 */
public class Texto implements Persistencia {
    
    @Override
    public boolean salvar(String texto) {
        //Código para salvar um texto no arquivo TXT

        System.out.println("Salvando em TXT");
        return true;
    }
}
