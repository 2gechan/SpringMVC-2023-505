const INPUT_INDEX = {
  NAME: 0,
  //   AREA: 1,
  //   GENDER: 2,
  PHONE: 1,
  MAIL: 2,
  PW_NAME: 3,
  PW_PHONE: 4,
};

document.addEventListener("DOMContentLoaded", () => {
  const find1 = () => {
    const find_inputs = document.querySelectorAll(".wrapper input");
    if (!find_inputs[INPUT_INDEX.NAME].value) {
      alert("이름은 필수 항목입니다");
      find_inputs[INPUT_INDEX.NAME].focus();
      return false;
    }
    if (!find_inputs[INPUT_INDEX.PHONE].value) {
      alert("휴대폰 번호는 필수 항목입니다");
      find_inputs[INPUT_INDEX.PHONE].focus();
      return false;
    }
    if (!document.getElementById("area").value) {
      alert("지역을 선택해주세요");
      area.focus();
      return false;
    }
    if (!document.getElementById("gender").value) {
      alert("성별을 선택해주세요");
      gender.focus;
      return false;
    }
    alert("찾으시는 ID는 XXX@XXXX.XXX 입니다");
  };
  const find2 = () => {
    const find_inputs = document.querySelectorAll(".wrapper input");
    if (!find_inputs[INPUT_INDEX.MAIL].value) {
      alert("이메일을 입력해주세요");
      find_inputs[INPUT_INDEX.MAIL].focus();
      return false;
    }
    if (!find_inputs[INPUT_INDEX.PW_NAME].value) {
      alert("이름을 입력해주세요");
      find_inputs[INPUT_INDEX.PW_NAME].focus();
      return false;
    }
    if (!find_inputs[INPUT_INDEX.PW_PHONE].value) {
      alert("휴대폰 번호는 필수 항목입니다");
      find_inputs[INPUT_INDEX.PW_PHONE].focus();
      return false;
    }
    alert("찾으시는 비밀번호는 ~~ 입니다");
  };
  document.querySelector("#find_button1").addEventListener("click", find1);
  document.querySelector("#find_button2").addEventListener("click", find2);
});
