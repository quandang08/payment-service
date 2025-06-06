# 🧾 Payment Service - E-Commerce Microservices System

## 📌 Overview
`payment-service` is responsible for handling all payment-related logic in the E-Commerce microservices system. It processes payments for orders and sends asynchronous payment confirmation messages via Kafka to other services (e.g. Notification Service).

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA / MongoDB (optional)
- Kafka (asynchronous messaging)
- Docker (optional)
- Eureka Client (Service Discovery)
- Spring Cloud Config (External Configuration)
- Zipkin (Distributed Tracing)

---

## 🔁 Responsibilities
- Process payments upon order placement.
- Persist payment transactions (optional).
- Send **asynchronous** confirmation via Kafka.
- Communicate with other services via REST or Kafka.
- Integrate with Eureka Discovery and Config Server.

---
Kafka Integration
Topic Published: payment-events

Message Type: PaymentEvent (includes orderId, status, timestamp)

Used for event-driven architecture (E.g., Notification Service listens for this topic)

---

Dependencies
This service interacts with:

Order Service (receives payment request)

Kafka Broker (sends confirmation events)

Notification Service (receives payment confirmation)

Eureka Server (for service discovery)

Config Server (for centralized config)

Zipkin (for tracing across microservices)
