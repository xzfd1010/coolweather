package zhongcheng.example.coolweather.util;

/**
 * Created by Administrator on 2016/1/29.
 * 服务器返回结果的监听类
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
