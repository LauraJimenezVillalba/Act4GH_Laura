public class NumerosAleatorios {

  public static void main(String[] args) {
    
    final int LONGITUD_NUMEROS = 20;
    final int MAXIMO = 1;
    final int MINIMO = 10;
    int[] numerosAleatorios = new int[LONGITUD_NUMEROS];
    for (int i = 0; i < LONGITUD_NUMEROS; i++) {
      numerosAleatorios[i] = (int)(Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
      System.out.println("numerosAleatorios[" + i + "] = " + numerosAleatorios[i]);
    }

  }
  
  public void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }
  }

}
