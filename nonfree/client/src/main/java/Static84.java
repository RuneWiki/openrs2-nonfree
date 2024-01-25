import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eq", name = "Q", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_69 = new Class221("M", "M", "M", "M");

	@OriginalMember(owner = "client!eq", name = "V", descriptor = "[I")
	public static final int[] anIntArray213 = new int[14];

	@OriginalMember(owner = "client!eq", name = "W", descriptor = "[I")
	public static final int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!eq", name = "X", descriptor = "[I")
	public static final int[] anIntArray215 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)Lclient!vk;")
	public static Class239 method1486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class239 local7 = new Class239();
		local7.anInt6445 = -1;
		local7.anInt6454 = arg0 + 1 + 5;
		local7.anInt6436 = -1;
		local7.anInt6443 = arg1 + 5 + 1;
		local7.anIntArrayArray54 = new int[local7.anInt6454][local7.anInt6443];
		local7.method5561();
		return local7;
	}
}
