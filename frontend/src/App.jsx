import { useEffect, useState } from 'react'
import './App.css'

const API_URL = 'http://localhost:8080/api/health'

function App() {
  const [health, setHealth] = useState(null)
  const [error, setError] = useState('')

  useEffect(() => {
    fetch(API_URL)
      .then((res) => res.json())
      .then(setHealth)
      .catch(() => setError('Chưa kết nối được backend (cổng 8080)'))
  }, [])

  return (
    <div className="app">
      <h1>Quản lý nhà hàng</h1>
      <p>Nhóm 10 – Công nghệ phần mềm</p>
      <div className="card">
        {health && <p>Backend: <b>{health.status}</b> – {health.app}</p>}
        {error && <p className="error">{error}</p>}
        {!health && !error && <p>Đang kiểm tra backend...</p>}
      </div>
    </div>
  )
}

export default App
