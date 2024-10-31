package solo.project.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LoginType {
    NOMAL("ROLE_NOMAL","자사 로그인"),
    KAKAO("ROLE_KAKAO","카카오 로그인");

    private final String key;
    private final String title;
}