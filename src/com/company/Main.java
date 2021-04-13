package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите название файла: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String f = bufferedReader.readLine();
        System.out.println("Задайте размер массива: ");
        int r = Integer.parseInt(bufferedReader.readLine());
        String[] str = new String[r];
        System.out.println("Введите необходимые данные: ");
        System.out.println("Введите 'стоп' для завершения программы");
        System.out.println("Введите 'старт', чтобы начать");
        String s;
            do {
                s = bufferedReader.readLine();

                switch (s) {
                    case "старт" -> {
                        for (int i = 0; i < str.length; i++) {
                            switch (i) {
                                case 0 -> System.out.println("Ваше имя: ");
                                case 1 -> System.out.println("Ваша фамилия: ");
                                case 2 -> System.out.println("Ваше отчество: ");
                                case 3 -> System.out.println("Введите ваш возраст: ");
                                case 4 -> System.out.println("Введите ваш знак зодиака: ");
                                case 5 -> System.out.println("Введите город вашего рождения: ");
                                case 6 -> System.out.println("Ваше любимое блюдо: ");
                                default -> System.out.println("Введите информацию, которую посчитаете нужной: ");
                            }
                            str[i] = bufferedReader.readLine();
                            if (str[i].equals("стоп")) break;
                        }
                        System.out.println("Содержимое вашего файла: ");
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C://Users//Name//Desktop//" + f + ".txt"));
                        for (String i : str) {
                            if (i.equals("стоп")) break;
                            bufferedWriter.write(i + "\n");
                        }
                        bufferedWriter.close();
                    }
                    case "стоп" -> {}
                    default -> System.out.println("Такой команды не существует");
                }
            } while (!(s.equals("старт") || s.equals("стоп")));









    }
}
