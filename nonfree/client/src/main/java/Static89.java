import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt2113 = -1;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Connection lost.";

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!ne;")
	public static Class146 aClass146_20 = null;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class14_Sub2_Sub19 method2117(@OriginalArg(1) int arg0) {
		@Pc(10) Class14_Sub2_Sub19 local10 = (Class14_Sub2_Sub19) Static9.aClass178_2.method4772((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = Static310.aClass143_108.method3745(0, arg0);
		} else {
			local30 = Static183.aClass143_74.method3745(0, arg0 & 0x7FFF);
		}
		local10 = new Class14_Sub2_Sub19();
		if (local30 != null) {
			local10.method4436(new Class14_Sub4(local30));
		}
		if (arg0 >= 32768) {
			local10.method4434();
		}
		Static9.aClass178_2.method4767(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)I")
	public static int method2125(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(38) int local38 = (arg0 & 0x7F) * 96 >> 7;
			if (local38 < 2) {
				local38 = 2;
			} else if (local38 > 126) {
				local38 = 126;
			}
			return local38 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public static void method2130() {
		Static327.aClass25_35.method685();
		Static96.aClass25_7.method685();
	}
}
