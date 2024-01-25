import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_79 = new Class137(48, 11);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method1273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!ea;IIIILclient!vg;Lclient!f;)V")
	public static void method1274(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class250 arg5, @OriginalArg(7) Class49 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static100.anInt1781 == 4) {
			local16 = (int) Static95.aFloat27 & 0x3FFF;
		} else {
			local16 = (int) Static95.aFloat27 + Static171.anInt2824 & 0x3FFF;
		}
		@Pc(52) int local52 = Math.max(arg5.anInt7041 / 2, arg5.anInt6997 / 2) + 10;
		@Pc(60) int local60 = arg3 * arg3 + arg1 * arg1;
		if (local60 > local52 * local52) {
			return;
		}
		@Pc(74) int local74 = Class1_Sub1_Sub25.anIntArray249[local16];
		@Pc(78) int local78 = Class1_Sub1_Sub25.anIntArray248[local16];
		if (Static100.anInt1781 != 4) {
			local78 = local78 * 256 / (Static305.anInt5082 + 256);
			local74 = local74 * 256 / (Static305.anInt5082 + 256);
		}
		@Pc(109) int local109 = arg3 * local74 + local78 * arg1 >> 15;
		@Pc(119) int local119 = local78 * arg3 - local74 * arg1 >> 15;
		arg6.method5638(arg4 + arg5.anInt7041 / 2 + local109 - arg6.ja() / 2, -local119 + (arg2 - -(arg5.anInt6997 / 2)) + -(arg6.JA() / 2), arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIJLjava/lang/String;IZLjava/lang/String;IIII)V")
	public static void method1275(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static263.aBoolean329 && Static19.anInt396 < 500) {
			@Pc(23) int local23 = arg4 == -1 ? Static258.anInt4103 : arg4;
			@Pc(37) Class1_Sub45 local37 = new Class1_Sub45(arg6, arg3, local23, arg9, arg7, arg2, arg1, arg8, arg5, arg0);
			Static50.aClass254_8.method5430(local37);
			Static19.anInt396++;
		}
	}
}
