package company.co.kr.pushapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void show() {
        int f;
        String arr[]={"감사해요", "오늘 하루도 수고했어요", "힘내세요", "사랑해요", "웃어봐요"};  // 기분좋아지는 말들

        f= (int)(Math.random() * arr.length);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "default");

        // 필수 항목
        builder.setSmallIcon(R.drawable.happy);
        builder.setContentTitle("기분 좋아지는 말");
        builder.setContentText(arr[f]+"");

        // 액션 정의
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        // 클릭 이벤트 설정
        builder.setContentIntent(pendingIntent);

        // 큰 아이콘 설정
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        builder.setLargeIcon(largeIcon);

        // 색상 변경
        builder.setColor(Color.GREEN);

        // 기본 알림음 사운드 설정
        Uri ringtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(ringtoneUri);

        // 진동설정: 대기시간, 진동시간, 대기시간, 진동시간 ... 반복 패턴
        long[] vibrate = {0, 100, 200, 300};
        builder.setVibrate(vibrate);

        builder.setAutoCancel(true);

        // 알림 매니저
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // 오레오에서는 알림 채널을 매니저에 생성해야 한다
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(new NotificationChannel("default", "기본 채널", NotificationManager.IMPORTANCE_DEFAULT));
        }

        // 알림 통지
        manager.notify(1, builder.build());
    }



    private void show2() {
        int f;
        String arr[]={"고통없이 배울 수 없다 -아리스토텔레스-", "삶이 있는 한 희망은 있다 -키케로-", "나만이 내 인생을 바꿀 수 있다. 아무도 날 대신해 줄 수 없다 -캐롤 버넷-",
                "내가 있는 곳이 낙원이라 -볼테르-", "내 자신에 대한 자신감을 잃으면, 온 세상이 나의 적이 된다 -랄프 왈도 에머슨-"};    // 슬플때 글귀

        f= (int)(Math.random() * arr.length);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "default");

        // 필수 항목
        builder.setSmallIcon(R.drawable.unhappy);
        builder.setContentTitle("슬플때");
        builder.setContentText(arr[f]+"");

        // 액션 정의
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        // 클릭 이벤트 설정
        builder.setContentIntent(pendingIntent);

        // 큰 아이콘 설정
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        builder.setLargeIcon(largeIcon);

        // 색상 변경
        builder.setColor(Color.GREEN);

        // 기본 알림음 사운드 설정
        Uri ringtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(ringtoneUri);

        // 진동설정: 대기시간, 진동시간, 대기시간, 진동시간 ... 반복 패턴
        long[] vibrate = {0, 100, 200, 300};
        builder.setVibrate(vibrate);

        builder.setAutoCancel(true);

        // 알림 매니저
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // 오레오에서는 알림 채널을 매니저에 생성해야 한다
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(new NotificationChannel("default", "기본 채널", NotificationManager.IMPORTANCE_DEFAULT));
        }

        // 알림 통지
        manager.notify(1, builder.build());
    }



    private void show3() {
        int f;
        String arr[]={"'원래 그런거야'라고 생각해봐요", "'그 일은 정말 웃긴다'라고 생각해봐요", "즐거웠던 순간을 떠올려봐요",
                "'그럴 만한 사정이 있겠지'라고 생각해봐요", "눈을 감고 심호흡을 해봐요", "시간이 약이에요. 시간이 흐르면 다 괜찮아 질거에요", "집밖으로 나가서 산책을 해봐요"};    // 화날때 글귀

        f= (int)(Math.random() * arr.length);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "default");

        // 필수 항목
        builder.setSmallIcon(R.drawable.angry);
        builder.setContentTitle("화날때");
        builder.setContentText(arr[f]+"");

        // 액션 정의
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        // 클릭 이벤트 설정
        builder.setContentIntent(pendingIntent);

        // 큰 아이콘 설정
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        builder.setLargeIcon(largeIcon);

        // 색상 변경
        builder.setColor(Color.GREEN);

        // 기본 알림음 사운드 설정
        Uri ringtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(ringtoneUri);

        // 진동설정: 대기시간, 진동시간, 대기시간, 진동시간 ... 반복 패턴
        long[] vibrate = {0, 100, 200, 300};
        builder.setVibrate(vibrate);

        builder.setAutoCancel(true);

        // 알림 매니저
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // 오레오에서는 알림 채널을 매니저에 생성해야 한다
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(new NotificationChannel("default", "기본 채널", NotificationManager.IMPORTANCE_DEFAULT));
        }

        // 알림 통지
        manager.notify(1, builder.build());
    }
    public void happy(View view) {
        show();
    }
    public void sad(View view) {
        show2();
    }
    public void angry(View view) {
        show3();
    }

}