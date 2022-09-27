package com.company.java_core.homework8.task1;

import java.util.Scanner;

/*
 * @since java 1.8
 * @author Victoriia Bereshchak
 * @version 1.1
 * */

public class Main {
    public static void main(String[] args) throws NoNumException {
        Month[] months = Month.values();
        Season [] seasons = Season.values();
        Scanner sc = new Scanner(System.in);
        Month[] days = Month.values();
        int message = 0;

        while(true) {
            menu();
            System.out.println("Enter number: ");
            String num = sc.next();
            switch (num) {
                case "1" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();
                    boolean flag = isMonth(months, month);
                }
                case "2" -> {
                    System.out.println("Enter season: ");
                    sc = new Scanner(System.in);
                    String seasonSc = sc.next().toUpperCase();

                    boolean flag = false;

                    for(Month m : months){
                        if(m.getSeason().name().equals(seasonSc)){
                            flag = true;
                        }

                        if(flag) {
                            for (Month month : months) {
                                if (month.getSeason().name().equalsIgnoreCase(seasonSc)) ;
                                System.out.println(month);
                            }
                        }

                        if (!flag) {
                            System.out.println("Season does not exist.");
                        }break;
                    }
                }
                case "3" -> {
                    System.out.println("Enter number of days: ");
                    sc = new Scanner(System.in);
                    int daySc = sc.nextInt();

                    boolean flag = false;

                    for(Month m : months){
                        if(m.getDay() == daySc){
                            flag = true;
                        }

                        if(flag) {
                            Month month = Month.values()[daySc];
                            for (Month day : days) {
                                if (month.getDay() == daySc) ;
                                System.out.println(day);
                            }
                        }

                        if (!flag) {
                            System.out.println("Number of days does not exist.");
                            throw new NoNumException(message);
                        }break;
                    }
                }
                case "4" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    for (Month month00:Month.values()) {
                        if (month00.getDay() > month1.getDay()) {
                            System.out.println("Month that has fewer days: " + month0);
                        }
                    }
                }
                case "5" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    for (Month month00:Month.values()) {
                        if (month00.getDay() < month1.getDay()) {
                            System.out.println("Month that has more days: " + month0);
                        }
                    }
                }
                case "6" -> {
                    System.out.println("Enter season: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    System.out.println("Next season: ");
                    int indexNext = month1.getSeason().ordinal() + 1;
                    if (indexNext == 4) {
                        indexNext = Season.values().length - 4;
                    }
                    System.out.println(Season.values()[indexNext]);
                }
                case "7" -> {
                    System.out.println("Enter season: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    System.out.println("Previous season: ");
                    int indexPrev = month1.getSeason().ordinal() - 1;
                    if (indexPrev == -1) {
                        indexPrev = Season.values().length - 1;
                    }
                    System.out.println(Season.values()[indexPrev]);
                }
                case "8" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    if (month1.getDay() % 2 == 0) {
                        System.out.println("It is a month with even amount of days.");
                    }
                }
                case "9" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    if (month1.getDay() % 2 != 0) {
                        System.out.println("It is a month with odd amount of days.");
                    }
                }
                case "10" -> {
                    System.out.println("Enter month: ");
                    sc = new Scanner(System.in);
                    String month0 = sc.next();
                    Month month1 = Month.valueOf(month0.toUpperCase());

                    if (month1.getDay() % 2 == 0) {
                        System.out.println("It is a month with even amount of days.");
                    } else System.out.println("It is a month with odd amount of days.");
                }
            }
        }
    }

    private static void menu() {
        System.out.println(" ");
        System.out.println("1.Does the entered month exist?");
        System.out.println("2.Months of a season.");
        System.out.println("3.Months with the same number of days.");
        System.out.println("4.Output months that has fewer days.");
        System.out.println("5.Output months that has more days.");
        System.out.println("6.Output the next season after the entered one.");
        System.out.println("7.Output the previous season before the entered one.");
        System.out.println("8.Output months that have an even number of days.");
        System.out.println("9.Output months that have an odd number of days.");
        System.out.println("10.Does the entered month have an even number of days?");
    }

    private static boolean isMonth(Month[] months, String season) {
        boolean flag = false;
        for (Month m : months) {
            if (m.name().equals(season)) {
                System.out.println("Month exists.");
                flag = true;
            }
            if (!flag) {
                System.out.println("Month does not exist.");
            }
            break;
        }
        return flag;
    }

    private static boolean isSeason(Season[] seasons, String season) {
        boolean flag = false;
        for (Season s : seasons) {
            if (s.name().equals(season)) {
                flag = true;
            }
            if (!flag) {
                System.out.println("Season does not exist.");
            }
            break;
        }
        return flag;
    }
}