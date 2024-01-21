import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_14;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1137 = Static28.method504("To create a new account you need to");

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array17 = new Class39[100];

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	public static int[] anIntArray249 = new int[128];

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public static volatile int anInt2270 = 0;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1141 = Static28.method504("Close");

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1138 = aClass39_1141;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1139 = aClass39_1137;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1140 = Static28.method504("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1142 = Static28.method504("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1143 = Static28.method504("m");

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "[I")
	public static int[] anIntArray252 = new int[100];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method1692() {
		Static49.aClass12_33.method233();
		Static96.aClass12_64.method233();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!pd;Lclient!pd;I)V")
	public static void method1697(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2) {
		Static46.aBoolean52 = arg0;
		Static70.aClass20_34 = arg1;
		Static74.aClass20_37 = arg2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZJ)Lclient!ja;")
	public static Class39 method1699(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(50) byte[] local50 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local34--;
				local50[local34] = Static122.aByteArray33[(int) (local54 - arg0 * 37L)];
			}
			@Pc(81) Class39 local81 = new Class39();
			local81.aByteArray10 = local50;
			local81.anInt1481 = local50.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public static void method1700() {
		Static35.aClass4_Sub16_Sub1_1.method1494();
		@Pc(11) int local11 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static35.aClass4_Sub16_Sub1_1.method1500(2);
		if (local22 == 0) {
			Static35.anIntArray101[Static30.anInt785++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local22 == 1) {
			local49 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
			Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1909(false, local49);
			local59 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			if (local59 == 1) {
				Static35.anIntArray101[Static30.anInt785++] = 2047;
			}
			return;
		}
		@Pc(101) int local101;
		if (local22 == 2) {
			local49 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
			Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1909(true, local49);
			local59 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
			Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1909(true, local59);
			local101 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			if (local101 == 1) {
				Static35.anIntArray101[Static30.anInt785++] = 2047;
			}
		} else if (local22 == 3) {
			local49 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			local59 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			if (local59 == 1) {
				Static35.anIntArray101[Static30.anInt785++] = 2047;
			}
			Static131.anInt3202 = Static35.aClass4_Sub16_Sub1_1.method1500(2);
			local101 = Static35.aClass4_Sub16_Sub1_1.method1500(7);
			@Pc(156) int local156 = Static35.aClass4_Sub16_Sub1_1.method1500(7);
			Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1913(local101, local156, local49 == 1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1701() {
		anIntArray252 = null;
		aClass39_1138 = null;
		aClass39_1139 = null;
		aClass20_Sub1_14 = null;
		aClass39_1141 = null;
		aClass39_1143 = null;
		anIntArray249 = null;
		aClass39_1137 = null;
		aClass39_1140 = null;
		aClass39Array17 = null;
		aClass39_1142 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pd;III)Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 method1706(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static55.method977(arg1, arg2, arg0) ? Static59.method1050() : null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1707(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static62.aClass66_1);
		arg0.addMouseMotionListener(Static62.aClass66_1);
		arg0.addFocusListener(Static62.aClass66_1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
	public static int method1708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg2;
		@Pc(34) int local34 = arg1 & 0x7F;
		if (arg2 < 3 && (Static131.aByteArrayArrayArray7[1][local3][local11] & 0x2) == 2) {
			local30 = arg2 + 1;
		}
		@Pc(55) int local55 = arg0 & 0x7F;
		@Pc(86) int local86 = local55 * Static6.anIntArrayArrayArray1[local30][local3 + 1][local11 + 1] + Static6.anIntArrayArrayArray1[local30][local3][local11 + 1] * (128 - local55) >> 7;
		@Pc(113) int local113 = local55 * Static6.anIntArrayArrayArray1[local30][local3 + 1][local11] + (128 - local55) * Static6.anIntArrayArrayArray1[local30][local3][local11] >> 7;
		return local113 * (128 - local34) + local34 * local86 >> 7;
	}
}
