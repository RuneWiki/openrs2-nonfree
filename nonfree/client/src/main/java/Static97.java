import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "Lclient!ei;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!jh", name = "Lb", descriptor = "Lclient!pb;")
	public static Class71 aClass71_19;

	@OriginalMember(owner = "client!jh", name = "Fb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_775 = Static151.method2243("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!jh", name = "Sb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_777 = Static151.method2243("This computers address has been blocked");

	@OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_776 = aClass62_777;

	@OriginalMember(owner = "client!jh", name = "Hb", descriptor = "[Lclient!oc;")
	public static final Class71_Sub1[] aClass71_Sub1Array1 = new Class71_Sub1[256];

	@OriginalMember(owner = "client!jh", name = "Mb", descriptor = "I")
	public static int anInt2284 = 0;

	@OriginalMember(owner = "client!jh", name = "Tb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_778 = Static151.method2243(")3");

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "(B)V")
	public static void method1589() {
		for (@Pc(15) Class2_Sub1_Sub13 local15 = (Class2_Sub1_Sub13) Static163.aClass13_11.method303(); local15 != null; local15 = (Class2_Sub1_Sub13) Static163.aClass13_11.method309()) {
			@Pc(20) Class7_Sub4 local20 = local15.aClass7_Sub4_1;
			if (local20.anInt1937 != Static126.anInt2806 || local20.aBoolean103) {
				local15.method3183();
			} else if (Static25.anInt581 >= local20.anInt1934) {
				local20.method1266(Static103.anInt2221);
				if (local20.aBoolean103) {
					local15.method3183();
				} else {
					Static31.method536(local20.anInt1937, local20.anInt1944, local20.anInt1927, local20.anInt1943, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIB[Lclient!tf;II[B)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class95[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class2_Sub11 local16 = new Class2_Sub11(arg8);
		while (true) {
			@Pc(20) int local20 = local16.method1572();
			if (local20 == 0) {
				return;
			}
			local11 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local16.method1572();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local16.method1534();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg0 == local60 && local56 >= arg1 && local56 < arg1 + 8 && local50 >= arg6 && arg6 + 8 > local50) {
					@Pc(107) Class2_Sub1_Sub11 local107 = Static60.method844(local11);
					@Pc(125) int local125 = arg7 + Static32.method564(local50 & 0x7, local72, local107.anInt1559, arg4, local107.anInt1556, local56 & 0x7);
					@Pc(143) int local143 = arg3 + Static36.method622(local72, arg4, local107.anInt1556, local50 & 0x7, local107.anInt1559, local56 & 0x7);
					if (local125 > 0 && local143 > 0 && local125 < 103 && local143 < 103) {
						@Pc(159) int local159 = arg2;
						if ((Static133.aByteArrayArrayArray11[1][local125][local143] & 0x2) == 2) {
							local159 = arg2 - 1;
						}
						@Pc(175) Class95 local175 = null;
						if (local159 >= 0) {
							local175 = arg5[local159];
						}
						Static146.method2191(local68, local11, arg2, Static60.aBoolean52, local125, local143, local72 + arg4 & 0x3, local175, arg2, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(IB)I")
	public static int method1593(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIILclient!mf;IJ)Z")
	public static boolean method1594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class7 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static112.method1716(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
