## The Anatomy of a Test Case

## Abstract

Inconsistent test case formats can hinder software development. This document outlines a well-defined, standardized test case structure based on established best practices. It details the core components of a test case, like test case ID, description, and pass/fail criteria. By adopting this standardized approach, projects can benefit from improved clarity, increased efficiency in test creation and execution, reduced errors due to clear pass/fail criteria, and streamlined traceability for defect tracking.

|TABLE OF CONTENT | THE ANATOMY OF A TEST CASE |
|-----------------|----------------------------|
| 1. | [What's a Test Case?](Standardized Test Case Structure for Enhanced Software Quality) |
| 2. | Why Are Test Cases Important? |
| 3. | Methodology |
| 4. | Standardized Test Case Structure for Enhanced Software Quality |

## What's a Test Case?
A test case is a set of instructions that checks if *software works as planned*, with specific steps, inputs, and expected results.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/6b31b196-8028-4603-8ff1-afb3145fff9c)

The image above shows the test case structure we will detail in the following paragraphs.

## Why Are Test Cases Important?
Test cases act as a safety net in software development. By planning tests, ***we can identify issues early on, saving time and money compared to fixing bugs after release***. They ensure the software works as intended, preventing frustrating crashes and glitches for users.

Well-defined test cases are the cornerstone of robust software testing within the Software Development Lifecycle (SDLC).  A consistent test case structure streamlines the testing process, promotes clarity for all stakeholders, and enhances software quality. 

## Methodology:

This document establishes a standardized structure for test case development within this project. This approach fosters clear, concise, and efficient testing practices, ultimately contributing to delivering high-quality software. 

We will use the example of a test case written for a fictional mobile banking app called *ZippyBank* to illustrate each test case component.

## Standardized Test Case Structure for Enhanced Software Quality
It is a good practice that test cases follow the structure below, creating a well-defined format that facilitates efficient test creation, execution, and management:

* **Test Case ID:**  A unique identifier assigned to each test case for easy reference and traceability within the testing process. 

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/4554f43a-57a1-4e71-b504-2ed0a3ea0d34)

 It simplifies test organization and retrieval, allowing testers to quickly locate specific test cases during execution or reporting phases.

* **Test Case Description:**  A clear and concise description of the functionality or scenario being tested.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/fb0f28f6-f4ce-4acd-bb25-f8bd0c8c2c29)

This description should be crafted for comprehension by both technical and non-technical stakeholders.

* **Dependencies:** External factors that rely on _the successful execution of other test cases_ before the current test case can be run.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/9cb2ed53-c597-4a6d-adcb-140e87b59304)

For the fictional example of ZippyBank, the selected dependency ensures a valid user account exists in the system before attempting the login functionality. Since the login test relies on a user account being created, the registration test case (TC-REG-001) needs to be executed successfully first, creating the necessary pre-condition (user account) for the login test to function properly.

* **Pre-Conditions:**  Specific conditions _within the testing environment_ that must be met before running a test case. This may include system configurations, specific data setup requirements, or user permissions necessary for test execution.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/b2a6be98-b6f3-419d-96f7-4e6500fedbbe)

Documenting pre-conditions eliminates ambiguity and ensures a consistent testing environment for all test cases. 

* **Test Data:** Specific input values used to execute and verify the expected results of a test case.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/9d3756c1-32ff-4fed-ab6d-a231806b5f35)

In ZippyBank's test case, we selected the username and the password as test data, since we're testing the login function.

* **Test Scenario:** Sets the stage for the test case by describing the broader functionality or user story being tested.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/cd82bd4f-b410-482d-8693-4c5525edac85)

This minimizes the risk of testers focusing on irrelevant details or missing the core objective.

* **Test Steps:**  A numbered sequence outlining the actions the tester should perform to execute the test.  Each step should be clear, concise, and actionable, ensuring unambiguous execution.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/8c7c12b3-6779-44c6-833b-367c24ba96f3)

Numbered steps promote a structured testing approach, minimizing the risk of missed steps or errors during test execution.

* **Expected Results:**  A clear description of the anticipated outcome for each test step. This defines the expected system behavior under normal conditions, providing a benchmark for evaluating test results.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/7ae20378-67c6-4c6e-bb24-3a056580403a)

Clear expected results eliminate subjectivity and ensure testers evaluate the system against a defined standard.

* **Actual Results:** The tester's observations during test execution, compared against expected results.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/86a5aaa9-41d0-49d7-9c0d-8af00585db64)

The Actual Results determine pass/fail and identify potential defects.

* **Pass/Fail Criteria:**  Specific criteria defining whether the test case has passed or failed.  This section ensures objective evaluation of test results, minimizing subjective interpretations and fostering consistent testing execution.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/15b85ca9-d067-4bfa-a74d-c889803e3ff4)

Clearly defined pass/fail criteria streamline testing and expedite defect identification.  

>[!IMPORTANT]
>
>**Expected Results vs. Pass/Fail Criteria:**
>
>**Expected Results:** This section describes the anticipated outcome for each test step, focusing on the system's behavior under normal conditions. It paints a picture of what the tester should see on the screen.
>
>**Pass/Fail Criteria:** This section defines the specific conditions that determine whether the test case has passed or failed. _It goes beyond just describing the expected outcome and sets a clear benchmark for evaluating the actual results._

* **Pass/Fail/Not Executed/Suspended:** The current state of the test case.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/bfe1ffe3-ff00-4d2b-8e07-3c05382ccf21)

Here, testers define whether the test passed or failed according to the expected results and the Pass/Fail criteria.

* **Post-Conditions:**  Any actions required after completing the test case, such as data cleanup or system reset. 

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/c90942d0-a8a1-47d2-8610-eaf2d76ec52b)

Specifying post-conditions ensures the testing environment is maintained clean for subsequent test case execution. 

* **Additional Information (Optional):**  This section can include relevant details such as:

    * **Severity:**  Classification of the defect identified through the test case (High, Medium, Low).  Severity helps prioritize bug fixes based on potential impact. It can be included as a separate section in the test case. However, the best practice is to report it in a separate defect tracking system.

    * **Priority:**  Prioritization of the test case for execution (High, Medium, Low).  Prioritization guides testing efforts, ensuring critical functionalities are tested first.
  
    ![image](https://github.com/amandaestevez/softwareqa/assets/123298275/20200b3a-7f76-4fe1-87fc-16880f5c0d6c)

    * **Traceability:**  Links to specific requirements documents for comprehensive traceability.
      
      ![image](https://github.com/amandaestevez/softwareqa/assets/123298275/dc74b03d-20a7-467f-966c-9474ab492334)

      Traceability ensures that all project requirements are thoroughly tested, minimizing the risk of defects slipping into production.

## Conclusion

This project establishes a robust foundation for efficient and effective software testing by adhering to a standardized test case structure.  This well-defined approach fosters clear communication, enhances testing efficiency, minimizes errors, and streamlines traceability throughout the development lifecycle. A standardized test case structure is pivotal in delivering high-quality software that meets user expectations and business requirements.
