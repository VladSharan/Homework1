import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner k = new Scanner(System.in);
                System.out.println("Пожалуйста выберите действие, которое хотите выполнить:");
                System.out.println("1. Определение корней квадратного уравнения.");
                System.out.println("2. Опреднлнние периметра и площади для заданного прямоугольника");
                System.out.println("3. Определение длинны стороны квадрата по пириметру");
                System.out.println("4. Определить переменную по заданной формуле");
                System.out.println("5. Выход");
                int n = k.nextInt();
                if (n == 1) {
                    System.out.println("Далее будет производится решение уравнения формата: ax^2+bx+c");
                    System.out.println("Пожалуйста введите коэфициенты a, b и c");
                    double a = k.nextDouble();
                    double b = k.nextDouble();
                    double c = k.nextDouble();
                    double D = Math.pow(b,2) - 4 * a * c;
                    System.out.println("D="+D);

                    if (D > 0) {
                        double x1 = (-b + Math.sqrt(D)) / 2 * a;
                        double x2 = (-b - Math.sqrt(D)) / 2 * a;
                        System.out.println("Корни квадратного уравнения x1 и x2 будут равны соответственно:" + x1 + " и " + x2);
                    }
                    else if (D == 0) {
                        double x = -b / 2 * a;
                        System.out.println("Корень кадратного уравнения один, и он равен:" + x);
                    }
                    else {
                        System.out.println("У квадратного уравнения нет действительных корней");
                    }
                }
                else if (n==2){
                    System.out.println("Пожалуйста, введите параметры длин двух перпендикулярных сторон прямоугольника");
                    double a = k.nextDouble();
                    double b = k.nextDouble();
                    System.out.println("Площадь прямоугольника, с заданными сторонами, S="+a*b);
                    System.out.println("Периметр данного прямоугольника равен П="+a*2+b*2);
                }
                else  if (n==3){
                    System.out.println("Пожалуйста, введите периметр квадрата для определения длинны его стороны.");
                    double P = k.nextDouble();
                    System.out.println("Длинна стороны квадрата с заданным периметром А="+P/4);
                }
                else if(n==4){
                    System.out.println("Пожалуйста, вберите формулу, по которой вы хотите произвести расчёт переменной Y/Z");
                    System.out.println("1. y=((b+√(b²+4ac))/2a)-a³c+1/b³");
                    System.out.println("2. y=x³+x²");
                    System.out.println("3. y=x-(x³/3)+((x²*x³)/5)");
                    System.out.println("4. z=((x+y)/(y+1))-((x*y-12)(34+x))");
                    System.out.println("5. y=sin√(x+1)-sin√(x-1)");
                    System.out.println("6. Выход");
                    int formul = k.nextInt();
                    if(formul == 1){
                        System.out.println("Пожалуйста, введите коєфициенты b, a и c");
                        double b = k.nextDouble();
                        double a = k.nextDouble();
                        double c = k.nextDouble();
                        if(a==0){
                            System.out.println("Происходитит деление на ноль, введите другие переменную.");
                        }
                        else {
                            double y = (b+sqrt((pow(b,2)+4*a*c))/(2*a))-(pow(a,3)*c)+pow(b,-2);
                            System.out.println("Y="+y);
                        }
                    }
                    else if (formul == 2){
                        System.out.println("Пожалуйста введите X");
                        double x = k.nextDouble();
                        double y = pow(x,2)+pow(x,3);
                        System.out.println("Y="+y);
                    }
                    else if (formul == 3){
                        System.out.println("Пожалуйса, введите X");
                        double x = k.nextDouble();
                        double y = x - ((pow(x,3))/3)+((pow(x,5))/5);
                        System.out.println("Y="+y);
                    }
                    else if(formul == 4){
                        System.out.println("Пожалуйста введите X и Y");
                        double x = k.nextDouble();
                        double y = k.nextDouble();
                        if (y==-1 || x==-34){
                            System.out.println("Происходит деление на ноль, ввеите другие переменные");
                        }
                        else {double z = (x+y)/(y+1)-(x*y-12)/(34+x);
                        System.out.println("Z="+z);
                        }
                    }
                    else if(formul == 5){
                        System.out.println("Пожалуйста введите X");
                        double x = k.nextDouble();
                        double y = sin(sqrt(x+1))-sin(sqrt(x-1));
                        System.out.println("Y="+y);
                    }
                    else if(formul == 6){break;}
                }
                else if (n==5){
                    break;
                }
            }
        }

    public static double sqrt( double a){ return Math.sqrt(a);}

    public  static double pow(double a, double b){ return  Math.pow(a,b);}

    public static double sin(double a){ return  Math.sin(a);}
}