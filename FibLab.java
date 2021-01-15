class FibLab{
  public static void main(String args[]) {

    long start_time;
    long end_time;

    long totalTime=0;
    float avgTime=0;

    int trials = 10;

    for (int n = 10; n < 90; n += 10) {
      for (int i = 0; i < trials; i++) {
          start_time = System.nanoTime();
          fib_i(n);
          end_time = System.nanoTime();
          totalTime = end_time - start_time;
          System.out.println(n + "," + totalTime);
          //fib_m(n);
          //fib_r(n);
          }
        }
  }

  static int fib_i(int n){
    int a = 1, b = 1, c = 0;
    for (int i = 3; i <= n; i++){
       c = a + b;
       a = b;
       b = c;
    }
    return c;
}

 static int fib_m(int n){
   int f[]= new int[n+1];
   f[1] = 1;
   f[2] = 1;

   for (int i = 3; i <= n; i++){
      f[i] = f[i-1] + f[i-2];
   }

   return f[n];
}

static int fib_r(int n){
   if (n <= 2) return 1;
   else return fib_r(n-1) + fib_r(n-2);
  }
}
