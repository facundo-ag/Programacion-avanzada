// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
  Random random = new Random();
      int I,j,n;
      n=0;
      float Promedios;
for (I=0;I<500;I++){
       j= 10+random.nextInt(1001);
      System.out.println("El numero es: "+j);
        n=j+n;
    }
      Promedios=n/500;
      
    System.out.println("el promedio de los numeros es:"+Promedios);
    System.out.println("suma de los numeros"+n);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}