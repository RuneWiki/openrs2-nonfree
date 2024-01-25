import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "[S")
	public static short[] aShortArray41;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
	public static final int[] anIntArray103 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static int anInt1522 = 0;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt1523 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method1230(@OriginalArg(0) Class11_Sub25 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static91.aClass69_2 != null) {
			@Pc(24) int local24;
			try {
				Static91.aClass69_2.method1219(0L);
				Static91.aClass69_2.method1218(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method5226(local12, 24);
	}
}
