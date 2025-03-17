# 📝 Test Case: Login cu credențiale valide  

**Test Case ID:** TC_Login_01  
**Descriere:** Verifică autentificarea unui utilizator cu email și parolă validă.  

## 🔹 Precondiții  
- Utilizatorul are un cont valid.  
- Browserul este deschis pe pagina de login.  

## 🔹 Pași  
1. Accesează pagina de login a aplicației.  
2. Introduce un email valid (`user@test.com`).  
3. Introduce o parolă validă (`Parola123!`).  
4. Apasă butonul „Login”.  

## 🔹 Rezultate așteptate  
✅ Utilizatorul este autentificat cu succes.  
✅ Pagina principală se încarcă fără erori.  
✅ Utilizatorul este vizibil ca „Autentificat” în colțul dreapta sus.  

## 🔹 Rezultate obținute  
✅ Utilizatorul „user@test.com” a fost autentificat cu succes.  
✅ Redirecționarea către pagina principală a avut loc fără erori.  
✅ Pagina principală s-a încărcat corespunzător și utilizatorul este vizibil ca „Autentificat”.  
