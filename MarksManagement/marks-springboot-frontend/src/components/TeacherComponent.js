import React, { useState, useEffect } from 'react';
import axios from 'axios';

const TeacherComponent = () => {
  const [teachers, setTeachers] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8084/api/teachers')
      .then(response => setTeachers(response.data))
      .catch(error => console.error('Error fetching teachers:', error));
  }, []);

  return (
    <div>
      <h2>Teacher Data</h2>
      <ul>
        {teachers.map(teacher => (
          <li key={teacher.id}>{`${teacher.id} - ${teacher.teacherName}`}</li>
        ))}
      </ul>
    </div>
  );
};

export default TeacherComponent;
