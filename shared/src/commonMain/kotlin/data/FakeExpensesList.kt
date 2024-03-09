package data

import model.Expense
import model.ExpenseCategory

object ExpenseManager {

    private var currentId = 1L

    val fakeExpenseList = mutableListOf(
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.GROCERIES,
            description = "Compra Semanal"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.SNACKS,
            description = "Amigos"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.CAR,
            description = "Audi A1"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.COFFEE,
            description = "Frappuccino"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.PARTY,
            description = "Fin de Semana"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.HOUSE,
            description = "Gastos"
        ),
        Expense(
            id = currentId++,
            amount = 0.0,
            category = ExpenseCategory.OTHER,
            description = "LIMPIEZA"
        )
    )

    fun addNewExpense(expense: Expense) {
        fakeExpenseList.add(expense.copy(id = currentId++))
    }

    fun editExpense(expense: Expense) {
        val index = fakeExpenseList.indexOfFirst { it.id == expense.id }
        if (index != -1) {
            fakeExpenseList[index] = fakeExpenseList[index].copy(
                amount = expense.amount,
                category = expense.category,
                description = expense.description
            )
        }
    }

    fun getCategories(): List<ExpenseCategory> {
        return listOf(
            ExpenseCategory.GROCERIES,
            ExpenseCategory.PARTY,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFFEE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSE,
            ExpenseCategory.OTHER
        )
    }
}
