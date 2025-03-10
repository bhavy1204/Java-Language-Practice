// public class Inheritance {
//     public static void main(String[] args) {
//         Child c1 = new Child(20);
//         System.out.println(c1.parentData);

//         Child c2 = new Child(c1);
//         System.out.println(c2.parentData);

//         Parent p = new Parent(c1);
//         System.out.println(p.parentData);

//         System.out.println("-------------------- Child accessing parent data --------------");
//         c1.showParentData();
//     }
// }

// // Singe level : - Parent -> Child
// class Parent {
//     int parentData = 10;
//     public int publicData = 10;
//     private int privateData = 10;
//     protected int protectedData = 10;

//     Parent() {
//         System.out.println("Parent's deafult constructor");
//         System.out.println("Parent Private data : "+ this.privateData);
//     }

//     Parent(int a) {
//         System.out.println("Parent's parameterized constructor");
//         this.parentData = a;
//     }

//     Parent(Child c) {
//         System.out.println("Parent's child copy parameterized constructor");
//         this.parentData = c.parentData;
//     }
// }

// // class Child extends Parent {
// //     int childData = 20;
// //     public int childPublicData = 10;
// //     private int childPrivateData = 10;
// //     protected int childProtectedData = 10;

// //     Child() {
// //         System.out.println("Child's deafult constructor");
// //         System.out.println("Child Private data : "+ this.childPrivateData);
// //     }

// //     Child(int a) {
// //         System.out.println("Child's parameterized constructor");
// //         this.parentData = a;
// //     }

// //     Child(Child c) {
// //         System.out.println("Child's copy constructor");
// //         this.parentData = c.parentData;
// //     }

// //     public void showParentData() {
// //         System.out.println("protected : " + protectedData);
// //         System.out.println("deafult : " + parentData);
// //         System.out.println("public : " + publicData);
// //         // System.out.println("private : " + privateData); //Will throw error
// //     }
// // }

// //
