import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public static int anInt1649;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public static int anInt1655;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Lclient!di;")
	public static Class1_Sub7_Sub1 aClass1_Sub7_Sub1_1;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "Lclient!tq;")
	public static Class164 aClass164_3;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public static int anInt1653 = 0;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	public static int method1350() {
		if ((double) Static353.aFloat16 == 3.0D) {
			return 37;
		} else if ((double) Static353.aFloat16 == 4.0D) {
			return 50;
		} else if ((double) Static353.aFloat16 == 6.0D) {
			return 75;
		} else if ((double) Static353.aFloat16 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
	public static void method1351(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class1 local9 = Static54.aClass77_5.method1359(); local9 != null; local9 = Static54.aClass77_5.method1360()) {
			if ((long) arg0 == (local9.aLong207 >> 48 & 0xFFFFL)) {
				local9.method5577();
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Lclient!lt;")
	public static Class1_Sub6_Sub11 method1353() {
		@Pc(14) Class1_Sub6_Sub11 local14 = (Class1_Sub6_Sub11) Static286.aClass170_6.method3685();
		if (local14 != null) {
			local14.method5577();
			local14.method5580();
			return local14;
		}
		do {
			local14 = (Class1_Sub6_Sub11) Static301.aClass170_7.method3685();
			if (local14 == null) {
				return null;
			}
			if (local14.method3000() > Static378.method5293()) {
				return null;
			}
			local14.method5577();
			local14.method5580();
		} while ((Long.MIN_VALUE & local14.aLong208) == 0L);
		return local14;
	}
}
