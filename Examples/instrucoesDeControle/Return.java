package instrucoesDeControle;

class Return {
    public static void main(final String[] args) {
        
        final boolean t = true;

        System.out.println("Antes do retorno.");

        if (t)
            return ; // retorna ao chamador
        
        System.out.println("Isto não será executado.");
    }
}
/* Os dados de saída dessa programa são:
    Antes do retorno.

    Como ovocê pode ver a instrução println não é executada.  Assim que return é executada,
    o controle volta a ser do chamador.
    Um última consideração no programa acima, a instrução if(t) é necessária. Sem ela, o 
    compilador Java sinalizaria o erro "código inalcançável", pos o compilador saberia que
    a última instrução println() nunca seria executada. Para evitar este erro, a instrução if
    é usada aqui pra enganar o compilador para esta demonstração.
*/