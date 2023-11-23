import React, { useState, useEffect } from 'react';
import axios from 'axios';

const MarksComponent = () => {
  const [marks, setMarks] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8084/api/marks/top10')
      .then(response => setMarks(response.data))
      .catch(error => console.error('Error fetching marks:', error));
  }, []);

  return (
    <div>
      <h2>Marks Data</h2>
      <ul>
        {marks.map(mark => (
          <li key={mark.id}>{`${mark.id} - ${mark.studentName} - ${mark.teacherName} - ${mark.subject} - ${mark.marks}`}</li>
        ))}
      </ul>
    </div>
  );
};

export default MarksComponent;
