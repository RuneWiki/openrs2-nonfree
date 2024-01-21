import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!ph;")
	public static Class2_Sub10_Sub3 aClass2_Sub10_Sub3_1;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!nc;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt2266;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_10;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 aClass2_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_660 = Static38.method685("Texturen geladen)3");

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!db;")
	public static Class16 aClass16_7 = new Class16(32);

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_661 = Static38.method685("mapfunction");

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_662 = Static38.method685(" )2> ");

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt2267 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_663 = Static38.method685("");

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_664 = Static38.method685("sl_arrows");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII)I")
	public static int method1489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static164.aByteArrayArrayArray7[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static164.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1490() {
		aClass6_660 = null;
		aClass6_661 = null;
		aClass6_663 = null;
		aClass2_Sub3_Sub2_Sub3_2 = null;
		aClass2_Sub10_Sub3_1 = null;
		aClass10_Sub1_10 = null;
		aClass58_1 = null;
		aClass16_7 = null;
		aClass6_662 = null;
		aClass6_664 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!c;Lclient!ai;BLclient!ai;)Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 method1491(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) Class6 arg2) {
		@Pc(16) int local16 = arg0.method1602(arg1);
		@Pc(22) int local22 = arg0.method1600(local16, arg2);
		return Static48.method882(local22, arg0, local16);
	}
}
