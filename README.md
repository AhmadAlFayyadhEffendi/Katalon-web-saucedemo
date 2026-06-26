### Automation Testing — SauceDemo (Swag Labs)
### Menggunakan Katalon Studio | Web Automation Testing

## 📋 Deskripsi Project

Project ini merupakan implementasi **automation testing** menggunakan **Katalon Studio** terhadap website demo e-commerce [SauceDemo (Swag Labs)](https://www.saucedemo.com/).

Testing mencakup alur end-to-end mulai dari **Login**, **Product Browsing**, **Shopping Cart**, hingga **Checkout**, menggunakan pendekatan **Black Box Testing** dan **Functional Testing**.

---

## 🌐 Informasi Aplikasi

| Item | Detail |
|------|--------|
| **URL** | https://www.saucedemo.com/ |
| **Tipe Aplikasi** | Web — E-Commerce Demo |
| **Browser** | Google Chrome |

### Test Credentials

| Username | Password | Keterangan |
|----------|----------|------------|
| `standard_user` | `secret_sauce` | ✅ User normal (basis utama testing) |
| `locked_out_user` | `secret_sauce` | 🔒 User diblokir — negative test login |
| `problem_user` | `secret_sauce` | ⚠️ User dengan bug visual |
| `performance_glitch_user` | `secret_sauce` | 🐢 Simulasi loading lambat |

---

## 🛠️ Tools & Teknologi

| Tool | Keterangan |
|------|------------|
| Katalon Studio | IDE utama automation testing |
| Selenium WebDriver | Engine web automation (built-in Katalon) |
| Google Chrome | Browser eksekusi |
| XPath & CSS Selector | Teknik identifikasi web element |
| Object Repository | Manajemen web element |

---

## ⚙️ Cara Menjalankan Project

**1. Clone repository**
```bash
git clone https://github.com/<username>/<nama-repo>.git
```

**2. Buka di Katalon Studio**
- Pilih **File → Open Project** → arahkan ke folder hasil clone

**3. Jalankan test suite**
- Buka folder **Test Suites** di sidebar
- Pilih test suite → klik **Run (▶)** → pilih **Chrome**

**4. Lihat hasil**
- Tab **Log Viewer** untuk hasil real-time
- Folder `Reports/` untuk laporan lengkap

---

## 📁 Struktur Folder

```
SauceDemo-Automation/
├── Object Repository/       # Web elements (XPath, CSS Selector)
│   ├── Page_Login/
│   ├── Page_Products/
│   ├── Page_Cart/
│   └── Page_Checkout/
├── Test Cases/              # Script test case per modul
│   ├── TC_Login/
│   ├── TC_Product/
│   ├── TC_Cart/
│   ├── TC_Checkout/
│   ├── TC_Sort/
│   └── TC_Navigation/
├── Test Suites/             # Kumpulan test case
├── Reports/                 # Hasil eksekusi (auto-generated)
├── Profiles/
│   └── default.glbl
└── README.md
```

---

## ✅ Cakupan Test Case

> Total **39 test case** — 29 Positive | 10 Negative

- 🔐 **Login & Authentication** — 9 TC (4 positive, 5 negative)
- 🛍️ **Product Listing & Detail** — 6 TC (6 positive, 0 negative)
- 🛒 **Shopping Cart** — 7 TC (6 positive, 1 negative)
- 💳 **Checkout Process** — 9 TC (5 positive, 4 negative)
- 🔃 **Sort & Filter** — 4 TC (4 positive, 0 negative)
- 🧭 **Navigation & Menu** — 4 TC (4 positive, 0 negative)

---

## 👤 Author

**Ahmad Al Fayyadh Effendi**  
📧 alfayatefendi@gmail.com  
🎓 Information Systems — Universitas Nusa Mandiri  
