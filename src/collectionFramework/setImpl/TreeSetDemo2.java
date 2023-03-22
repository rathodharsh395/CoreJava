package collectionFramework.setImpl;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<String> courses = new TreeSet<>();
        courses.add("core java");
        courses.add("advance java");
        courses.add("hibernate");
        courses.add("spring core");
        courses.add("spring mvc");
        courses.add("spring aop");
        courses.add("spring boot");
        courses.add("spring rest");
        courses.add("spring security");
        courses.add("spring jdbc");
        courses.add("spring data jpa");
        courses.add("maven");
        courses.add("git");
        courses.add("junit");
        courses.add("lombok");
        courses.add("gradle");
        courses.add("linux");
        courses.add("docker");
        courses.add("kubernetis");
        courses.add("AWS");
        courses.add("Jenkins");
        for(String cource:courses){
            System.out.println(cource);
        }
        System.out.println("size of courses "+ courses.size());
    }
}
