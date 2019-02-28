package factory;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;//change name
    private Plane plane;//add obj

    public MilitaryPlane(Plane plane, MilitaryType type) {
        this.militaryType = type;
    }

    public MilitaryType getType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
