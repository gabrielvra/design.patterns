/**
 * Classe responsável pela criação e escrita de arquivos no formado PDF.
 * Aqui deve ser relacionado todas as bibliotecas relacionadas as PDF.
 */
public class Pdf implements Persistencia {
    
    @Override
    public boolean salvar(String texto) {
        //Código para salvar um texto no arquivo PDF

        System.out.println("Salvando em PDF");
        return true;
    }
}
