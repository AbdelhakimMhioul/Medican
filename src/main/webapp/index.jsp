<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Medican</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
   <%@ include file="./includes/head.html" %>
  </head>
  <body>
	<%@ include file="./includes/navbar.jsp" %>
    
    <div class="hero-wrap js-fullheight" style="background-image: url('images/bg_1.jpg');">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-start" data-scrollax-parent="true">
          <div class="col-md-9 ftco-animate mb-5 pb-5 text-center text-md-left" data-scrollax=" properties: { translateY: '70%' }">
            <h1 class="mb-4" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Find Your <br>Best Suitable Clinic</h1>
            <p data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">Find your nearest clinic in a really enjoyable way</p>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section justify-content-end ftco-search">
    	<div class="container-wrap ml-auto">
    		<div class="row no-gutters">
          <div class="col-md-12 nav-link-wrap">
            <div class="nav nav-pills justify-content-center text-center" id="v-pills-tab" role="tablist" aria-orientation="vertical">
              <a class="nav-link active" id="v-pills-1-tab" data-toggle="pill" href="#v-pills-1" role="tab" aria-controls="v-pills-1" aria-selected="true">Clinic</a>

              <a class="nav-link" id="v-pills-2-tab" data-toggle="pill" href="#v-pills-2" role="tab" aria-controls="v-pills-2" aria-selected="false">Destination</a>
            </div>
          </div>
          <div class="col-md-12 tab-wrap">
            
            <div class="tab-content p-4 px-5" id="v-pills-tabContent">

              <div class="tab-pane fade show active" id="v-pills-1" role="tabpanel" aria-labelledby="v-pills-nextgen-tab">
              <form action="ShowIndexClinic" method ="post" class="search-destination">
              		<div class="row">
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">City</label>
	              				<div class="form-field">
	              					<div class="icon"><span class="icon-my_location"></span></div>
					                <input name="ville" type="text" class="form-control" placeholder="Ville">
					              </div>
				              </div>
              			</div>
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">Check In</label>
              					<div class="form-field">
	              					<div class="icon"></div>
					                <input name="date_init" type="date" >
					              </div>
				              </div>
              			</div>
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">Check Out</label>
              					<div class="form-field">
	              					<div class="icon"><span class="icon-map-marker"></span></div>
					                <input name="date_end" type="date">
					              </div>
				              </div>
              			</div>
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">Persons</label>
              					<div class="form-field">
	              					<div class="select-wrap">
			                      <div class="icon"><span class="ion-ios-arrow-down"></span></div>
			                      <select name="personne" class="form-control">
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
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">Room</label>
              					<div class="form-field">
	              					<div class="select-wrap">
			                      <div class="icon"><span class="ion-ios-arrow-down"></span></div>
			                      <select name="chambre" class="form-control">
			                      	<option value="1">1</option>
			                        <option value="2">2</option>
			                        <option value="3">3</option>
			                      </select>
			                    </div>
					              </div>
				              </div>
              			</div>
              			<div class="col-md align-self-end">
              				<div class="form-group">
              					<div class="form-field">
					                <input type="submit" value="Search" class="form-control btn btn-primary">
					              </div>
				              </div>
              			</div>
              		</div>
              	</form>
              </div>

              <div class="tab-pane fade" id="v-pills-2" role="tabpanel" aria-labelledby="v-pills-performance-tab">
              	<form action="#" class="search-destination">
              		<div class="row">
              			<div class="col-md align-items-end">
              				<div class="form-group">
              					<label for="#">City</label>
	              				<div class="form-field">
	              					<div class="icon"><span class="icon-my_location"></span></div>
					                <input type="text" class="form-control" placeholder="Ville">
					              </div>
				              </div>
              			</div>
              			<div class="col-md align-self-end">
              				<div class="form-group">
              					<div class="form-field">
					                <input type="submit" value="Search" class="form-control btn btn-primary">
					              </div>
				              </div>
              			</div>
              		</div>
              	</form>
              </div>
            </div>
          </div>
        </div>
    	</div>
    </section>

    <section class="ftco-section bg-light">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-4">
    				<div class="intro ftco-animate">
    					<h3><span>01</span> Enjoy</h3>
    					<p>Feel free to enjoy our service for you to head faster. Feel free to enjoy our service for you to head faster.</p>
    				</div>
    			</div>
    			<div class="col-md-4">
    				<div class="intro ftco-animate">
    					<h3><span>02</span> Experience</h3>
    					<p>Feel free to enjoy our service for you to head faster. Feel free to enjoy our service for you to head faster.</p>
					</div>
    			</div>
    			<div class="col-md-4">
    				<div class="intro ftco-animate">
    					<h3><span>03</span> Relax</h3>
    					<p>Feel free to enjoy our service for you to head faster. Feel free to enjoy our service for you to head faster.</p>
    				</div>
    			</div>
    		</div>
    	</div>
    </section>
		
	<section class="ftco-about d-md-flex">
    	<div class="one-half img" style="background-image: url(images/about.jpg);"></div>
    	<div class="one-half ftco-animate">
        <div class="heading-section ftco-animate ">
          <h2 class="mb-4">The Best Clinic Service</h2>
        </div>
        <div>
			<p>Feel free to enjoy our service for you to head faster. Feel free to enjoy our service for you to head faster.</p>
		</div>
    	</div>
    </section>

    <section class="ftco-section services-section bg-light">
      <div class="container">
        <div class="row d-flex">
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services d-block">
              <div class="icon"><span class="flaticon-yatch"></span></div>
              <div class="media-body">
                <h3 class="heading mb-3">Special Promotions</h3>
                <p>A small river named Duden flows by their place and supplies.</p>
              </div>
            </div>      
          </div>
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services d-block">
              <div class="icon"><span class="flaticon-around"></span></div>
              <div class="media-body">
                <h3 class="heading mb-3">Clinic Arrangements</h3>
                <p>A small river named Duden flows by their place and supplies.</p>
              </div>
            </div>    
          </div>
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="media block-6 services d-block">
              <div class="icon"><span class="flaticon-compass"></span></div>
              <div class="media-body">
                <h3 class="heading mb-3">Information Blog</h3>
                <p>A small river named Duden flows by their place and supplies.</p>
              </div>
            </div>      
          </div>
        </div>
      </div>
    </section>

    <section class="ftco-section ftco-counter img" id="section-counter" style="background-image: url(images/bg_1.jpg);" data-stellar-background-ratio="0.5">
    	<div class="container">
    		<div class="row justify-content-center">
    			<div class="col-md-10">
		    		<div class="row">
		          <div class="col-md-4 d-flex justify-content-center counter-wrap ftco-animate">
		            <div class="block-18 text-center">
		              <div class="text">
		                <strong class="number" data-number="100000">0</strong>
		                <span>Happy Customers</span>
		              </div>
		            </div>
		          </div>
		          <div class="col-md-4 d-flex justify-content-center counter-wrap ftco-animate">
		            <div class="block-18 text-center">
		              <div class="text">
		                <strong class="number" data-number="87000">0</strong>
		                <span>Clinics</span>
		              </div>
		            </div>
		          </div>
		          <div class="col-md-4 d-flex justify-content-center counter-wrap ftco-animate">
		            <div class="block-18 text-center">
		              <div class="text">
		                <strong class="number" data-number="400">0</strong>
		                <span>Articles</span>
		              </div>
		            </div>
		          </div>
		        </div>
	        </div>
        	</div>
    	</div>
    </section>

    <section class="ftco-section">
    	<div class="container">
				<div class="row justify-content-center mb-5 pb-3">
          <div class="col-md-7 heading-section text-center ftco-animate">
            <h2 class="mb-4"><strong>Popular</strong> Clinics</h2>
          </div>
        </div>    		
    	</div>
    	<div class="container-fluid">
    		<div class="row">
    			<div class="col-sm col-md-6 col-lg-4 ftco-animate">
    				<div class="destination">
    					<a href="#" class="img img-2 d-flex justify-content-center align-items-center" style="background-image: url(images/clinic.jpg);">
    						<div class="icon d-flex justify-content-center align-items-center">
    							<span class="icon-link"></span>
    						</div>
    					</a>
    					<div class="text p-3">
    						<div class="d-flex">
    							<div class="one">
		    						<h3><a href="#">Clinic 1</a></h3>
		    						<p class="rate">
		    							<i class="icon-star"></i>
		    							<i class="icon-star"></i>
		    							<i class="icon-star"></i>
		    							<i class="icon-star"></i>
		    							<i class="icon-star-o"></i>
		    							<span>4 Rating</span>
		    						</p>
	    						</div>
	    						<div class="two">
	    							<span class="price per-price">$40<br><small>/night</small></span>
    							</div>
    						</div>
    						<p>Far far away, behind the word mountains, far from the countries</p>
    						<hr>
    						<p class="bottom-area d-flex">
    							<span><i class="icon-map-o"></i> Rabat</span> 
    							<span class="ml-auto"><a href="#">Book Now</a></span>
    						</p>
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
    </section>

    <section class="ftco-section testimony-section">
      <div class="container">
        <div class="row justify-content-center mb-5 pb-3">
          <div class="col-md-7 text-center heading-section heading-section-white ftco-animate">
            <h2 class="mb-4">Our satisfied customer says</h2>
            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in</p>
          </div>
        </div>
        <div class="row ftco-animate">
          <div class="col-md-12">
            <div class="carousel-testimony owl-carousel ftco-owl">
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(images/person_1.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text">
                    <p class="mb-5">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                    <p class="name">Mark Web</p>
                    <span class="position">Doctor</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(images/person_2.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text">
                    <p class="mb-5">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                    <p class="name">Mark Web</p>
                    <span class="position">Doctor</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(images/person_3.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text">
                    <p class="mb-5">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                    <p class="name">Mark Web</p>
                    <span class="position">Nurse</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(images/person_1.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text">
                    <p class="mb-5">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                    <p class="name">Mark Web</p>
                    <span class="position">Doctor</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(images/person_1.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text">
                    <p class="mb-5">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                    <p class="name">Mark Web</p>
                    <span class="position">Doctor</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="ftco-section bg-light">
      <div class="container">
        <div class="row justify-content-center mb-5 pb-3">
          <div class="col-md-7 heading-section text-center ftco-animate">
            <h2><strong>Tips</strong> &amp; Articles</h2>
          </div>
        </div>
        <div class="row d-flex">
          <div class="col-md-4 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="https://www.geisinger.org/health-and-wellness/wellness-articles/2018/01/19/14/13/antibiotics-for-the-flu" target="_blank" class="block-20" style="background-image: url('https://www.geisinger.org/-/media/OneGeisinger/Images/ghs/health-and-wellness/Wellness-Articles/2022/2022-1-Can-I-Take-Antibiotics-to-Treat-the-Flu.jpg?w=0&h=0&as=1&hash=2C277EC42725303A9450BF4DD1D3E46193F2AA7E');">
              </a>
              <div class="text">
              	<span class="tag">Health, General</span>
                <h3 class="heading mt-3"><a href="https://www.geisinger.org/health-and-wellness/wellness-articles/2018/01/19/14/13/antibiotics-for-the-flu">Can I take antibiotics to treat the flu?</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">October 3, 2018</a></div>
                  <div><a href="#">Admin</a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 3</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a target="_blank" href="https://www.geisinger.org/health-and-wellness/wellness-articles/2020/03/30/13/45/5-things-that-happen-when-you-quit-smoking" class="block-20" style="background-image: url('https://www.geisinger.org/-/media/OneGeisinger/Images/ghs/health-and-wellness/Wellness-Articles/2020/2020-03-5-things-that-happen-when-you-quit-smoking-web.jpg?w=0&h=0&as=1&hash=8C985C9E58E17D47D0C2A70AA088970C0466E581');">
              </a>
              <div class="text">
              	<span class="tag">Smoking</span>
                <h3 class="heading mt-3"><a href="https://www.geisinger.org/health-and-wellness/wellness-articles/2020/03/30/13/45/5-things-that-happen-when-you-quit-smoking">5 things that happen to your body when you quit smoking</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">October 3, 2018</a></div>
                  <div><a href="#">Admin</a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 3</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="https://www.geisinger.org/health-and-wellness/wellness-articles/2020/04/27/13/14/how-to-recover-from-covid-19-at-home" target="_blank" class="block-20" style="background-image: url('https://www.geisinger.org/-/media/OneGeisinger/Images/ghs/health-and-wellness/Wellness-Articles/2020/2020-04-how-to-recover-from-COVID-19-at-home-web.jpg?w=0&h=0&as=1&hash=7177D34AFC2A596EE926B65212DBAF5051EB335B');">
              </a>
              <div class="text">
              	<span class="tag">Covid 19</span>
                <h3 class="heading mt-3"><a href="https://www.geisinger.org/health-and-wellness/wellness-articles/2020/04/27/13/14/how-to-recover-from-covid-19-at-home">5 things to know about recovering from COVID-19 at home</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">October 3, 2018</a></div>
                  <div><a href="#">Admin</a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 3</a></div>
                </div>
              </div>
            </div>
        </div>
      </div>
    </section>
		
		<section class="ftco-section-parallax">
      <div class="parallax-img d-flex align-items-center">
        <div class="container">
          <div class="row d-flex justify-content-center">
            <div class="col-md-7 text-center heading-section heading-section-white ftco-animate">
              <h2>Subcribe to our Newsletter</h2>
              <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in</p>
              <div class="row d-flex justify-content-center mt-5">
                <div class="col-md-8">
                  <form action="#" class="subscribe-form">
                    <div class="form-group d-flex">
                      <input type="text" class="form-control" placeholder="Enter email address">
                      <input type="submit" value="Subscribe" class="submit px-3">
                    </div>
                  </form>
                </div>
              </div>
            </div>
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