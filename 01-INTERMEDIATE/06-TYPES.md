# Functional

# 1. Unit Tests
# 2. Integration
# 3. System
# 4. User Acceptance (UAT)
# User Acceptance Testing

Select true statements for User Acceptance Testing:

**QUESTIONS**

_1. Who should perform User Acceptance Testing?_
   
   ❌ Developers
   ✅ Customers
   ❌ QA testers
   ❌ Customer support agents

_2. When should User Acceptance Testing be performed?_

   ❌ Before writing integration tests
   ❌ Before system testing
   ❌ Just after important features are implemented
   ✅ After all features have been implemented and otherwise tested

_3. How should User Acceptance Testing be performed?_

 ✅ Using real-life scenarios
 ❌ According to functional tests
 ❌ Using a list of steps that were agreed upon at the start of the project
 ❌ By predicting user behavior.

-----------
**EXPLANATION**

Before diving into the answers, let's understand a few core concepts of UAT.

In this type of testing, the end users and clients will test the software in the "real world" or real-life scenarios/conditions to assess its usability and functionality. 
![image](https://github.com/user-attachments/assets/29297d93-ab43-4a6c-a19d-2ccca6d10b8f) 

UAT ensures the product meets real-world requirements.

There are six different types of UAT:

**- Alpha Testing:** Conducted by internal users or a limited group of external users to identify early-stage issues.
**- Beta Testing:** Involves a larger group of external users who test the product in a real-world environment.
**- Operational Acceptance Testing (OAT):** Verifies the product's ability to function in the actual production environment, including performance, security, and backup procedures.
**- Contract Acceptance Testing (CAT):** Ensures the product meets the contractual specifications and requirements agreed upon with the client.
**- Regulation Acceptance Testing (RAT):** Confirms compliance with industry regulations and standards.
**- Business Acceptance Testing (BAT):** Evaluates if the product meets the business objectives and goals.

--------------
 **ANSWERS**

 _1. Who should perform User Acceptance Testing?_

 **The customers should perform User Acceptance Testing.** These individuals should have a deep understanding of the system's requirements and how it will be used in real-world scenarios. They are the ones who will know if the software suits their needs.

_2. When should User Acceptance Testing be performed?_

**UAT should be performed after all features have been implemented and otherwise tested** to ensure the product is complete and stable for end-user evaluation.

_3. How should User Acceptance Testing be performed?_

**UAT should be conducted using real-life scenarios** to uncover issues that might not be apparent in controlled testing environments.

--------------

Thank you so much for dedicating your time to read this! 

# Non-Functional

# 1. Performance
# 2. Load
# 3. Stress
# 4. Web Performance
# 5. Soak/Endurance
# 6. Usability
# 7. Accessibility
     Visual
     Hearing
     Physical
     Cognitive
# 8 . Security

# Security: Web Application
# CROSS-SITE REQUEST FORGERY (CSRF)

A web application for ordering cat food charges users and places an order when an HTTP GET request is issued to the following URL:

http://www.catsupplies.com/order?brand=xxxxx&quantity=xxxxx

A malicious website could add snippets like this to their site:

```html
<img src="http://www.catsupplies.com/order?brand=xxxxx&quantity=xxxxx">
```

What would help protect against such attacks considering that the web application has the CORS policy that only allows requests from the same site?

(Select all acceptable answers):

**ALTERNATIVES**

:white_check_mark: 1. Switch the endpoint method from HTTP GET to HTTP PUT and move the query parameters into the request body.


:x: 2. Add an additional "token" cookie, without the same site attribute, that is unique per user session and checks if it's correct when visiting the page.


:x: 3. Only accept IPv6 connections.


:white_check_mark: 4. Add an additional "token" HTTP header that is unique per user session and checks if it's correct when visiting the page.


:x: 5. Set the Content-Type header of the returned data to text/html.


--------------------

**EXPLANATION**

This is a Cross-site Request Forgery attack, A.K.A. CSRF or XSRF - it forces users to submit an unwanted request to an application they are **logged in.** 

In this case, the hacker embedded the malicious HTML snippet containing pre-filled data for brand and quantity (of what the user is buying) as an image and distributed the link, mostly through **social engineering.**

When the user accesses this link, the browser automatically sends the order since the link contains a GET request. It is hard for the cat supplies store owner to know about the attack, because the unwanted GET request sends the customer's cookies along, making the purchase seem legit.

--------------------

**_How to avoid this attack?_**


:white_check_mark: 1. Switch the endpoint method from HTTP GET to HTTP PUT and move the query parameters into the request body.

- **CORRECT.** *GET Requests that change state aren't safe in general.* In the cat supplies store case, it changes state because it places an order - altering the *state of the system*: inventory, user account, financial records, etc.

Changing the HTTP method from GET to PUT would make it more difficult for the store to suffer a CSRF attack because the GET method passes the information in the URL, while the PUT method passes the information in the request body.

It's not a foolproof solution, but it adds a layer of security.

--------------------

:x: 2. Add an additional "token" cookie, without the same site attribute, that is unique per user session and checks if it's correct when visiting the page.

- **INCORRECT.** _The token cookie can still be stolen if it doesn't contain the HttpOnly flag_ - a security measure that makes cookies inaccessible via JavaScript. For this alternative, we are considering the flag wouldn't be added since it isn't mentioned anywhere.

In this case, the malicious actor would just need to create a JavaScript function that steals the token (or sensitive information stored in the cookie) and sends it to their server, then add the function as an attribute to the **_img_** element. 

It could look like this:

```html
<img src="http://www.catsupplies.com/order?brand=xxxxx&quantity=xxxxx">
 onload="stealCookieValue()"
```

The **_onload_** event attribute specifies that the **_stealCookieValue()_** function should be triggered after the **_img_** element successfully loads.

**_But how do you set the HttpOnly flag?_**

That depends on the language used on the server side. In Java, for example, you can use the **_javax.servlet.http_** package to create it:

```java
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class MyServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        // Set cookie name and value
        String cookieName = "myToken";
        String cookieValue = "your_token_value";
        
        // Create a cookie object
        Cookie cookie = new Cookie(cookieName, cookieValue);
        
        // Set HttpOnly flag
        cookie.setHttpOnly(true);
        
        // Set expiration time (optional)
        cookie.setMaxAge(60 * 60 * 24); // Expires in 24 hours
        
        // Add cookie to the response
        response.addCookie(cookie);
        
        // ... (rest of your servlet code)
    }
}
```

--------------------

:x: 3. Only accept IPv6 connections.

- **INCORRECT.** _CSRF targets logged-in user sessions, not the servers directly._ This means that if the user is logged in and authorized by the server, the attack will happen no matter the IP version.

--------------------

:white_check_mark: 4. Add an additional "token" HTTP header that is unique per user session and checks if it's correct when visiting the page.

- **CORRECT.** _Upon successful login, the server generates a unique token value, either _a random string_ or _a cryptographic hash_. The generated token is included in the "token" HTTP header when the user makes subsequent requests to the page. The server then receives the request and checks the value of the "token" header, associating it with the user session (e.g., storing it in a database or in-memory cache). If the token value matches the one associated with the user's session, the request is considered valid. Otherwise, the server rejects the request.

--------------------

 :x: 5. Set the Content-Type header of the returned data to text/html.

 -**INCORRECT.** _Just like in the IP version case, the CSRF attack targets user sessions,_ not the server itself. So even if the server returns text/html data, it wouldn't prevent the attack.

## EXERCISE 02: An office supplies web store wants to improve the security of their website. A developer suggested a number of changes.

Which of the changes would improve security?

(Select all acceptable answers.)

✅ 1. Everything on the site should use HTTPS instead of HTTP.

❌ 2. When resetting a user's password, send the user a new password instead of a password reset code.

✅ 3. Set an HTTP-only flag on the session cookie.

✅ 4. Show a CAPTCHA after several failed login attempts.

❌ 5. Replace UUIDs in URLs with sequential IDs.

❌ 6. Session tokens should never expire.

-----------

✅ 1. Everything on the site should use HTTPS instead of HTTP.

- **CORRECT.** _Hypertext Transfer Protocol Secure (HTTPS) is the secure version of HTTP._ It acts like a fortified communication channel between the web browser and a website. HTTPS uses **_Transport Layer Security (TLS)_** to encrypt the data you send and receive, making it unreadable to anyone who might intercept it. This is in contrast to regular HTTP, which transmits data in plain text, leaving it vulnerable to eavesdropping. Therefore, it **makes the website more secure**.

-----------

❌ 2. When resetting a user's password, send the user a new password instead of a password reset code.

**- INCORRECT.** By sending the user a new password, anyone who has access to the user's email will be able to see the new password. Therefore, it is more secure to send a password reset code.

-----------

✅ 3. Set an HTTP-only flag on the session cookie.

- **CORRECT.** The HttpOnly flag is a _security measure that makes cookies inaccessible via JavaScript._ Without this protection, the website could easily suffer a **Cross-site Request Forgery attack**, also known as CSRF - a type of attack where a malicious actor forces users to submit an unwanted request to an application they are logged in.

**_How do you set the HttpOnly flag?_**

The specific method depends on the server-side language you're using. Consult the documentation for your chosen framework or language for detailed instructions.
In Java, for example, you can use the javax.servlet.http package to create it:

```java
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class MyServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        // Set cookie name and value
        String cookieName = "myToken";
        String cookieValue = "your_token_value";
        
        // Create a cookie object
        Cookie cookie = new Cookie(cookieName, cookieValue);
        
        // Set HttpOnly flag
        cookie.setHttpOnly(true);
        
        // Set expiration time (optional)
        cookie.setMaxAge(60 * 60 * 24); // Expires in 24 hours
        
        // Add cookie to the response
        response.addCookie(cookie);
        
        // ... (rest of your servlet code)
    }
}
```

----------

✅ 4. Show a CAPTCHA after several failed login attempts.

**- CORRECT.** The CAPTCHA can help verify that the application is being accessed by real humans, and not under attack. By presenting a CAPTCHA after a certain number of failed login attempts, the website makes it more difficult for automated scripts to crack passwords through brute-force attacks.

------------

❌ 5. Replace UUIDs in URLs with sequential IDs.

**- INCORRECT.** _Sequential IDs would make the website LESS secure._ 

Both sequential IDs and UUIDs are used to identify items in a database. 

E.g. - an e-commerce URL might look like this: 

```http
https://ecommerceurl.com/product_1234
```
_or_ 

```http
https://ecommerceurl.com/product_3a1b2c4d-e5f6-g7h8-i9j0-k1l2m3n4o5p6
```

Where _"product_1234"_ and _"product_3a1b2c4d-e5f6-g7h8-i9j0-k1l2m3n4o5p6"_ are the product identifiers in the e-commerce database.

The difference between them is that:

**_- Sequential IDs:_** As the name says, they follow a sequence of characters, like "1234" or "abcd", which makes the ID more predictable for malicious actors and, therefore, less secure.

**_- UUIDs:_** UUIDs are 128-bit identifiers generated according to a specific standard (RFC 4122) to ensure they are extremely unlikely ever to collide.
They are typically represented as hexadecimal strings with a specific format (e.g., "3a1b2c4d-e5f6-g7h8-i9j0-k1l2m3n4o5p6").

Due to their random nature, UUIDs are very difficult to guess, offering strong protection against unauthorized access.

So changing from UUIDs to Sequential IDs wouldn't help with the security.

------------

❌ 6. Session tokens should never expire.

**- INCORRECT.** _Session Tokens (A.K.A. **cookies**) should ALWAYS expire._ Despite it being much nicer and comfortable to go to your favorite website and not have to log in again because it already recognizes you, session tokens that don't expire can represent a security threat to website users. Here's why:

| Increased Attack Window: A non-expiring token essentially becomes a permanent "key" to your account. If an attacker gains access to this token (through malware, phishing, etc.), they can potentially impersonate you and access your account for an indefinite period.|
|Lost or Stolen Device: If you lose your device or it's stolen, anyone who gains access to it will also have access to your account for as long as the token remains active.|
|Public/Shared Devices: Using a public or shared computer with a non-expiring token poses a risk. Someone else could access your account if they haven't cleared the cookies after their session.|

As a best practice, always implement a reasonable expiration time for session tokens to enhance your website's security.  Consider factors like user behavior and the sensitivity of data when choosing an appropriate expiration duration.  Explore server-side language functionalities to set expiration times for your cookies.

------------

Thank you so much for your time! If you think something is missing or would like to correct/add more information, please feel free to submit a pull request.

See you next time!


      SQL Injection
      Cross-site Scripting
      Network
        - Spoofing Attack
        - IP Protection

# Prevent Vulnerabilities With Security Testing Techniques

This table provides a concise overview of various security testing techniques, outlining their focus and approach.

##  Methodology
The table will list common security testing techniques in one column, with a corresponding one-sentence description in the next column explaining the technique's target area and testing method.

| TYPE OF TESTING | DESCRIPTION | KEY FOCUS | METHODOLOGY | MOST USED TOOL | 
|---------|---------------|-----------|------------|---------|
| Vulnerability Scanning | Automated process to identify known vulnerabilities in systems, applications, or networks | Finding weaknesses based on predefined patterns | Scans for vulnerabilities in code, configuration, or network devices | Nessus |
| Penetration Testing (Ethical Hacking) | Simulates real-world attacks to identify exploitable vulnerabilities | Uncovering critical security issues an attacker might use | Ethical hackers attempt to gain unauthorized access using various techniques | Kali Linux |
| Security Code Review | Manual examination of code to identify security flaws | Detecting vulnerabilities in code during development | Security professionals analyze code for common coding errors and security weaknesses | N/A (Manual process) |
| SAST (Static Application Security Testing) | Analyzes source code without running the application | Finding vulnerabilities early in the development lifecycle | Examines code for patterns and weaknesses without executing it | Fortify on Demand |
| DAST (Dynamic Application Security Testing) | Tests running applications to identify vulnerabilities | Discovering vulnerabilities during runtime by simulating user interaction | Scans a running application for vulnerabilities by injecting malicious code or data | Burp Suite |
| Risk Assessment | Evaluates the likelihood and impact of potential security threats | Prioritizing security efforts based on potential risks | Analyzes threats, vulnerabilities, and potential consequences | N/A (Framework based) | 
| Security Posture Assessment | Broad evaluation of an organization's overall security posture | Identifying weaknesses across different security controls | Assesses security policies, procedures, and technical controls | SecurityScorecard |

## Conclusion
By strategically utilizing these diverse security testing techniques, organizations can proactively identify and address vulnerabilities, bolstering their overall cyber resilience.



# 9. API
     Validation
     Functional
     UI
     Load
     Security
     Runtime Error/Detection
     Penetration
     Fuzz
     Interoperability
     Tools

