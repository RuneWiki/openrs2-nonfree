import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Lclient!kb;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	public static int anInt2324;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!pc;")
	public static Class12 aClass12_66;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1100 = Static87.method1648("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1090 = aClass27_1100;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1098 = Static87.method1648("Loading game screen )2 ");

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1091 = aClass27_1098;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1097 = Static87.method1648("Could not complete login)3");

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1092 = aClass27_1097;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1096 = Static87.method1648("The server is being updated)3");

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1093 = aClass27_1096;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1094 = aClass27_1100;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1095 = Static87.method1648("headicons_hint");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public static int anInt2323 = 0;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
	public static int[] anIntArray350 = new int[4000];

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1099 = Static87.method1648("headicons_pk");

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1101 = aClass27_1100;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
	public static void method1636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			for (local18 = 0; local18 < 8; local18++) {
				Static55.anIntArrayArrayArray4[arg1][arg2 + local14][arg0 + local18] = 0;
			}
		}
		if (arg2 > 0) {
			for (local18 = 1; local18 < 8; local18++) {
				Static55.anIntArrayArrayArray4[arg1][arg2][local18 + arg0] = Static55.anIntArrayArrayArray4[arg1][arg2 - 1][arg0 + local18];
			}
		}
		if (arg0 > 0) {
			for (local18 = 1; local18 < 8; local18++) {
				Static55.anIntArrayArrayArray4[arg1][arg2 + local18][arg0] = Static55.anIntArrayArrayArray4[arg1][local18 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static55.anIntArrayArrayArray4[arg1][arg2 - 1][arg0] != 0) {
			Static55.anIntArrayArrayArray4[arg1][arg2][arg0] = Static55.anIntArrayArrayArray4[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static55.anIntArrayArrayArray4[arg1][arg2][arg0 - 1] != 0) {
			Static55.anIntArrayArrayArray4[arg1][arg2][arg0] = Static55.anIntArrayArrayArray4[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static55.anIntArrayArrayArray4[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static55.anIntArrayArrayArray4[arg1][arg2][arg0] = Static55.anIntArrayArrayArray4[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1637(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static50.aClass35_1);
		arg0.removeMouseMotionListener(Static50.aClass35_1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method1638() {
		aClass27_1101 = null;
		anIntArrayArrayArray5 = null;
		aClass12_66 = null;
		aClass27_1093 = null;
		aClass27_1090 = null;
		aClass27_1100 = null;
		aClass27_1097 = null;
		aClass27_1098 = null;
		aClass27_1094 = null;
		aClass33_1 = null;
		aClass27_1099 = null;
		aClass27_1096 = null;
		aClass27_1091 = null;
		aClass27_1092 = null;
		anIntArray350 = null;
		aClass27_1095 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!u;")
	public static Class3_Sub3_Sub13 method1639(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub13 local10 = (Class3_Sub3_Sub13) Static15.aClass21_10.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static83.aClass54_30.method1615(14, arg0);
		local10 = new Class3_Sub3_Sub13();
		if (local25 != null) {
			local10.method1780(new Class3_Sub11(local25));
		}
		Static15.aClass21_10.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static77.anInt2151 == arg1) {
			return true;
		} else if (arg0 == 1 && Static109.anInt2068 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static4.anInt2753;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method1641() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static7.anIntArray39[local9 + 32512] = 255;
			}
		}
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(61) int local61;
		for (local16 = 0; local16 < 100; local16++) {
			local48 = (int) (Math.random() * 124.0D) + 2;
			local55 = (int) (Math.random() * 128.0D) + 128;
			local61 = (local55 << 7) + local48;
			Static7.anIntArray39[local61] = 192;
		}
		for (local48 = 1; local48 < 255; local48++) {
			for (local55 = 1; local55 < 127; local55++) {
				local61 = (local48 << 7) + local55;
				Static84.anIntArray338[local61] = (Static7.anIntArray39[local61 + 128] + Static7.anIntArray39[local61 - 1] + Static7.anIntArray39[local61 + 1] + Static7.anIntArray39[local61 + -128]) / 4;
			}
		}
		Static20.anInt465 += 128;
		if (Static20.anInt465 > Static34.anIntArray154.length) {
			Static20.anInt465 -= Static34.anIntArray154.length;
			local55 = (int) (Math.random() * 12.0D);
			Static37.method695(Static87.aClass3_Sub3_Sub2_Sub4Array7[local55]);
		}
		@Pc(175) int local175;
		for (local55 = 1; local55 < 255; local55++) {
			for (local61 = 1; local61 < 127; local61++) {
				local175 = local61 + (local55 << 7);
				@Pc(195) int local195 = Static84.anIntArray338[local175 + 128] - Static34.anIntArray154[Static34.anIntArray154.length - 1 & Static20.anInt465 + local175] / 5;
				if (local195 < 0) {
					local195 = 0;
				}
				Static7.anIntArray39[local175] = local195;
			}
		}
		for (local61 = 0; local61 < 255; local61++) {
			Static84.anIntArray337[local61] = Static84.anIntArray337[local61 + 1];
		}
		Static84.anIntArray337[255] = (int) (Math.sin((double) Static2.anInt38 / 14.0D) * 16.0D + Math.sin((double) Static2.anInt38 / 15.0D) * 14.0D + Math.sin((double) Static2.anInt38 / 16.0D) * 12.0D);
		if (Static10.anInt268 > 0) {
			Static10.anInt268 -= 4;
		}
		if (Static19.anInt445 > 0) {
			Static19.anInt445 -= 4;
		}
		if (Static10.anInt268 != 0 || Static19.anInt445 != 0) {
			return;
		}
		local175 = (int) (Math.random() * 2000.0D);
		if (local175 == 1) {
			Static19.anInt445 = 1024;
		}
		if (local175 == 0) {
			Static10.anInt268 = 1024;
			return;
		}
	}
}
