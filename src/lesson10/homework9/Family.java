package lesson10.homework9;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family {" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }


    public void addChild(Human newChild) {
        newChild.setFamily(this);
        newChild.getFamily().setMother(this.mother);
        newChild.getFamily().setFather(this.father);
        Human[] newArrayChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArrayChildren[i] = children[i];
        }
        newArrayChildren[children.length] = newChild;
        children = newArrayChildren;
    }
    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArrayChildren = new Human[children.length - 1];
        int counter = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArrayChildren[counter];
            counter++;
        }
        children = newArrayChildren;
    }
    public int countFamily() {
        return 2 + children.length;
    }
}
