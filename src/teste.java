import Pieces.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> sla = new ArrayList<>();

        sla.add(1);
        sla.add(2);
        sla.add(3);
        sla.add(null);
        sla.add(null);
        sla.add(4);

        for(Integer x : sla){
            if(x != null){
                System.out.println(x);
            }else{
            System.out.println("null");
            }
        }

    }

}
