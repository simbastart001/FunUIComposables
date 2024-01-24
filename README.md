# Lets Compose App

## Overview
This app demonstrates the usage of Jetpack Compose to build a simple UI. Users can enter their names in a text field, and the entered names are displayed in the center of the screen. Users can also add names to a list, which is displayed below the text field. The app showcases the usage of Material3 Theme and Surface with Compose for a consistent and modern UI.

## MainActivity
The `MainActivity` class initializes the Compose UI, declares state variables for the entered name and a list of names, and sets up the UI components such as a text field, a button, and a list to display names. It also includes an example of using Material3 Theme and Surface.

## Greeting Composable
The `Greeting` composable is a customizable UI component that can be used to display greetings or other content. It includes commented-out examples of different Compose composables that can be used to build a UI.

## NameList Composable
The `NameList` composable is a reusable component that takes a list of names as a parameter and displays them in a vertical list using Jetpack Compose's `LazyColumn`. It includes a divider between each name.

## Preview
The `GreetingPreview` composable provides a preview of the `Greeting` composable within the Let's Compose theme.

## Usage
To use this app, follow these steps:
1. Enter a name in the text field.
2. Click the "Add" button to add the name to the list.
3. The entered name will be displayed in the center of the screen, and the list of names will be updated below the text field.

Feel free to customize the provided composables and UI components based on your specific needs.

---

*Note: Ensure you have the necessary dependencies and setup for Jetpack Compose in your Android project.*
