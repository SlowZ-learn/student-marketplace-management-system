# Student Marketplace System
## Requirements Document

**Version:** 0.1  
**Status:** Initial Draft

## 1. Project Overview

The Student Marketplace System is a web application that allows students within one university community to buy and sell items.

The platform provides a centralized place where students can advertise items, browse available products, and submit purchase requests.

The application facilitates the buying and selling process, but physical payment and exchange of items happen outside the platform.

## 2. Problem Statement

Students often lack a centralized platform within their university community to advertise items for sale or discover items being sold by other students.

This can make it difficult for buyers to find available products and for sellers to reach potential buyers.

The Student Marketplace System aims to address this by providing a shared online marketplace for the university community.

## 3. Project Objectives

The system aims to:

- Provide a platform for students to advertise items.
- Allow users to browse and search for available products.
- Allow interested buyers to submit purchase requests.
- Help sellers manage their listings and incoming requests.
- Make buying and selling within the university community more convenient.

## 4. Target Users

The initial target audience is students within one university.

A registered user can act as both a buyer and a seller. These are activities performed by the same account, not separate account types.

Student verification is not included in the initial version.

## 5. Functional Requirements

These describe what the system should allow users to do.

### User Accounts
1. Users should be able to create accounts.
2. Users should be able to log in and log out.
3. Users should be able to view and update their profiles.

### Product Listings
4. Sellers should be able to create product listings.
5. Sellers should be able to edit their own listings.
6. Sellers should be able to delete their own listings.
7. Sellers should be able to view and manage their listed products.
8. Sellers should be able to mark a product as sold.

### Browsing and Searching
9. Users should be able to browse available products.
10. Users should be able to search for products.
11. Users should be able to filter products by relevant categories.

### Purchase Requests
12. Buyers should be able to submit purchase requests for available products.
13. Buyers should be able to view the status of their requests.
14. Sellers should be able to view purchase requests received for their listings.
15. Sellers should be able to accept or reject purchase requests.

## 6. Non-Functional Requirements

These describe how well the system should work.

1. **Security:** User passwords should be stored securely using password hashing.
2. **Access Control:** Users should not be able to modify listings or requests belonging to other users without authorization.
3. **Usability:** The application should have a simple and understandable interface.
4. **Performance:** Product searches and browsing should return results within a reasonable time.
5. **Reliability:** The system should maintain consistent data when listings and purchase requests are updated.
6. **Maintainability:** The codebase should be organized so that developers can understand and modify it.
7. **Input Validation:** The system should validate user inputs and handle invalid data appropriately.
8. **Compatibility:** The application should work on commonly used desktop and mobile web browsers.

## 7. Business Rules

These are rules that govern how the marketplace operates.

1. Users must have an account before creating listings or submitting purchase requests.
2. A product listing must contain a title, description, price, and category.
3. Only the owner of a listing can edit or delete it.
4. A seller cannot submit a purchase request for their own listing.
5. Sold products cannot receive new purchase requests.
6. Only the seller who owns a listing can manage requests for that listing.
7. Purchase requests should have statuses to indicate their progress, such as Pending, Accepted, and Rejected.
8. Accepting a purchase request does not mean payment has been completed.
9. Physical payment and exchange of items take place between the buyer and seller outside the application.
10. A listing should be marked as sold after the seller confirms that the transaction has been completed.

## 8. Project Scope

### Included in the Initial Version

- User registration and authentication.
- User profiles.
- Product listing creation and management.
- Product browsing.
- Product search and category filtering.
- Purchase requests.
- Seller request management.
- Listing status management.

### Not Included in the Initial Version

- Student identity verification.
- Online payment integration.
- In-app messaging or live chat.
- Delivery and shipment tracking.
- Seller ratings and reviews.
- Refund processing.
- Support for multiple universities.

## 9. Technology Stack

| Component | Technology |
|---|---|
| Frontend | React |
| Backend | Java / Spring Boot |
| Database | MySQL |
| ORM | Hibernate / JPA |
| Data Access | Spring Data JPA |
| Build Tool | Maven |
| Version Control | Git and GitHub |

## 10. Items Requiring Group Discussion

The following details need to be agreed upon before implementation:

1. What happens to other pending purchase requests when a seller accepts one request?
2. What happens if a buyer does not complete an accepted purchase request?
3. Should a reservation expire after a particular period?
4. Should sellers be able to cancel an accepted request and make the listing available again?

These decisions will help establish consistent marketplace behaviour.