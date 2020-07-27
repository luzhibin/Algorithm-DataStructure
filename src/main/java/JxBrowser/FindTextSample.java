package JxBrowser;

import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.dom.*;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import com.teamdev.jxbrowser.search.FindOptions;
import com.teamdev.jxbrowser.search.TextFinder;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static java.awt.event.KeyEvent.KEY_RELEASED;

/**
 * This sample demonstrates, how to find text on the loaded web page.
 */
public class FindTextSample {

    private static void hackBrowser() {
        try {
            System.setProperty("teamdev.license.info", "true");
            Field e = bb.class.getDeclaredField("e");
            e.setAccessible(true);
            Field f = bb.class.getDeclaredField("f");
            f.setAccessible(true);
            Field modifersField = Field.class.getDeclaredField("modifiers");
            modifersField.setAccessible(true);
            modifersField.setInt(e, e.getModifiers() & ~Modifier.FINAL);
            modifersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);
            e.set(null, new BigInteger("1"));
            f.set(null, new BigInteger("1"));
            modifersField.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        hackBrowser();
        final String url = "http://m.baidu.com/";
        final String title = "百度";
        final Browser browser = new Browser();
        final DOMDocument document = browser.getDocument();
        final BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame();
        //close功能
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //不显示标题栏,最大化,最小化,退出按钮
        //frame.setUndecorated(true);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL(url);
/*        browser.loadHTML("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<title>www.jb51.net JS关键字文本高亮</title>\n" +
                "</head>\n" +
                "  <body>\n" +
                "    <div id=\"content\">\n" +
                "      前端通常是指网站的表现层和结构层。因此前端技术一般分为前端设计和前端开发，前端设计一般可以理解为网站的视觉设计，前端开发则是网站的前台代码实现，现在最新的高级版本HTML5、CSS3，以及SVG等。\n" +
                "      HTML、CSS、JavaScript是前端开发中最基本也是最必须的三个技能。前端的开发中，在页面的布局时， HTML将元素进行定义，CSS对展示的元素进行定位，再通过JavaScript实现相应的效果和交互。虽然表面看起来很简单，但这里面需要掌握的东西绝对不会少。在进行开发前，需要对这些概念弄清楚、弄明白，这样在开发的过程中才会得心应手。\n" +
                "    </div>\n" +
                "    <input type=\"text\" id=\"text\" placeholder=\"请输入关键字\"/>\n" +
                "<script>\n" +
                        "       var content = document.getElementById(\"content\");\n" +
                        "       var contents = content.innerHTML;\n" +
                        "       var text = document.getElementById(\"text\");\n" +
                        "       text.onkeyup= function() {\n" +
                        "         var value = text.value;\n" +
                        "         var values = contents.split(value);\n" +
                        "         content.innerHTML = values.join('<span style=\"background:red;\">' + value + '</span>');\n" +
                        "       };\n" +
                        "    </script>\n"+
                "  </body>\n" +
                "</html>");*/
        //browser.executeJavaScript("");

        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {
                if (event.isMainFrame()) {

                    SearchParams request = new SearchParams("7");
                    // Find text from the beginning of the loaded web page.
                    SearchResult result = browser.findText(request);
                    //TextFinder textFinder = browser.findText();
                    //DOMElement element = document.findElement(By.id(result.toString()));
                    //TextFinder textFinder = browser.textFinder();
                    browserView.setKeyEventsHandler(new InputEventsHandler<KeyEvent>() {
                        @Override
                        public boolean handle(KeyEvent event) {
                            if (event.isControlDown() && event.getKeyCode() == KeyEvent.VK_F
                                    && event.getID() == KEY_RELEASED) {
                                browser.findText(new SearchParams("7"));
                                textFinder.find("text", FindOptions.newBuilder()
                                        .matchCase(true)
                                        .build(), findResult -> {
                                    // Check if the text search has been finished.
                                    if (findResult.isSearching()) {
                                        // The Text Finder is still searching the text.
                                        // It's recommended to wait until the search is finished.
                                    } else {
                                        // Text search has been finished, so get total the number of matches.
                                        int numberOfMatches = findResult.numberOfMatches();
                                    }
                                });

                            }
                            return false;
                        }
                    });
                }
            }
        });
    }
}

