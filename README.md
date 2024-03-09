## App

# 🍎iOS
### 🍎 Screenshots (DarkMode)
<div style="display: flex; justify-content: space-between;">
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/2d346be2-38ac-4c23-b4fc-959155de85bc" height=400>
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/f1557929-d4e2-4b30-8c65-93ca82ad9c5a" height=400>
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/ea82d847-84c5-4f38-819a-6a77cfe638cf" height=400>
</div>

# 🤖Android
### 🤖Screenshots (DarkMode)
<div style="display: flex; justify-content: space-between;">
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/f9c26ed3-14e6-4653-9a8f-0fd682e843e5" height=400>
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/07c4c5dc-99e4-487a-8279-ed60f8b4042b" height=400>
    <img src="https://github.com/gastsail/expenses-KMP/assets/57275367/ab90f5be-499b-4a61-bd4e-2bbab023e4eb" height=400>
</div>

## App Architecture
Currently, this app uses MVVM Architecture, which is achieved with a third-party library called PreCompose.

## Libraries
- PreCompose for Viewmodels
- PreCompose for Navigation
- Koin for DI with PreCompose
- Kamel (Not used but if we need to load images from the internet in future versions of the app, we include it)
- SQLDelight 2.0.1 for local storage
- Ktor for API support (please follow https://github.com/JordyV3/expensesApi.git to start the server) also see ExpensesRepoImpl to setup the BASE_URL


