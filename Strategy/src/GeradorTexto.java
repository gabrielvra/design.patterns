import java.util.Scanner;

/**
 * Classe responsáel por gerar um texto aleatório e salvar em arquivo.
 * Essa classe é o contexto do que queremos fazer.
 * 
 * @author Gabriel Vieira - gabriel@elefascomunicacao.com.br
 */
public class GeradorTexto {
    
    private enum Arquivo{TEXTO, CSV, PDF};

    /**
     * Esse contrutor recebe por parâmetro um tipo de Arquivo (TEXTO, CSV ou PDF)
     * e escolhe a melhor estratégia de geração do arquivo, instanciando a classe que implementa o processo de persistência adequado.
     * Tudo que o padrão Strategy faz é delegar algoritmos complexos para outras classes, deixando a classe principal livre de regras complexas
     * permitindo que o código seja utilizado em outros locais.
     * 
     * @param tipo
     */
    public GeradorTexto(Arquivo tipo){
        Persistencia persistencia;

        //Essa é a parte que ocorre o uso da Strategy.
        //O programa vai instanciar o objeto conforme a necessidade, usando a interface padrão "Persistencia"
        switch (tipo) {
            case TEXTO:
                persistencia = new Texto();
                break;
            case CSV:
                persistencia = new Csv();
                break;
            case PDF:
                persistencia = new Pdf();
                break;
            default:
                persistencia = new Texto();
                break;
        }
        //Nesse ponto a variável "persistencia" já tem a instância do tipo de arquivo.
        //Ao executar o método salvar, será gerado o arquivo conforme o tipo do parâmetro.
        persistencia.salvar("Um texto gerado de forma automática");
    }

    /**
     * Inicializa a aplicação
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)){
            System.out.println("Informe um tipo de arquivo: ");
            String tipo = teclado.nextLine();
            if ("txt".equals(tipo)){
                new GeradorTexto(Arquivo.TEXTO);
            } else if ("pdf".equals(tipo)){
                new GeradorTexto(Arquivo.PDF);
            } else if ("csv".equals(tipo)){
                new GeradorTexto(Arquivo.CSV);
            }    
        }
    }
}
