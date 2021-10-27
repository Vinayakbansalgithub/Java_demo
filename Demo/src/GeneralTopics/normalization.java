package GeneralTopics;

public class normalization {

}
//1st Normal Form (1NF)
//
//In this Normal Form, we tackle the problem of atomicity. Here atomicity means values in the table should not be further divided. In simple terms, a single cell cannot hold multiple values. If a table contains a composite or multi-valued attribute, it violates the First Normal Form.  
//
//1NF_table - Normalization in SQL -Edureka
//
//In the above table, we can clearly see that the Phone Number column has two values. Thus it violated the 1st NF. Now if we apply the 1st NF to the above table we get the below table as the result.
//
//1NF_table_example - Normalization in SQL -Edureka
//
//By this, we have achieved atomicity and also each and every column have unique values.
//2nd Normal Form (2NF)
//
//The first condition in the 2nd NF is that the table has to be in 1st NF. The table also should not contain partial dependency. Here partial dependency means the proper subset of candidate key determines a non-prime attribute. To understand in a better way lets look at the below example.
//
//Consider the table 
//
//2nf - normalization in sql - Edureka
//Course Curriculum
//MySQL DBA Certification Training
//
//This table has a composite primary key Emplyoee ID, Department ID. The non-key attribute is Office Location. In this case, Office Location only depends on Department ID, which is only part of the primary key. Therefore, this table does not satisfy the second Normal Form.
//
//To bring this table to Second Normal Form, we need to break the table into two parts. Which will give us the below tables:
//
//2nf_tab1 - normalization in sql - edureka 2nf_tab2 - normalization in sql - edureka
//
// 
//
// 
//
// 
//
// 
//
// 
//
// 
//
//As you can see we have removed the partial functional dependency that we initially had. Now, in the table, the column Office Location is fully dependent on the primary key of that table, which is Department ID.
//
//Now that we have learnt 1st and 2nd normal forms lets head to the next part of this Normalization in SQL article.
//3rd Normal Form (3NF)
//
//The same rule applies as before i.e, the table has to be in 2NF before proceeding to 3NF. The other condition is there should be no transitive dependency for non-prime attributes. That means non-prime attributes (which doesn’t form a candidate key) should not be dependent on other non-prime attributes in a given table. So a transitive dependency is a functional dependency in which X → Z (X determines Z) indirectly, by virtue of X → Y and Y → Z (where it is not the case that Y → X)
//
//Let’s understand this more clearly with the help of an example:
//
//3nf - normalization in sql - edureka
//
//In the above table, Student ID determines Subject ID, and Subject ID determines Subject. Therefore, Student ID determines Subject via Subject ID. This implies that we have a transitive functional dependency, and this structure does not satisfy the third normal form.
//
