import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!jc;")
	public static Class40 aClass40_25;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1342 = Static107.method1838(")4l");

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public static int anInt2200 = 2;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
	public static int anInt2206 = -1;

	@OriginalMember(owner = "client!kb", name = "xb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1345 = Static107.method1838("yellow:");

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1343 = aClass28_1345;

	@OriginalMember(owner = "client!kb", name = "zb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1346 = aClass28_1345;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
	public static int method1560(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(26) int local26 = (local9 & 0x33333333) + (local9 >>> 2 & 0x73333333);
		@Pc(38) int local38 = local26 + (local26 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Lclient!gg;")
	public static Class28 method1563(@OriginalArg(1) int arg0) {
		@Pc(12) Class28 local12 = new Class28();
		local12.anInt1718 = 0;
		local12.aByteArray14 = new byte[arg0];
		return local12;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1564() {
		Static146.aClass14_165.method596();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ff;B)V")
	public static void method1569(@OriginalArg(0) Class24 arg0) {
		@Pc(6) int local6 = arg0.anInt1388;
		if (local6 == 324) {
			if (Static1.anInt2957 == -1) {
				Static1.anInt2957 = arg0.anInt1362;
				Static132.anInt3084 = arg0.anInt1404;
			}
			if (Static29.aClass6_1.aBoolean19) {
				arg0.anInt1362 = Static1.anInt2957;
			} else {
				arg0.anInt1362 = Static132.anInt3084;
			}
		} else if (local6 == 325) {
			if (Static1.anInt2957 == -1) {
				Static1.anInt2957 = arg0.anInt1362;
				Static132.anInt3084 = arg0.anInt1404;
			}
			if (Static29.aClass6_1.aBoolean19) {
				arg0.anInt1362 = Static132.anInt3084;
			} else {
				arg0.anInt1362 = Static1.anInt2957;
			}
		} else if (local6 == 327) {
			arg0.anInt1416 = 150;
			arg0.anInt1418 = (int) (Math.sin((double) Static156.anInt3491 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1433 = -1;
			arg0.anInt1405 = 5;
		} else if (local6 == 328) {
			if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953 == null) {
				arg0.anInt1433 = 0;
			} else {
				arg0.anInt1416 = 150;
				arg0.anInt1418 = (int) (Math.sin((double) Static156.anInt3491 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1405 = 5;
				arg0.anInt1433 = ((int) Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953.method1129() << 11) + 2047;
				arg0.anInt1359 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1614;
				arg0.anInt1385 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1606;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public static void method1570() {
		aClass28_1343 = null;
		aClass28_1346 = null;
		aClass28_1345 = null;
		aClass28_1342 = null;
		aClass40_25 = null;
	}
}
