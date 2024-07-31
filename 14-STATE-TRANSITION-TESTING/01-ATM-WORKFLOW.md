The workflow of an ATM is defined by the following rules:

- The ATM goes into the **WORKING** state with the **TURN ON** action.
- When in the WORKING state, the ATM can:
     1 - **ACCEPT CARD** which switches it to the **CARD ACCEPTED** state.
     2 - Start the **AUTOMATIC TESTING** action which switches it to the **SELF TESTING** state.

- Within CARD ACCEPTED the ATM can:
     1 - CALL POLICE which switches it to the **WAITING POLICE** state.
     2 - PROCESS TRANSACTION which switches it to the TRANSACTION PROCESSED state.

- From the TRANSACTION PROCESSED state the ATM goes into the SELF TESTING state with the PULL CARD action.
- When in the SELF TESTING state, the ATM can either:
     1 - PASS, which switches it to the WORKING STATE.
     2 - FAIL, which switches it to the WAITING SERVICE state.

- From the WAITING SERVICE state, the ATM can either:
     1 - Be SERVICED, which puts the ATM into the WORKING state.
     2 - Be RETESTED, which returns the ATM to the SELF TESTING state.

Prepare the optimal (effective and efficient) set of test cases required to test this workflow.
Cover all state transitions and minimize repeating the same state transitions.

----------
**EXPLANATION**

The question above is about **state transition testing**, a **black-box testing technique** which focuses on evaluating how a software changes when transitioning from one state to another in response to events.

There are **x** important steps to creating optimal State transition tests:

**_1 - Review the specifications/requirements -_** it will help you understand how the system is expected to behave.
**_2 - Identify system states, events, and transitions -_** Identify all the states the system can be in, the events that trigger them and the transitions that are supposed to occur once those events happen.
**_3 - Create state transition diagrams -_** They will provide a clear overview of the software expected behavior.
**_4 - Derive the test cases -_** Use the state transition diagrams to derive the necessary test cases.
**_5 - Execute and analyze the test results -_** Perform the test cases and record the actual system behavior, then compare the actual results with the expected results. Identify any discrepancies or unexpected behavior.Investigate failed test cases to determine the root cause of the issue.

----------
**ANSWER**

First, let's identify all the states and events/actions that cause the transitions:

**- State Transitions:** WORKING, CARD ACCEPTED, TRANSACTION PROCESSED, SELF TESTING, WAITING SERVICE, WAITING POLICE.

**- Actions** TURN ON, ACCEPT CARD, AUTOMATIC TESTING, CALL POLICE, PROCESS TRANSACTION, PULL CARD, PASS, FAIL, SERVICED, RETESTED.

Second, let's create the State Transition Diagram:

![workflow-diagram](https://github.com/user-attachments/assets/416efd5d-e848-4b5c-a502-3f4504520917)

(I created the diagram with Eraser.io, but you can use other diagram-making tools such as Draw.io or even Canva).

Third, let's define the test cases!

-------

## Defining Test Cases


Let's start by prioritizing the test cases. This is crucial in helping maximize the chances of identifying high-impact defects early in the development cycle.

**:bangbang: High Priority**
**_Test Case 1:_** Normal Operation and Maintenance: Covers core functionalities and system recovery.

**:heavy_exclamation_mark: Medium Priority**
**_Test Case 2:_** Error Handling: Addresses critical error scenarios and system resilience.

**:question_mark: Low Priority**
**_Test Case 3:_** Retest function: While important, this test case covers a subset of the first test case's functionality

Now let's build out the test cases considering the priority order.

>[!IMPORTANT]
> I found TWO WAYS to solve this issue:
> One compromises effectiveness to increase efficiency. The other compromises efficiency to increase effectiveness.
> I'll explain both ways here, but you should always consider what is more important for your organization.

## 01: Effectiveness Over Efficiency 

Before we move on, let's get one thing straight: in no way this is a sloppy test case. As you will see, the it's total score is 80%, because it achieves a 100% EFFECTIVENESS score, meaning it is 100% successful in finding bugs, even if there is a bit of overlap or redundancy in the sets.

### Test Case 1: Normal Operation and Maintenance

Objective: Verify normal ATM operation, maintenance, and recovery.
Steps:

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| ACCEPT CARD | CARD ACCEPTED |
| PROCESS TRANSACTION | TRANSACTION PROCESSED |
| PULL CARD | SELF TESTING |
| PASS | WORKING |
| AUTOMATIC TESTING | SELF TESTING |
| FAIL | WAITING SERVICE |
| SERVICED | WORKING |

### Test Case 2: Error Handling

Objective: Verify ATM behavior in case of a police call.

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| ACCEPT CARD | CARD ACCEPTED |
| CALL POLICE | WAITING POLICE |


### Test Case 3: Retest

Objective: Verify the retest process.

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| AUTOMATIC TESTING | SELF TESTING |
| FAIL | WAITING SERVICE |
| RETESTED | SELF TESTING |

Test suite effectiveness: 100%

Test suite efficiency: 80%

Overall score: 80%

The interesting thing though is that if we remove test cases 02 and 03, we also get 100% effectiveness and 80% efficiency. So the test would look like this:

### Test Case 1: Normal Operation and Maintenance

Objective: Verify normal ATM operation, maintenance, and recovery.
Steps:

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| ACCEPT CARD | CARD ACCEPTED |
| PROCESS TRANSACTION | TRANSACTION PROCESSED |
| PULL CARD | SELF TESTING |
| PASS | WORKING |
| AUTOMATIC TESTING | SELF TESTING |
| FAIL | WAITING SERVICE |
| SERVICED | WORKING |

----------
## 02: Efficiency Over Effectiveness

Here, to increase efficiency while keeping the effectiveness at an acceptable level, we can remove the third test case, which was low priority, and only stick to the first and second cases. 

### Test Case 1: Normal Operation and Maintenance

Objective: Verify normal ATM operation, maintenance, and recovery.
Steps:

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| ACCEPT CARD | CARD ACCEPTED |
| PROCESS TRANSACTION | TRANSACTION PROCESSED |
| PULL CARD | SELF TESTING |
| PASS | WORKING |
| AUTOMATIC TESTING | SELF TESTING |
| FAIL | WAITING SERVICE |
| SERVICED | WORKING |

### Test Case 2: Error Handling

Objective: Verify ATM behavior in case of a police call.

| ACTION | NEXT STATE |
|--------|------------|
| TURN ON | WORKING |
| ACCEPT CARD | CARD ACCEPTED |
| CALL POLICE | WAITING POLICE |

Test suite effectiveness: 90%

Test suite efficiency: 98%

Overall score: 88%
