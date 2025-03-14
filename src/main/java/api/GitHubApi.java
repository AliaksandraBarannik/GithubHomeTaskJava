package api;

public class GitHubApi {
//    public static void main(String[] args) {
//        // Define repository info and GitHub personal access token (PAT)
//        String username = "your-username";
//        String repoName = "your-repository";
//        String accessToken = "your-personal-access-token";
//        String filePath = "path/to/your/file.txt";
//
//        // Get the SHA of the current commit to use as a base for your commit
//        String latestCommitSha = getLatestCommitSha(username, repoName, accessToken);
//
//        // Create a new commit
//        commitFile(username, repoName, accessToken, filePath, latestCommitSha);
//    }
//
//    private static String getLatestCommitSha(String username, String repoName, String accessToken) {
//        Response response = RestAssured.given()
//                .auth().oauth2(accessToken)
//                .get("https://api.github.com/repos/" + username + "/" + repoName + "/git/refs/heads/main");
//
//        return response.jsonPath().getString("object.sha");
//    }
//
//    private static void commitFile(String username, String repoName, String accessToken, String filePath, String latestCommitSha) {
//        // Define commit message
//        String commitMessage = "Automated commit via GitHub API";
//
//        // Define file content (base64 encoded)
//        String fileContent = "This is a new line in the file".getBytes().toString();
//
//        // Create the commit JSON object
//        JSONObject commitObject = new JSONObject();
//        commitObject.put("message", commitMessage);
//        commitObject.put("parents", new String[]{latestCommitSha});
//        commitObject.put("tree", new JSONObject().put("path", filePath)
//                .put("mode", "100644")
//                .put("type", "blob")
//                .put("content", fileContent));
//
//        // Post the commit to the GitHub API
//        RestAssured.given()
//                .auth().oauth2(accessToken)
//                .body(commitObject.toString())
//                .post("https://api.github.com/repos/" + username + "/" + repoName + "/git/commits");
//
//        System.out.println("Commit created via API!");
//    }
}
