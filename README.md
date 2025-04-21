# SNHU-CS320
Software Test, Automation QA

# Developer Reflection

#### How can I ensure that my code, program, or software is functional and secure?
Ensuring functionality and security begins with writing clean, modular code backed by rigorous unit testing. Throughout this project, I implemented JUnit tests to verify that each service—Contact, Task, and Appointment—met its functional requirements. I followed test-driven development (TDD) principles where appropriate, ensuring that features were validated early and often.

To strengthen reliability and minimize risk:

I validated all input parameters (e.g., null checks, length constraints)

Used Java’s exception handling to guard against invalid operations

Maintained test coverage of over 90% across all services

Incorporated boundary testing and negative testing to uncover hidden defects

Security and functionality are ongoing commitments, so I emphasized maintainability and readability to make future improvements and audits easier.

#### How do I interpret user needs and incorporate them into a program?
Understanding user needs starts with clearly identifying business rules and constraints. For this project, I translated requirements like:

“No contact ID may be longer than 10 characters”

“Appointments must be set to future dates”

“No duplicate tasks with the same name and description”

into concrete, testable functionality.

I approached each feature by asking:

What assumptions is the user making?

What edge cases could they encounter?

What validations are needed to prevent invalid or dangerous behavior?

By building thorough tests and error handling directly into the logic, I ensured that the software consistently respected those user needs, even in edge cases.

#### How do I approach designing software?
I take a service-oriented and modular approach to software design. For this project:

Each feature was encapsulated in its own service class (ContactService, TaskService, AppointmentService)

I kept the logic focused, predictable, and loosely coupled

Used in-memory data structures to allow quick iteration and easy testing

I start by breaking down requirements into small, manageable methods. Then I test those methods independently before combining them into larger workflows. This minimizes complexity and allows each part of the system to be validated in isolation.

I also think like a tester during design—asking how I might break the code and how it should respond to invalid use. This mindset leads to more resilient, adaptable software.

