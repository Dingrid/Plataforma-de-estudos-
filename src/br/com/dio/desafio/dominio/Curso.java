package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    //sobrecreve o metodo calcularXP de conteudo
    @Override
    public double calcularXp()
    {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {}

    public int getCargaHoraria()
    {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria)
    {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
