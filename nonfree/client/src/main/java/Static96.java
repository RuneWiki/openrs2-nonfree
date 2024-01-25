import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
	public static int anInt1960;

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "Lclient!hc;")
	public static Class3_Sub24 aClass3_Sub24_1;

	@OriginalMember(owner = "client!dk", name = "B", descriptor = "[I")
	public static final int[] anIntArray90 = new int[3];

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	public static void method1777() {
		if (Static126.anInt2887 == 0) {
			return;
		}
		try {
			if (++Static300.anInt5105 > 2000) {
				if (Static324.aClass165_2 != null) {
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
				}
				if (Static230.anInt4042 >= 2) {
					Static479.anInt8303 = -5;
					Static126.anInt2887 = 0;
					return;
				}
				Static512.aClass51_5.method1489();
				Static126.anInt2887 = 1;
				Static300.anInt5105 = 0;
				Static230.anInt4042++;
			}
			if (Static126.anInt2887 == 1) {
				Static570.aClass39_7 = Static512.aClass51_5.method1491(Static237.aClass258_3);
				Static126.anInt2887 = 2;
			}
			if (Static126.anInt2887 == 2) {
				if (Static570.aClass39_7.anInt894 == 2) {
					throw new IOException();
				}
				if (Static570.aClass39_7.anInt894 != 1) {
					return;
				}
				Static324.aClass165_2 = Static143.method2770((Socket) Static570.aClass39_7.anObject2);
				Static570.aClass39_7 = null;
				Static84.method1672();
				Static126.anInt2887 = 4;
			}
			@Pc(118) int local118;
			if (Static126.anInt2887 == 4) {
				if (!Static324.aClass165_2.method3982(1)) {
					return;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				local118 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
				if (local118 != 21) {
					Static479.anInt8303 = local118;
					Static126.anInt2887 = 0;
					Static324.aClass165_2.method3977();
					Static324.aClass165_2 = null;
					return;
				}
				Static126.anInt2887 = 5;
			}
			if (Static126.anInt2887 == 5) {
				if (!Static324.aClass165_2.method3982(1)) {
					return;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				Static506.aStringArray35 = new String[Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF];
				Static126.anInt2887 = 6;
			}
			if (Static126.anInt2887 == 6 && Static324.aClass165_2.method3982(Static506.aStringArray35.length * 8)) {
				Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
				Static324.aClass165_2.method3976(Static506.aStringArray35.length * 8, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				for (local118 = 0; local118 < Static506.aStringArray35.length; local118++) {
					Static506.aStringArray35[local118] = Static596.method7952(Static532.aClass3_Sub11_Sub1_2.method5226());
				}
				Static126.anInt2887 = 0;
				Static479.anInt8303 = 21;
				Static324.aClass165_2.method3977();
				Static324.aClass165_2 = null;
			}
		} catch (@Pc(220) IOException local220) {
			if (Static324.aClass165_2 != null) {
				Static324.aClass165_2.method3977();
				Static324.aClass165_2 = null;
			}
			if (Static230.anInt4042 < 2) {
				Static512.aClass51_5.method1489();
				Static126.anInt2887 = 1;
				Static300.anInt5105 = 0;
				Static230.anInt4042++;
			} else {
				Static479.anInt8303 = -4;
				Static126.anInt2887 = 0;
			}
		}
	}
}
