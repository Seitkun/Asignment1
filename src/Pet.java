public class Pet  {
    private String name;
    private String type;
    private int age;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPetDetails(){
        System.out.println("Name: " + name + " Type: " + type + " Age: " + age);
    }
}