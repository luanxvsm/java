public class NóÁrvore {
    int valor;
    NóÁrvore direita;
    NóÁrvore esquerda;

    public void imprime(NóÁrvore a){
        if(a != null){
            imprime(a.esquerda);
            System.out.println(a.valor);
            imprime(a.direita);
    }
}

    public NóÁrvore busca(NóÁrvore raiz, int valorprocurado){
        if(raiz == null)
            return null;
        else if(raiz.valor > valorprocurado)
            return busca(raiz.esquerda, valorprocurado);
        else if(raiz.valor < valorprocurado)
            return busca(raiz.direita, valorprocurado);
        else 
            return raiz;
    }

    public NóÁrvore insere (NóÁrvore a, int v){
        if(a == null){
            a = new NóÁrvore();
            a.valor = v;
            a.esquerda = a.direita = null;
        }
        else if(v < a.valor)
            a.esquerda = insere(a.esquerda, v);
        else 
            a.direita = insere(a.direita, v);

        return a;
    }

    public NóÁrvore remover (NóÁrvore r, int v){
        if(r == null)
            return null;

        else if(r.valor> v)
            r.esquerda = remover(r.esquerda, v);
        else if(r.valor < v)
            r.direita = remover(r.direita, v);
        else{
            if(r.esquerda == null && r.direita == null){
                r = null;
            }
            else if(r.esquerda == null){
                NóÁrvore temp = r;
                r = r.direita;
            }
            else if(r.direita == null){
                NóÁrvore temp = r;
                r = r.esquerda;
            }
            else{
                NóÁrvore subesquerda = r.esquerda;
                while(subesquerda.direita != null){
                    subesquerda = subesquerda.direita;
                }
                r.valor = subesquerda.valor;
                subesquerda.valor = v;
                r.esquerda = remover(r.esquerda, v);
                }
            }
            return r;
        }
    }




