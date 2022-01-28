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
						<span class="mr-2"> <a href="index.jsp">Home</a>
						</span>
					</p>
					<h1 class="mb-3 bread"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Clinics</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 sidebar order-md-last ftco-animate">
					<a href="addclinic.jsp">
						<button class="btn btn-primary">Add Clinic</button>
					</a>
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">Find City</h3>
						<form action="#">
							<div class="fields">
								<div class="form-group">
									<input type="text" class="form-control"
										placeholder="Destination, City">
								</div>
								<div class="form-group">
									<div class="select-wrap one-third">
										<div class="icon">
											<span class="ion-ios-arrow-down"></span>
										</div>
										<select name="" id="" class="form-control"
											placeholder="Keyword search">
											<option value="">Select Location</option>
											<option value="">San Francisco USA</option>
											<option value="">Berlin Germany</option>
											<option value="">Lodon United Kingdom</option>
											<option value="">Paris Italy</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<input type="text" id="checkin_date"
										class="form-control checkin_date" placeholder="Date from">
								</div>
								<div class="form-group">
									<input type="text" id="checkout_date"
										class="form-control checkout_date" placeholder="Date to">
								</div>
								<div class="form-group">
									<div class="range-slider">
										<span> <input type="number" value="25000" min="0"
											max="120000" /> - <input type="number" value="50000" min="0"
											max="120000" />
										</span> <input value="1000" min="0" max="120000" step="500"
											type="range" /> <input value="50000" min="0" max="120000"
											step="500" type="range" />
									</div>
								</div>
								<div class="form-group">
									<input type="submit" value="Search"
										class="btn btn-primary py-3 px-5">
								</div>
							</div>
						</form>
					</div>
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">Star Rating</h3>
						<form method="post" class="star-rating">
							<div class="form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">
									<p class="rate">
										<span><i class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star"></i></span>
									</p>
								</label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">
									<p class="rate">
										<span><i class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star-o"></i></span>
									</p>
								</label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">
									<p class="rate">
										<span><i class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star"></i><i class="icon-star-o"></i><i
											class="icon-star-o"></i></span>
									</p>
								</label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">
									<p class="rate">
										<span><i class="icon-star"></i><i class="icon-star"></i><i
											class="icon-star-o"></i><i class="icon-star-o"></i><i
											class="icon-star-o"></i></span>
									</p>
								</label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">
									<p class="rate">
										<span><i class="icon-star"></i><i class="icon-star-o"></i><i
											class="icon-star-o"></i><i class="icon-star-o"></i><i
											class="icon-star-o"></i></span>
									</p>
								</label>
							</div>
						</form>
					</div>
				</div>
				<!-- END-->
				<div class="col-lg-9">
					<div class="row">
						<div class="col-sm col-md-6 col-lg-4 ftco-animate">
							<div class="destination">
								<a href="#"
									class="img img-2 d-flex justify-content-center align-items-center"
									style="background-image: url(images/clinic.jpg);">
									<div
										class="icon d-flex justify-content-center align-items-center">
										<span class="icon-link"></span>
									</div>
								</a>
								<div class="text p-3">
									<div class="d-flex">
										<div class="one">
											<h3>
												<a href="#">Clinic 1</a>
											</h3>
											<p class="rate">
												<i class="icon-star"></i> <i class="icon-star"></i> <i
													class="icon-star"></i> <i class="icon-star"></i> <i
													class="icon-star-o"></i> <span>4 Rating</span>
											</p>
										</div>
										<div class="two">
											<span class="price per-price">$40<br>
											<small>/night</small></span>
										</div>
									</div>
									<p>Far far away, behind the word mountains, far from the
										countries</p>
									<hr>
									<p class="bottom-area d-flex">
										<span><i class="icon-map-o"></i> Rabat</span> <span
											class="ml-auto"><a href="#">Book Now</a></span>
									</p>
								</div>
							</div>
						</div>
						<div class="col-sm col-md-6 col-lg-4 ftco-animate">
							<div class="destination">
								<a href="#"
									class="img img-2 d-flex justify-content-center align-items-center"
									style="background-image: url(images/clinic.jpg);">
									<div
										class="icon d-flex justify-content-center align-items-center">
										<span class="icon-link"></span>
									</div>
								</a>
								<div class="text p-3">
									<div class="d-flex">
										<div class="one">
											<h3>
												<a href="#">Clinic 2</a>
											</h3>
											<p class="rate">
												<i class="icon-star"></i> <i class="icon-star"></i> <i
													class="icon-star"></i> <i class="icon-star"></i> <i
													class="icon-star-o"></i> <span>3 Rating</span>
											</p>
										</div>
										<div class="two">
											<span class="price per-price">$40<br>
											<small>/night</small></span>
										</div>
									</div>
									<p>My desc</p>
									<hr>
									<p class="bottom-area d-flex">
										<span><i class="icon-map-o"></i> Casa</span> <span
											class="ml-auto"><a href="#">Book Now</a></span>
									</p>
								</div>
							</div>
						</div>
					</div>
					<div class="row mt-5">
						<div class="col text-center">
							<div class="block-27">
								<ul>
									<li><a href="#">&lt;</a></li>
									<li class="active"><span>1</span></li>
									<li><a href="#">&gt;</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<!-- .col-md-8 -->
			</div>
		</div>
	</section>
	<!-- .section -->
	<section class="ftco-section-parallax">
		<div class="parallax-img d-flex align-items-center">
			<div class="container">
				<div class="row d-flex justify-content-center">
					<div
						class="col-md-7 text-center heading-section heading-section-white ftco-animate">
						<h2>Subcribe to our Newsletter</h2>
						<p>Far far away, behind the word mountains, far from the
							countries Vokalia and Consonantia, there live the blind texts.
							Separated they live in</p>
						<div class="row d-flex justify-content-center mt-5">
							<div class="col-md-8">
								<form action="#" class="subscribe-form">
									<div class="form-group d-flex">
										<input type="text" class="form-control"
											placeholder="Enter email address"> <input
											type="submit" value="Subscribe" class="submit px-3">
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
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