package BibliotecaEnConsola;

import java.util.ArrayList;

public class BookController {

    public static ArrayList<Book> mainBooks () {
        return BookService.allBooks;
    }

    public static void main(String[] args) {

        BookService.allBooks.add(new Book(1, "Riyad-us-Saliheen", "Darussalam", "Imam An-Nawawi", 700, 18.99));
        BookService.allBooks.add(new Book(2, "The Sealed Nectar", "Darussalam", "Safir al-Rahman al-Mubarakpuri", 500, 16.50));
        BookService.allBooks.add(new Book(3, "Fortress of the Muslim", "Darussalam", "Saeed bin Wahf Al-Qahtani", 250, 6.99));
        BookService.allBooks.add(new Book(4, "Kitab At-Tawheed", "Darussalam", "Muhammad ibn Abdul-Wahhab", 300, 10.99));
        BookService.allBooks.add(new Book(5, "Explanation of the Three Fundamental Principles", "Darussalam", "Ibn al-Uthaymeen", 400, 13.49));
        BookService.allBooks.add(new Book(6, "The Fundamentals of Tawheed", "IIPH", "Dr. Bilal Philips", 350, 12.99));
        BookService.allBooks.add(new Book(7, "Ar-Raheeq Al-Makhtum", "Darussalam", "Safir al-Rahman al-Mubarakpuri", 500, 16.20));
        BookService.allBooks.add(new Book(8, "Men Around the Messenger", "Darussalam", "Khalid Muhammad Khalid", 450, 15.90));
        BookService.allBooks.add(new Book(9, "Women Around the Messenger", "Darussalam", "Muhammad Ali Qutb", 320, 14.40));
        BookService.allBooks.add(new Book(10, "The Creed of Imam Al-Tahawi", "IIPH", "Ibn Abi al-Izz", 380, 13.50));
        BookService.allBooks.add(new Book(11, "In the Footsteps of the Prophet", "Oxford", "Tariq Ramadan", 300, 12.00));
        BookService.allBooks.add(new Book(12, "Purification of the Soul", "IIPH", "Ibn Rajab / Ghazali / Ibn Qayyim", 280, 11.40));
        BookService.allBooks.add(new Book(13, "Manners in Islam", "Darussalam", "Abdul Fattah Abu Ghuddah", 190, 8.25));
        BookService.allBooks.add(new Book(14, "Stories of the Prophets", "Darussalam", "Ibn Kathir", 500, 18.00));
        BookService.allBooks.add(new Book(15, "Tafsir Ibn Kathir (Abridged)", "Darussalam", "Ibn Kathir", 3000, 99.99));
        BookService.allBooks.add(new Book(16, "Sahih Al-Bukhari (Abridged)", "Darussalam", "Imam Al-Bukhari", 1200, 45.50));
        BookService.allBooks.add(new Book(17, "Sahih Muslim (Abridged)", "Darussalam", "Imam Muslim", 875, 43.25));
        BookService.allBooks.add(new Book(18, "Bulugh al-Maram", "Darussalam", "Ibn Hajar al-Asqalani", 1449, 27.60));
        BookService.allBooks.add(new Book(19, "Imam Nawawi’s 40 Hadith", "Darussalam", "Imam Nawawi", 1277, 12.99));
        BookService.allBooks.add(new Book(20, "Fiqh-us-Sunnah", "Al-Firdous", "Sayyid Sabiq", 1950, 39.99));
        BookService.allBooks.add(new Book(21, "Don't Be Sad", 18.50));
        BookService.allBooks.add(new Book(22, "The Ideal Muslim", 21.50));
        BookService.allBooks.add(new Book(23, "The Four Rules", 9.99));
        BookService.allBooks.add(new Book(24, "The Book of Manners", 15.50));
        BookService.allBooks.add(new Book(25, "Aqidah al-Wasitiyyah", 16.40));
        BookService.allBooks.add(new Book(26, "The Biography of Abu Bakr As-Siddiq", 24.99));
        BookService.allBooks.add(new Book(27, "The Biography of Umar Ibn Al-Khattab", 29.99));
        BookService.allBooks.add(new Book(28, "The Biography of Uthman Ibn Affan", 31.99));
        BookService.allBooks.add(new Book(29, "The Biography of Ali Ibn Abi Talib", 33.99));
        BookService.allBooks.add(new Book(30, "The Prophet’s Prayer Described", 11.50));
        BookService.allBooks.add(new Book(31, "The Beautiful Names of Allah", 18.45));
        BookService.allBooks.add(new Book(32, "Jinn and Human Sickness", 21.99));
        BookService.allBooks.add(new Book(33, "The Hereafter (Akhirah)", 22.99));
        BookService.allBooks.add(new Book(34, "Enjoy Your Life", 16.99));
        BookService.allBooks.add(new Book(35, "When the Moon Split", 25.99));
        BookService.allBooks.add(new Book(36, "The Day of Resurrection", 18.99));
        BookService.allBooks.add(new Book(37, "The World of the Angels", 15.99));
        BookService.allBooks.add(new Book(38, "The World of the Jinn and Devils", 17.99));
        BookService.allBooks.add(new Book(39, "Enjoy Your Prayer", 14.50));
        BookService.allBooks.add(new Book(40, "The Inner Dimensions of Prayer", 11.99));
        BookService.allBooks.add(new Book(41, "The Rights of Women in Islam", 12.99));
        BookService.allBooks.add(new Book(42, "The True Message of Jesus", 10.50));
        BookService.allBooks.add(new Book(43, "Healing with the Medicine of the Prophet", 19.99));
        BookService.allBooks.add(new Book(44, "The Book of Patience", 16.99));
        BookService.allBooks.add(new Book(45, "Major Sins", 14.99));
        BookService.allBooks.add(new Book(46, "The Ideal Muslimah", 19.50));
        BookService.allBooks.add(new Book(47, "The Prophet’s Medicine", 17.80));
        BookService.allBooks.add(new Book(48, "A Simple Guide to Salah", 13.20));
        BookService.allBooks.add(new Book(49, "Seerah of the Prophet", 21.75));
        BookService.allBooks.add(new Book(50, "Daily Duas for Muslims", 12.40));

    }

}
