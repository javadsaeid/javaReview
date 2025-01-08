package abstraction;

import java.util.Arrays;

public class Developer extends Person {

    private String[] skills;

    public Developer(String name, int age, String[] skills) {
        super(name, age);
        this.skills = skills;
    }

    @Override
    public void description() {
        System.out.println("I'm a developer, my name is" + this.getName() + "and my age is" + this.getAge() + " years old.");
        System.out.println();
        System.out.println("my skills are:" + Arrays.toString(this.skills));
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
