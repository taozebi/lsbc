/*导航条设置*/
app.factory("nav",['$window',function($window){
	
	function getNav(){
		return $window.sessionStorage.getItem('header') || 0;
	}
	
	function setNav(index){
		$window.sessionStorage.setItem('header',index);
		setSubNav(0);
	}
	
	function getSubNav(){
		return $window.sessionStorage.getItem('sub') || 0;
	}
	
	function setSubNav(index){
		$window.sessionStorage.setItem('sub',index);
	}
	
	return {
		get:getNav,
		set:setNav,
		getSub:getSubNav,
		setSub:setSubNav
	};
	
}]);
