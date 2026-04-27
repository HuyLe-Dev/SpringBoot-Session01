# Phân tích luồng Request - Response: Chức năng "Xem danh sách sản phẩm"

- 1. Client (Trình duyệt / ReactJS)
  - Hành động: Gửi yêu cầu (HTTP Request)
  - HTTP Method: GET (Dùng để lấy dữ liệu)
  - URL (Endpoint) dự kiến: /api/v1/products
- 2. Server (Ứng dụng Spring Boot)
  - Controller (@RestController): Tiếp nhận Request từ Client
  - Service (@Service): Chứa logic nghiệp vụ (nếu có)
  - Repository (@Repository): Chịu trách nhiệm truy xuất dữ liệu
- 3. Database (Bộ nhớ RAM / Oracle DB)
  - Vai trò: Lưu trữ thông tin sản phẩm
  - Hành động: Truy vấn và trả về danh sách dữ liệu (List) cho Server
- 4. Response (Phản hồi về Client)
  - Định dạng dữ liệu: JSON (Dễ dàng cho ReactJS xử lý)
  - HTTP Status Code: 200 OK (Thành công)
  - Hành động tiếp theo: Client nhận JSON và render hiển thị lên giao diện UI