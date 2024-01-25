import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString77 = "Examine";

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method1589(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg2;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg2; local36 < local32; local36++) {
				@Pc(42) String local42 = arg0[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(63) int local63 = arg2; local63 < local32; local63++) {
				@Pc(69) String local69 = arg0[local63];
				if (local69 == null) {
					local61.append("null");
				} else {
					local61.append(local69);
				}
			}
			return local61.toString();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BB)[B")
	public static byte[] method1590(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub21 local8 = new Class1_Sub21(arg0);
		@Pc(12) int local12 = local8.method5720();
		@Pc(21) int local21 = local8.method5716();
		if (local21 < 0 || Static301.anInt6023 != 0 && Static301.anInt6023 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(81) byte[] local81 = new byte[local21];
			local8.method5730(local81, local21);
			return local81;
		} else {
			@Pc(38) int local38 = local8.method5716();
			if (local38 < 0 || Static301.anInt6023 != 0 && Static301.anInt6023 < local38) {
				throw new RuntimeException();
			}
			@Pc(59) byte[] local59 = new byte[local38];
			if (local12 == 1) {
				Static113.method1819(local59, local38, arg0, local21);
			} else {
				Static304.aClass126_1.method2804(local59, local8);
			}
			return local59;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lclient!ps;IZIII)V")
	public static void method1592(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class163 local9 = arg0[local3];
			if (local9 != null && local9.anInt4918 == arg1) {
				Static73.method743(arg2, arg3, local9, arg4);
				Static349.method5817(arg3, arg4, local9);
				if (local9.anInt4971 > local9.anInt4928 - local9.anInt4991) {
					local9.anInt4971 = local9.anInt4928 - local9.anInt4991;
				}
				if (local9.anInt4990 - local9.anInt4935 < local9.anInt4985) {
					local9.anInt4985 = local9.anInt4990 - local9.anInt4935;
				}
				if (local9.anInt4971 < 0) {
					local9.anInt4971 = 0;
				}
				if (local9.anInt4985 < 0) {
					local9.anInt4985 = 0;
				}
				if (local9.anInt4934 == 0) {
					Static154.method2689(local9, arg2);
				}
			}
		}
	}
}
