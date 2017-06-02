# Junit 5 in Action – PalindromeHero
1.	isPalindrome()

    a) Write two simple tests, one that checks for a valid palindrome and another one that checks for an invalid palindrome.
    
    b) Run the tests. One test should fail.
    
    c) Add an error message to your failing test, e.g. `“isPalindrome should return 'true'."`.
    
    d) Implement isPalindrome with the following rules:

     - If input is `null`, return `false`
     -	If input is empty, return `true`
     -	For any other input return `true` if input equals the reverse of the input, `false` otherwise
        
    e) Tests should now be green
    
    f) Congratulations, you have successfully mastered Test Driven Development :relaxed:

---

2.	isPalindromeIgnoreCase()

    a)	Add another test to check for a valid palindrome with a capitalized starting letter. This time make use of `lambda functions` for your test.
    
    b)	Implement `isPalindromeIgnoreCase` and make the test satisfy
    
    c)	You are now skilled enough to start blog-posting about your nasty TDD skills!

---

3.	@BeforeEach

    a)	You should now have 3 tests in your Testclass. Make use of `@BeforeEach` to initialize a new instance of `PalindromeHero` to simplify your code.

---

4.	Look at your performance
    a)	Junit tests should be really fast. Let’s count the time your tests will need to run. Make use of `@BeforeAll` and `@AfterAll` and print the result to the console.
    
    b)	Next, add another test, which tests for a valid palindrome. Repeat the test 10 times. Make use of `@RepeatedTest`
    
    c)	You should be really impressed by your insanely fast Unit tests. Their word throughput is faster than any rapper performance (even Eminem’s)
    
---

5.	TestFactory/DynamicTests (aka shit just got real)

    a)	Read the file `palindrome.txt`. Do this during the `@BeforeAll` method implemented earlier.
    
    b)	Add a method to your Testclass annotated with `@TestFactory` and the return type `List<DynamicTest>`.
    
    c)	Each line of the text file is formatted like this: `{text}SPACE{expected}`.
    
    d)	For each line create a DynamicTest using `DynamicTest.dynamicTest(displayName, executable)`. Use `{text}` for displayName and test `{text}` against `{expected}` using `isPalindrome()`.
    
    e)	Return a list of DynamicTests.
    
    f)	Run the Testclass. Junit 5 manages the rest for. At runtime it’ll generate tests dynamically, depending on your content in `palindrome.txt`. The tests will display nicely in your test report.
    
    g)	Try adding entries to the textfile and rerun the Testclass. The new entries should generate new Tests.
    
    h)	Now you know how to pick up girls. Just show them your big TestFactory ( ͡° ͜ʖ ͡°)

---

6.	Behavior Driven Development with @Nested

    a.	Implement `generatePalindrome()` with the following rules:
    
       -	If `length < 1` throw an `IllegalArgumentException`
       -	For any other length, generate a valid palindrome with the given length using lower case alphabet `[a-z]` only.
       
    b.	Did you notice something? You just wrote the code before writing tests. FeelsBadMan. But don’t worry. This way you have a better understanding of what you need to test.
    
    c.	Use this description to structure your Behavior Driven Tests. Make use of `@Nested`, `@DisplayName` and `@Test`.
    
      ```
      testGeneratePalindrome
        when length is < 1
          throws exception
        when length is even
          returns a String of input length
          returns a valid palindrome
        when length is odd
          returns a String of input length
          returns a valid palindrome
      ```

    d.	You can also print the generated palindromes to the console.

---

<img src="https://vignette3.wikia.nocookie.net/spongebob/images/9/95/Meuterei.jpg" width="250">

 
