import "./App.css";
import FooterComponent from "./components/FooterComponent";

import ListEmployeeComponent from "./components/ListEmployeeComponent";
import EmployeeComponent from "./components/EmployeeComponent"; // Import EmployeeComponent

import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          {/* http://localhost:3000 */}
          <Route path="/" element={<ListEmployeeComponent />} />
          {/* http://localhost:3000/employees */}
          <Route path="/employees" element={<ListEmployeeComponent />} />
          {/* http://localhost:3000/add-employees */}
          <Route path="/add-employees" element={<EmployeeComponent />} />{" "}
          {/* http://localhost:3000/edit-employee/1 */}
          <Route path="/edit-employee/:id" element={<EmployeeComponent />} />
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;
