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
		url: '/storage'
	}).state('main.delivery',{
		url: '/delivery'
	}).state('main.finance',{
		url: '/finance'
	}).state('main.system',{
		url: '/system'
	}).state('main.stock',{
		url: '/stock'
	}).state('main.stock.stocklist', {
		url: '/stocklist',
		views:{
			'sense@main':{
				templateUrl:"page/stock/stockList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.storage.addstorage', {
		url: '/addstorage',
		views:{
			'sense@main':{
				templateUrl:"page/storage/addStorage.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.storage.storagelist', {
		url: '/storagelist',
		views:{
			'sense@main':{
				templateUrl:"page/storage/storageList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.delivery.adddelivery', {
		url: '/adddelivery',
		views:{
			'sense@main':{
				templateUrl:"page/delivery/addDelivery.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.delivery.deliverylist', {
		url: '/deliverylist',
		views:{
			'sense@main':{
				templateUrl:"page/delivery/deliveryList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.finance.addfinance', {
		url: '/addfinance',
		views:{
			'sense@main':{
				templateUrl:"page/finance/addFinance.html",
			}
		},resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.finance.financelist', {
		url: '/financelist',
		views:{
			'sense@main':{
				templateUrl:"page/finance/financeList.html",
			}
		},resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.adduser', {
		url: '/adduser',
		views:{
			'sense@main':{
				templateUrl:"page/system/addUser.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.userlist', {
		url: '/userlist',
		views:{
			'sense@main':{
				templateUrl:"page/system/userList.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.addgoods', {
		url: '/addgoods',
		views:{
			'sense@main':{
				templateUrl:"page/system/addGoods.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.goodslist', {
		url: '/goodslist',
		views:{
			'sense@main':{
				templateUrl:"page/system/goodsList.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        ]);
		    }]
		}
	}).state('main.system.warnset', {
		url: '/warnset',
		views:{
			'sense@main':{
				templateUrl:"page/system/warnSet.html",
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