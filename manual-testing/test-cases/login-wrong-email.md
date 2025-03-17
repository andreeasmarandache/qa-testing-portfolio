# 📝 Test Case: Login cu email incorect  

**Test Case ID:** TC_Login_02  
**Descriere:** Verifică mesajul de eroare afișat atunci când utilizatorul introduce un email incorect.  

## 🔹 Precondiții  
- Utilizatorul are un cont valid.  
- Browserul este deschis pe pagina de login.  

## 🔹 Pași  
1. Accesează pagina de login a aplicației.  
2. Introduce un email invalid (`user@gresit.com`).  
3. Introduce o parolă validă.  
4. Apasă butonul „Login”.  

## 🔹 Rezultate așteptate  
❌ Apare un mesaj de eroare: „Email sau parolă incorecte”.  
❌ Utilizatorul rămâne pe pagina de login și nu este autentificat.  

## 🔹 Rezultate obținute  
✅ Mesajul „Email sau parolă incorecte” a fost afișat corect.  
✅ Utilizatorul a rămas pe pagina de login și nu a fost autentificat.  
