package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class app {
    Scanner sc;

    app(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        int id = 1;
        List<List> list = new ArrayList<>();

        while (true) {
            System.out.printf("명령) ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.printf("제목 : ");
                String subject = sc.nextLine().trim();
                System.out.printf("내용 : ");
                String content = sc.nextLine().trim();
                List list1 = new List(id, subject, content);
                list1.add(list);
                System.out.printf("%d 번 게시물이 등록 되었습니다\n", id);
                id++;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("------------------------");
                for (int i = 0; i < list1.size(); i++) {
                    List list = list1.get(i);
                    System.out.printf("%d %s %s", );
                }
            }

        }
    }
}
