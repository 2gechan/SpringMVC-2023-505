function checkOnlyOne(element) {
  const checkboxes = document.getElementsByName("check");

  checkboxes.forEach((cb) => {
    cb.checked = false;
  });

  element.checked = true;
}

// 미선택시 alert , 선택시 노선조회로...
document.addEventListener("DOMContentLoaded", () => {
  const select = () => {
    const checkbox = document.querySelector(
      "input[type=checkbox][name=check]:checked"
    );

    if (!checkbox) {
      alert("조회할 즐겨찾기를 선택 해주세요");
      return false;
    }

    window.location.href = "searchBus.html";
  };

  document.querySelector("#select_btn").addEventListener("click", select);
});
/*
  const select1 = document.getElementById("select1");
  const select2 = document.getElementById("select2");
  const mainviewForm = document.getElementById("mainview");
  
  const stopAni_str = document.getElementById("stop-image-str");
  const stopAni_end = document.getElementById("stop-image-end");
  const moveAni = document.getElementById("moving-image");
  select1.value = "str0006";
  select2.value = "end0001";
  
  if (select1.value === "str0006" && select2.value === "end0001") {
    mainviewForm.style.display = "flex";
  
    stopAni_str.style.display = "flex";
    stopAni_end.style.display = "flex";
    moveAni.style.display = "flex";
  
    stopAni_str.style.animationPlayState = "running";
    stopAni_end.style.animationPlayState = "running";
    moveAni.style.animationPlayState = "running";
  }
  */
