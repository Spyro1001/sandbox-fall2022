package org.example.inheritance.animal;

public abstract class Animal implements HighOrderBehaviors {

    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void mate() {

    }

    @Override
    public void call() {

    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal {");
        sb.append("age=")
          .append(age);
        sb.append('}');
        return sb.toString();
    }
}
