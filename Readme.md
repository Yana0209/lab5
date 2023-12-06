# Лабораторна робота 5
## Обробка виняткових ситуацій в Java
### Мета:
Зрозуміти базові принципи обробки виняткових ситуацій в Java.
Створити спеціалізовані класи винятків для обробки конкретних помилкових сценаріїв.
Використовувати пропагацію винятків.
### Опис:
Ця програма реалізує спрощену банківську систему, що дозволяє створювати рахунки, здійснювати фінансові операції та проводити операції зі зведенням рахунків.

#### Програма містить наступні компоненти:
- Клас `BankAccount` з методами для здійснення операцій з рахунками: `deposit`, `withdraw`, `getBalance` та `getAccountSummary`.
- Спеціалізовані класи винятків: `InsufficientFundsException`, `NegativeAmountException`, `AccountNotFoundException`.
- Клас `Bank`, що зберігає колекцію об'єктів `BankAccount`, і має методи: `createAccount`, `findAccount`, `transferMoney`.

#### План роботи 
1. Створюємо клас BankAccount
2. Додаємо методи: Реалізуємо методи deposit, withdraw, getBalance та getAccountSummary в класі BankAccount.
3. Створюємо класи винятків: InsufficientFundsException, NegativeAmountException, AccountNotFoundException.
4. Реалізуємо клас Bank
5. Створюємо клас Bank: Реалізуємо клас Bank, що містить колекцію об'єктів BankAccount.
6. Додаємо методи createAccount, findAccount, transferMoney в клас Bank.
7. Пишемо тести: Створюємо тестові класи для перевірки роботи класів Bank, BankAccount та обробки винятків.
8. Запускаємо тести