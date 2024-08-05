# Implement Testing Through the SDLC


_This document delineates the roles of testing and quality assurance (QA) within the software development lifecycle. The principles outlined herein apply regardless of whether testing is conducted by a dedicated team or an individual. To illustrate these concepts, the development of a fictional mobile banking application, ZippyBank, will be used as a case study._


| TABLE OF CONTENT |
|------------------|
|1. What's the Software Development Lifecycle (SDLC)?|
|2. Why Is the SDLC Choice Relevant to Testing? |
|3.Testing & The Software Development Lifecycle |
|4. Phases of the SDLC & Testing |
|5. Conclusion | 
|6. References |

# What is the Software Development Lifecycle (SDLC)?
SDLC is a process used to create software that meets the stakeholders' requirements cost-efficiently, avoiding rework and waste of resources.

Examples of the different SLDC models include:

|SEQUENTIAL MODELS | ITERATIVE MODELS | INCREMENTAL MODELS |
|------------------|------------------|--------------------|
| Waterfall | Spiral model | United Process |
| V-model | Prototyping | Feature-Driven Development (FDD) |

# Why is the SDLC Choice Relevant to Testing?

According to the [ISTQB Certified Tester - Foundation Level Syllabus - v4.0](https://istqb-main-web-prod.s3.amazonaws.com/media/documents/ISTQB_CTFL_Syllabus-v4.0.pdf), **testing must be adapted to the chosen SDLC process to succeed**. The SDLC method deeply impacts the scope and timing of testing activities.

The six core phases below form the foundation of various SDLC models, which are arranged differently to fit project needs.

# Testing & The Software Development Lifecycle

The below RUP(Rational Unified Process) diagram created by IBM shows that Testing & QA is present throughout the entire SDLC:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/1e9d2107-61f6-4e98-ad4f-14ecb8ef0fdf)

## Methodology

This document will employ a case study methodology to demonstrate the integration of testing and quality assurance (QA) throughout the software development lifecycle (SDLC). The fictional mobile banking application, ZippyBank, will serve as a case study. By examining the six phases of the SDLC through the lens of ZippyBank, including risk identification in the planning phase and checklist utilization for deployment validation, this document will illustrate how a robust testing strategy can contribute to software quality from inception to maintenance.

While the specific testing activities may vary based on the chosen SDLC model, this document will prioritize the adherence to testing best practices as outlined by the ISTQB rather than focusing on a particular SDLC framework:

>1. For every software development activity, there is a corresponding test activity, so that all development activities are subject to quality control;
>2. Different test levels have specific and different test objectives, which allows for testing to be appropriately comprehensive while avoiding redundancy;
>3. Test analysis and design for a given test level begins during the corresponding development phase of the SDLC so that testing can adhere to the principle of early testing;
>4. Testers are involved in reviewing work products as soon as drafts of this documentation are available so that this earlier testing and defect detection can support the shift-left strategy.

This way, the documentation and instruction can be adapted and applied through the different models.

# Phases of the SDLC & Testing

# Phase 01: Planning
Understanding the needs, defining the project scope, and creating a solid execution plan.

| TESTING & QA ROLE IN PLANNING |
|-------------------------------------------|
| Providing Feedback on Requirements |

The following template was designed to identify, assess, and document potential risks, challenges, and improvements related to login requirements. Comments within the template guide this process. This template fills a gap in existing SRS templates by providing a structure for tester and QA feedback and can be adapted for project-specific needs.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/e3b928e7-18c3-4144-ba42-525c5d5a2243)

# Phase 02: Design
Here, the development team translates the requirements into a technical roadmap for the software. 

| TESTING & QA ROLE IN DESIGN |
|-----------------------------------------|
| Reviewing the designs created by the development team to prevent them from writing modules that don't work or don't work as intended. |

Here's an example dataflow datagram for the ZippyBank app:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/c87702de-5c32-47e2-9320-df286e3038fc)

And an example of feedback provided to help make the data flow more comprehensible and avoid bottlenecks for the developers:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/bdb391ae-8cb4-4f0c-a3b8-909bdd8fe700)

Early testing and QA involvement in design are crucial to prevent module defects. Due to a lack of suitable templates, the aforementioned template was developed.

# Phase 03: Development
This is where the code is written and the software is brought to life.

| TESTING & QA ROLE IN DEVELOPMENT |
|-----------------------------------------|
| Reviewing code |
| Test plan refinement | 
| Early usability testing collaboration |

The following screenshot presents a partial view of the ZippyBank test plan, focusing on key sections: Features to be Tested, Features Not to be Tested, Testing Approach, and Pass/Fail Criteria:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/9a136c98-186b-4438-a232-e67dda7ed25f)
![image](https://github.com/amandaestevez/softwareqa/assets/123298275/0271136c-fe2e-4dd8-8a37-00c33baedd44)

# Phase 04: Testing
The built software is meticulously examined to identify bugs, ensure functionality meets requirements, and guarantee a smooth user experience. This phase is where the test plan, refined during development, comes into action.

| EXAMPLE OF ACTIVITIES IN THE TESTING PHASE |
|-----------------------------------------|
| Writing and executing the pre-defined test cases |
| Bug reporting | 
| Test results analysis & reporting |

Below is a sample-sized Test Case example for the ZippyBank's login function:

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/91b1417d-aee3-4a4f-a47e-0534bcbee6a3)

# Phase 05: Deployment
The focus is on getting the software up and running smoothly in its final environment and the QA helps ensure a successful deployment.

| EXAMPLE OF TESTING & QA ROLES IN DEPLOYMENT |
|-----------------------------------------|
| Deployment validation |
| Post-deployment testing | 
| Monitoring and supporting |

A deployment checklist could mitigate common deployment issues due to the absence of existing resources. This checklist provides a general framework and may require adaptation based on specific deployment methodologies and project requirements.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/3b071824-5039-4c67-bb93-7e5c8ee5acda)

# Phase 06: Maintenance

The QA's role shifts from deployment validation to ongoing monitoring and testing, ensuring the software's quality and user experience throughout its lifespan.

| EXAMPLE OF TESTING & QA ROLES IN DEPLOYMENT |
|-----------------------------------------|
| Regression testing |
| Defect management and verification | 
| Performance monitoring and optimization|

Initial key performance indicators (KPIs) for performance monitoring and optimization of the ZippyBank project are presented below. This list is subject to modification as the project progresses.

![image](https://github.com/amandaestevez/softwareqa/assets/123298275/86686090-cc85-431f-ba33-90bb3d46c53f)

The template is designed for easy understanding by the entire team.

# Conclusion

Testing and quality assurance (QA) are integral to the software development lifecycle. A well-integrated testing strategy executed by QA specialists ensures software quality, functionality, and user experience throughout development.

The subsequent section delves into test case anatomy, providing a detailed examination of test case design for the ZippyBank application.

![diagram-export-10-06-2024-05_41_59](https://github.com/amandaestevez/softwareqa/assets/123298275/c80bfe96-78f1-4318-ad11-1de18742dd76)

## References
- Cerquozzi, R., Decoutere, W., Dussa-Zieger, K., Riverin, J.-F., Hryszko, A., Klonk, M., Pilaeten, M., Posthuma, M., Reid, S., Riou du Cosquer, E. (chair), Roman, A., Stapp, L., Ulrich, S. (vice chair), & Zakaria, E. (2024). [ISTQB Certified Tester - Foundation Level Syllabus - v4.0. ISTQB.](https://istqb-main-web-prod.s3.amazonaws.com/media/documents/ISTQB_CTFL_Syllabus-v4.0.pdf);
