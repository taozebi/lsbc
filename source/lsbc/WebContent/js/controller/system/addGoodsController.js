app.controller("addGoodsController",['$scope','request','dialog',function($scope,request,dialog){
	/*这里存储添加商品的信息*/
	$scope.regist = {};
	/*注册按钮点击事件*/
	$scope.submit = function(){
		request.get('/goods/addGoods.action'/*URL*/,$scope.regist/*参数*/,function(data){
			if(data.status == '0'){
				/*添加成果*/
				dialog.info({
					items : {title:'提示信息',content:'添加商品成功!',type:'success',success:function(data){
						alert('success');
					}}
				});
			}else{
				dialog.info({
					items : {title:'添加商品信息失败',content:'请检查服务器配置!',type:'warn'}
				});
			}
		}/*回调*/);
	};
}]);