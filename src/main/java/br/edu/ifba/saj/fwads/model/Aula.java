package br.edu.ifba.saj.fwads.model;

public class Aula {
    private String nomeAula;
    private String professor;
    private String horario;

    public Aula(String nomeAula, String horario, String professor) {
        this.nomeAula = nomeAula;
        this.horario = horario;
        this.professor = professor;
    }

    public String getnomeAula() {
        return nomeAula;
    }

    public void setnomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public String gethorario() {
        return horario;
    }

    public void sethorario(String horario) {
        this.horario = horario;
    }

    public String getprofessor() {
        return professor;
    }

    public void setprofessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aula [nome da aula=" + nomeAula + ", horário=" + horario + ", Professor:" + professor + "]";
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
