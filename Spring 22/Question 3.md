# ده حل طالب قديم ولسه مراجعتوش ولا شوفت الامتحان
# بعد قراءة السؤال طلع فيه حوارات تانية كمان في المالتي ثريدنج هو طالبها 🙂💔
# فهسيب البلاي ليست اللي كنت شارح فيها الدرس لو حد حابب يعرف بنعمل الكلام ده ازاي وحوار اللوك وكدا ولو حد حل السؤال يبقي يبعتلي أرفعه عشان ببصمج ناو ومش فاضي ومعلش لو الصوت فيها مش واضح أو فيه ديستورشن أو زعيق سيكا عشان بنفعل وأنا بشرح ومش متعود علي شغل الشرح علي اللابتوب والتسجيل 
# https://www.youtube.com/playlist?list=PLtAm40HOEEvXlYAZQq5NjpM2cr9B-U6E0

``` java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mido Mostafa
 */

class Bag {
    private float width;
    private float height;
    private float depth;
    private String color;
    private boolean wheeled;

    public Bag() {
    }
    
   
    public Bag(float width, float height, float depth, String color, boolean wheeled) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.wheeled = wheeled;
    }
    
    /*getters*/

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }

    public boolean isWheeled() {
        return wheeled;
    }
    
    @Override
    public String toString() {
        String s = "This Bag is with the following properties: \nWidth = " + this.width + "\nHeight = " + this.height +"\nDepth = " + this.depth + "\nColor is " + this.color + "\nWith Wheels? " + this.wheeled;
        return s;
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Bag)){
            return false;
        }
        Bag b = (Bag)o;
        if(this.height == b.height && this.depth == b.depth && this.width == b.width && this.color.equals(b.color) && this.wheeled == b.wheeled){
            return true;
        }
        return false;
    }
    
    public float getVolume(){
        return height*depth*width;
    }
    
    public boolean isLarger(Bag b){
        if(this.getVolume() > b.getVolume()){
            return true;
        }
        return false;
    }
    
    public boolean canEnclose(Bag b){
        if(b.width < width && b.height < height && b.depth < depth) return true;
        if(b.width < width && b.height < depth && b.depth < height) return true;
        if(b.width < height && b.height < width && b.depth < depth) return true;
        if(b.width < height && b.height < depth && b.depth < height) return true;
        if(b.width < depth && b.height < height && b.depth < width) return true;
        if(b.width < depth && b.height < width && b.depth < height) return true;
        return false;
    }
    
    public static int findSmallestBag(Bag[] b, String color, boolean wheeled){
        float volume = Float.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < b.length; i++){
            if(b[i].wheeled == wheeled){
                if(b[i].getVolume() < volume){
                    if(color == null || b[i].color.equals(color)){
                        volume = b[i].getVolume();
                        index = i;
                    }
                }
            }
        }
        return index;
    }
    
    public static void save(Bag[] bags, String filename,boolean binary) throws FileNotFoundException, IOException{
        if(binary){
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeInt(bags.length);
            for(Bag bag : bags){
                oos.writeFloat(bag.width);
                oos.writeFloat(bag.height);
                oos.writeFloat(bag.depth);
                oos.writeObject(bag.color);
                oos.writeBoolean(bag.wheeled);
            }
            oos.close();
        }
        else{
            PrintWriter output = new  PrintWriter(new FileWriter(filename));
            output.println(bags.length);
            for(Bag bag : bags){
                output.println(bag.width);
                output.println(bag.height);
                output.println(bag.depth);
                output.println(bag.color);
                output.println(bag.wheeled);
            }
            output.close();
        }
    }
    
    public static Bag[] open(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
        Bag[] bags;
        if(filename.contains(".bag")){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            bags = new Bag[ois.readInt()];
            for(int i = 0; i < bags.length;i++){
                bags[i] = new Bag();
                bags[i].width = ois.readFloat();
                bags[i].height = ois.readFloat();
                bags[i].depth = ois.readFloat();
                bags[i].color = (String) ois.readObject();
                bags[i].wheeled = ois.readBoolean();
            }
        }
        else if(filename.contains(".txt")) {
            Scanner input = new Scanner(new FileReader(filename));
            bags = new Bag[input.nextInt()];
            for(int i = 0; i < bags.length;i++){
                bags[i] = new Bag();
                bags[i].width = input.nextFloat();
                bags[i].height = input.nextFloat();
                bags[i].depth = input.nextFloat();
                bags[i].color = input.next();
                bags[i].wheeled = input.nextBoolean();
                
            }
            input.close();
        }
        else{
            bags = null;
        }
         return bags;
    }
}

public class Final{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Bag[] bags = new Bag[]{
                new Bag(45, 65, 1000, "Red", true),
                new Bag(66, 84, 21, "Green", true),
                new Bag(45, 15, 69,"Blue", true),
                new Bag(69, 69, 80, "Pink", false),
                new Bag(45, 22, 46, "Red", true),
                new Bag(45, 59, 46, "Green", true)
        };

        System.out.println(bags[0].canEnclose(bags[1]));
        System.out.println(bags[0].equals(bags[1]));
        System.out.println(bags[0].getVolume());
        System.out.println(bags[0].isLarger(bags[1]));
        System.out.println(Bag.findSmallestBag(bags, "red", true));
        Bag.save(bags,"bags.txt",false);
      
        Bag[] readData = Bag.open("bags.txt");
        for (Bag readData1 : readData) {
            System.out.println(readData1);
        }
    }
}

```

