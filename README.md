# Tab Demo
- 安卓课程项目 Tab标签页demo
- 目前希望使用FragmentAcitivity作为MainAcitivity的继承来实现
- 可能要自己画好多东西

很多demo都是在[这里](http://www.cnblogs.com/hawkon/p/3593709.html)找到的，有的还挺有用的
**我先把这一页一页先画出来吧** 

# 抓紧时间
*Deadline* Week 8

# 目前的实现方法
## 代码
'''java
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (frame_test == null) {
            frame_test = new FrameTest();
        }
    }
}

'''

