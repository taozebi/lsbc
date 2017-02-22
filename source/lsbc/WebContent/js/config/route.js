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
                	'js/util/datepicker.js',
                	'js/util/params.js',
                	'js/controller/dialog/searchController.js',
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
				controller:"stockListController",
				templateUrl:"page/stock/stockList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/stock/stockListController.js',
		        ]);
		    }]
		}
	}).state('main.storage.addstorage', {
		url: '/addstorage',
		views:{
			'sense@main':{
				controller:"newStorageController",
				templateUrl:"page/storage/addStorage.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/dialog/searchGoodsController.js',
		        	'js/controller/storage/newStorageController.js'
		        ]);
		    }]
		}
	}).state('main.storage.storagelist', {
		url: '/storagelist',
		views:{
			'sense@main':{
				controller:'storageListController',
				templateUrl:"page/storage/storageList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/storage/storageListController.js'
		        ]);
		    }]
		}
	}).state('main.delivery.adddelivery', {
		url: '/adddelivery',
		views:{
			'sense@main':{
				controller:"newDeliveryController",
				templateUrl:"page/delivery/addDelivery.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/dialog/searchGoodsController.js',
		        	'js/controller/delivery/newDeliveryController.js'
		        ]);
		    }]
		}
	}).state('main.delivery.deliverylist', {
		url: '/deliverylist',
		views:{
			'sense@main':{
				controller:"deliveryListController",
				templateUrl:"page/delivery/deliveryList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/delivery/deliveryListController.js'
		        ]);
		    }]
		}
	}).state('main.finance.addfinance', {
		url: '/addfinance',
		views:{
			'sense@main':{
				controller:"addFinanceController",
				templateUrl:"page/finance/addFinance.html",
			}
		},resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/finance/addFinanceController.js'
		        ]);
		    }]
		}
	}).state('main.finance.financelist', {
		url: '/financelist',
		views:{
			'sense@main':{
				controller:"financeListController",
				templateUrl:"page/finance/financeList.html",
			}
		},resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/finance/financeListController.js'
		        ]);
		    }]
		}
	}).state('main.system.adduser', {
		url: '/adduser',
		views:{
			'sense@main':{
				/*加载路由时将加载进来的模板指定一个控制器*/
				controller:"addUserController",
				templateUrl:"page/system/addUser.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/system/addUserController.js'/*异步加载controller.js文件*/
		        ]);
		    }]
		}
	}).state('main.system.userlist', {
		url: '/userlist',
		views:{
			'sense@main':{
				controller:"userListController",
				templateUrl:"page/system/userList.html"
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/system/userListController.js'
		        ]);
		    }]
		}
	}).state('main.system.addgoods', {
		url: '/addgoods',
		views:{
			'sense@main':{
				controller:"addGoodsController",
				templateUrl:"page/system/addGoods.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/system/addGoodsController.js'
		        ]);
		    }]
		}
	}).state('main.system.goodslist', {
		url: '/goodslist',
		views:{
			'sense@main':{
				controller:"goodsListController",
				templateUrl:"page/system/goodsList.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/system/goodsListController.js'
		        ]);
		    }]
		}
	}).state('main.system.warnset', {
		url: '/warnset',
		views:{
			'sense@main':{
				controller:"warnSetController",
				templateUrl:"page/system/warnSet.html",
			}
		},
		resolve:{
			loadCustom:["$ocLazyLoad",function($ocLazyLoad){
		        return $ocLazyLoad.load([
		        	'js/controller/system/warnSetController.js'
		        ]);
		    }]
		}
	});
}]);