# Knights and Barbarians Abstract Factory

This repository contains an implementation of the Abstract Factory design pattern using a medieval theme. The code provides factories for creating weapons and armor for knights and barbarians.

## Table of Contents
- [Abstract Factory Pattern](#abstract-factory-pattern)
- [Directory Structure](#directory-structure)
- [Implementation](#implementation)
- [Usage](#usage)
- [Contributing](#contributing)

## Abstract Factory Pattern

The Abstract Factory pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. In this implementation, we have `BlacksmithForge` as the abstract factory interface, and concrete factories `KnightFactory` and `BarbarianFactory` for creating weapons and armor for knights and barbarians respectively.

## Directory Structure

- `python/`: Contains the Python implementation of the Abstract Factory pattern.
  - `adventurer.py`: Python code for the Abstract Factory pattern.
- `java/`: Contains the Java implementation of the Abstract Factory pattern.
  - `Main.java`: Java code for the Abstract Factory pattern.

## Implementation

The implementation includes the following components:

- **Abstract Factory Interface**: `BlacksmithForge` interface defines methods for forging weapons and armor.
- **Concrete Factories**: `KnightFactory` and `BarbarianFactory` implement the `BlacksmithForge` interface to create weapons and armor specific to knights and barbarians.
- **Abstract Products**: `Weapon` and `Armor` interfaces define methods for wielding and equipping weapons and armor.
- **Concrete Products**: `Sword`, `Axe`, `KnightArmor`, and `BarbarianArmor` implement the `Weapon` and `Armor` interfaces with specific functionalities.

## Usage

To use this Abstract Factory implementation, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the `python/` or `java/` directory depending on your preferred language.
3. Run the code in your preferred environment or IDE.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, feel free to open an issue or submit a pull request.

##License
This project is licensed under the [MIT License](LICENSE).
