# AI Learning Assistant (Java + Spring Boot + Multi-Agent + RAG)

## Features
- Multi-agent AI system
- Tutor (LLM)
- Knowledge gap detection
- Personalized learning path
- RAG (Vector search)

## Tech
- Java Spring Boot
- Spring AI
- OpenAI
- Vector DB

## Run
This project uses Maven. If PowerShell shows `mvn : The term 'mvn' is not recognized`,
Maven is either not installed or its `bin` directory is not available on your `PATH`.

### Windows setup
1. Install JDK 17.
2. Check whether Maven is already installed:
   ```powershell
   Get-ChildItem "C:\Program Files\Apache\Maven" -Recurse -Filter mvn.cmd
   ```
3. If Maven is installed but `mvn -version` fails, add Maven's `bin` directory to your user `PATH`.
   For example:
   ```powershell
   setx PATH "$env:PATH;C:\Program Files\Apache\Maven\apache-maven-3.9.16\bin"
   ```
4. Close and reopen PowerShell so the updated `PATH` is loaded.
5. Verify Maven is available:
   ```powershell
   mvn -version
   ```
6. Run the application from the project root:
   ```powershell
   mvn spring-boot:run
   ```

If Maven is not installed, install it from the official Maven binary ZIP and add the extracted
`bin` folder to `PATH`. Some Windows package sources may not provide an `Apache.Maven` winget package.

You can also run Maven once by using the full path:
   ```powershell
   & "C:\Program Files\Apache\Maven\apache-maven-3.9.16\bin\mvn.cmd" spring-boot:run
   ```

### Frontend
After starting the application, open your browser at:

```text
http://localhost:8080/
```

The application serves a simple web UI from `src/main/resources/static` that sends requests to the tutor API at `/api/tutor/ask`.

### IntelliJ IDEA
You can also run the project with IntelliJ's bundled Maven support:
open `pom.xml`, import it as a Maven project, then run the Spring Boot application.
