<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<div class="container w-25">
		<h1>Thêm Khách Hàng</h1>
		<form action="${pageContext.request.contextPath}/luukhach" class="form-control " method="post">
			<label for="tenkhach" class="form-check-label">Tên Khách
				Hàng</label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text" id="tenKH" name="tenKH"
					class="form-control" placeholder="Tên Khách Hàng"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="diachi" class="form-check-label">Địa Chỉ</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="diachi" name="diachi"
					class="form-control" placeholder="Địa Chỉ" aria-label="Username"
					aria-describedby="addon-wrapping">
			</div>
			<label for="sdt" class="form-check-label">Số ĐT</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="phone" name = "phone"
					class="form-control" placeholder="Số Điện Thoại"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="email" class="form-check-label">Email</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span> <input type="text" id="email" name ="email"
					class="form-control" placeholder="Email" aria-label="Username"
					aria-describedby="addon-wrapping">
			</div>

			<button class="btn btn-secondary form-control pb-3">Thêm Mới</button>
			</form>
	</div>
	<script type="text/javascript" src="<c:url value='/resources/qlphongmay.js' />"></script>
</body>