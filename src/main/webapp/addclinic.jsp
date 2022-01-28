<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Ajouter un Clinique</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="./includes/head.html" %>
  </head>
  <body>
	<%@ include file="./includes/navbar.jsp" %>
    
    <div class="hero-wrap js-fullheight" style="background-image: url('images/bg_1.jpg');">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
          <div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
            <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">
            	<span class="mr-2">
            		<a href="index.jsp">Home</a>
            	</span>
            	<span>
            		<a href="blog.jsp">Blog</a>
            	</span>
            </p>
            <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Add New Clinic</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section contact-section ftco-degree-bg">
      <div class="container">
       <center>
        <div class="row block-9">
          <div class="col-md-6 order-md-last pr-md-5">
          <h2 class="row block-9">Add New Clinic</h2>  
            <br>   
            <form action="AddClinic" method="post">
              <div class="form-group">
                <input type="text" name="nom" class="form-control" placeholder="Nom du clinique">
              </div>
              <div class="form-group">
                <input type="text" name="ville" class="form-control" placeholder="Ville">
              </div>
              <div class="form-group">
                <input type="text" name="adresse" class="form-control" placeholder="Adresse">
              </div>
              <div class="form-group">
                <input type="text" name="phone" class="form-control" placeholder="Téléphone">
              </div>  
              <div class="form-group">
                <input type="text" name="desc" id="password"  class="form-control" placeholder="Description"/>
              </div>
              <div class="col-md align-items-end">
              Nombre d'étoiles
					<div class="form-group">
						<div class="form-field">
							<div class="select-wrap">
						        <div placeholder ="Etoiles" class="icon">
							        <select name="stars" id="stars" class="form-control">
							        	<option value="1">1</option>
							          	<option value="2">2</option>
							          	<option value="3">3</option>
							          	<option value="4">4</option>
							          	<option value="5">5</option>
							        </select>
						      	</div>
				  			</div>
				 		</div>
					</div>
				</div>
              <div class="form-group">
                <input type="text" name="photo" id="password"  class="form-control" placeholder="Image"/>
              </div>
              <div class="form-group">
                <input type="submit" name="clinicadd" value="Valider" class="btn btn-primary py-3 px-5">
              </div>
            </form>
         
          </div>
          </div>
        </div>
		</center>
      </div>
    </section>

    <%@ include file="./includes/footer.html" %>

	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>

	<%@ include file="./includes/script.html" %>
  </body>
</html>