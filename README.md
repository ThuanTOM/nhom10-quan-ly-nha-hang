# Quản lý nhà hàng – Nhóm 10

Đồ án môn **Công nghệ phần mềm**. Phần mềm quản lý nhà hàng: sơ đồ bàn, gọi món, bếp, thanh toán, báo cáo doanh thu.

| Vai trò | Nhiệm vụ chính |
|---|---|
| PM  | Lập kế hoạch sprint, quản lý backlog trên Jira, theo dõi tiến độ |
| BA  | Thu thập yêu cầu, viết user story + tiêu chí nghiệm thu, test nghiệm thu |
| DEV | Thiết kế, lập trình backend/frontend, review code, viết test |

## Công nghệ
- **Backend:** Java 21, Spring Boot, Spring Data JPA, H2 (mặc định) / MySQL
- **Frontend:** React + Vite
- **Quản lý dự án:** Jira (project `KAN`) – **Quản lý mã nguồn:** GitHub

## Cấu trúc thư mục
```
backend/    Spring Boot API (cổng 8080)
frontend/   React (cổng 5173)
docs/       Tài liệu dự án
```

## Chạy thử
```bash
# Backend
cd backend
./mvnw spring-boot:run          # Windows: mvnw.cmd spring-boot:run
# Kiểm tra: http://localhost:8080/api/health

# Frontend
cd frontend
npm install
npm run dev                     # http://localhost:5173
```

## Quy ước làm việc
- Không commit thẳng lên `main`. Mỗi việc tạo một nhánh từ `develop`:
  `feature/KAN-<số>-<mo-ta-ngan>`, ví dụ `feature/KAN-5-api-mon-an`.
- Commit message bắt đầu bằng mã Jira: `KAN-5: them API danh sach mon an`.
- Xong việc thì mở Pull Request vào `develop`, cần 1 người review rồi mới merge.
