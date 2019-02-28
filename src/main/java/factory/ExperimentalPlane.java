package factory;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;
    private Plane plane;

    public ExperimentalPlane(Plane plane, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        this.experimentalTypes = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + plane.getModel() + '\'' +
                '}';
    }
}
