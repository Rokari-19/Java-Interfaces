public class Computer implements Electronic {
    
    Ram ram;
    Storage storage;
    Processor cpu;

    public Computer(Ram ram, Processor cpu, Storage storage){
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }
    @Override
    public String toString(){
        return "Computer{" +
        "ram=" + ram +
        ", cpu=" + cpu +
        ", storage=" + storage +
        "}";
    }
    
    @Override
    public boolean on(){
        return false;
    }

    @Override
    public boolean off(){
        return false;
    }
}
