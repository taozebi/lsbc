/*http请求*/
app.factory("dialog",['$uibModal','$document',function($uibModal,$document){
	function openDialog(config){
		config.items = ['item1', 'item2', 'item3'];
		config.controller = 'ModalInstanceCtrl';
		config.templateUrl = 'page/dialog/dialogDome.html';
		config.animation = true;
		config.success = function(data){
		};
		config.fail = function(data){
		};
		$uibModal.open({
	      animation: config.animation,
	      templateUrl: config.templateUrl,
	      controller: config.controller,
	      size: config.size,
	      resolve: {
	    	  items: function () {
	    		  return config.items;
	    	  }
	      }
		}).result.then(config.success || function(data){}, config.fail || function(data){});
	};
	
	return{
		open : openDialog
	}
}]);
app.controller('ModalInstanceCtrl',['$scope','$uibModalInstance','items',function ($scope,$uibModalInstance,items) {
	$scope.items = items;
	$scope.selected = {
			item: $scope.items[0]
	};
	$scope.ok = function () {
		$uibModalInstance.close($scope.selected.item);
	};

	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
}])