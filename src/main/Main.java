package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AntでHelloWorldのmain処理を持つクラス。<br>
 * <br>
 * @author tarosa0001
 */
public class Main {
    /** ロガー */
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * [main処理]<br>
     * AntでHelloWorldのmain処理。<br>
     * <br>
     * @param args コマンド引数
     */
    public static void main(String[] args) {
        logger.info("処理開始");

        logger.info("AntでHello World!!");

        logger.info("処理終了");
    }
}