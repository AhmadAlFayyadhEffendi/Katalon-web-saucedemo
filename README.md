**Automation Testing — SauceDemo (Swag Labs)**
**Menggunakan Katalon Studio | Web Automation Testing**

**Deskripsi Project**
Project ini merupakan implementasi automation testing menggunakan Katalon Studio terhadap website demo e-commerce SauceDemo (Swag Labs).
Testing mencakup alur end-to-end mulai dari Login, Product Browsing, Shopping Cart, hingga Checkout, menggunakan pendekatan Black Box Testing dan Functional Testing.

**Informasi Aplikasi**
- URL: https://www.saucedemo.com/
- Tipe Aplikasi: Web E-Commerce Demo
- Browser: Google Chrome

**Test Credentials**
**Username**                          **Password**          **Keterangan**
standard_user                           secret_sauce✅        User normal (basis utama testing)
locked_out_user                         secret_sauce🔒        User diblokir — negative test 
loginproblem_user                       secret_sauce⚠️        User dengan bug visual
performance_glitch_user                 secret_sauce🐢        Simulasi loading lambat

**Tools & Teknologi**
**Tool**                    **Keterangan**
Katalon Studio                IDE utama automation testing
Selenium WebDriver            Engine web automation (built-in Katalon)
Google Chrome                 Browser eksekusi
XPath & CSS Selector          Teknik identifikasi web element
Object Repository             Manajemen web element
