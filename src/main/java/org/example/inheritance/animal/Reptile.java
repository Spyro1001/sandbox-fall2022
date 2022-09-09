package org.example.inheritance.animal;

public class Reptile extends Animal {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reptile {");
        sb.append("age=")
          .append(age);
        sb.append('}');
        return sb.toString();
    }
}
