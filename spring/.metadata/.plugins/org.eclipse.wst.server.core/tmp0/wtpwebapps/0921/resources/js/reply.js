let replyService = (function() {
	
	function add(reply, callback, error) {
		console.log('댓글 등록');
		
		$.ajax({
			type: 'post',
			url: '/replies/new',
			data: JSON.stringify(reply),
			contentType: 'application/json; charset=utf-8',
			
			success : function(result, status, xhr) {
				if(callback) {
					callback(result);
				} 
			},
			error : function(xhr, status, e) {
				if(error) {
					error(e);
				}
			}
		})
	}
	
	function getList(param, callback, error) {
		const bno = param.bno;
		const page = 1;
		
		$.getJSON('/replies/pages/' + bno +'/' + page + '.json',
			function(data) {
				if(callback) {
					callback(data);
				}
			})
	}
	
	function remove(rno, callback, error) {
		$.ajax({
			type: 'delete',
			url: '/replies/' + rno,
			
			success : function(result, status, xhr) {
				if(callback) {
					callback(result);
				}
			},
			
			error : function(xhr, status, e) {
				if(error) {
					error(e);
				}
			}
		})
	}
	
	function modify(reply, callback, error) {
		
		$.ajax({
			type: 'put',
			url: '/replies/' + reply.rno,
			data: JSON.stringify(reply),
			contentType : 'application/json; charset=utf-8',
			
			success : function(result, status, xhr) {
				if(callback) {
					callback(result);
				}
			},
			
			error : function(xhr, status, e) {
				if(error) {
					error(e);
				}
			}
		});
	}
	
	function get(rno, callback, error) {
		
		$.get('/replies/' + rno + '.json',
			function(result) {
				if(callback) {
					callback(result);
				}
			})
		
	}
	
	function displayTime(timeValue) {
		let today = new Date();
		let gap = today.getTime() - timeValue;
		let dateObj = new Date(timeValue);
		let str = '';
		
		if(gap < 24 * 60 * 60 * 1000) {
			let h = dateObj.getHours();
			let m = dateObj.getMinutes();
			let s = dateObj.getSeconds();
			
			return h + ":" + m + ":" + s;
		} else {
			let y = dateObj.getFullYear();
			let m = dateObj.getMonth() + 1;
			let d = dateObj.getDate();
			
			return y + "/" + m + "/" + d;
		}
	}
	
	return {
		add : add,
		getList : getList,
		remove : remove,
		modify : modify,
		get : get,
		displayTime : displayTime
	}
	
})();


