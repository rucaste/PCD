package _04;

public class SearchResult {

    private int inteiro;
    private String texto;

    public SearchResult(int inteiro, String texto){
        this.inteiro = inteiro;
        this.texto = texto;
    }

    @Override
    public String toString(){
        return inteiro + " - " + texto;
    }

}
