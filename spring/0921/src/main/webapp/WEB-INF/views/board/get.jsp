<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="../includes/header.jsp"%>
<style>

   .uploadResult {
      width: 100%;
      background-color: gray;
   }
   
   .uploadResult ul {
      display: flex;
      flex-flow: row;
      justify-content: center;
      align-items: center;
   }
   
   .uploadResult ul li {
      list-style: none;
      padding: 10px;
   }
   
   .uploadResult ul li img {
      width: 60px;
   }
   
   .uploadResult ul li span {
      color: white;
   }
   
   .bigPictureWrapper {
      position: absolute;
      display: none;
      justify-content: center;
      align-items: center;
      top: 0%;
      width: 100%;
      height: 100%;
      background-color: gray;
      z-index: 100;
      background: rgba(255, 255, 255, 0.5);
   }
   
   .bigPicture {
      position: relative;
      display: flex;
      justify-content: center;
      align-items: center;
   }
   
   .bigPicture img {
      width: 600px;
   }

</style>

<div class="row">
   <div class="col-lg-12">
      <h1 class="page-header">Board Register</h1>
   </div>
</div>

<div class="row">
   <div class="col-lg-12">
      <div class="panel panel-default">
         <div class="panel-heading">Board Register</div>
         
         <div class="panel-body">
         	<div class="form-group">
            	<label>No</label>
                <input class="form-control" name="bno" value="${board.bno}" readonly>
            </div>
            <div class="form-group">
                <label>Title</label>
                <input class="form-control" name="title" value="${board.title}" readonly>
            </div>
               
            <div class="form-group">
                <label>Text Area</label>
                <textarea class="form-control" rows="3" name="content" readonly>${board.content}</textarea>
            </div>
               
            <div class="form-group">
                <label>Writer</label>
                <input class="form-control" name="writer" value="${board.writer}" readonly>
            </div>
            
            <sec:authentication property="principal" var="pinfo" />
            <sec:authorize access="isAuthenticated()">
            	<c:if test="${pinfo.username eq board.writer}">
            		<button class="btn btn-default" data-oper="modify">게시글 수정</button>
            	</c:if>
            </sec:authorize>
            <button class="btn btn-default" data-oper="list">목록</button>
			
			<form id="actionForm" action="/board/modify" method="get">
				<input type="hidden" name="bno" value="${board.bno}">
				<input type="hidden" name="pageNum" value="${paging.pageNum}">
				<input type="hidden" name="amount" value="${paging.amount}">	
				<input type="hidden" name="keyword" value="${paging.keyword}">
				<input type="hidden" name="type" value="${paging.type}">
			</form>
         </div>
      </div>
   </div>
</div>

<div class="row">
	<div class="col-lg-12">
		 <div class="panel panel-default">
			<div class="panel-heading">첨부 파일</div>
				<div class="panel-body">
				     
				   <div class="uploadResult">
				    <ul>
				    </ul>
				   </div>
				</div>
	     </div>
	</div>
</div>

<div class="bigPictureWrapper">
	<div class="bigPicture">
	</div>
</div>

<div class='row'>
   <div class='col-lg-12'>
      <div class='panel panel-default'>
         <div class='panel-heading'>
            <i class='fa fa-comments fa-fw'></i> 댓글
            <sec:authorize access="isAuthenticated()">
            	<button id='addReplyBtn' class='btn btn-primary btn-xs pull-right'>댓글달기</button>
            </sec:authorize>
         </div>
         
         <div class='panel-body'>
            <ul class='chat'>
              
            </ul>
         </div>
      </div>
   </div>
</div>

