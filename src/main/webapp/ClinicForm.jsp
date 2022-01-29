<!DOCTYPE html>
<html lang="en">
<head>
<title>Medican</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="./includes/head.html"%>
</head>
<body>
	<%@ include file="./includes/navbar.jsp"%>

	<div class="hero-wrap js-fullheight"
		style="background-image: url('images/bg_1.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
				data-scrollax-parent="true">
				<div class="col-md-9 text-center ftco-animate"
					data-scrollax=" properties: { translateY: '70%' }">
					<p class="breadcrumbs"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">
						<span class="mr-2"><a href="index.html">Home</a></span> <span>Blog</span>
					</p>
					<h1 class="mb-3 bread"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Mettre
						a jour un Clinic</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section contact-section ftco-degree-bg">
		<div class="container">
			<center>
				<div class="row block-9">
					<div class="col-md-6 order-md-last pr-md-5">
						<h2 class="row block-9">Mettre a jour un Clinic</h2>
						<br>
						<form action="UpdateClinic" method="post">
							<div>
								<img src="pic_trulli.jpg" alt="Italian Trulli" name="img">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="nom"
									placeholder="Nom" value="${hm.nom_clinic}" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="ville"
									placeholder="Ville" value="'${hm.ville_clinic}" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="desc"
									placeholder="Description" value="${hm.description}" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="phone"
									placeholder="Telephone" value="${hm.tel_clinic}" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="adresse"
									placeholder="Adresse" value="${hm.adresse_clinic}" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="stars"
									placeholder="Etoiles" value="${hm.nbr_etoiles}" />
							</div>
							<div class="form-group">
								<a class="btn btn-primary p-6"
									href="AddClinic?id=${hm.getId_clinic()}">Valider</a>
							</div>
						</form>
					</div>
				</div>
			</center>
		</div>
	</section>
	<%@ include file="./includes/footer.html"%>

	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg>
	</div>

	<%@ include file="./includes/script.html"%>
</body>
</html>