package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常） Created by jay-xqt on 2018/5/8.
 */
public class RepeatKillException extends RuntimeException {

    private static final long serialVersionUID=-7588706798824576584L;

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
