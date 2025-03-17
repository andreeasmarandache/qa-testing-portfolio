# 🚨 Test Case: Adăugare produs în coș când stocul este 0  

**Test Case ID:** TC_AddToCart_OutOfStock_01  
**Descriere:** Testează ce se întâmplă când utilizatorul încearcă să adauge în coș un produs fără stoc.  

## 🔹 Precondiții  
- Utilizatorul este autentificat în aplicație.  
- Produsul selectat are stoc 0.  

## 🔹 Pași  
1. Navighează către pagina produsului.  
2. Verifică dacă stocul este 0.  
3. Apasă pe butonul „Adaugă în coș”.  

## 🔹 Rezultate așteptate  
❌ Produsul nu este adăugat în coș.  
❌ Mesaj de eroare apare: „Produsul nu este disponibil în stoc.”  

## 🔹 Rezultate obținute  
✅ Produsul „Laptop X” nu a fost adăugat în coș.  
✅ Mesajul de eroare „Produsul nu este disponibil în stoc” a apărut corect.  
