document.addEventListener("DOMContentLoaded", () => {
  function handleChange() {
    const select1 = document.getElementById("select1");
    const select2 = document.getElementById("select2");
    const mainviewForm = document.getElementById("mainview");

    const stopAni_str = document.getElementById("stop-image-str");
    const stopAni_end = document.getElementById("stop-image-end");
    const moveAni = document.getElementById("moving-image");

    if (select1.value === "str_default") {
      alert("첫 번째 선택지를 먼저 선택해주세요.");
      mainviewForm.style.display = "none";

      return false;
    }

    if (select1.value === "str0006" && select2.value === "end0001") {
      mainviewForm.style.display = "flex";

      stopAni_str.style.display = "flex";
      stopAni_end.style.display = "flex";
      moveAni.style.display = "flex";

      stopAni_str.style.animationPlayState = "running";
      stopAni_end.style.animationPlayState = "running";
      moveAni.style.animationPlayState = "running";
    } else {
      mainviewForm.style.display = "none";

      stopAni_str.style.display = "none";
      stopAni_end.style.display = "none";
      moveAni.style.display = "none";

      stopAni_str.style.animationPlayState = "paused";
      stopAni_end.style.animationPlayState = "paused";
      moveAni.style.animationPlayState = "paused";
    }
  }

  select1.addEventListener("change", handleChange);
  select2.addEventListener("change", handleChange);
});
