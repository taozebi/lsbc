app.config(['$stateProvider','$urlRouterProvider',function($stateProvider, $urlRouterProvider){
	$urlRouterProvider.otherwise("/login");
	$stateProvider
	.state('login', {
		url: '/login',
		controller:"loginController",
		templateUrl:"page/login.html",
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
                return $ocLazyLoad.load([
                	'css/login.css',
                	'js/controller/loginController.js'
                ]);
            }]
		}
	}).state('main', {
		url: '/main',
		controller:"mainController",
		templateUrl:"page/main.html",
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
                return $ocLazyLoad.load([
                	'css/main.css',
                	'js/service/navService.js',
                	'js/controller/mainController.js'
                ]);
            }]
		}
	}).state('main.storage',{
		url: '/storage',
		views:{
			'subnav@main':{
				templateUrl:'page/storage/storage.html'
			}
		}
	}).state('main.delivery',{
		url: '/delivery',
		views:{
			'subnav@main':{
				templateUrl:"page/delivery/delivery.html"
			}
		}
	}).state('main.finance',{
		url: '/finance',
		views:{
			'subnav@main':{
				templateUrl:"page/finance/finance.html"
			}
		}
	}).state('main.system',{
		url: '/system',
		views:{
			'subnav@main':{
				templateUrl:"page/system/system.html"
			}
		}
	}).state('main.storage.content', {
		url: '/content',
		views:{
			'sense@main':{
				templateUrl:"page/content.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.delivery.content', {
		url: '/content',
		views:{
			'sense@main':{
				templateUrl:"page/content.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.finance.content', {
		url: '/content',
		views:{
			'sense@main':{
				templateUrl:"page/content.html",
			}
		},resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.content', {
		url: '/content',
		views:{
			'sense@main':{
				templateUrl:"page/content.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	});
}]);