import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_690 = Static120.method2057("b12_full");

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
	public static final boolean aBoolean85 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILclient!fb;Lclient!fb;IIJ)V")
	public static void method1497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(5) Class1_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class22 local8 = new Class22();
		local8.aLong37 = arg8;
		local8.anInt1125 = arg1 * 128 + 64;
		local8.anInt1124 = arg2 * 128 + 64;
		local8.anInt1120 = arg3;
		local8.aClass1_Sub2_Sub1_1 = arg4;
		local8.aClass1_Sub2_Sub1_2 = arg5;
		local8.anInt1121 = arg6;
		local8.anInt1127 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static167.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static167.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub17(local42, arg1, arg2);
			}
		}
		Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1498() {
		aClass81_690 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method1499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
