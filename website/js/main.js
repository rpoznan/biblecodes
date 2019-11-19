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
	
	$scope.bibleSearch = function() {
		$scope.error = undefined;
		$scope.gemReport = {};
		$scope.gemResults = {};
		$scope.resultList = {};
		var passage = $scope.query;
		var req1 = {};
		var rg1 = passage.match(/(Genesis|Gen|Ge|Exodus|Exo|Ex|Leviticus|Lev|Le|Numbers|Num|Nu|Deuteronomy|Deu|De|Joshua|Jos|Jo|Judges|Jud|Ju|1 Samuel|1 Sam|1 Sa|2 Samuel|2 Sam|2 Sa|1 Kings|1 Kin|1 Ki|2 Kings|2 Kin|2 Ki|Isaiah|Isa|Is|Jeremiah|Jer|Je|Ezekiel|Eze|Ez|Hosea|Hos|Ho|Joel|Joe|Jo|Amos|Amo|Am|Obadiah|Oba|Ob|Jonah|Jon|Jo|Micah|Mic|Mi|Nahum|Nah|Na|Habakkuk|Hab|Ha|Zephaniah|Zep|Ze|Haggai|Hag|Ha|Zechariah|Zec|Ze|Malachi|Mal|Ma|Psalms|Psa|Ps|Proverbs|Pro|Pr|Job|Job|Jo|Song of Songs|Song |Song|Ruth|Rut|Ru|Lamentations|Lam|La|Ecclesiastes|Ecc|Ec|Esther|Est|Es|Daniel|Dan|Da|Ezra|Ezr|Ez|Nehemiah|Neh|Ne|1 Chronicles|1 Chr|1 Ch|2 Chronicles|2 Chr|2 Ch|Matthew|Mat|Ma|Mark|Mar|Ma|Luke|Luk|Lu|John|Joh|Jo|Acts|Act|Ac|Romans|Rom|Ro|1 Corinthians|1 Cor|1 Co|2 Corinthians|2 Cor|2 Co|Galatians|Gal|Ga|Ephesians|Eph|Ep|Philippians|Phili|Colossians|Col|Co|1 Thessalonians|1 The|1 Th|2 Thessalonians|2 The|2 Th|1 Timothy|1 Tim|1 Ti|2 Timothy|2 Tim|2 Ti|Titus|Tit|Ti|Philemon|Phile|Hebrews|Heb|He|James|Jam|Ja|1 Peter|1 Pet|1 Pe|2 Peter|2 Pet|2 Pe|1 John|1 Joh|1 Jo|2 John|2 Joh|2 Jo|3 John|3 Joh|3 Jo|Jude|Jud|Ju|Revelation|Rev|Re) (\d+\:?\d*\-?\d*)/);
		if(rg1 != null && rg1.length == 3) {
			req1.book = rg1[1];
			var rg2 = rg1[2].match(/(\d+)/);
			var rg3 = rg1[2].match(/(\d+):(\d+)/);
			var rg4 = rg1[2].match(/(\d+):(\d+)\-(\d+)/);
			if(rg2 != null && rg2.length == 2) {
				req1.chapter = rg2[1];
			}
			if(rg3 != null && rg3.length == 3) {
				req1.chapter = rg3[1];
				req1.versex = rg3[2];
				
			}
			if(rg4 != null && rg4.length == 4) {
				req1.chapter = rg4[1];
				req1.versex = rg4[2];
				req1.versey = rg4[3];
			}
		}
		//console.log("search result: "+req1.book+ " "+req1.chapter + " "+req1.versex+" "+req1.versey );
		
		if(req1.book != undefined && req1.chapter != undefined) {
		$http.post("bible.php", JSON.stringify(req1))
  .then(function(response) {
			$scope.resultList = response.data;
			
  });
		
	} 
	
	var isnum = myNumber($scope.query);

	if(isnum) {
		  $http.get("gemsearchrpt.php?query="+$scope.query)
			.then(function(response) {
				$scope.gemReport = response.data;
			});
	}
	
	if(!isnum && req1.book != undefined && req1.chapter != undefined) {
		$scope.error = "Please enter numeric value for search";
	}
	
	};
	
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
	$scope.resultList = {};

	var searchObject = $location.search();
	
	
	if(myNumber(searchObject.q) && myNumber(searchObject.b)) {
		$scope.query = searchObject.q;
		$scope.book = searchObject.b;
	}
	var req1 = {};
	req1.book = searchObject.book;
	req1.chapter = searchObject.chapter;
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
	
	if(req1.book != undefined && req1.chapter != undefined) {
		$http.post("bible.php", JSON.stringify(req1))
  .then(function(response) {
			$scope.resultList = response.data;
			
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