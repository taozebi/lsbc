/*http请求*/
app.factory("dialog",['$uibModal',function($uibModal){
	
	function openDialog(config){
		$uibModal.open({
	      animation: config.animation || false,
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
	
	function openMsg(config){
		config.size = "dialog-msg";
		config.templateUrl = 'page/dialog/dialog-msg.html';
		config.controller = 'dialog-msg';
		config.animation = false;
		openDialog(config);
	};
	
	return{
		open : openDialog,
		info : openMsg
	}
}]);
app.controller('dialog-msg',['$scope','$uibModalInstance','items',function ($scope,$uibModalInstance,items) {
	
	$scope.title = items.title;
	$scope.content = items.content;
	$scope.type = items.type;
	
	$scope.ok = function () {
		$uibModalInstance.close('cancel');
	};

	$scope.cancel = function () {
		$uibModalInstance.dismiss('cancel');
	};
}])