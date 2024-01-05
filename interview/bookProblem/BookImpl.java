package com.interview.bookProblem;

import java.util.ArrayList;
import java.util.List;

/* create a book class,
1.print the title of books published after year 2000
2.Calaculate total price of books
3.Find the book with highest price
4. create a booklist with books which are less than 40rs*/
public class BookImpl {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("aaa", "sss", 2010, 900.00));
        bookList.add(new Book("aaa", "sss", 2012, 900.00));
        bookList.add(new Book("aaa", "sss", 2000, 800.00));
        bookList.add(new Book("aaa", "sss", 1998, 40.00));
        bookList.add(new Book("aaa", "sss", 1996, 30.00));

//        System.out.println(bookList);
        System.out.println(bookList.get(2));


//print the title of books published after year 2000
        bookList.stream()
                .filter(s -> s.getYear() > 2000)
                .map(Book::getTitle)
                .forEach(System.out::println);

//- create a booklist with books which are less than 40rs
        List price = bookList.stream().filter(s -> s.getPrice() < 40).toList();
        System.out.println(price);

//        Calaculate total price of books

       double totalPrice= bookList.stream().mapToDouble(Book::getPrice).sum();
        System.out.println(totalPrice);

//        Find the book with highest price
        System.out.println( bookList.stream().mapToDouble(Book::getPrice).max());

        //or///

       Book book= bookList.stream()
                .max((b1,b2)->Double.compare(b1.getPrice(), b2.getPrice()))
                .orElse(null);
        System.out.println(book);
    }

}


