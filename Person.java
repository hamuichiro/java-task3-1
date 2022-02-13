public class Person {
    public String gender;

    public Person(String gender) {
        this.gender = gender;
    }

    public void speak() {
        String gen = "I'm a ";
        if (this.gender.equals("’j«")) {
            gen += "man";
        } else {
            gen += "woman";
        }
        System.out.println(gen);
    }    
}

