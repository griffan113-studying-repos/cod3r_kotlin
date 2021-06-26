package OO

private val dentroDoArquivo = 1;
internal val dentroDoProjeto = 1;
public val publico = 1;

private fun privado() { }

private open class Capsula {
    private val dentroDoObjeto = 1;
    protected val vaiPorHeranca = 1; //Ou dentro da classe
    internal val dentroDoProjeto = 1;
    public val publico = 1
} //Permite herança

private class CapsulaFilha : Capsula() {
    public fun verificarAcesso() {
//        println(Capsula().dentroDoProjeto);
        println(vaiPorHeranca);
        println(publico);
    }
}

private fun verificarAcesso() {
    println(Capsula().publico);
    println(Capsula().dentroDoProjeto);
}