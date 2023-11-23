import React, { useState, useEffect } from 'react';
import axios from 'axios';

const StudentComponent = () => {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8084/api/students')
      .then(response => setStudents(response.data))
      .catch(error => console.error('Error fetching students:', error));
  }, []);

  return (
    <div>
      <h2>Student Data</h2>
      <ul>
        {students.map(student => (
          <li key={student.id}>{`${student.id} - ${student.name}`}</li>
        ))}
      </ul>
    </div>
  );
};

export default StudentComponent;
