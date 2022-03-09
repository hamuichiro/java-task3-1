public class Person {
    public String gender;

    public Person(String gender) {
        this.gender = gender;
    }

    public void speak() {
        String message = "I'm a ";
        if (this.gender.equals("man")) {
            message += "man";
        } else {
            message += "woman";
        }
        System.out.println(message);
    }    
}

