package Task3;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

      Title title1 = new Title();
      Author author1 = new Author();
      Content content1 = new Content();
      Scanner in = new Scanner(System.in);
        System.out.println("Добо пожаловать в домашнее задание №3");
        System.out.println("Для создания книги введите ее название");
        title1.title = in.nextLine();

        System.out.println("Прекрасно, а теперь добавьте автора данной книги");
        author1.author = in.nextLine();

        System.out.println("А теперь введите краткое содержание");
        content1.content = in.nextLine();

        System.out.println("И так вами создана книга и вот информация по ней:");
        System.out.println("Название книги: " + Title.title);
        System.out.println("Автор книги: " + Author.author);
        System.out.println("Краткое содержание книги: " + Content.content);



    }
}
