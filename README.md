# RideSharingAppService
- A very Efficient ride share app where the users can book their nearest ride with their cost calculated.

Implemented a ride-sharing application where passengers can request rides, and drivers can be matched to them based on proximity. The application also handles different types of vehicles (such as cars, bikes, luxury cars) and supports multiple fare calculation strategies. The system also notifies both passengers and drivers about ride statuses and calculates the fare based on the type of ride and distance traveled.

This is a design of a clean, maintainable, and scalable solution using SOLID principles and appropriate Design Patterns.

## Functional Requirements

### 1. Ride Request
- Passengers can request a ride by providing their location and the desired destination.
- The system can calculate the distance between the passenger’s location and the driver’s location.
- The system also assigns the nearest available driver to the passenger.

### 2. Vehicle Types
- The system supports different vehicle types (e.g., car, bike, luxury car).
- Each vehicle type has a different base fare per kilometer.

### 3. Fare Calculation:
- The system uses different fare strategies (e.g., standard fare, shared fare, luxury fare).
- The fare is calculated based on the distance traveled and the vehicle type.

### 4. Ride Status Notifications:
- Both the passenger and the driver are notified of ride statuses (e.g., ride started, ride ongoing, ride completed).
- Used the Observer Pattern to notify users about ride status updates.

### 5. Ride Matching:
- Drivers are assigned to passengers based on proximity.
- After a ride is completed, the driver becomes available for new ride requests.

## Non - Functional Requirements

### 1. Scalability:
- The design allows the system to easily add new types of vehicles and fare strategies without modifying core functionality.

### 2. Maintainability:
- Adheres to the SOLID principles to ensure that the system is easy to maintain and extend. Ensures that future features can be added with minimal changes to the existing codebase.
- Separation of Concerns: Separates the logic of fare calculation, ride matching, notifications, and user management into distinct components or classes.

### 3. Extensibility:
- The system is extensible. New vehicle types (e.g., electric scooters, vans) and new fare strategies (e.g., peak-hour pricing) can be easily added without modifying the core ride-matching logic.
