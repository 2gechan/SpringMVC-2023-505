document.addEventListener("DOMContentLoaded", () => {
  const btn_list = document.querySelector("button.detail.list");
  const btn_update = document.querySelector("button.detail.update");
  const btn_delete = document.querySelector("button.detail.delete");

  btn_list?.addEventListener("click", () => {
    document.location.href = `${rootPath}/`;
  });

  btn_update?.addEventListener("click", (e) => {
    const id = e.target.dataset.id;
    document.location.href = `${rootPath}/update?id=${id}`;
  });

  btn_delete?.addEventListener("click", (e) => {
    // 클릭된 button tag가 가장 하위에 있기 때문에
    // click event e.target은 delete button이 된다.
    const btn = e.target;
    const id = btn.dataset.id;

    if (confirm("삭제한 데이터는 복구할 수 없습니다.\n정말 삭제할까요?")) {
      document.location.href = `${rootPath}/delete?id=${id}`;
    }
  });
});
