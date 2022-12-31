public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("小狗的名字" + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("变量值" + myPuppy.puppyAge);
    }

    public int getAge() {
        System.out.println("小狗年龄" + puppyAge);
        return puppyAge;
    }

    public void setAge(int age) {
        puppyAge = age;
    }
}
