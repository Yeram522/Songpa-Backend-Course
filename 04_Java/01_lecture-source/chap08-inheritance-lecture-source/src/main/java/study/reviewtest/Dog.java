package study.reviewtest;

public class Dog extends Animal{
    private boolean isBarking;

    public Dog(boolean isBarking) {
        this.isBarking = isBarking;
    }

    public Dog(String name, int age, String gender, boolean isBarking) {
        super(name, age, gender);
        this.isBarking = isBarking;
    }

    @Override
    public void walk(){ // ❌ Error
        if(isBarking){
            System.out.println("강아지는 짖으면서 걸을 수 없어요!");
            return;
        }

        System.out.println("강아지가");
        super.walk();
    }

    @Override
    public void stop(){
        System.out.println("강아지가");
        super.stop();
    }

    @Override
    public void sayInfo(){
        System.out.println("강아지의");
        super.sayInfo();
    }

    public void bark(){
        if(isBarking){
            System.out.println("강아지가 짖는것을 멈춥니다.");
            isBarking = false;
        }else{
            System.out.println("강아지가 짖습니다.");
            isBarking = true;
        }
    }


}
