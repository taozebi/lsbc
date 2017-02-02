/**
 * 项目初始化
 */
var app = angular.module('kcgl',['ui.router','ui.bootstrap']);
app.config(['$controllerProvider','$compileProvider','$filterProvider','$provide',
	function($controllerProvider, $compileProvider, $filterProvider, $provide) {
		app.register = {
				controller: $controllerProvider.register,
				directive: $compileProvider.directive,
				filter: $filterProvider.register,
				factory: $provide.factory,
				service: $provide.service
		};
}]);