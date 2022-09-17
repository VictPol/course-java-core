package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Help: Unicode (decimal)
 * <p>
 * Необходимо определить, какие символы вводит пользователь:
 * <ul>
 *  <li>латиница</li>
 *  <li>кириллица</li>
 *  <li>цифра</li>
 *  <li>спец. символ</li>
 * </ul>
 * <p>
 * Так же программа не должна зависеть от регистра.
 */
class Task11 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        char symbol = 'z';

        String monthName = getSymbolType(symbol);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет к какому типу относится данный символ.
     *
     * @param symbol символ
     * @return <code>latin</code>/<code>cyrillic</code>/<code>digit</code>/<code>undefined</code>
     */
    static String getSymbolType(char symbol) {
        int codeDecimal = (int) symbol;
        String _symbolType = "undefined";
        if (48 <= codeDecimal && codeDecimal <= 57) {
            _symbolType = "digit";
        } else if ((65 <= codeDecimal && codeDecimal <= 90) || (97 <= codeDecimal && codeDecimal <= 122)) {
            _symbolType = "latin";
        } else if (1040 <= codeDecimal && codeDecimal <= 1103) {
            _symbolType = "cyrillic";
        } else {
            _symbolType = "undefined";
        }
        return _symbolType;
    }
}
