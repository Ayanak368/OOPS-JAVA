public class CPU {
    int price;

    // Constructor
    CPU(int price) {
        this.price = price;
    }

    // Inner class Processor
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Information:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    void displayPrice() {
        System.out.println("CPU Price: ₹" + price);
    }

    // Main method in the same class
    public static void main(String[] args) {
        CPU cpu = new CPU(30000); // Create CPU object

        CPU.Processor processor = cpu.new Processor(6, "Intel"); // Inner class object
        CPU.RAM ram = new CPU.RAM(16, "Corsair"); // Static nested class object

        cpu.displayPrice();
        processor.display();
        ram.display();
    }
}
