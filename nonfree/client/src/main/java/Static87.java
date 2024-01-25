import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!cr;")
	public static final Class54 aClass54_2 = new Class54();

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[I")
	public static int[] anIntArray85 = new int[2];

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
	public static final int[] anIntArray86 = new int[5];

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)[Lclient!gfa;")
	public static Class116[] method2044() {
		return new Class116[] { Static242.aClass116_3, Static4.aClass116_1, Static575.aClass116_14, Static51.aClass116_2, Static447.aClass116_11, Static566.aClass116_13, Static418.aClass116_9, Static395.aClass116_7, Static519.aClass116_12, Static370.aClass116_5, Static389.aClass116_6, Static429.aClass116_10, Static399.aClass116_8, Static330.aClass116_4 };
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method2045() {
		@Pc(7) Class337 local7 = null;
		try {
			@Pc(13) Class234 local13 = Static406.aClass354_5.method8215("2", true);
			while (local13.anInt6717 == 0) {
				Static63.method1019(1L);
			}
			if (local13.anInt6717 == 1) {
				local7 = (Class337) local13.anObject16;
				@Pc(36) byte[] local36 = new byte[(int) local7.method7969()];
				@Pc(51) int local51;
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38 += local51) {
					local51 = local7.method7964(local38, local36.length - local38, local36);
					if (local51 == -1) {
						throw new IOException("EOF");
					}
				}
				Static408.method6472(new Class4_Sub11(local36));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local7 != null) {
				local7.method7966();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}
}
