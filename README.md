# opencv-android
Example for using opencv with android.


1. Create a module named "opencv" for your android project.

2. Download opencv-android from [http://opencv.org/downloads.html](http://opencv.org/downloads.html)
 
3. Copy files from {opencv-android-dir}/sdk/java to opencv module.

4. Copy files from {opencv-android-dir}/sdk/native/libs to app/src/main/jniLibs
 
5. Add project dependency to your main module.

            dependencies {
                compile fileTree(dir: 'libs', include: ['*.jar'])
                compile 'com.android.support:appcompat-v7:21.0.3'
        
                compile project(':opencv')
            }

6. Load opencv library before using opencv java api.
        
            public class MainActivity extends ActionBarActivity {
            
            
                private static final String LOG_TAG = MainActivity.class.getSimpleName();
            
                static {
                    System.loadLibrary("opencv_java");
                }
            
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
            
                    Mat mat = new Mat();
                    Log.d(LOG_TAG, mat.toString());
                }
            
            
            }
