package Semana1.SegundaFeira;

public class LeetCode1108 {
    public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }

    public static void main(String[]args){
        LeetCode1108 teste = new LeetCode1108();

        System.out.println(teste.defangIPaddr("1.1.1.1"));


    }
}
