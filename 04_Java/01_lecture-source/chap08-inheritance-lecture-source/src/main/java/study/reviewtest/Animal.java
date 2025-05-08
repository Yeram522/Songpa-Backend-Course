package study.reviewtest;

public class Animal {
    private String name;
    private int age;
    private String gender;
    private boolean isWalking;

    public Animal(){}

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected  void walk(){  // ❌ 1 related problem
        if(isWalking){
            System.out.println("이미 걷고 있습니다~");
        }else{
            System.out.println("걷고 있습니다");
            isWalking = true;
        }
    }

     protected void stop(){ // ❌ 2 related problem
        if(isWalking){
            System.out.println("멈췄습니다!");
            isWalking =false;
        }else{
            System.out.println("이미 멈춰 있습니다.");
        }
    }

    protected void sayInfo(){
        System.out.printf("이름은" + name +"이고, 나이는" + age + "이고, 성별은 " + gender + "입니다.");
    }


}
