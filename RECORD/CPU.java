package RECORD;

// Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
// and static nested class RAM (memory, manufacturer). 
// Create an object of CPU and print information of Processor and RAM.

public class CPU {
    int price;

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("cores =" + cores);
            System.out.println("manufacturer =" + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("memory =" + memory);
            System.out.println("manufacturer =" + manufacturer);
        }

    }

    public static void main(String[] args) {
        CPU c = new CPU();
        c.price = 1000;
        CPU.Processor p = c.new Processor(4, "intel");
        CPU.RAM r = c.new RAM(8, "amd");
        p.display();
        r.display();

    }
}