# Flight Booking Application

A JavaFX–based GUI application for searching, booking, and managing flights.

---

## Prerequisites

- **Java SE Development Kit (JDK)** — Java SE 8 or newer installed  
- **NetBeans IDE** — required to run and develop the project  
- **JavaFX SDK** — required for running the GUI  

> **Note:** You need to download and install the above tools separately.  
>  
> For configuring JavaFX with NetBeans (Non-modular from IDE setup), follow the official instructions here:  
> [JavaFX and NetBeans — Non-modular from IDE](https://openjfx.io/openjfx-docs/index.html#netbeans-non-modular)  
>  
> This includes setting up JavaFX SDK libraries and VM options properly to run the application.

---

## Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/aniruddhan04/Flight-Booking-Application.git
   cd Flight-Booking-Application
   ```

2. **Build with Ant**  
   ```bash
   ant compile
   ```

---

## Usage

- **Run via Ant**  
  ```bash
  ant run
  ```
  This will launch the Swing GUI where you can:
  - Search available flights  
  - Book or cancel reservations  
  - View and manage your bookings

- **Run in NetBeans** (optional)  
  1. File → Open Project → select the `Flight-Booking-Application` folder  
  2. Run the `Main` class in the `coe528.lab1` package  

---

## Project Structure

```
Flight-Booking-Application/
├── nbproject/                   # (optional) NetBeans project metadata
├── src/
│   └── coe528/
│       └── lab1/                # Java source code
│           ├── Main.java
│           ├── Flight.java
│           ├── Booking.java
│           ├── Passenger.java
│           └── …  
├── test/
│   └── coe528/
│       └── lab1/                # Unit tests
├── build.xml                    # Ant build script
└── README.md                    # (this file)
```

---

## Features

- **Flight Search**: Filter by origin, destination, date  
- **Booking Management**: Create, view, cancel reservations  
- **Data Persistence**: In-memory storage  
- **Input Validation**: Prevent invalid bookings and duplicate entries  

---

## License

Released under the MIT License.

---

## Author

Aniruddha Nandy
