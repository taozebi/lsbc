app.controller("searchController",['$scope','request','dialog','$uibModalInstance','items',function($scope,request,dialog,$uibModalInstance,items){
	
	$scope.ok = function () {
		$uibModalInstance.close('cancel');
	};

	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
}]);