<!DOCTYPE html>
<html lang="en">
  	<head>
    <title>Medican</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
   	<%@ include file="./includes/head.html" %>
  	</head>
  	<body>
		<% 
	        String attribut = (String)(request.getAttribute("test"));
	        if(attribut != null){
	        	System.out.print(attribut);
	        }
	    %>
    
	  <%@ include file="./includes/navbar.jsp" %>
    
    <div class="hero-wrap js-fullheight" style="background-image: url('images/bg_1.jpg');">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
          <div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
            <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="index.html">Home</a></span> <span>Blog</span></p>
            <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Register</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section contact-section ftco-degree-bg">
      <div class="container">
        <div class="row block-9">
          <div class="col-md-6 order-md-last pr-md-5">
              
            <form action="register" method="post">
              <div class="form-group">
                <input type="text" name="nom" class="form-control" placeholder="Your Last Name">
              </div>
              <div class="form-group">
                <input type="text" name="prenom" class="form-control" placeholder="Your First Name">
              </div>
              <div class="form-group">
                <input type="text" name="email" class="form-control" placeholder="Your Email">
              </div>
              <div class="form-group">
                <input type="text"  name="phone" class="form-control" placeholder="Your Phone Number">
              </div>  
              <div class="col-md align-items-end">
	        				<div class="form-group">
	        					<div class="form-field">
	         					<div class="select-wrap">
	                   <select name="type" class="form-control">
	                   	<option value="manager">Manager</option>
	                     <option value="client">Client</option>
	                   </select>
	                 </div>
	             </div>
	            </div>
				</div>
              <div class="form-group">
                <input type="password" name="password" id="password"  class="form-control" placeholder="Your Password"/>
              </div>
              <div class="form-group">
                <input type="submit" name="submit" value="login" class="btn btn-primary py-3 px-5">
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>

    <%@ include file="./includes/footer.html" %>
    
	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>

	<%@ include file="./includes/script.html" %>
  </body>
</html>