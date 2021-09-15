package Unit5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Unit5Task {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cpu = "Intel(R) Core(TM) i5-10200H";
        computer.ram = 16.0;
        computer.hdd = 500;

        computer.showInfo();
        System.out.println();
        computer.work();

    }
}

class Computer{
    String cpu;
    double ram;
    int hdd;
    int fullCircleOfWork = 7;
    int countCircleOfWork = 0;
    boolean statusForTurnOn = true;

    void showInfo(){
        System.out.printf("CPU: %s \nRAM = %s Gb \nHDD = %s Gb \n%s circle(s) of work \n", cpu, ram, hdd, fullCircleOfWork);
    }

    void work(){                                            //метод запуска программы
        if(countCircleOfWork < fullCircleOfWork){
            action();
        }else if(countCircleOfWork == fullCircleOfWork){
                gone();
        }
    }

    String scannerOfAction(){                           //метод ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String line = null;
        try{
            line = scanner.nextLine();
        }catch (IllegalArgumentException e){
            System.out.println("Enter on or of");

        }
        return line;
    }

    void action(){                                      //метод меню пользователя и сообщения
        System.out.printf("Enter \"%s\" for turn %s \n", message(), message());
        turnOnOrOff();
    }

    String message(){               //определение текста сообщения
        if(this.statusForTurnOn){
            return "on";
        }
        return "off";
    }

    void turnOnOrOff(){                      //обработка данных ввода пользователя
        if(this.statusForTurnOn && scannerOfAction().equals(message())){
            turnOn();
        }else if(!this.statusForTurnOn && scannerOfAction().equals(message())){
            turnOff();
        }else{
            System.out.println("Incorrectly");
            work();
        }
    }

    void turnOn(){                              //метод включения
        if(random() == scannerZeroOrOne()){
            System.out.println("Computer is on");
            statusForTurnOn = false;
            work();
        }else{
            burnedOut();
        }
    }

    void turnOff(){                         //метод выключения
        if(random() == scannerZeroOrOne()){
            System.out.println("Computer is off");
            statusForTurnOn = true;
            countCircleOfWork++;
            work();
        }else{
            burnedOut();
        }
    }

    int random(){                       //метод рандом
        Random random = new Random();
        return random.nextInt(2);
    }

    int scannerZeroOrOne(){                             //метод обработки ввода 0 или 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        int zeroOrOne = Integer.parseInt(null);
        try {
            zeroOrOne = scanner.nextInt();
            if(zeroOrOne == 0 || zeroOrOne == 1){
                return zeroOrOne;
            }else
                System.out.println("You entered incorrect number. Try again");
            scannerZeroOrOne();
        }catch (InputMismatchException e){
            System.out.println("Please, enter number");
        }
        return zeroOrOne;
    }

    void burnedOut(){                               //сгорел
        System.out.println("Computer is burn out");
        countCircleOfWork = fullCircleOfWork;
        work();
    }

    void gone(){                                //ему конец
        if(scannerOfAction().equals("on")){
            System.out.println("Computer is gone");
        }else{
            System.out.println("Incorrectly command. Computer is gone");
        }
        work();
    }
}
