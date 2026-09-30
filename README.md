# Smart Home System

## Assignment 2: Factory Method & Abstract Factory

This project demonstrates the Factory Method and Abstract Factory design patterns using a Smart Home System.

The system contains 6 device types:

- Camera
- Light
- Thermostat
- Door Lock
- Speaker
- Sensor

The final version contains 6 product families:

- Xiaomi
- Samsung
- Google
- Amazon
- Apple
- Philips

This gives a total of 36 concrete family products.

---

## Part A - Initial Version Without Factories

The first version of the project created devices directly in the client code using `new` and `if/else`.

This created several design problems:

1. The client depended directly on concrete objects.
2. Adding another product family required changing the client code.
3. Object creation logic was duplicated and mixed with the main program logic.
4. Large `if/else` structures would become more difficult to maintain when more families were added.

The initial implementation is preserved in the Git history.

---

## Part B - Factory Method

Factory Method is used for creating individual smart devices.

Main classes:

- `SmartDevice` - Product interface
- `Camera`
- `Light`
- `Thermostat`
- `DeviceCreator` - abstract Creator
- `CameraCreator`
- `LightCreator`
- `ThermostatCreator`

The factory method is:

`createDevice()`

`DeviceCreator` also contains business logic in `operateDevice()`.

This means the Creator does more than only create an object.

---

## Part C - Abstract Factory

`SmartHomeFactory` is the Abstract Factory.

It can create six related product types:

- `FamilyCamera`
- `FamilyLight`
- `FamilyThermostat`
- `FamilyDoorLock`
- `FamilySpeaker`
- `FamilySensor`

Concrete factories are:

- `XiaomiFactory`
- `SamsungFactory`
- `GoogleFactory`
- `AmazonFactory`
- `AppleFactory`
- `PhilipsFactory`

Each factory creates products belonging to the same family.

---

## Part D - Compatibility Rule

`SmartHomeSystem` receives one `SmartHomeFactory`.

All six devices are created internally using this same factory.

For example, if the system receives `SamsungFactory`, all devices are Samsung devices.

The client does not manually pass individual products from different families to `SmartHomeSystem`.

This makes incompatible product combinations difficult to create and keeps the product family consistent.

---

## Part E - Runtime Factory Selection

The user chooses the smart home family while the application is running.

`FactoryProvider` receives the family name and returns the correct `SmartHomeFactory`.

Example:

`FactoryProvider.getFactory("samsung")`

returns a `SamsungFactory`.

After the factory is selected, `SmartHomeSystem` works through the `SmartHomeFactory` abstraction and does not need to know the concrete family.

---

## Part F - Business Scenarios

The system contains three main business operations.

### Away Mode

Uses:

- Door Lock
- Sensor
- Camera

### Evening Mode

Uses:

- Light
- Thermostat
- Speaker

### Security Alert

Uses:

- Sensor
- Camera
- Door Lock

These operations demonstrate collaboration between multiple products.

---

## Part G - Adding a New Family

The original Abstract Factory implementation was created with:

- Xiaomi
- Samsung
- Google

After the main architecture was completed, Amazon was added as the fourth family.

The new family required:

- `AmazonCamera`
- `AmazonLight`
- `AmazonThermostat`
- `AmazonDoorLock`
- `AmazonSpeaker`
- `AmazonSensor`
- `AmazonFactory`

Existing selection code was updated in:

- `FactoryProvider`
- `Main`

The main business logic in `SmartHomeSystem` did not need to be changed.

Apple and Philips were later added as additional families.

---

## Part H - UML Diagram

The UML diagram is located in:

`docs/SmartHome_UML.png`

It shows the Factory Method structure, Abstract Factory structure, concrete factories, product families, runtime factory selection, and the client.

---

## Part I - Automated Tests

The project contains more than the required 15 automated tests using JUnit.

The tests cover:

- Original product families
- Correct concrete product creation
- Product family compatibility
- Runtime factory selection
- New fourth family
- Invalid family selection
- Away Mode behavior
- Evening Mode behavior
- Security Alert behavior

---

## Part J - Git History

The project was developed incrementally using meaningful Git commits.

Important development stages include:

1. Initial implementation without factories
2. Factory Method implementation
3. Abstract Factory with three families
4. Compatibility and business operations
5. Runtime factory selection
6. Amazon as the fourth family
7. Additional Apple and Philips families
8. Automated tests
9. UML documentation

This history demonstrates how the design evolved from direct object creation to an extensible factory-based architecture.