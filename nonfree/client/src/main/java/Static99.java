import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!saa;")
	public static Class3_Sub44 aClass3_Sub44_2;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZII)V")
	public static void method2155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static284.aFloat160 < Static284.aFloat161) {
			Static284.aFloat160 = (float) ((double) Static284.aFloat160 + (double) Static284.aFloat160 / 30.0D);
			if (Static284.aFloat160 > Static284.aFloat161) {
				Static284.aFloat160 = Static284.aFloat161;
			}
			Static132.method2577();
			Static284.anInt7854 = (int) Static284.aFloat160 >> 1;
			Static284.aByteArrayArrayArray17 = Static308.method4826(Static284.anInt7854);
		} else if (Static284.aFloat160 > Static284.aFloat161) {
			Static284.aFloat160 = (float) ((double) Static284.aFloat160 - (double) Static284.aFloat160 / 30.0D);
			if (Static284.aFloat160 < Static284.aFloat161) {
				Static284.aFloat160 = Static284.aFloat161;
			}
			Static132.method2577();
			Static284.anInt7854 = (int) Static284.aFloat160 >> 1;
			Static284.aByteArrayArrayArray17 = Static308.method4826(Static284.anInt7854);
		}
		if (Static296.anInt5364 != -1 && Static341.anInt6022 != -1) {
			@Pc(80) int local80 = Static296.anInt5364 - Static319.anInt5778;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(94) int local94 = Static341.anInt6022 - Static236.anInt4460;
			Static319.anInt5778 += local80;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static236.anInt4460 += local94;
			if (local80 == 0 && local94 == 0) {
				Static341.anInt6022 = -1;
				Static296.anInt5364 = -1;
			}
			Static132.method2577();
		}
		if (Static440.anInt4098 <= 0) {
			Static112.anInt2609 = -1;
			Static412.anInt6932 = -1;
		} else {
			Static474.anInt7705--;
			if (Static474.anInt7705 == 0) {
				Static474.anInt7705 = 100;
				Static440.anInt4098--;
			}
		}
		if (!Static458.aBoolean594 || Static552.aClass130_63 == null) {
			return;
		}
		for (@Pc(159) Class3_Sub50 local159 = (Class3_Sub50) Static552.aClass130_63.method3543(); local159 != null; local159 = (Class3_Sub50) Static552.aClass130_63.method3551()) {
			@Pc(168) Class40 local168 = Static284.aClass168_4.method4062(local159.aClass3_Sub41_1.anInt7163);
			if (local159.method7782(arg0, arg1)) {
				if (local168.aStringArray7 != null) {
					if (local168.aStringArray7[4] != null) {
						Static577.method3272(1002, 0, -1, (long) local159.aClass3_Sub41_1.anInt7163, local168.aStringArray7[4], local168.anInt1395, true, local168.aString26, -1, false);
					}
					if (local168.aStringArray7[3] != null) {
						Static577.method3272(1009, 0, -1, (long) local159.aClass3_Sub41_1.anInt7163, local168.aStringArray7[3], local168.anInt1395, true, local168.aString26, -1, false);
					}
					if (local168.aStringArray7[2] != null) {
						Static577.method3272(1003, 0, -1, (long) local159.aClass3_Sub41_1.anInt7163, local168.aStringArray7[2], local168.anInt1395, true, local168.aString26, -1, false);
					}
					if (local168.aStringArray7[1] != null) {
						Static577.method3272(1008, 0, -1, (long) local159.aClass3_Sub41_1.anInt7163, local168.aStringArray7[1], local168.anInt1395, true, local168.aString26, -1, false);
					}
					if (local168.aStringArray7[0] != null) {
						Static577.method3272(1004, 0, -1, (long) local159.aClass3_Sub41_1.anInt7163, local168.aStringArray7[0], local168.anInt1395, true, local168.aString26, -1, false);
					}
				}
				if (!local159.aClass3_Sub41_1.aBoolean566) {
					local159.aClass3_Sub41_1.aBoolean566 = true;
					Static149.method2775(Static293.aClass318_3, local159.aClass3_Sub41_1.anInt7163, local168.anInt1395);
				}
				if (local159.aClass3_Sub41_1.aBoolean566) {
					Static149.method2775(Static343.aClass318_4, local159.aClass3_Sub41_1.anInt7163, local168.anInt1395);
				}
			} else if (local159.aClass3_Sub41_1.aBoolean566) {
				local159.aClass3_Sub41_1.aBoolean566 = false;
				Static149.method2775(Static348.aClass318_5, local159.aClass3_Sub41_1.anInt7163, local168.anInt1395);
			}
		}
	}
}
