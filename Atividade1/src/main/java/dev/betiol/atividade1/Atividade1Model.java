package dev.betiol.atividade1;

import java.util.Objects;

public class Atividade1Model {
    private String skills;
    private String recursos;
    private String participantes;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade1Model that = (Atividade1Model) o;
        return skills.equals(that.skills) && recursos.equals(that.recursos) && participantes.equals(that.participantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skills, recursos, participantes);
    }

}
