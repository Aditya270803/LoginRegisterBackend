# Deploy Spring Boot Backend on Render

## 1) Push backend code
Push this `reglog` backend folder to GitHub.

## 2) Create Web Service on Render
Use **Blueprint** (`render.yaml`) or create a **Web Service** manually.

- Build command: `./mvnw clean package -DskipTests`
- Start command: `java -jar target/reglog-0.0.1-SNAPSHOT.jar`

## 3) Set environment variables in Render

- `SPRING_DATASOURCE_URL`  
  Example: `jdbc:mysql://<host>:3306/<db_name>`
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `APP_CORS_ALLOWED_ORIGINS`  
  Example: `https://your-netlify-site.netlify.app`

Optional:
- `SPRING_JPA_HIBERNATE_DDL_AUTO=update`
- `SPRING_JPA_SHOW_SQL=false`

## 4) Update frontend env in Netlify

Set:
- `REACT_APP_API_BASE_URL=https://<your-render-service>.onrender.com`

Then redeploy frontend.
