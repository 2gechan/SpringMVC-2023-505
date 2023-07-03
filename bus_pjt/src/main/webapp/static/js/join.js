const phoneFocus1 = () => {
  const a1 = document.getElementById("a1").value;
  if (a1.length === 3) {
    document.getElementById("a2").focus();
  }
};

const phoneFocus2 = () => {
  const a2 = document.getElementById("a2").value;
  if (a2.length === 4) {
    document.getElementById("a3").disabled = false;
    document.getElementById("a3").focus();
  } else {
    document.getElementById("a3").disabled = true;
  }
};

const auth = () => {
  const a1 = document.getElementById("a1").value;
  const a2 = document.getElementById("a2").value;
  const a3 = document.getElementById("a3").value;

  if (a1.length === 3 && a2.length === 4 && a3.length === 4) {
    document.getElementById("authSend").disabled = false;
    document.getElementById("clear").style =
      "background: #0068ff; color: #ffffff; cursor: pointer;";
  } else {
    document.getElementById("authSend").disabled = true;
    document.getElementById("clear").style =
      "background: #ffffff; color: black; cursor: default;";
  }
};
let isStarted = false;
const createNum = () => {
  if (isStarted === false) {
    isStarted = true;
    document.getElementById("clear").disabled = false;
    document.getElementById("clear").style =
      "background: #0068ff; color: #ffffff; cursor: pointer;";

    let a = String(Math.floor(Math.random() * 1000000)).padStart(6, "0");
    document.getElementById("num1").innerText = a;

    let time = 10;
    let timer;

    timer = setInterval(function () {
      if (time >= 0) {
        let min = Math.floor(time / 60);
        let sec = String(time % 60).padStart(2, "0");
        document.getElementById("num2").innerText = min + ":" + sec;
        time = time - 1;
      } else {
        document.getElementById("clear").disabled = true;
        document.getElementById("clear").style =
          "background: #ffffff; color: black; cursor: default;";
        document.getElementById("num1").innerText = "000000";
        isStarted = false;
        clearInterval(timer);
      }
    }, 1000);
  } else {
  }
};

function authClear() {
  alert("인증이 완료되었습니다.");
}
