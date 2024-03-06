// 주어진 학생 목록에서 성적이 80점 이상인 학생들의 목록을 필터링하는 함수
function filterHighScorers(students) {
// filter 메서드를 사용하여 성적이 80점 이상인 학생들만 필터링하여 반환
  return students.filter(student => student.score >= 80);
}

// 학생들의 이름과 성적을 담은 배열
const students = [
  { name: "홍길동", score: 74 },
  { name: "손흥민", score: 98 },
  { name: "이강인", score: 81 },
  { name: "황희찬", score: 65 }
];

// 필터링 함수를 호출하고 결과를 콘솔에 출력
console.log(filterHighScorers(students));
