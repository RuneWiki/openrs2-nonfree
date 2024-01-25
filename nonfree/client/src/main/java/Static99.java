import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!et", name = "O", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array65;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "Lclient!ce;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "Lclient!bu;")
	public static Class32 aClass32_34;

	@OriginalMember(owner = "client!et", name = "P", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_44 = new Class119(85, 4);

	@OriginalMember(owner = "client!et", name = "U", descriptor = "I")
	public static final int anInt2267 = 1338;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V")
	public static void method1743() {
		@Pc(7) Class256 local7 = null;
		try {
			@Pc(12) Class43 local12 = Static66.aClass143_2.method3394("2");
			while (local12.anInt1521 == 0) {
				Static360.method4758(1L);
			}
			if (local12.anInt1521 == 1) {
				local7 = (Class256) local12.anObject3;
				@Pc(41) byte[] local41 = new byte[(int) local7.method5389()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local7.method5387(local43, local41.length - local43, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static426.method5445(new Class3_Sub7(local41));
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method5388();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZ)I")
	public static int method1746(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(I)[Lclient!ko;")
	public static Class134[] method1747() {
		return new Class134[] { Static138.aClass134_4, Static47.aClass134_3, Static320.aClass134_6 };
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(III)Lclient!rl;")
	public static Class7_Sub3 method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub3_2;
	}
}
