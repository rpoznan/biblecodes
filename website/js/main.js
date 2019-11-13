/**
 * AngularJS Tutorial 1
 * @author Nick Kaye <nick.c.kaye@gmail.com>
 */

/**
 * Main AngularJS Web Application
 */
var app = angular.module('tutorialWebApp', [
  'ngRoute'
]);

/**
 * Configure the Routes
 */
app.config(['$routeProvider', function ($routeProvider) {
  $routeProvider
    // Home
    .when("/", {templateUrl: "partials/home.html", controller: "HomeCtrl"})
    // Pages
    .when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"})
    .when("/faq", {templateUrl: "partials/faq.html", controller: "PageCtrl"})
    .when("/pricing", {templateUrl: "partials/pricing.html", controller: "PageCtrl"})
    .when("/services", {templateUrl: "partials/services.html", controller: "ServiceCtrl"})
    .when("/contact", {templateUrl: "partials/contact.html", controller: "PageCtrl"})
    // Blog
    .when("/blog", {templateUrl: "partials/blog.html", controller: "BlogCtrl"})
    .when("/blog/post", {templateUrl: "partials/blog_item.html", controller: "BlogCtrl"})
    // else 404
    .otherwise("/404", {templateUrl: "partials/404.html", controller: "PageCtrl"});
}]);

/**
 * Controls the Blog
 */
app.controller('BlogCtrl', function (/* $scope, $location, $http */) {
  console.log("Blog Controller reporting for duty.");
});
app.controller('ServiceCtrl', function ($scope, $location, $http) {

$scope.pageSearch = function() {
	var isnum = $scope.query != undefined ? /^\d+$/.test($scope.query) : false;
	
	if(isnum) {
		$http.get("tanakh.php?page="+$scope.query)
  .then(function(response) {
			$scope.resultList = response.data;
			
  });
		
	} else {
		$scope.error = "must enter integer to perform search";
	}
};

});

app.controller('HomeCtrl', function ($scope, $location, $http, $location) {
	
	function myNumber(x) {
		return x != undefined ? /^\d+$/.test(x) : false;
	}
	
	$scope.activeBook = function(bookId) {
		if($scope.book == bookId) 
			return "active";
		else 
			return "";
	}
	
	$scope.doSearch3 = function() {
	$scope.error = undefined;
	$scope.gemReport = {};
	$scope.gemResults = {};

	
	var isnum = myNumber($scope.query);
	
	if(!isnum) {
		$scope.error = "Please enter numeric value for search";
	}
	
	if(isnum) {
		  $http.get("gemsearchrpt.php?query="+$scope.query)
			.then(function(response) {
				$scope.gemReport = response.data;
			});
	}
	
	};
	
	$scope.doSearch2 = function() {
	$scope.error = undefined;
	$scope.gemReport = {};
	$scope.gemResults = {};

	var searchObject = $location.search();
	
	
	if(myNumber(searchObject.q) && myNumber(searchObject.b)) {
		$scope.query = searchObject.q;
		$scope.book = searchObject.b;
	}

	//if(isnum && myNumber(searchObject.q) && $scope.query != searchObject.q) {
	//	query = $scope.query;
	//}
	
	var isnum = myNumber($scope.query);
	
	if(!isnum) {
		$scope.error = "Please enter numeric value for search";
	}
	
	if(isnum) {
		  $http.get("gemsearchrpt.php?query="+$scope.query)
			.then(function(response) {
				$scope.gemReport = response.data;
			});
	}
	if(isnum && myNumber($scope.book)) {
		$http.get("gemsearch2.php?query="+$scope.query+"&book="+$scope.book)
			.then(function(response) {
				$scope.gemResults = response.data;
			});
	}
	
	
	
	};
	
	$scope.doSearch2();
  
$scope.doSearch = function() {
	
	$scope.error = undefined;
	$scope.matchedWord = false;
	$scope.matchedVerse = false;
	$scope.resultList = {};
	
	var isnum = $scope.query != undefined ? /^\d+$/.test($scope.query) : false;
	
	if(isnum) {

  $http.get("gemsearch.php?query="+$scope.query)
  .then(function(response) {
    var resultList = response.data;
	if(resultList.verseList == null || resultList.verseList == undefined || resultList.verseList.length == 0) {
		$scope.error = "nothing found";
	}
	if(resultList.word != null && resultList.word != undefined && resultList.word.length > 0) {
		$scope.matchedWord = true;
	}
	if(resultList.verse != null && resultList.verse != undefined && resultList.verse.length > 0) {
		$scope.matchedVerse = true;
	}
	
	$scope.resultList = highLightWord(resultList);

  });
  
	} else {
		$scope.error = "must enter integer to perform search";
	}
    
};

function highLightWord(resultList) {
	if($scope.matchedWord == false || $scope.error != undefined) 
		return resultList;
	
	var wordList = [];
	for(var i=0; i < resultList.word.length; i++) {
		wordList.push(resultList.word[i].tran_word);
	}
	
	for(var t=0; t < resultList.verseList.length; t++) {
		var verse = resultList.verseList[t].tran_verse;
		for(var c=0; c < wordList.length; c++) {
			resultList.verseList[t].tran_verse = verse.replace(wordList[c], "<span style=\"background-color: yellow;\">"+wordList[c]+"</span>");
		}
	}
	
	return resultList;
};
  
    //var res = str.replace("קָדֵשׁ", "<span style=\"background-color: yellow;\">קָדֵשׁ</span>");
  
});

/**
 * Controls all other Pages
 */
app.controller('PageCtrl', function (/* $scope, $location, $http */) {
  console.log("Page Controller reporting for duty.");

  // Activates the Carousel
  $('.carousel').carousel({
    interval: 5000
  });

  // Activates Tooltips for Social Links
  $('.tooltip-social').tooltip({
    selector: "a[data-toggle=tooltip]"
  })
});