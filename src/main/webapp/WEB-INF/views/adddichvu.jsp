<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<div class="container w-25">
		<h1>Thêm Dịch Vụ</h1>
		<form action="${pageContext.request.contextPath}/luudv" class="form-control" method ="post">
			<label for="tendichvu" class="form-check-label">Tên Dịch Vụ</label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text" id="tendv" name = "tendv"
					class="form-control" placeholder="Tên Dịch Vụ"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="donvi" class="form-check-label">Đơn Vị Tính</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="donvi" name ="donvi"
					class="form-control" placeholder="Đơn Vị Tính"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="dongia" class="form-check-label">Đơn Giá</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="dongia" name = "dongia"
					class="form-control" placeholder="Đơn Giá" aria-label="Username"
					aria-describedby="addon-wrapping">
			</div>
			<button class="btn btn-secondary form-control pb-3">Thêm Mới</button>
			</form>
	</div>
	
</body>