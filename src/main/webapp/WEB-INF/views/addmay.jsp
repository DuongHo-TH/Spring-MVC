<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<div class="container w-25">
		<h1>Thêm Máy Mới</h1>
		<form action="${pageContext.request.contextPath}/savemay" class="form-control " method="post" >
			<label for="mamay" class="form-check-label">ID Máy</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-lock"></i></span>
					 <input type="text" name="mamay" class="form-control" placeholder="Vị Trí Máy"
					aria-label="Username" aria-describedby="addon-wrapping"/>
			</div>
			<label for="vitri" class="form-check-label">Vị Trí Máy</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-lock"></i></span>
					 <input type="text" name="vitri" class="form-control" placeholder="Vị Trí Máy"
					aria-label="Username" aria-describedby="addon-wrapping"/>
			</div>
			<label for="trangthai" class="form-check-label">Trạng Thái </label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text"  name="trangthai"
					id="trangthai" class="form-control" placeholder="Trạng Thái"
					aria-label="Username" aria-describedby="addon-wrapping"/>
			</div>
			<button class="btn btn-secondary form-control pb-3">Thêm Mới</button>
		</form>
	</div>
	<script type="text/javascript" src="<c:url value='/resources/qlphongmay.js' />"></script>
</body>