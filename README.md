# Deli-cious Sandwich Shopp App

## A CLI Application allows Customers to place a Food Order and after prints a receipt with their Custom Order and the Total.

## 🥪 About the Project
This project is the point of sales application for DELI-cious, a custom sandwich shop. 
Currently at DELI-cious our customers can fully customize their sandwich orders.
Until recently they have been managing all orders in person and are currently taking all orders on paper.
But their business is growing, and they need a way to automate the order process (and eventually even make it available online).
This application I made should take full advantage of Object Oriented Analysis and Design.
In other words, I am going to make use of OOP concepts throughout this process.

 ## Challenges & Reflections
 During the development of this application I have had the most hardships I have ever experienced in the program thus far. I started this application later than a lot of my colleagues
 because it took me significantly longer to finish the UML diagram which is a requirement to even start making the program. Even faced with this circumstance I made the decision to not allow for this situation to cut me down. 
 Instead I made the decision to press forward and do everything I could to get the best grade possible on this Capstone. My goal was a simple one. 
 
 To pass this Capstone like the last one despite the challenges.
 I will show myself that when faced with unforeseen circumstances that I can still find success, even greater than the success I have already accomplished.
 This application is birthed from my perseverance, grit, long sleepless nights, and personal dedication to deliver excellent results/work.
 I hope you enjoy it and this inspires you to see that you can always overcome your challenges and do the same.

 ## Class Diagram
 ![image](https://github.com/user-attachments/assets/bd14f2da-6e1c-4a7d-8ba1-dbb576e295ed)


## User Stories (Generated)
Throughout the development of this application, these User Stories played a role in shaping my process and decisions. 
They served as a roadmap, helping me stay focused on creating features that would truly meet the store's and user's needs. 
Each story has details for how I wanted to build an application intuitive, functional, and user-friendly. 
I'm excited to share how these User Stories guided the evolution of the application and brought the vision to life!

🥪 1. As a customer, I want to choose my sandwich size so that I can get the right amount of food.
- Define size options (4", 8", 12")
- Create a Sandwich class with a size field
- Prompt user for sandwich size during sandwich creation
- Validate the size input

🍞 2. As a customer, I want to select a bread type so that I can enjoy the sandwich base I prefer.
- Define valid bread types (white, wheat, rye, wrap)
- Add a breadType field to Sandwich class
- Prompt user to select from available bread types
- Validate and set bread type in the sandwich object

🧀 3. As a customer, I want to choose toppings (regular and premium) so that my sandwich is fully customized.
- Create a list of available toppings (separated as regular vs premium)
- Allow user to choose multiple toppings
- Track whether a topping is selected as “extra”
- Add method to calculate premium charges
- Update Sandwich to store selected toppings
      
🔥 4. As a customer, I want to choose whether to toast my sandwich so I can get it warm and crispy.
- Add a boolean field isToasted to Sandwich
- Prompt user: “Would you like your sandwich toasted?”
- Store the result in the sandwich object
    
🧾 5. As a customer, I want to place an order with multiple sandwiches so I can order for myself or others.
- Create Order class with a list of Sandwich objects
- Allow user to add multiple sandwiches to a single order
- Loop the sandwich creation steps for each new sandwich
      
💵 6. As a customer, I want to see a final receipt that shows my sandwich details and total cost, including extra charges.
- Implement a method in Order to calculate total price
- Include premium topping charges and size-based pricing
- Format the output with sandwich details and total
- Print the receipt when the user finishes the order


## Setup (Generated)
Instructions on how to set up and run the project using IntelliJ IDEA.
1. Open IntelliJ IDEA
   Launch IntelliJ.
On the welcome screen, click "New Project" or "Open" if you already have the folder.
2. Create or Open a Java Project
   If creating new:
Choose "Java".
Make sure SDK is selected (download one if not).
Click Next > Finish.
If opening an existing project:
Go to File > Open and select your project folder.
3. Add a New Java Class (if needed)
   Right-click src > New > Java Class
Name it Main (or your preferred name).
4. Write or Paste Your Code
   Paste your public static void main(String[] args) method in the class.
5. Run the Program
   Click the green ▶ Run button near your main() method, or
Right-click the file > Run 'Main.main()'

### Prerequisites
- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used

- Java 17 Maven.

## Demo
![image](https://github.com/user-attachments/assets/0ef7b66d-014b-4dd3-bf2e-c6d63daa66b4)
![image](https://github.com/user-attachments/assets/020c1cd4-1675-4bc9-927e-b71d8009088e)
![image](https://github.com/user-attachments/assets/3c932d69-6719-4b96-9c94-08d4d11830a5)




## Future Work
- Editing Receipt to Show Quantities of Orders
- Add Signature Sandwiches/ Combos that the User can Select
- Saving Customer's Name and Printing it on the Receipt


- [ChatGPT](https://chatgpt.com/)
- [Raymond's Potato Sensei](https://chatgpt.com/g/g-681d378b0c90819197b16e49abe384ec-potato-sensei)
- 
## Team Members

- **Jacob Nealy** - Solo Developer (Future DevOps Engineer)

## Thanks

Shout Out to my Potato Instructor Raymond Mourn for his french fry guidance
Shout Out to Potato Sensei AI for all the Tips and Advice
Shout Out to Walter Donnellan (My Tutor) for sacrificing his lunch breaks and extra time to tutor me
Shoutout Out to Tiffany Obi for being the realest Tutor out there! 

- A special thanks to all classmates for their encouragement.
- Adam Jessie for the Idea of diplaying Options in Capstone 1 (completely stole that idea this time around)
- #FullStackFryers
- #SigmaData
