package exception;

public enum ErrorMessage {
    NULL_INPUT_ERROR("null은 입력할 수 없는 값입니다. 다시 입력해 주세요."),
    EMPTY_INPUT_ERROR("빈 문자열은 입력할 수 없습니다. 다시 입력해 주세요."),
    INVALID_AMOUNT_PATTERN_ERROR("구입 금액은 1000원 단위의 양수여야 합니다. 다시 입력해 주세요."),
    MAX_AMOUNT_ERROR("로또는 1인당 최대 100장까지 구매할 수 있습니다. 다시 입력해 주세요.")
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
