# SLDC - TESTING & QA

_This document is for ***educational purposes*** only. I've included a login validation scenario for a mobile banking app to keep the document simple, yet comprehensive._

   
## What is the Software Development Lifecycle (SDLC)?
SDLC is a process used to create software that meets the stakeholders' requirements cost-efficiently. It helps developers avoid rework by building software as per the client's needs and receiving constant feedback.

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


This is an example of a project called ZippyBank, where I assessed the potential risks, challenges, and improvements of the login requirements and included them as comments. I created the template, but it can be adapted depending on the needs of the project/tester.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/e3b928e7-18c3-4144-ba42-525c5d5a2243)

### Phase 02: Design
The design phase is like laying out the blueprints for a building. Here, the development team translates the requirements into a technical roadmap for the software. 

| EXAMPLE OF TESTING & QA ROLES IN DESIGN |
|-----------------------------------------|
| Reviewing UI mockups |
| Analyzing dataflow diagrams | 
| Participating in design reviews |


Here's an example dataflow datagram for the ZippyBank app:

```mermaid
graph LR
A[User Interface] --> B{Enter Username}
B --> C{Validate Username with Account Database}
C -->|Valid Username| D[Generate Session Token]
C -->|Invalid Username| E{Display Error Message}
D --> F[Store Session Token in Cookie]
F --> G[Grant Access to Account]
A --> B{Enter Password}
B --> C{Validate Password with Account Database}
C -->|Valid Password| D
C -->|Invalid Password| E
```

And an example of feedback provided to help make the data flow more comprehensible and avoid bottlenecks for the developers:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/bdb391ae-8cb4-4f0c-a3b8-909bdd8fe700)




