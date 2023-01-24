/**
 * Define a estratégia para salvar um arquivo na aplicação.
 * Pode ser utilizada em qualquer parte da aplicação. 
 * Implementar essa interface define uma nova forma de salvar um arquivo na aplicação
 */
public interface Persistencia {
    
    public boolean salvar(String texto);
}
