package zut.ipz.dbproject.constant;

import lombok.Getter;

@Getter
public enum SpecialSignConstant {
    COMMA(","),
    OPEN_BRACKET("("),
    CLOSE_BRACKET(")"),
    BACKTICK("`"),
    SPACE(" ");
    private final String symbol;

    SpecialSignConstant(String sign) {
        this.symbol = sign;
    }
}
