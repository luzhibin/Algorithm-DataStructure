package JxBrowser;

import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

import static java.awt.event.KeyEvent.KEY_RELEASED;

/**
 * This sample demonstrates, how to find text on the loaded web page.
 */
public class FindTextSample {

    public static String showInputDialog(Component parentComponent,Object message,String title,int messageType){
        return null;
    }
    public static Object showInputDSalog(Component parentComponent,Object message,String title,int messageType,Icon icon,Object[] selectionValue,Object initValue){
        JOptionPane.showInputDialog(parentComponent,"请输入用户名","输入用户名",1);
        return message;
    }

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
/*        browser.loadHTML("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>JavaScript Prompt</h1>\n" +
                "\n" +
                "<button onclick=\"myFunction()\">试一试</button>\n" +
                "\n" +
                "<p id=\"demo\"></p>\n" +
                "</body>\n" +
                "</html>");*/



        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {

                if (event.isMainFrame()) {
//                    SearchParams request = new SearchParams("7");
//                    SearchResult result = browser.findText(request);
                    //TextFinder textFinder = browser.findText();
                    //DOMElement element = document.findElement(By.id(result.toString()));
                    //TextFinder textFinder = browser.textFinder();
                    browserView.setKeyEventsHandler(event1 -> {
                        if (event1.isControlDown() && event1.getKeyCode() == KeyEvent.VK_F
                                && event1.getID() == KEY_RELEASED) {
                            //showInputDSalog();
                            browser.findText(new SearchParams("7"), new SearchResultCallback() {
                                @Override
                                public void onResultReceived(SearchResult searchResult) {
                                    System.out.println("getNumberOfMatches()----------总数：:"+searchResult.getNumberOfMatches());
                                    System.out.println("indexOfSelectedMatch()----------:"+searchResult.indexOfSelectedMatch());
                                    System.out.println("indexOfSelectedMatch()----------:"+searchResult.toString());
                                }
                            });
                        }
                        return false;
                    });

                }
            }
        });
    }
}

