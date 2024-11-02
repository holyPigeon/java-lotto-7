# java-lotto-precourse

<div class="Container_box__GEbZX"><div class="MissionView_mission-viewer-body__OXsxc markdown-body"><h2>목표</h2><h3>학습 목표</h3><ul><li>관련 함수를 묶어 클래스를 만들고, 객체들이 협력하여 하나의 큰 기능을 수행하도록 한다.</li><li>클래스와 함수에 대한 단위 테스트를 통해 의도한 대로 정확하게 작동하는 영역을 확보한다.</li><li><a href="https://docs.google.com/document/d/1QW_762N0WC6JvAiDHNBYXzLJ60y1Azex1d7tID0BggM/edit?usp=sharing">2주 차 공통 피드백</a>을 최대한 반영한다.</li></ul><hr><h2>프리코스 진행 방식</h2><h3>진행 방식</h3><ul><li>미션은 <strong>과제 진행 요구 사항</strong>, <strong>기능 요구 사항</strong>, <strong>프로그래밍 요구 사항</strong> 세 가지로 구성되어 있다.</li><li>세 개의 요구 사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.</li><li><strong>기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.</strong></li><li>매주 진행할 미션은 화요일 오후 3시부터 확인할 수 있으며, 다음 주 월요일까지 구현을 완료하여 제출해야 한다. <strong>제출은 일요일 오후 3시부터 가능하다.</strong><ul><li><strong>정해진 시간을 지키지 않을 경우 미션을 제출하지 않은 것으로 간주한다.</strong></li><li>종료 일시 이후에는 추가 푸시를 허용하지 않는다.</li></ul></li></ul><h3>미션 제출 방법</h3><ul><li>미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.<ul><li>GitHub을 활용한 제출 방법은 <a href="https://github.com/woowacourse/woowacourse-docs/tree/master/precourse">프리코스 과제 제출</a> 문서를 참고해 제출한다.</li></ul></li><li>GitHub에 미션을 제출한 후 <a href="https://apply.techcourse.co.kr">우아한테크코스 지원 플랫폼</a>에 PR 링크를 포함하여 최종 제출한다.<ul><li>자세한 안내는 <a href="https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#%EC%A0%9C%EC%B6%9C-%EA%B0%80%EC%9D%B4%EB%93%9C">제출 가이드</a>를 참고한다.</li><li>과제를 수행하면서 느낀 점, 배운 점, 많은 시간을 투자한 부분 등 자유롭게 작성한다.</li></ul></li></ul><h3>과제 제출 전 체크 리스트</h3><ul><li>기능을 올바르게 구현했더라도 <strong>요구 사항에 명시된 출력 형식을 따르지 않으면 0점</strong>을 받게 된다.</li><li>기능 구현을 완료한 후 아래 가이드에 따라 모든 테스트가 성공적으로 실행되는지 확인한다.</li><li><strong>테스트가 실패하면 점수가 0점</strong>이 되므로 제출하기 전에 반드시 확인한다.</li></ul><h4>테스트 실행 가이드</h4><ul><li>터미널에서 <code>java -version</code>을 실행하여 Java 버전이 21인지 확인한다. Eclipse 또는 IntelliJ IDEA와 같은 IDE에서 Java 21로 실행되는지 확인한다.</li><li>터미널에서 Mac 또는 Linux 사용자의 경우 <code>./gradlew clean test</code> 명령을 실행하고, Windows 사용자의 경우 <code>gradlew.bat clean test</code> 또는 <code>.\gradlew.bat clean test</code> 명령을 실행할 때 모든 테스트가 아래와 같이 통과하는지 확인한다.</li></ul><pre><code data-highlighted="yes" class="hljs language-apache"><span class="hljs-attribute">BUILD</span> SUCCESSFUL in <span class="hljs-number">0</span>s
</code></pre><hr><h1>로또</h1><h2>과제 진행 요구 사항</h2><ul><li>미션은 <a href="https://github.com/woowacourse-precourse/java-lotto-7">로또</a> 저장소를 포크하고 클론하는 것으로 시작한다.</li><li><strong>기능을 구현하기 전 <code>README.md</code>에 구현할 기능 목록을 정리</strong>해 추가한다.</li><li>Git의 커밋 단위는 앞 단계에서 <code>README.md</code>에 정리한 기능 목록 단위로 추가한다.<ul><li><a href="https://gist.github.com/stephenparish/9941e89d80e2bc58a153">AngularJS Git Commit Message Conventions</a>을 참고해 커밋 메시지를 작성한다.</li></ul></li><li>자세한 과제 진행 방법은 프리코스 진행 가이드 문서를 참고한다.</li></ul><h2>기능 요구 사항</h2><p>간단한 로또 발매기를 구현한다.</p><ul><li>로또 번호의 숫자 범위는 1~45까지이다.</li><li>1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.</li><li>당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.</li><li>당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.<ul><li>1등: 6개 번호 일치 / 2,000,000,000원</li><li>2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원</li><li>3등: 5개 번호 일치 / 1,500,000원</li><li>4등: 4개 번호 일치 / 50,000원</li><li>5등: 3개 번호 일치 / 5,000원</li></ul></li><li>로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.</li><li>로또 1장의 가격은 1,000원이다.</li><li>당첨 번호와 보너스 번호를 입력받는다.</li><li>사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.</li><li>사용자가 잘못된 값을 입력할 경우 <code>IllegalArgumentException</code>을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.<ul><li><code>Exception</code>이 아닌 <code>IllegalArgumentException</code>, <code>IllegalStateException</code> 등과 같은 명확한 유형을 처리한다.</li></ul></li></ul><h3>입출력 요구 사항</h3><h4>입력</h4><ul><li>로또 구입 금액을 입력 받는다. 구입 금액은 1,000원 단위로 입력 받으며 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.</li></ul><pre><code data-highlighted="yes" class="hljs language-undefined">14000
</code></pre><ul><li>당첨 번호를 입력 받는다. 번호는 쉼표(,)를 기준으로 구분한다.</li></ul><pre><code data-highlighted="yes" class="hljs language-apache"><span class="hljs-attribute">1</span>,<span class="hljs-number">2</span>,<span class="hljs-number">3</span>,<span class="hljs-number">4</span>,<span class="hljs-number">5</span>,<span class="hljs-number">6</span>
</code></pre><ul><li>보너스 번호를 입력 받는다.</li></ul><pre><code data-highlighted="yes" class="hljs language-undefined">7
</code></pre><h4>출력</h4><ul><li>발행한 로또 수량 및 번호를 출력한다. 로또 번호는 오름차순으로 정렬하여 보여준다.</li></ul><pre><code data-highlighted="yes" class="hljs language-prolog"><span class="hljs-number">8</span>개를 구매했습니다.
[<span class="hljs-number">8</span>, <span class="hljs-number">21</span>, <span class="hljs-number">23</span>, <span class="hljs-number">41</span>, <span class="hljs-number">42</span>, <span class="hljs-number">43</span>] 
[<span class="hljs-number">3</span>, <span class="hljs-number">5</span>, <span class="hljs-number">11</span>, <span class="hljs-number">16</span>, <span class="hljs-number">32</span>, <span class="hljs-number">38</span>] 
[<span class="hljs-number">7</span>, <span class="hljs-number">11</span>, <span class="hljs-number">16</span>, <span class="hljs-number">35</span>, <span class="hljs-number">36</span>, <span class="hljs-number">44</span>] 
[<span class="hljs-number">1</span>, <span class="hljs-number">8</span>, <span class="hljs-number">11</span>, <span class="hljs-number">31</span>, <span class="hljs-number">41</span>, <span class="hljs-number">42</span>] 
[<span class="hljs-number">13</span>, <span class="hljs-number">14</span>, <span class="hljs-number">16</span>, <span class="hljs-number">38</span>, <span class="hljs-number">42</span>, <span class="hljs-number">45</span>] 
[<span class="hljs-number">7</span>, <span class="hljs-number">11</span>, <span class="hljs-number">30</span>, <span class="hljs-number">40</span>, <span class="hljs-number">42</span>, <span class="hljs-number">43</span>] 
[<span class="hljs-number">2</span>, <span class="hljs-number">13</span>, <span class="hljs-number">22</span>, <span class="hljs-number">32</span>, <span class="hljs-number">38</span>, <span class="hljs-number">45</span>] 
[<span class="hljs-number">1</span>, <span class="hljs-number">3</span>, <span class="hljs-number">5</span>, <span class="hljs-number">14</span>, <span class="hljs-number">22</span>, <span class="hljs-number">45</span>]
</code></pre><ul><li>당첨 내역을 출력한다.</li></ul><pre><code data-highlighted="yes" class="hljs language-apache"><span class="hljs-attribute">3</span>개 일치 (<span class="hljs-number">5</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">1</span>개
<span class="hljs-attribute">4</span>개 일치 (<span class="hljs-number">50</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-attribute">5</span>개 일치 (<span class="hljs-number">1</span>,<span class="hljs-number">500</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-attribute">5</span>개 일치, 보너스 볼 일치 (<span class="hljs-number">30</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-attribute">6</span>개 일치 (<span class="hljs-number">2</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
</code></pre><ul><li>수익률은 소수점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)</li></ul><pre><code data-highlighted="yes" class="hljs language-erlang-repl">총 수익률은 <span class="hljs-number">62.5</span><span class="hljs-comment">%입니다.</span>
</code></pre><ul><li>예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 "[ERROR]"로 시작해야 한다.</li></ul><pre><code data-highlighted="yes" class="hljs language-prolog">[<span class="hljs-symbol">ERROR</span>] 로또 번호는 <span class="hljs-number">1</span>부터 <span class="hljs-number">45</span> 사이의 숫자여야 합니다.
</code></pre><h4>실행 결과 예시</h4><pre><code data-highlighted="yes" class="hljs language-prolog">구입금액을 입력해 주세요.
<span class="hljs-number">8000</span>

<span class="hljs-number">8</span>개를 구매했습니다.
[<span class="hljs-number">8</span>, <span class="hljs-number">21</span>, <span class="hljs-number">23</span>, <span class="hljs-number">41</span>, <span class="hljs-number">42</span>, <span class="hljs-number">43</span>] 
[<span class="hljs-number">3</span>, <span class="hljs-number">5</span>, <span class="hljs-number">11</span>, <span class="hljs-number">16</span>, <span class="hljs-number">32</span>, <span class="hljs-number">38</span>] 
[<span class="hljs-number">7</span>, <span class="hljs-number">11</span>, <span class="hljs-number">16</span>, <span class="hljs-number">35</span>, <span class="hljs-number">36</span>, <span class="hljs-number">44</span>] 
[<span class="hljs-number">1</span>, <span class="hljs-number">8</span>, <span class="hljs-number">11</span>, <span class="hljs-number">31</span>, <span class="hljs-number">41</span>, <span class="hljs-number">42</span>] 
[<span class="hljs-number">13</span>, <span class="hljs-number">14</span>, <span class="hljs-number">16</span>, <span class="hljs-number">38</span>, <span class="hljs-number">42</span>, <span class="hljs-number">45</span>] 
[<span class="hljs-number">7</span>, <span class="hljs-number">11</span>, <span class="hljs-number">30</span>, <span class="hljs-number">40</span>, <span class="hljs-number">42</span>, <span class="hljs-number">43</span>] 
[<span class="hljs-number">2</span>, <span class="hljs-number">13</span>, <span class="hljs-number">22</span>, <span class="hljs-number">32</span>, <span class="hljs-number">38</span>, <span class="hljs-number">45</span>] 
[<span class="hljs-number">1</span>, <span class="hljs-number">3</span>, <span class="hljs-number">5</span>, <span class="hljs-number">14</span>, <span class="hljs-number">22</span>, <span class="hljs-number">45</span>]

당첨 번호를 입력해 주세요.
<span class="hljs-number">1</span>,<span class="hljs-number">2</span>,<span class="hljs-number">3</span>,<span class="hljs-number">4</span>,<span class="hljs-number">5</span>,<span class="hljs-number">6</span>

보너스 번호를 입력해 주세요.
<span class="hljs-number">7</span>

당첨 통계
---
<span class="hljs-number">3</span>개 일치 (<span class="hljs-number">5</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">1</span>개
<span class="hljs-number">4</span>개 일치 (<span class="hljs-number">50</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-number">5</span>개 일치 (<span class="hljs-number">1</span>,<span class="hljs-number">500</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-number">5</span>개 일치, 보너스 볼 일치 (<span class="hljs-number">30</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
<span class="hljs-number">6</span>개 일치 (<span class="hljs-number">2</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>,<span class="hljs-number">000</span>원) - <span class="hljs-number">0</span>개
총 수익률은 <span class="hljs-number">62.5</span><span class="hljs-comment">%입니다.</span>
</code></pre><h2>프로그래밍 요구 사항 1</h2><ul><li>JDK 21 버전에서 실행 가능해야 한다.</li><li>프로그램 실행의 시작점은 <code>Application</code>의 <code>main()</code>이다.</li><li><code>build.gradle</code> 파일은 변경할 수 없으며, <strong>제공된 라이브러리 이외의 외부 라이브러리는 사용하지 않는다.</strong></li><li>프로그램 종료 시 <code>System.exit()</code>를 호출하지 않는다.</li><li>프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.</li><li>자바 코드 컨벤션을 지키면서 프로그래밍한다.<ul><li>기본적으로 <a href="https://github.com/woowacourse/woowacourse-docs/blob/main/styleguide/java">Java Style Guide</a>를 원칙으로 한다.</li></ul></li></ul><h2>프로그래밍 요구 사항 2</h2><ul><li>indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.<ul><li>예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.</li><li>힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.</li></ul></li><li>3항 연산자를 쓰지 않는다.</li><li>함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.</li><li>JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.<ul><li>테스트 도구 사용법이 익숙하지 않다면 아래 문서를 참고하여 학습한 후 테스트를 구현한다.<ul><li><a href="https://junit.org/junit5/docs/current/user-guide">JUnit 5 User Guide</a></li><li><a href="https://assertj.github.io/doc">AssertJ User Guide</a></li><li><a href="https://www.baeldung.com/assertj-exception-assertion">AssertJ Exception Assertions</a></li><li><a href="https://www.baeldung.com/parameterized-tests-junit-5">Guide to JUnit 5 Parameterized Tests</a></li></ul></li></ul></li></ul><h2>프로그래밍 요구 사항 3</h2><ul><li>함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.<ul><li>함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.</li></ul></li><li>else 예약어를 쓰지 않는다.<ul><li>else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.</li><li>힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.</li></ul></li><li>Java Enum을 적용하여 프로그램을 구현한다.</li><li>구현한 기능에 대한 단위 테스트를 작성한다. 단, UI(System.out, System.in, Scanner) 로직은 제외한다.<ul><li>단위 테스트 작성이 익숙하지 않다면 <code>LottoTest</code>를 참고하여 학습한 후 테스트를 작성한다.</li></ul></li></ul><h3>라이브러리</h3><ul><li><code>camp.nextstep.edu.missionutils</code>에서 제공하는 <code>Randoms</code> 및 <code>Console</code> API를 사용하여 구현해야 한다.<ul><li>Random 값 추출은 <code>camp.nextstep.edu.missionutils.Randoms</code>의 <code>pickUniqueNumbersInRange()</code>를 활용한다.</li><li>사용자가 입력하는 값은 <code>camp.nextstep.edu.missionutils.Console</code>의 <code>readLine()</code>을 활용한다.</li></ul></li></ul><h4>사용 예시</h4><ul><li>1에서 45 사이의 중복되지 않은 정수 6개 반환</li></ul><pre><code class="language-java hljs" data-highlighted="yes">Randoms.pickUniqueNumbersInRange(<span class="hljs-number">1</span>, <span class="hljs-number">45</span>, <span class="hljs-number">6</span>);
</code></pre><h3>Lotto 클래스</h3><ul><li>제공된 <code>Lotto</code> 클래스를 사용하여 구현해야 한다.</li><li><code>Lotto</code>에 <code>numbers</code> 이외의 필드(인스턴스 변수)를 추가할 수 없다.</li><li><code>numbers</code>의 접근 제어자인 <code>private</code>은 변경할 수 없다.</li><li><code>Lotto</code>의 패키지를 변경할 수 있다.</li></ul>
```java
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // TODO: 추가 기능 구현
}
```
