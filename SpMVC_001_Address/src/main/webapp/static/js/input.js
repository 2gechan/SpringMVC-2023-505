// HTML DOM 기반의 JS 코드 시작점
document.addEventListener("DOMContentLoaded", () => {
  // div.message의 index 변수
  const INDEX = {
    ID: 0,
    NAME: 1,
    TEL: 2,
    ADDR: 3,
  };

  // DOM 객체(tag 객체)
  const form_addr = document.querySelector("form.main.input");
  const input_id = form_addr.querySelector("input[name='a_id']");
  const input_name = form_addr.querySelector("input[name='a_name']");
  const input_tel = form_addr.querySelector("input[name='a_tel']");
  const input_addr = form_addr.querySelector("input[name='a_addr']");
  const btn_input = form_addr.querySelector("button.input");
  const btn_list = form_addr.querySelector("button.list");

  const msg_boxs = document.querySelectorAll("div.message");

  // 2개의 매개변수를 받는 함수 선언
  const message_view = (index, className, message) => {
    const msg_box = msg_boxs[index];
    msg_box?.classList.remove("ok");
    msg_box?.classList.remove("error");

    msg_box?.classList.add(className);
    msg_box.querySelector("span").innerHTML = message;
  };

  // inline 익명(무명) 함수로 click event 설정
  btn_list?.addEventListener("click", (e) => {
    // alert("리스트 버튼 클릭");
    // 현재 화면에 보여줄 페이지 요청하기
    document.location.href = `${rootPath}`;
  });

  // event call 함수를 선언하고
  const inputButtonClickHandler = (e) => {
    // alert("추가 버튼 클릭")

    if (!input_id.value) {
      message_view(INDEX.ID, "error", "* ID는 반드시 입력해야 합니다.");

      // const msg_box = msg_boxs[INDEX.ID];
      // msg_box.classList.remove("ok");
      // msg_box.classList.add("error");
      // msg_box.querySelector("span").innerHTML =
      //   " * ID는 반드시 입력해야 합니다.";
      input_id.focus();
      return false;
    }

    // JS 코드에서 form에 포함된 button을 클릭했을때
    // Server로 데이터를 전송하라
    addr_input?.submit();
  };

  // 선언된 event call 함수를 사용하여 click event 선언
  btn_input?.addEventListener("click", inputButtonClickHandler);

  input_id?.addEventListener("blur", async (e) => {
    const value = e.target.value;
    const idCheck_url = `${rootPath}/id_check?id=${value}`;
    if (!value) {
      message_view(INDEX.ID, "error", "* ID를 입력해주세요");
      // id_box.classList.remove("ok");
      // id_box.classList.add("error");
      // span_box.innerHTML = "* ID를 입력해주세요";
      input_id.focus();
      return false;
    }
    const response = await fetch(idCheck_url);
    const result = await response.text();

    if (result === "OK") {
      message_view(INDEX.ID, "ok", "* 사용가능한 ID 입니다");
      // id_box.classList.remove("error");
      // id_box.classList.add("ok");
      // span_box.innerHTML = "* 사용가능한 ID 입니다";
    } else if (result === "FAIL") {
      message_view(INDEX.ID, "error", "* 이미 추가된 ID 입니다. 사용불가 !!!");
      // id_box.classList.remove("ok");
      // id_box.classList.add("error");
      // span_box.innerHTML = "* 이미 추가된 ID 입니다. 사용불가!!!";
      input_id.focus();
    } else {
      message_view(INDEX.ID, "error", "* 서버 오류. 알 수 없는 오류 !!");
      // id_box.classList.add("error");
      // span_box.innerHTML = "* 서버 오류. 알수 없는 오류!!";
      input_id.focus();
    }
  });
});
