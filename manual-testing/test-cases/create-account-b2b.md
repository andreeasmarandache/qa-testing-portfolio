# 🏢 Test Case: Creare cont B2B cu email deja existent  

**Test Case ID:** TC_CreateAccount_B2B_EmailAlreadyExists_01  
**Descriere:** Testează procesul de creare cont pentru un utilizator B2B cu un email care există deja în sistem.  

## 🔹 Precondiții  
- Utilizatorul nu este autentificat în aplicație.  
- Emailul folosit pentru înregistrare există deja în sistem.  

## 🔹 Date de intrare  
- **Nume companie:** Tech Solutions SRL  
- **Cod unic de identificare (CUI):** RO12345678  
- **Email:** contact@techsolutions.ro  
- **Parolă:** Parola123  
- **Telefon:** 0722123456  
- **Adresă:** Str. Exemplu, Nr. 10  

## 🔹 Pași  
1. Navighează la pagina de înregistrare.  
2. Selectează opțiunea „Înregistrare B2B”.  
3. Completează toate câmpurile, dar folosește un **email deja existent**.  
4. Apasă butonul „Creează cont”.  

## 🔹 Rezultate așteptate  
❌ Contul nu este creat.  
❌ Mesaj de eroare: „Emailul introdus este deja înregistrat.”  
❌ Utilizatorul rămâne pe pagina de înregistrare și poate corecta emailul sau solicita recuperarea parolei.  

## 🔹 Rezultate obținute  
✅ Înregistrarea a eșuat din cauza că emailul „contact@techsolutions.ro” este deja folosit.  
✅ Mesajul de eroare „Emailul introdus este deja înregistrat” a apărut corect.  
✅ Utilizatorul a avut opțiunea de a reseta parola sau de a folosi un alt email.  
