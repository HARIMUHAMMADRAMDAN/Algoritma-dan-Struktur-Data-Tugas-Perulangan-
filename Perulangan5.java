public class Perulangan5 {
        public static void main(String[] args) {
          for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 4; j++) {
              if(j % 2 == 0) {
                System.out.print("B ");
              } else {
                System.out.print("A ");
              }
            }
            System.out.println();
          }
        }
      
}
