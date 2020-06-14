public class Multiplication {
    
    private double number1;
    private double number2;
    private double number3;

    public double getNumber1() {
        return this.number1;
    }
    
      public void setNumber1(double number1) {
        this.number1 = number1;
    }
    
        public double getNumber2() {
        return this.number2;
    }
    
      public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
        public double getNumber3() {
        return this.number3;
    }
    
      public void setNumber3(double number3) {
        this.number3 = number3;
    }

       public double multiplicate() {
        return this.number1 * this.number2 * this.number3;
    }
    
    @Override
    public String toString() {
    return "Number 1: " + this.getNumber1()
         + "\nNumber 2: " + this.getNumber2()
         + "\nNumber 3: " + this.getNumber3()
         + "\nMultiplication: " + this.multiplicate();
    }
}