# SLDC - TESTING & QA

_This document is for ***educational purposes*** only. I've included a login validation scenario for a fictional mobile banking app to keep the document simple, yet comprehensive._

   
## What is the Software Development Lifecycle (SDLC)?
SDLC is a process used to create software that meets the stakeholders' requirements cost-efficiently. It helps developers avoid rework by building software per the client's needs and receiving constant feedback.

## Testing & The Software Development Lifecycle
The below RUP diagram created by IBM shows that Testing & QA is present throughout the entire SDLC:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/1e9d2107-61f6-4e98-ad4f-14ecb8ef0fdf)

### Phase 01: Planning
This phase focuses on understanding the needs, defining the project scope, and creating a solid execution plan.

| EXAMPLE OF TESTING & QA ROLES IN PLANNING |
|-------------------------------------------|
| Identifying Potential Risks |
| Defining Testability | 
| Providing Input on Feasibility |


This is an example of a project called ZippyBank, where I assessed the potential risks, challenges, and improvements of the login requirements and included them as comments. 

Although there are several Software Requirements Specification templates online, I couldn't find a document where Testers and the QA team could include their feedback, so I created the template below. It can be adapted depending on the needs of the project/tester.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/e3b928e7-18c3-4144-ba42-525c5d5a2243)

### Phase 02: Design
The design phase is like laying out the blueprints for a building. Here, the development team translates the requirements into a technical roadmap for the software. 

| EXAMPLE OF TESTING & QA ROLES IN DESIGN |
|-----------------------------------------|
| Reviewing UI mockups |
| Analyzing dataflow diagrams | 
| Participating in design reviews |

Here's an example dataflow datagram for the ZippyBank app:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/c87702de-5c32-47e2-9320-df286e3038fc)

And an example of feedback provided to help make the data flow more comprehensible and avoid bottlenecks for the developers:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/bdb391ae-8cb4-4f0c-a3b8-909bdd8fe700)

Feedback during the design phase is essential to prevent developers from writing modules that don't work or don't work as they are supposed to. However, finding an online template was extremely challenging, so I created the one above.

### Phase 03: Development
This is where the code is written and the software is brought to life. Here, developers translate the blueprints created in the design phase into functional software.

| EXAMPLE OF TESTING & QA ROLES IN DEVELOPMENT |
|-----------------------------------------|
| Reviewing code |
| Test plan refinement | 
| Early usability testing collaboration |

The screenshot below is a sample of a test plan built for ZippyBank. Although the test plan is much more extensive, here will see just the Features to Be Tested, Features Not to Be Tested, Testing Approach, and Pass/Fail Criteria:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/9a136c98-186b-4438-a232-e67dda7ed25f)
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/0271136c-fe2e-4dd8-8a37-00c33baedd44)

Keep in mind that this is just a sample with features I selected based on the Banking apps I've used.

### Phase 04: Testing
The quality checkpoint. Here, the built software is meticulously examined to identify bugs, ensure functionality meets requirements, and guarantee a smooth user experience. This phase is where the test plan, refined during development, comes into action.

| EXAMPLE OF ACTIVITIES IN THE TESTING PHASE |
|-----------------------------------------|
| Writing and executing the pre-defined test cases |
| Bug reporting | 
| Test results analysis & reporting |

Below is a sample-sized Test Case example I created for the app's login function:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/8761f31a-511f-4fc0-b8fe-5fde9b52193d)

### Phase 05: Deployment
The finished software is released to its intended audience. Here, the focus is on getting the software up and running smoothly in its final environment. But QA's job isn't over yet! They play a crucial role in ensuring a successful deployment.

| EXAMPLE OF TESTING & QA ROLES IN DEPLOYMENT |
|-----------------------------------------|
| Deployment validation |
| Post-deployment testing | 
| Monitoring and supporting |

This is a deployment checklist I created to use during the deployment process to avoid pitfalls after not finding one. However, it is a general guide, and specific tasks may vary depending on the deployment approach and project needs.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/3b071824-5039-4c67-bb93-7e5c8ee5acda)

### Phase 06: Maintenance
Keeping the software up-to-date, functional, and secure after deployment is ongoing. Here, the QA's role shifts from deployment validation to ongoing monitoring and testing, ensuring the software's quality and user experience throughout its lifespan.

| EXAMPLE OF TESTING & QA ROLES IN DEPLOYMENT |
|-----------------------------------------|
| Regression testing |
| Defect management and verification | 
| Performance monitoring and optimization|

When it comes to performance monitoring and optimization, these are the KPIs I would focus on for ZippyBank's project (to start with - the list can change as the project evolves):

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/86686090-cc85-431f-ba33-90bb3d46c53f)

I created the template above to be as simple as possible so the entire team can understand what we're measuring. 

## Conclusion
Testing and QA play a vital role throughout the entire Software Development Lifecycle. From identifying risks in the planning phase to monitoring performance in maintenance, testers, and QA specialists ensure the software's quality, functionality, and user experience at every stage with a well-integrated testing strategy for a successful software development process.
