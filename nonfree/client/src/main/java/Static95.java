import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dha", name = "p", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_25 = new Class218(66, 7);

	@OriginalMember(owner = "client!dha", name = "t", descriptor = "Lclient!vv;")
	public static final Class363 aClass363_3 = new Class363();

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378() != 0 && arg1 != 0 && Static224.anInt5125 < 50 && arg0 != -1) {
			Static620.aClass208Array1[Static224.anInt5125++] = new Class208((byte) 1, arg0, arg1, arg2, arg3, arg4, arg5, null);
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(II)I")
	public static int method2482(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(15) int local15 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIILclient!kha;ZLclient!nl;B)V")
	public static void method2483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class181 arg2, @OriginalArg(5) Class3_Sub7_Sub5 arg3) {
		Static195.method6190(arg2, arg0, arg1);
		Static218.aClass3_Sub7_Sub5_1 = arg3;
	}
}
