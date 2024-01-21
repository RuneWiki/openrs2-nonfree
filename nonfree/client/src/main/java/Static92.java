import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_94;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_608 = Static181.method2795("runes");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIII)V")
	public static void method1592(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static36.anInt940 = arg1;
		Static147.anInt4074 = 0;
		Static61.anInt1501 = arg0;
		Static209.anInt4155 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public static void method1595() {
		for (@Pc(10) int local10 = -1; local10 < Static21.anInt572; local10++) {
			@Pc(19) int local19;
			if (local10 == -1) {
				local19 = 2047;
			} else {
				local19 = Static10.anIntArray18[local10];
			}
			@Pc(27) Class24_Sub4_Sub1 local27 = Static22.aClass24_Sub4_Sub1Array1[local19];
			if (local27 != null) {
				Static2.method57(1, local27);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)I")
	public static int method1598(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static142.method2280(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static209.anInt4155 <= arg1 && arg1 <= Static36.anInt940) {
			@Pc(17) int local17 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg2);
			@Pc(25) int local25 = Static50.method998(Static61.anInt1501, Static147.anInt4074, arg3);
			Static211.method3197(arg1, local17, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILclient!rb;Lclient!rb;IIJ)V")
	public static void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class105 local8 = new Class105();
		local8.aLong146 = arg8;
		local8.anInt4192 = arg1 * 128 + 64;
		local8.anInt4202 = arg2 * 128 + 64;
		local8.anInt4203 = arg3;
		local8.aClass24_11 = arg4;
		local8.aClass24_10 = arg5;
		local8.anInt4197 = arg6;
		local8.anInt4193 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static203.aClass2_Sub23ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static203.aClass2_Sub23ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub23(local42, arg1, arg2);
			}
		}
		Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass105_1 = local8;
	}
}
