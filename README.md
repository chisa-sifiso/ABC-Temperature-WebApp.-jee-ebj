
<body>
    <h1>ABC Temperature Monitoring WebApp</h1>
    
  <p>
        This project is a web application developed for monitoring employee temperature readings. It uses a Java EE (Jakarta EE) architecture and is deployed on a GlassFish server. The application follows the MVC architecture, and business logic is handled using Enterprise JavaBeans (EJB).
    </p>

  <h2>Technologies Used</h2>
  <ul>
      <li><strong>Java EE (Jakarta EE)</strong> - The core technology used to develop the web application.</li>
      <li><strong>GlassFish Server</strong> - The application is deployed on GlassFish and packaged as a WAR (Web Application Archive) file.</li>
      <li><strong>Enterprise JavaBeans (EJB)</strong> - EJBs are used to manage business logic such as counting employee temperature readings.</li>
      <li><strong>JSP and Servlets</strong> - Used for rendering dynamic web pages and handling HTTP requests.</li>
      <li><strong>HTML & CSS</strong> - Used for building the frontend components of the application.</li>
  </ul>

  <h2>Project Structure</h2>
  <p>The application is structured into different components, each handling specific functionalities.</p>

  <ul>
      <li>
          <strong>Web Pages</strong> (HTML/JSP):
          <ul>
              <li><strong>login.html:</strong> User login page.</li>
              <li><strong>menu.html:</strong> Main menu page after login.</li>
              <li><strong>capture_employee_details.html:</strong> Page for capturing employee temperature details.</li>
              <li><strong>get_low_temp_cnt.html:</strong> Page to get the count of employees with low temperature readings.</li>
              <li><strong>get_high_temp_cnt.html:</strong> Page to get the count of employees with high temperature readings.</li>
              <li><strong>high_temp_cnt_outcome.jsp:</strong> Displays the number of employees with high temperature readings.</li>
              <li><strong>low_temp_cnt_outcome.jsp:</strong> Displays the number of employees with low temperature readings.</li>
          </ul>
      </li>

  <li>
        <strong>Servlets</strong>:
        <ul>
            <li><strong>EmployeeDetailsServlet:</strong> Handles capturing employee temperature details and stores them in the database.</li>
            <li><strong>GetHighTemperesCountServlet:</strong> Retrieves the number of employees with high temperature readings.</li>
            <li><strong>GetLowTemperaCountServlet:</strong> Retrieves the number of employees with low temperature readings.</li>
            <li><strong>LogoutServlet:</strong> Manages user logout and session invalidation.</li>
        </ul>
    </li>

  <li>
        <strong>Enterprise JavaBeans (EJB)</strong>:
        <ul>
            <li><strong>EmployeeFacade:</strong> Contains the business logic to manage employee data and calculate the count of employees with high and low temperature readings.</li>
        </ul>
    </li>

  <li>
        <strong>Entity</strong>:
        <ul>
            <li><strong>Employee:</strong> Represents the Employee entity with fields for ID, name, and temperature reading.</li>
        </ul>
    </li>
  </ul>

  <h2>How to Run the Project</h2>
  <ol>
      <li>Ensure that you have <strong>GlassFish Server</strong> installed and configured.</li>
      <li>Clone the repository: <code>git clone https://github.com/your-github-username/ABC-Temperature-WebApp.git</code></li>
      <li>Open the project in your preferred Java EE IDE (e.g., NetBeans, IntelliJ IDEA).</li>
      <li>Build the project and generate a WAR file.</li>
      <li>Deploy the WAR file to GlassFish.</li>
      <li>Access the application by navigating to the GlassFish server's URL (e.g., <code>http://localhost:8080/ABC-Temperature-WebApp</code>).</li>
  </ol>

  <h2>Endpoints</h2>
  <ul>
      <li><code>/capture_employee_details.html</code> - Capture employee temperature details.</li>
      <li><code>/get_high_temp_cnt.html</code> - Get the count of employees with high temperature readings.</li>
      <li><code>/get_low_temp_cnt.html</code> - Get the count of employees with low temperature readings.</li>
      <li><code>/LogoutServlet.do</code> - Logout the user and invalidate the session.</li>
  </ul>

  <h2>Author</h2>
  <p>
      Developed by Sifiso.
  </p>

  <h2>License</h2>
  <p>
      This project is licensed under the <strong>MIT License</strong>.
  </p>
</body>
</html>
