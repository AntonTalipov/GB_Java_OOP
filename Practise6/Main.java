package Practise6;

public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().setName("Danil").salary(120000).сabinet((byte)13).phoneNumber(456245654).setVacation(true).build();
        System.out.println(worker);
        Cat cat1 = CatBuilder.getInstance().setName("Bob").setAge(5).setWeight(13).setBreed("seam").setColor("white").setInGoodMood(false).build();
        System.out.println(cat1);

    }
}
