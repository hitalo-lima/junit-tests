## Snippet: `test BDD`

### Explanation

Type `test BDD` and press `CTRL + Space` to insert a JUnit 5 test method using the BDD structure (Given-When-Then), based on the [BDD unit test structure](https://medium.com/@elisabethmamede/bdd-e-teste-de-software-a708df3502e).

### Generated code

```java
@Test
@DisplayName("Test description")
void testABC_When_XYZ_Should() {
		// Given / Arrange
		// When / Act
		// Then / Assert
}
```

### As defined in `java.json`

```json
"JUnit5 Test Method": {
	"prefix": "test BDD",
	"body": [
		"@Test",
		"@DisplayName(\"${1:Test description}\")",
		"void ${2:testName}_When_${3:condition}_Should_${4:expectation}() {",
		"\t// Given / Arrange",
		"\t$5",
		"\t",
		"\t// When / Act",
		"\t$6",
		"\t",
		"\t// Then / Assert",
		"\t$0",
		"}"
	],
	"description": "JUnit5 test method with Given-When-Then structure"
}
```
