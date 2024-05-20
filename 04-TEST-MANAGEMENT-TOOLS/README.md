# Using Jira for Test Management

_This description uses **team-managed project**._

## Setting Up Xray

1. Install [X-ray](https://marketplace.atlassian.com/apps/1211769/xray-test-management-for-jira?tab=overview&hosting=cloud) in your Jira instance.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/6a1315c1-3c5d-4cd2-bd81-1dcc931a20d2)

2. Click on "Get Started".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/cb09e8c5-f694-4b82-97c6-ba43e343a508)

3. Click "Configure Project" and select the project you want to use:
   
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/4349f9d2-6b74-43f5-8ba8-32d9ed0a58d6)

4. In your project menu, click "Add view", then select "More views":
   
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/503fff67-a3a4-4a24-aa0d-3e8d75e842bc)

5. Another screen will open. Select "Issue Types" on the menu on the left:
    
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/ea9e0dda-eb27-40a5-bb89-7a47ec49a78a)

6. Click "Add issue type":
    
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/d4e7aae8-df25-4305-87cb-86a2b43ec52c)

7. A pop-up will appear. Select "Create issue type" on the lower left:
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/3af2f445-09e5-4d43-bfd6-9acf3cad7abe)

8. Specify a name, description, and icon for the new issue type - you can choose the same issue type names as the default global Xray issue types: Test, Precondition, Test Set, Test Plan, and Test Execution. You can also select an icon for each issue.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/498d7a13-f3e7-4b86-b8fe-8093aacaf86f)

9. Click on "Apps" on the top menu and select "Xray" to go back to its settings.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/7a415128-530e-4b03-9a6b-5d0d0f519cf2)

10. In the Xray settings, go to "Issue Types Mapping" and connect the issue types you just created with Xray entities. Click "Save".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/55dd9d3f-5f22-429a-8515-c1cd14c2ab95)

11. Select "Test Coverage" on the left panel. Drag the testable items you want from "Available" to "Coverable" and click "Save".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/5ed1a859-fa90-43bb-b553-8deff07373db)

12. Move to "Defect Mapping" and define the covered Issue Types. Click "Save".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/12bfe3da-4f48-4d8b-8134-7b0ea8176644)

Now you are done with setting up Xray! Let's move on to creating and managing the test cases!

## Creating Test Cases in Jira With Xray

1. Click "Create" on the top menu to create a new issue.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/515e20a5-924e-421a-8e6d-6db14ecbb14c)

2. A pop-up will appear. Select the desired project and set the issue type to "Test".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/6ced77e5-52c0-4345-8ae2-05e4ad1a31af)

3. Scroll down and fill out at least the required fields. Click "Create".
   
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/dd05ec84-f945-4ac1-b0ed-4661835cc92c)

4. On your board, click on the test case you just created. A pop-up will open.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/755cee2e-6710-42c4-9d24-8d8380b4e5fa)

5. In "Test Type", select the type of test you want to run (Available tests: Manual, Cucumber, Generic).
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/0991d720-e5af-4e7f-b837-68c044ff5a23)

**Manual -** ordered list of steps

**Cucumber -** Gherkin tests (BDD - Behavior-Driven Development). Automated, but can also be run manually on Jira.

**Generic -** Unstructured

### Option 01: Manual Tests

1. To create a manual test case, select "Manual", click "Add Step" and select "New Step".
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/98a22286-496d-4098-ab9f-775342c1b5d9)

2. Fill out the screen below with the first step of the manual test. Click "Create".
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/09868b3b-42f7-4d9f-bc05-92fd112b87fe)

3. Add all the remaining test steps by clicking "New Step" below the most recent step you added.
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/3dc2fdba-5fd9-4a9f-824e-c9c798abd857)Cucum

_Your test case will look like this as you add the steps:_
_![image](https://github.com/amandaestevez/softwareqa/assets/123298275/e3bfbfc5-0308-45b5-9e22-577586042253)

**Optional:**

You can also import steps from JSON, CSV, clipboard, or another test case.
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/e02bd580-7f7f-4d4d-9197-4a833c95e3b5)

### 0ption 02: Cucumber/Gherkin (BDD) Tests

1. To create a Cucumber test, select "Cucumber" from the Test Types dropdown menu:
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/dd5e4795-dab9-4417-823c-e1ab90f9f11f)

2. Add a Scenario for the test and provide the test steps in Gherkin language:
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/582f1d86-b7d1-4481-9903-2fcb79b52461)

The test case above is the same one we created in the Manual Tests section but in Gherkin.

### Option 03: Generic/Unstructured Tests

1. To create a Generic test, select "Generic" from the Test Types dropdown menu:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/fd745f3c-57bd-47a5-b6c0-ee3cf5a06be6)

2. Click "Click to add the test definition".

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/84f688fd-5fdb-47f3-9bb0-b876b94e1456)

3.  Add the desired definition to the test case.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/59f2c908-b88f-4ed0-9b47-28de68f4f180)

## Managing Test Cases in Jira With Xray

Xray allows the creation of test repositories to organize test cases. The test repository is a tree-like organizational structure at the project level. It allows you to hierarchically organize tests within folders and sub-folders. 

### Creating Test Repositories

1. On the left menu, scroll down and select "Testing Board".
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/656472e1-df7b-4686-83be-0cc498b79db8)

2. Click on "Test Repository".
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/3a461d9a-a94f-40bc-82eb-1842070d156a)

3. Click on the "+" button to create a new sub-repository.
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/cf0f5ee5-ef56-441b-9bf7-42e1b98fac54)

4. Add a name for your folder.
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/151fd5f5-d297-4375-bbce-852b519f43e1)

5. Drag and drop the tests you created or create new ones.

## Creating Test Plans

1. In the Testing Board section, open the menu and select "Test Plans".
2. Click "Create" and fill out the test plan.
3. Click on your issue ID (i.e. AB-12) and add the tests to your test plan.
4. There you can get an overview of your test plan status and make edits.

## Executing Tests 
1. Inside the Test Plan created, select "Create Test Execution".
2. Select the Test Execution created and click the "Play" button.



## Sources:
- [How to create and manage test cases with Xray and Jira](https://www.atlassian.com/devops/testing-tutorials/jira-xray-integration-manage-test-cases)
- [Xray Documentation](https://docs.getxray.app/display/XRAY/Test)
- [Xray Steps (Manual Tests)](https://docs.getxray.app/pages/viewpage.action?pageId=62267955#Steps(ManualTests)-DefiningTestSteps)
- [Xray Gherkin (BDD Tests)](https://docs.getxray.app/pages/viewpage.action?pageId=62268093)
- [Gherkin Syntax](https://cucumber.io/docs/gherkin/)
- [Xray Unstructured (Generic) Tests](https://docs.getxray.app/pages/viewpage.action?pageId=62268044)
