class Rectangle {
    int width;
    int height;

    
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    
    @Override
    public String toString() {
        return String.format("Rectangle [Width: %d, Height: %d]", width, height);
    }
}

public class Qno17 {
    public static void main(String[] args) {
       
        Rectangle R1 = new Rectangle(10, 20);
        Rectangle R2 = new Rectangle(15, 25);

        
        System.out.println(R1);
        System.out.println(R2);
    }
}
