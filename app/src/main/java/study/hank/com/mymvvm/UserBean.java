package study.hank.com.mymvvm;

public class UserBean {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
