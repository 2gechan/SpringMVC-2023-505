const err_message = (e, err_box, message) => {
  const value = e.value;
  // 밑의 코드는 if(value === "") 와 동일하다
  if (!value) {
    err_box.classList.add("on");
    err_box.innerHTML = message;
    e.select();
    return false;
  }
  return true;
};
