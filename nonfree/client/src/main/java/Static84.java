import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!dg;")
	public static Class8_Sub8_Sub1 aClass8_Sub8_Sub1_1;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!pk;")
	public static Class132 aClass132_34;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!uc;")
	public static Class164 aClass164_4 = new Class164();

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!wn;")
	public static Class182 aClass182_10 = new Class182();

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString67 = "glow2:";

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lclient!oj;")
	public static Class8_Sub1_Sub11 method1370(@OriginalArg(0) int arg0) {
		@Pc(16) Class8_Sub1_Sub11 local16 = (Class8_Sub1_Sub11) Static263.aClass125_49.method2957((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static135.aClass132_48.method3194(26, arg0);
		local16 = new Class8_Sub1_Sub11();
		if (local27 != null) {
			local16.method2946(new Class8_Sub2(local27));
		}
		Static263.aClass125_49.method2956((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)I")
	public static int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static137.aBoolean127) {
			Static137.aBoolean127 = false;
			arg0 = 1000000;
		}
		@Pc(17) Class24 local17 = Static169.aClass24ArrayArray1[arg3][arg1];
		@Pc(27) float local27 = ((float) arg2 * 0.1F + 0.7F) * local17.aFloat5;
		@Pc(30) int local30 = local17.anInt766;
		@Pc(33) int local33 = local17.anInt775;
		@Pc(36) float local36 = local17.aFloat3;
		@Pc(39) float local39 = local17.aFloat4;
		@Pc(42) Class8_Sub1_Sub3 local42 = local17.aClass8_Sub1_Sub3_1;
		@Pc(49) float local49 = local17.aFloat7;
		@Pc(52) float local52 = local17.aFloat6;
		@Pc(55) float local55 = local17.aFloat2;
		@Pc(58) int local58 = local17.anInt767;
		if (!Static35.aBoolean50) {
			local58 = 0;
		}
		if (local30 != Static50.anInt1116 || local27 != Static76.aFloat16 || Static230.aFloat50 != local36 || Static14.aFloat1 != local39 || local33 != Static171.anInt3423 || Static8.anInt5675 != local58 || Static177.aClass8_Sub1_Sub3_4 != local42 || local55 != Static288.aFloat15 || Static229.aFloat49 != local52 || Static144.aFloat30 != local49) {
			Static245.anInt4880 = Static62.anInt5013;
			Static243.aFloat56 = Static230.aFloat51;
			Static214.aFloat44 = Static176.aFloat35;
			Static60.aFloat12 = Static202.aFloat37;
			Static152.aFloat31 = Static134.aFloat28;
			Static217.anInt4472 = Static179.anInt3513;
			Static167.anInt3363 = Static141.anInt2801;
			Static256.aFloat58 = Static257.aFloat59;
			Static89.aClass8_Sub1_Sub3_5 = Static91.aClass8_Sub1_Sub3_6;
			Static216.aFloat45 = Static127.aFloat27;
			if (Static299.aClass8_Sub1_Sub3_8 == null || Static299.aClass8_Sub1_Sub3_8 == Static89.aClass8_Sub1_Sub3_5) {
				Static299.aClass8_Sub1_Sub3_8 = new Class8_Sub1_Sub3();
			}
			Static229.aFloat49 = local52;
			Static169.anInt3390 = 0;
			Static177.aClass8_Sub1_Sub3_4 = local42;
			Static50.anInt1116 = local30;
			Static171.anInt3423 = local33;
			Static288.aFloat15 = local55;
			Static8.anInt5675 = local58;
			Static14.aFloat1 = local39;
			Static230.aFloat50 = local36;
			Static144.aFloat30 = local49;
			Static76.aFloat16 = local27;
		}
		if (Static169.anInt3390 < 65536) {
			Static169.anInt3390 += arg0 * 250;
			if (Static169.anInt3390 < 65536) {
				@Pc(181) int local181 = Static169.anInt3390 >> 8;
				@Pc(188) int local188 = 65536 - Static169.anInt3390 >> 8;
				@Pc(196) float local196 = (float) (65536 - Static169.anInt3390) / 65536.0F;
				Static179.anInt3513 = local181 * Static8.anInt5675 + Static217.anInt4472 * local188 >> 8;
				@Pc(211) float local211 = (float) Static169.anInt3390 / 65536.0F;
				Static257.aFloat59 = Static256.aFloat58 * local196 + Static230.aFloat50 * local211;
				Static230.aFloat51 = Static229.aFloat49 * local211 + Static243.aFloat56 * local196;
				Static134.aFloat28 = local196 * Static152.aFloat31 + Static144.aFloat30 * local211;
				Static176.aFloat35 = local211 * Static288.aFloat15 + Static214.aFloat44 * local196;
				Static62.anInt5013 = ((Static245.anInt4880 & 0xFF00FF) * local188 + (Static171.anInt3423 & 0xFF00FF) * local181 & 0xFF00FF00) + ((Static245.anInt4880 & 0xFF00) * local188 + ((Static171.anInt3423 & 0xFF00) * local181) & 0xFF0000) >> 8;
				Static202.aFloat37 = Static14.aFloat1 * local211 + Static60.aFloat12 * local196;
				Static127.aFloat27 = Static76.aFloat16 * local211 + local196 * Static216.aFloat45;
				Static141.anInt2801 = ((Static50.anInt1116 & 0xFF00) * local181 + (Static167.anInt3363 & 0xFF00) * local188 & 0xFF0000) + (local181 * (Static50.anInt1116 & 0xFF00FF) + (Static167.anInt3363 & 0xFF00FF) * local188 & 0xFF00FF00) >> 8;
				if (Static89.aClass8_Sub1_Sub3_5 != Static177.aClass8_Sub1_Sub3_4) {
					if (Static89.aClass8_Sub1_Sub3_5 == null || Static177.aClass8_Sub1_Sub3_4 == null) {
						Static91.aClass8_Sub1_Sub3_6 = null;
					} else {
						Static91.aClass8_Sub1_Sub3_6 = Static299.aClass8_Sub1_Sub3_8.method489(Static89.aClass8_Sub1_Sub3_5, Static177.aClass8_Sub1_Sub3_4, (float) Static169.anInt3390 / 65536.0F);
					}
				}
			} else {
				Static62.anInt5013 = Static171.anInt3423;
				Static230.aFloat51 = Static229.aFloat49;
				Static257.aFloat59 = Static230.aFloat50;
				Static169.anInt3390 = 65536;
				Static176.aFloat35 = Static288.aFloat15;
				Static89.aClass8_Sub1_Sub3_5 = null;
				Static134.aFloat28 = Static144.aFloat30;
				Static141.anInt2801 = Static50.anInt1116;
				Static202.aFloat37 = Static14.aFloat1;
				Static179.anInt3513 = Static8.anInt5675;
				Static91.aClass8_Sub1_Sub3_6 = Static177.aClass8_Sub1_Sub3_4;
				Static127.aFloat27 = Static76.aFloat16;
			}
		}
		return Static62.anInt5013;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method1372() {
		Static120.aClass61_20.method1379();
		Static147.aClass61_24.method1379();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!tk;II)Ljava/lang/String;")
	public static String method1373(@OriginalArg(0) Class159 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method668(arg0).method3352(arg1) && arg0.anObjectArray23 == null) {
			return null;
		} else if (arg0.aStringArray73 == null || arg1 >= arg0.aStringArray73.length || arg0.aStringArray73[arg1] == null || arg0.aStringArray73[arg1].trim().length() == 0) {
			return Static104.aBoolean169 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray73[arg1];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZFIIII)[[I")
	public static int[][] method1374(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class8_Sub3_Sub35 local13 = new Class8_Sub3_Sub35();
		local13.anInt5063 = 8;
		local13.aBoolean409 = false;
		local13.anInt5064 = 4;
		local13.anInt5068 = 3;
		local13.anInt5054 = (int) (arg0 * 4096.0F);
		local13.method4220();
		Static58.method1723(256, 64);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method3848(local9[local40], local40);
		}
		return local9;
	}
}
