public class Basic extends TestBase{
    //The simplest case of Rest-Assured Usage: simple get and status code verification
    //  @Test
    public void shouldFetchListOfAllUsers() {
        REQUEST.get("/users")
                .then()
                .statusCode(200);
    }
}
