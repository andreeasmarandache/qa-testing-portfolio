# 🛍️ Test Case: Creare cont B2C cu email deja existent  

**Test Case ID:** TC_CreateAccount_B2C_EmailAlreadyExists_01  
**Descriere:** Testează procesul de creare cont pentru un utilizator B2C cu un email care există deja în sistem.  

## 🔹 Precondiții  
- Utilizatorul nu este autentificat în aplicație.  
- Emailul folosit pentru înregistrare există deja în sistem.  

## 🔹 Date de intrare  
- **Nume complet:** Ioana Popescu  
- **Email:** ioana.popescu@gmail.com  
- **Parolă:** Parola123  
- **Telefon:** 0734123456  
- **Adresă:** Str. Exemplu, Nr. 20  

## 🔹 Pași  
1. Navighează la pagina de înregistrare.  
2. Selectează opțiunea „Înregistrare B2C”.  
3. Completează toate câmpurile, dar folosește un **email deja existent**.  
4. Apasă butonul „Creează cont”.  

## 🔹 Rezultate așteptate  
❌ Contul nu este creat.  
❌ Mesaj de eroare: „Emailul introdus este deja înregistrat.”  
❌ Utilizatorul rămâne pe pagina de înregistrare și poate corecta emailul sau solicita recuperarea parolei.  

## 🔹 Rezultate obținute  
✅ Crearea contului a eșuat, deoarece emailul „ioana.popescu@gmail.com” este deja înregistrat.  
✅ Mesajul de eroare „Emailul introdus este deja înregistrat” a apărut corect.  
✅ Utilizatorul a fost direcționat către opțiunea de **recuperare a parolei** sau a avut opțiunea de a folosi un alt email.  
