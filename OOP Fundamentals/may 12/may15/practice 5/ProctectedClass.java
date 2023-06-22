    class Animal {
        protected void display() {
            System.out.println("I am an animal");
        }
    }
    
    public class ProctectedClass  extends Animal {
        public static void main(String[] args) {
            Animal animal = new ProctectedClass ();
            animal.display();
        }
    
       
    }
    