<div class='modal fade' id='myModal' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' aria-hidden='true'>
   <div class='modal-dialog'>
      <div class='modal-content'>
         <div class='modal-header'>
            <button type='button' class='close' data-dismiss='modal' aria-hidden='true'>&times;</button>
            <h4 class='modal-title' id='myModalLabel'>댓글 작성창</h4>
         </div>
         
         <div class='modal-body'>
            <div class='form-group'>
               <label>댓글</label>
               <input class='form-control' name='reply' value=''>
            </div>
            <div class='form-group'>
               <label>댓글 작성자</label>
               <input class='form-control' name='replyer' value=''>
            </div>
            <div class='form-group'>
               <label>작성일자</label>
               <input class='form-control' name='replyDate' value=''>
            </div>
         </div>
         
         <div class='modal-footer'>
            <button id='modalModBtn' type='button' class='btn btn-warning'>수정하기</button>
            <button id='modalRemoveBtn' type='button' class='btn btn-danger'>삭제하기</button>
            <button id='modalRegisterBtn' type='button' class='btn btn-primary' data-dismiss='modal'>댓글달기</button>            
            <button id='modalCloseBtn' type='button' class='btn btn-default' data-dismiss='modal'>닫기</button>
            
         </div>
      </div>
   </div>
</div>

<script src="/resources/js/reply.js"></script>

<script>
	const csrfHeaderName = "${_csrf.headerName}";
	const csrfToken = "${_csrf.token}";
	let replyer = null;
	<sec:authorize access="isAuthenticated()">
		replyer = '<sec:authentication property="principal.username"/>';
	</sec:authorize>
	
	$(document).ajaxSend(function(e, xhr, options) {
		xhr.setRequestHeader(csrfHeaderName, csrfToken);
	})


	const bno = '<c:out value="${board.bno}" />';
	
	$.getJSON('/board/getAttachList', {bno: bno}, function(attachList) {
		
		let str = '';
		
		$(attachList).each(function(i, obj) {
			
			if(obj.fileType) {
				
				let filePath = obj.uploadPath + '/s_' + obj.uuid + '_' + obj.fileName;
				filePath = encodeURIComponent(filePath);
				
				str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-fileName="' + obj.fileName + '" data-type="' + obj.fileType + '"><div>'
				str += '<span>' + obj.fileName + '</span>';
				str += '<br>';
				str += '<img src="/display?fileName=' + filePath + '">';
				str += '</div></li>';
				
			} else {
				
				let filePath = obj.uploadPath + '/' + obj.uuid + '_' + obj.fileName;
				filePath = encodeURIComponent(filePath);
				
				str += '<li data-path="' + obj.uploadPath + '" data-uuid="' + obj.uuid + '" data-fileName="' + obj.fileName + '" data-type="' + obj.fileType + '"><div>'
				str += '<span>' + obj.fileName + '</span>';
				str += '<br>';
				str += '<img src="/resources/img/첨부파일.png">';
				str += '</div></li>';
			}
		})
		$('.uploadResult ul').append(str);
	})
	
	$('.uploadResult').on('click', 'li', function() {
		let path = $(this).data('path') + '/' + $(this).data('uuid') + '_' + $(this).data('filename');
		path = encodeURIComponent(path);
		
		if($(this).data('type')) {
			
			showImage(path);
			
		} else {
			location = '/download?fileName=' + path;
		}
	})
	
	function showImage(path) {
		$('.bigPictureWrapper').css('display', 'flex').show();
		
		$('.bigPicture').html('<img src="/display?fileName=' + path + '">')
	}
	
	$('.bigPictureWrapper').on('click', function() {
		$('.bigPictureWrapper').hide();
	})
	
</script>

