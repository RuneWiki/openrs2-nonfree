import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!ie;")
	public static Class35 aClass35_24;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "J")
	public static long aLong128;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!qd;")
	public static Class63 aClass63_17 = new Class63(64);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!jd;")
	public static Class38 aClass38_21 = new Class38();

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1233 = Static9.method266("rot:");

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public static int anInt2495 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!e;)V")
	public static void method1643(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static44.anIntArray126.length; local9++) {
			Static44.anIntArray126[local9] = 0;
		}
		@Pc(38) int local38;
		for (@Pc(28) int local28 = 0; local28 < 5000; local28++) {
			local38 = (int) ((double) 256 * 128.0D * Math.random());
			Static44.anIntArray126[local38] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local38 = 0; local38 < 20; local38++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = local59 + (local55 << 7);
					Static59.anIntArray176[local67] = (Static44.anIntArray126[local67 - 128] + Static44.anIntArray126[local67 - 1] + Static44.anIntArray126[local67 + 1] + Static44.anIntArray126[local67 + 128]) / 4;
				}
			}
			@Pc(111) int[] local111 = Static44.anIntArray126;
			Static44.anIntArray126 = Static59.anIntArray176;
			Static59.anIntArray176 = local111;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt880; local59++) {
			for (local67 = 0; local67 < arg0.anInt883; local67++) {
				if (arg0.aByteArray12[local55++] != 0) {
					@Pc(147) int local147 = local59 + arg0.anInt881 + 16;
					@Pc(154) int local154 = arg0.anInt878 + local67 + 16;
					@Pc(160) int local160 = (local147 << 7) + local154;
					Static44.anIntArray126[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!id;I)I")
	public static int method1644(@OriginalArg(0) Class34 arg0) {
		if (Static122.anInt2892 == 1) {
			return 7;
		} else if (arg0.method985(Static75.aClass34_1012)) {
			return 1;
		} else if (arg0.method985(Static7.aClass34_215)) {
			return 1;
		} else if (arg0.method985(Static28.aClass34_1560)) {
			return 2;
		} else if (arg0.method985(Static120.aClass34_1464)) {
			return 2;
		} else if (arg0.method985(Static45.aClass34_1403)) {
			return 3;
		} else if (arg0.method985(Static24.aClass34_415)) {
			return 4;
		} else if (arg0.method985(Static127.aClass34_1020)) {
			return 4;
		} else if (arg0.method985(Static2.aClass34_109)) {
			return 5;
		} else if (arg0.method985(Static44.aClass34_600)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method1645() {
		aClass35_24 = null;
		aClass38_21 = null;
		aClass34_1233 = null;
		aClass63_17 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V")
	public static void method1646(@OriginalArg(0) int arg0) {
		if (Static93.anInt2429 == 0) {
			Static22.aClass1_Sub4_Sub1_1.method337(arg0);
		} else {
			Static12.anInt540 = arg0;
		}
	}
}
