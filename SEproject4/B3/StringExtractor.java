import java.util.ArrayList;
import java.util.List;

public class StringExtractor {

    /**
     * 提取源代码中的所有字符串.
     * @param sourceCode 源代码字符串
     * @return 所有提取的字符串列表
     */
    public static List<String> extractStrings(String sourceCode) {
        List<String> extractedStrings = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        boolean inString = false;  // 是否在字符串中
        boolean escape = false;    // 是否处于转义状态

        for (int i = 0; i < sourceCode.length(); i++) {
            char c = sourceCode.charAt(i);

            if (inString) {
                // 当前在字符串中
                if (escape) {
                    // 转义字符处理
                    if (c == '"' || c == '\\') {
                        currentString.append(c);  // 转义双引号或反斜杠
                    } else {
                        currentString.append('\\').append(c); // 保留未识别的转义字符
                    }
                    escape = false;
                } else {
                    if (c == '\\') {
                        escape = true;  // 进入转义状态
                    } else if (c == '"') {
                        // 字符串结束
                        inString = false;
                        extractedStrings.add(currentString.toString());
                        currentString.setLength(0); // 清空 StringBuilder
                    } else {
                        currentString.append(c); // 添加普通字符
                    }
                }
            } else {
                // 未在字符串中
                if (c == '"') {
                    inString = true; // 进入字符串
                }
            }
        }

        return extractedStrings;
    }

    public static void main(String[] args) {
        String sourceCode = "System.out.println(\"一般学习一门编程语言的时候，基本上第一个程序是输出\\\"Hello World!\\\"\");";
        List<String> strings = extractStrings(sourceCode);

        System.out.println("提取的字符串:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
