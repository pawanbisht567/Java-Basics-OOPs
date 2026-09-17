class Student {
    String name;
    int roll_num;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Navin";
        s1.roll_num = 26;
        s1.marks = 100;
        Student students[] = new Student[4];
        students[0] = s1;

        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.roll_num);
        System.out.println(s1.marks);

        int nums[] = new int[4];
        nums[0] = 40;
        nums[1] = 50;
        nums[2] = 60;
        nums[3] = 70;
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
