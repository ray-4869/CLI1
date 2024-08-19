package org.example;

import java.util.Scanner;

public class app {
        Scanner sc;
        app (Scanner sc) {
            this.sc = sc;
        }

        void run () {
            while(true) {
                System.out.printf("명령) ");
                String command = sc.nextLine().trim();
                int i = 100;
                if (command.equals("종료")) {
                    break;
                }else if (command.equals("등록")) {
                    System.out.printf("제목 : ");
                    String subject = sc.nextLine().trim();
                    System.out.printf("내용 : ");
                    String content = sc.nextLine().trim();
                    continue;
                }
            }
        }



}
