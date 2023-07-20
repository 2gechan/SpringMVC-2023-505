document.addEventListener("DOMContentLoaded", () => {
  const nav = document.querySelector("nav.main");
  const nav_login = document.querySelector("li.login");
  const nav_join = document.querySelector("li.join");

  /*
  event 핸들러의 매개변수(e)
  e.currentTarget과 e.target 속성이 기본으로 포함되어 있다
  이 때 e.currentTarget은 event 핸들러가 부착된 tag(nav.main)이고
  e.target은 event 버블링에 의해 가장 안쪽에서 실제 event가 적용되는 tag(li)
  */
  const navClickHandler = (e) => {
    const current = e.currentTarget; // nav.main
    const target = e.target; // li

    if (target.tagName === "LI") {
      const targetClassName = target.className;
      let URL = `${rootPath}` + targetClassName;
      const USER_URL = "login join mypage logout";

      if (targetClassName === "home") {
        URL = `${rootPath}`;
        /*
         * 문자열.indexOf("찾는 문자열")
         *
         * 문자열 내에 찾는 문자열이 있으면 0 이상의 위치값을 return
         * 없으면 -1을 return
         *
         * 문자열.search("찾는 문자열")
         * 정규표현식으로 문자열을 찾을 수 있다.
         */
      } else if (USER_URL.indexOf(targetClassName) > -1) {
        URL = `${rootPath}user/` + targetClassName;
      }
      //    else if (targetClassName === "mycar") {
      //     URL += targetClassName;
      //   } else if (targetClassName === "tacho") {
      //     alert("tacho");
      //   } else if (targetClassName === "login") {
      //     alert("login");
      //   } else if (targetClassName === "join") {
      //     alert("join");
      //   }
      document.location.href = URL;
    }
  };

  // event bobbling을 역으로 활용하여
  // 한개의 event를 설정하여 할일들 처리하기
  nav?.addEventListener("click", navClickHandler);

  // 개별적인 LI tag에 click event를 설정하여
  // nav를 선택했을 때 할일들 지정
  /*
  nav_login?.addEventListener("click", () => {
    alert("login");
  });

  nav_join?.addEventListener("click", () => {
    alert("join");
  });
  */
});

/*
 * 0, "", undefined, NaN, null 값이 if() 명령을 만나면
 * 이 값들은 false로 취급된다
 *
 * const 변수 = 0;
 * if(변수) {
 *  console.log(`이 값은 0이 아님 ${변수}`)
 * } else {
 *  console.log(`이 값은 false로 취급 ${변수}`)
 * }
 *
 * const 변수1 = "";
 * const 변수2;
 * const 변수3 = 0;
 * const 변수 = 변수1 && 변수2 && 변수3
 */
