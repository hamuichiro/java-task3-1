public class Person{
    public String gender;

    public Person(String gender){
        this.gender = gender;
    }

    public void speak(){
        if (this.gender.equals("’j«")){
            System.out.println("I'm a man");
        }else{
            System.out.println("I'm a woman");
        }
    }    
}

