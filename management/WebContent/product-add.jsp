<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Product Add</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
        crossorigin="anonymous">
    <script src="scripts/main.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="styles/main.css" />
</head>

<body>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="images/navlogo.PNG" width="250" height="45">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto ml-5">
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2 no-border" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn my-2 my-sm-0" type="submit">
                        <i class="fas fa-search"></i>
                    </button>
                </form>
            </ul>
            <ul class="navbar-nav md-mr-auto">
                <li class="nav-item nav-link mr-5">
                    <a class="nav-link" href="#">
                        <i class="fas fa-bell"></i>
                    </a>
                </li>
                <li class="nav-item nav-link mr-3">
                    <span class="navbar-text">
                        Welcome, Admin {{admin.name}}
                    </span>
                </li>
                <li class="nav-item nav-link">
                    <button class="btn btn-rounded" href="#">Logout</button>
                </li>
            </ul>

        </div>
    </nav>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-sm-3">
                <div class="card no-border">
                    <div class="card-body p-0">
                        <h5 class="card-title background-gray text-white px-2 py-1">PROFILE
                            <span href="#" class="float-right">EDIT</span>
                        </h5>
                        <img class="no-border mx-auto d-block" src="http://i.pravatar.cc/150" width="100" alt="Card image cap">
                        <span class="card-text text-center">
                            <h4>Helen Cho</h4>
                            <h4>ID</h4>
                            <p>9819264</p>
                            <h4>Designation</h4>
                            <p>Sr. Admin</p>
                            <h4>Office</h4>
                            <p>NYC, NY, USA</p>
                        </span>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="row ">
                    <div class="col-sm-8 p-0">
                        <div class="btn-group btn-group-lg btn-block" role="group">
                            <button type="button" class="btn background-gray active-border-btm text-left">PRODUCTS</button>
                            <button type="button" class="btn background-gray text-left">VENDORS</button>
                        </div>
                    </div>
                </div>
                <div class="row ">

                    <div class="col-sm-4 text-center">
                        <img src="images/add_img.PNG" class="img-thumbnail mx-auto">
                        <h4>Add Images</h4>
                    </div>

                    <form class="col-sm-4 form-group">
                        <input type="text" name="productId"placeholder="Enter Product ID" class="form-control no-border my-2">
                        <select name="category" class="custom-select no-border my-2">
                            <option value="" disabled selected>
                                <span style="font-weight: 700">Category</span>
                            </option>
                            <option value="">Electronics</option>
                            <option value="">Pets</option>
                            <option value="">Skincare</option>
                        </select>
                        <input type="text" placeholder="name" class="form-control no-border my-2">
                        <input type="text" placeholder="description" class="form-control no-border my-2">
                        <input type="text" placeholder="price" class="form-control no-border my-2">

                    </form>
                </div>
            </div>
            <div class="col-sm-1 align-self-end justify-content-end">
                <!-- <div class="row align-self-end"> -->
                    <!-- <div class="col align-self-end"> -->
                        <div class="form-group text-right">
                            <button class="btn no-border background-black btn-rounded text-white mb-2">Add</button>
                            <!-- <br><br> -->
                            <button class="btn no-border background-gray btn-rounded">Cancel</button>
                        </div>
                    <!-- </div> -->
                <!-- </div> -->
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
</body>
</html>