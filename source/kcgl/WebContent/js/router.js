/**
 * 路由配置
 */
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider){
	$urlRouterProvider.when("",'/header');
	$stateProvider.state('header',{
		url: '/header',
		views:{
			"header":{templateUrl: 'header.html'}
		}
	}).state('header.home',{
		url:'/home',
		views:{
			"body@header":{templateUrl:'home.html'}
		}
	}).state('header.photo',{
		url:'/photo',
		views:{
			"body@header":{templateUrl:'photo.html'}
		}
	}).state('header.about',{
		url:'/about',
		views:{
			"body@header":{templateUrl:'about.html'}
		}
	});
}]);