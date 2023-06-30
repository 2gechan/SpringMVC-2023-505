document.addEventListener("DOMContentLoaded", () => {
  const list_table = document.querySelector("table.main.list");

  // table의 tr을 클릭했을 때 사용할 event
  const trClickHandler = (e) => {
    // table > tr 을 클릭했을 때 최종적으로 td가 클릭이 된다.
    // 최종적으로 클릭되는 요소를 e.target 이라고 한다.
    const td = e.target;
    if (td.tagName === "TD") {
      // td.closest
      // td를 감싸고 있는 TR중에서 가장 가까운  tag
      const tr = td.closest("TR");
      // data-id 속성에 설정된 값을 가져오기
      const id = tr.dataset.id;
      document.location.href = `${rootPath}/detail?id=${id}`;
    }
  };

  list_table?.addEventListener("click", trClickHandler);
});
