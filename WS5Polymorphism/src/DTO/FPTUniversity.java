package DTO;

public class FPTUniversity extends University implements Role {

    private String address;

    public FPTUniversity() {
    }

    public FPTUniversity(int size, String address, String name) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    public void createWorker() {
        System.out.println("Providing human resources");
    }
}


