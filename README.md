# DemoTestingFrameworkPOM
Demo Framework
Test Plan: Movie Ticket Booking Functionality - BookMyShow
1. Introduction

This test plan outlines the approach, scope, objectives, resources, schedule, and deliverables for testing the movie ticket booking functionality on BookMyShow’s web application (https://in.bookmyshow.com/
).

The goal is to verify that users can successfully search for movies, select theatres, choose seats, make payments, and receive booking confirmations without errors or usability issues.

2. Objectives

To ensure end-to-end validation of the movie ticket booking workflow.

To verify the functional, UI/UX, performance, and security aspects of the booking process.

To identify and document defects before production deployment.

3. Scope
In-Scope

Functional testing of the movie ticket booking flow:

Location selection

Movie selection

Theatre and showtime selection

Seat selection

Payment and confirmation

Validation of booking confirmation (email/SMS/ticket display).

Compatibility testing across major browsers (Chrome, Edge, Firefox, Safari).

Mobile responsiveness testing.

Basic negative scenarios (invalid payment, seat unavailability, session expiry).

Out of Scope

Back-end integration with payment gateway (only front-end responses verified).

Third-party ad modules or non-ticketing flows (e.g., events, sports).

API-level load testing.

4. Test Items

The primary components under test:

Web Application URL: https://in.bookmyshow.com/

Modules:

Location & Movie Listing

Showtimes & Theatre Selection

Seat Layout & Booking

Payment Gateway Integration

Booking Confirmation & Ticket Generation

5. Test Strategy
5.1 Test Types
Test Type	Description
Functional Testing	Validate that each step in the booking process works as expected.
UI/UX Testing	Ensure the layout, fonts, alignment, and user flow are intuitive.
Usability Testing	Verify ease of navigation and clarity of options.
Boundary & Negative Testing	Validate invalid input handling (e.g., expired session, incorrect payment details).
Cross-browser Testing	Verify behavior across browsers and devices.
Performance Testing	Check responsiveness during seat selection and booking.
Regression Testing	Ensure existing features remain unaffected by new changes.
6. Test Environment
Component	Details
Test URL	https://in.bookmyshow.com/

Browsers	Chrome (latest), Edge, Firefox, Safari
Devices	Desktop, Mobile (Android/iOS)
Network	Stable internet connection (4G/WiFi)
Test Data	Dummy user accounts, valid credit/debit card details (test mode)
7. Test Data Requirements
Data Type	Example
User Credentials	testuser1@gmail.com
 / password123
City	Mumbai, Delhi, Bangalore
Movie	“Joker: Folie à Deux”, “Deadpool & Wolverine”
Showtime	Any available time slot
Seats	2 tickets, Gold Class
Payment Details	Test card number: 4111 1111 1111 1111 (for dummy testing)
8. Test Scenarios
8.1 Positive Scenarios

User selects city and views available movies.

User selects a movie, theatre, date, and showtime.

User selects available seats and proceeds to payment.

Payment is successful and booking confirmation is displayed.

Confirmation email/SMS is received.

User views ticket in “Your Orders” or “My Bookings” section.

8.2 Negative Scenarios

User selects unavailable seats → error message shown.

Payment fails due to invalid card → error handled gracefully.

Session timeout before payment → user redirected to seat selection.

Seat selected by another user during checkout → seat unavailable message.

User refreshes during payment → proper session handling verified.

9. Entry and Exit Criteria
Entry Criteria

Application build deployed to QA environment.

Test data prepared.

Access credentials available.

Exit Criteria

All test cases executed.

All critical and major defects resolved and re-tested.

Test summary report approved by QA Lead.

10. Deliverables

Test Plan Document (this document)

Test Scenarios and Test Cases

Defect Report

Test Execution Report

Final Test Summary Report

11. Roles and Responsibilities
Role	Responsibility
QA Lead	Define test strategy, review deliverables, manage execution.
QA Engineer	Create and execute test cases, log defects, retest fixes.
Automation Engineer	Automate regression test cases (if applicable).
Developer	Fix defects and provide builds for testing.
12. Tools

Test Management: Jira / TestRail

Defect Tracking: Jira

Browser Testing: BrowserStack / LambdaTest

Automation (optional): Selenium + TestNG

Reporting: Excel / HTML Test Report

13. Risks and Mitigation
Risk	Mitigation
Third-party payment gateway downtime	Use sandbox environment or mock services.
Seat booking race condition	Conduct concurrent user testing.
Browser compatibility issues	Execute smoke tests on multiple browsers.
14. Schedule
Phase	Duration	Deliverables
Test Planning	2 days	Test Plan
Test Case Design	3 days	Test Cases
Test Execution	4 days	Execution Report
Defect Retesting & Closure	2 days	Final Report
15. Approval
Name	Role	Signature
QA Lead		
Product Manager		
Project Manager
