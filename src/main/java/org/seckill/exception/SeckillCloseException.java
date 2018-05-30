package org.seckill.exception;

/**
 * Created by jay-xqt on 2018/5/8.
 */
public class SeckillCloseException extends SeckillException {

    private static final long serialVersionUID=1L;

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
