/*用户信息*/
app.factory("user",['$window',function($window){
	
	function setUser(obj){
		$window.sessionStorage.setItem('user',JSON.stringify(obj));
	};
	
	function getUser(){
		return JSON.parse($window.sessionStorage.getItem('user') || '{}');
	}
	
	return {
		set:setUser,
		get:getUser
	};
	
}]);
