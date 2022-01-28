<%
	String var = "Login";
	if (request.getSession().getAttribute("nameUser") == null) var = "Login";
	else var="Logout";
%>

<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
   <div class="container">
     <a class="navbar-brand" href="/project-S3">Medican</a>
     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
       <span class="oi oi-menu"></span> Menu
     </button>

     <div class="collapse navbar-collapse" id="ftco-nav">
       <ul class="navbar-nav ml-auto">
         <li class="nav-item"><a href="/project-S3" class="nav-link">Home</a></li>
         <li class="nav-item"><a href="about.jsp" class="nav-link">About</a></li>
         <li class="nav-item"><a href="/project-S3/ShowClinics" class="nav-link">Clinics</a></li>
         <li class="nav-item"><a href="blog.jsp" class="nav-link">Blog</a></li>
         <li class="nav-item"><a href="contact.jsp" class="nav-link">Contact</a></li>
       </ul>
       <a href="Login" class="btn btn-primary">
       		<%= var %>
       </a>
     </div>
   </div>
 </nav>