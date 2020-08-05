package JxBrowser1;

import JxBrowser.myFrame;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.bb;
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
 * Created by luzhibin on 2020/8/4 14:57
 */
public class FindText1 {
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
        final BrowserView browserView = new BrowserView(browser);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL(url);


        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {

                if (event.isMainFrame()) {
                    browserView.setKeyEventsHandler(event1 -> {
                        if (event1.isControlDown() && event1.getKeyCode() == KeyEvent.VK_F
                                && event1.getID() == KEY_RELEASED) {

                            createNewGUI();
/*                            browser.findText(new SearchParams("7"), new SearchResultCallback() {
                                @Override
                                public void onResultReceived(SearchResult searchResult) {
                                    System.out.println("getNumberOfMatches()----------总数：:"+searchResult.getNumberOfMatches());
                                    System.out.println("indexOfSelectedMatch()----------:"+searchResult.indexOfSelectedMatch());
                                    System.out.println("indexOfSelectedMatch()----------:"+searchResult.toString());
                                }
                            });*/
                        }
                        return false;
                    });
                }
            }
        });
    }

    private static void createNewGUI(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                //创建一个窗口，创建一个窗口
                MyFrame1 frame = new MyFrame1("SwingDemo!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //设置窗口大小
                frame.setSize(350, 150);
                //显示窗口
                frame.setVisible(true);
            }
        });
    }
}
