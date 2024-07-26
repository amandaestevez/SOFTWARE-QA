# Interest Rate Calculator Testing

An informational interest rate calculator for a fixed term deposit needs to be tested. For a given deposit amount and client's age, the calculator shows the annual interest rate.

_The following rules apply:_

- The minimum deposit amount is $100
- The maximum deposit amount is $10,000
- The annual interest rate depends on the deposit amount as follows:

| DEPOSIT AMOUNT | INTEREST RATE |
|-------|-----------|
| $100 - $999 | 1% |
| $1,000 - $4,999 | 1.3% | 
| $5,000 - $10,000 | 1.5% |

- Only adults (18 and older) are eligible to open a term deposit account.
- Clients aged 60 and older have a fixed interest rate of 2%.

Define the optimal (effective and efficient) set of boundary test cases for a system that calculates the term's deposit interest.

------------

**Test suite effectivenes:** The effectiveness of a solution is how successful the submitted test cases are at identifying potential bugs in a system.

It is calculated as the percentage of the bugs identified compared to the total potential bugs plus the number of incorrect test cases submitted.

_Formula: BugsFound / (BugsTotal + IncorrectTestCases)_

**Test suite efficiency:** The efficiency of a solution decreases as the number of steps taken to be effective increases.

It is calculated as the percentage of the minimum number of test cases required to find all bugs compared to the number submitted, multiplied by the percentage of bugs found.

_Formula: MinimumTestCases / SubmittedTestCases * BugsFound / BugsTotal_

**Total score:** The total score is calculated as the product of effectiveness and efficiency.

_Formula: Effectiveness * Efficiency_

----------------

I'm going to answer this question in different iterations until I get a 100% total score. The first iteration was on July 23, 2024. However, I didn't document it.

### 2nd iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $100 | 18 | 1% |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 18 | 1.5% |
| TC 04 | $10,000 | 18 | 1.5% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $99 | 18 | Unavailable |
| TC 07 | $10,001 | 60 | Unavailable | 
| TC 08 | $5,000 | 17 | Unavailable | 

Test suite effectiveness: 84% - meaning it can identify up to **84% of potential bugs found in the system.**

Test suite efficiency: 100% - we have the **ideal number of test cases** required.

Total score: 84% - the test set is **84% optimal.**

**_Comments:_** Since I'm not covering all limits - such as deposit $100 and age 17 - I believe I could add one more test case to improve effectiveness.

-------------

### 3rd iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $100 | 18 | 1% |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 18 | 1.5% |
| TC 04 | $10,000 | 18 | 1.5% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $99 | 18 | Unavailable |
| TC 07 | $10,001 | 60 | Unavailable | 
| TC 08 | $5,000 | 17 | Unavailable | 
| TC 09 | $100 | 17 | Unavailable |

Test suite effectiveness: 84% - meaning it can identify up to **84% of potential bugs found in the system.**

Test suite efficiency: 94% - we have **more test cases** than required.

Total score: 79% - the test set is **79% optimal.**

**_Comments:_** By increasing the number of test cases when compared to the previous iterations, I actually decreased its performance - it didn't impact the effectiveness, and reduced efficiency, so we had more test cases than necessary. That's an issue because inefficient test cases can increase delivery time and costs. This means I'll have to keep a **maximum of 8 test cases and change the other variables: age, deposit and interest rate.**

----------

### 4th iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $99 | 18 | Unavailable |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 18 | 1.5% |
| TC 04 | $10,000 | 18 | 1.5% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $10,001 | 60 | Unavailable | 
| TC 07| $5,000 | 17 | Unavailable | 
| TC 08 | $100 | 17 | Unavailable |

Test suite effectiveness: 70% - meaning it can identify up to **70% of potential bugs found in the system.**

Test suite efficiency: 92% - we have **more test cases** than required.

Total score: 64% - the test set is **64% optimal.**

**_Comments:_** This time, the total score was lower even with fewer test cases. So the issue seems to be with the variables in the test cases. Let's change TC 01 back to $100, and TCs 03 and 04 to age 59.

----------

### 5th iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $100 | 18 | 1% |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 59 | 1.5% |
| TC 04 | $10,000 | 59 | 1.5% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $10,001 | 60 | Unavailable | 
| TC 07| $5,000 | 17 | Unavailable | 
| TC 08 | $100 | 17 | Unavailable |

Test suite effectiveness: 75% - meaning it can identify up to **75% of potential bugs found in the system.**

Test suite efficiency: 99% - we are almost at the ideal number of test cases.

Total score: 74% - the test set is **74% optimal.**

**_Comments:_** Now we changed TC 03 and TC 04 ages to 59, and the total score was lower. We also changed the TC 01 back to $100 with an interest rate of 1%. However, we have two test cases covering 1.5% interest rate and the age 59, so let's change TC 04 to 1%.

----------

### 6th iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $100 | 18 | 1% |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 59 | 1.5% |
| TC 04 | $999 | 59 | 1% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $10,001 | 60 | Unavailable | 
| TC 07| $5,000 | 17 | Unavailable | 
| TC 08 | $100 | 17 | Unavailable |

Test suite effectiveness: 70% - meaning it can identify up to **70% of potential bugs found in the system.**

Test suite efficiency: 92% - we are almost at the ideal number of test cases.

Total score: 64% - the test set is **64% optimal.**

**_Comments:_** That didn't work 😅 Considering that the test efficiency decreased, I'll then remove the TC 08.


----------

### 7th iteration (07/26/2024)

| TEST CASE ID | DEPOSIT AMOUNT | CLIENT AGE | EXPECTED INTEREST RATE | 
|--------|-----------|--------|-------|
| TC 01 | $100 | 18 | 1% |
| TC 02 | $1,000 | 18 | 1.3% | 
| TC 03 | $5,000 | 59 | 1.5% | 
| TC 04 | $999 | 59 | 1% |
| TC 05 | $5,000 | 60 | 2% |
| TC 06 | $10,001 | 60 | Unavailable | 
| TC 07| $5,000 | 17 | Unavailable | 

Test suite effectiveness: 70% - meaning it can identify up to **70% of potential bugs found in the system.** 

Test suite efficiency: 100% - Yeeeyyy, back at 100% efficiency!!
Total score: 70%.

**_Comments:_** Well, although the test suite effectiveness remained the same, the efficiency actually increased! So let's keep 07 test cases and just change the age, deposit amount, and interest rate. Since the best result we had was the 2nd iteration, let's try to find a mid-term between the 2nd and the 7th iterations.