<script>
	const bnoValue = '<c:out value="${board.bno}" />';

	const modal = $('#myModal');
	
	const modalInputReply = modal.find('input[name="reply"]');
	const modalInputReplyer = modal.find('input[name="replyer"]');
	const modalInputReplyDate = modal.find('input[name="replyDate"]');
	
	const modalModBtn = $('#modalModBtn');
	const modalRemoveBtn = $('#modalRemoveBtn');
	const modalRegisterBtn = $('#modalRegisterBtn');
	
	$('#addReplyBtn').on('click', function() {
		modal.find('input').val('');
		
		
		
		modalInputReplyDate.closest('div').hide();
		
		modal.find('button[id != "modalCloseBtn"]').hide();
		
		modalRegisterBtn.show();
		
		modal.modal('show');
	})
	
	modalRegisterBtn.on('click', function() {
		let reply = {
			bno : bnoValue,
			reply : modalInputReply.val(),
			replyer : modalInputReplyer.val()
		}
		
		replyService.add(reply, function(result) {
			alert(result);
			
			modal.find('input').val('');
			
			showList(1);
		})
		
	})
	
	$('.chat').on('click', 'li', function() {
		
		let rno = $(this).data('rno');
		
		modal.data('rno', rno);
		
		console.log(modal.data('rno'));
		
		replyService.get(rno, function(result) {
			modalInputReply.val(result.reply);
			modalInputReplyer.val(result.replyer);
			modalInputReplyDate.val(replyService.displayTime(result.replyDate));
			
			modalInputReplyDate.attr('readonly', 'readonly');
			
			modal.find('button[id != "modalCloseBtn"]').hide();
			modalModBtn.show();
			modalRemoveBtn.show();
			modalInputReplyDate.closest('div').show();
			
			modal.modal('show');
		})
	})
	
	const replyUL = $('.chat');
	
	showList(1);
	
	function showList(page) {
		
		replyService.getList({
			bno : bnoValue,
			page : page || 1
		}, function(list) {
			let str = '';
			
			if(list == null || list.length == 0) {
				replyUL.html('');
				
				return;
			}
			
			for(let i=0; i < list.length; i++) {
				str += "<li class='left clearfix' data-rno='" + list[i].rno + "'>";
				str += "	<div>";
                str += "		<div class='header'>";
                str += "  			<strong class='primary-font'>" + list[i].replyer + "</strong>";
                str += "   			<small class='pull-right text-muted'>" + replyService.displayTime(list[i].replyDate) + "</small>";
                str += "		</div>";
                str += "		<p>" + list[i].reply + "</p>";
                str += "	</div>";
          		str += "</li>";
			}
			
			replyUL.html(str);
		})
		
	}
	
	modalRemoveBtn.on('click', function() {
		let rno = modal.data('rno');
		
		if(!replyer) {
			alert('로그인 후 사용 가능');
			modal.modal('hide');
			
			return;
		}
		
		if(replyer != modalInputReplyer.val()) {
			alert('작성자만 삭제가능합니다.');
			modal.modal('hide');
			
			return;
		}
		
		replyService.remove(rno, function(result) {
			alert(result);
			modal.modal('hide');
			
			showList(1);
		})
	})
	
	modalModBtn.on('click', function() {
		
		if(!replyer) {
			alert('로그인 후 사용 가능');
			modal.modal('hide');
			
			return;
		}
		
		if(replyer != modalInputReplyer.val()) {
			alert('작성자만 수정가능합니다.');
			modal.modal('hide');
			
			return;
		}
		
		let reply = {
			rno : modal.data('rno'),
			reply : modalInputReply.val()
		}
		
		replyService.modify(reply, function(result) {
			alert(result);
			modal.modal('hide');
			
			showList(1);
		})
	})
	
	/* replyService.get(10, function(result) {
			console.log(result);
	}) */
	
	/* replyService.modify(
		{
			rno:3,
			reply:'댓글수정'
		},
		
		function(result) {
			alert(result);
		}
	); */
	
	/* replyService.remove(
		1,
		function(result) {
			alert(result)
		},
		function(e) {
			alert('실패');
		}
	); */
	
	/* replyService.getList(
		{
			bno : bnoValue,
			page : 1
		},
		
		function(data) {
			for(let i=0; i<data.length; i++) {
				console.log(data[i]);
			}
		}
	); */
	
	const actionForm = $('#actionForm');
	
	$('button[data-oper="modify"]').on('click', function() {
		actionForm.attr('action', '/board/modify').submit();
	})
	
	$('button[data-oper="list"]').on('click', function() {
		actionForm.attr('action', '/board/list').submit();
	})
</script>

<%@ include file="../includes/footer.jsp"%>