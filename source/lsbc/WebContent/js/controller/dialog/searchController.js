app.controller("updateController",['$scope','request','dialog','$uibModalInstance','items',function($scope,request,dialog,$uibModalInstance,items){
	
	$scope.item = items;
	
	$scope.ok = function () {
		$uibModalInstance.close($scope.item.data);
	};

	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
}]);