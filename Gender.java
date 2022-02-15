public class Gender {
    
    public static void main(String[] args) {
        if (args.length != 0) {
            Person person = new Person(args[0]);
            person.speak();
        }
    }
}
