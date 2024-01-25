import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "Lclient!lga;")
	public static Class223 aClass223_19;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public static int anInt1290;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "Z")
	public static boolean aBoolean111;

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "[I")
	public static final int[] anIntArray81 = new int[64];

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!op;")
	public static final Class275 aClass275_6 = new Class275("", 15);

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_33 = new Class322(27, 0);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([BZI)[B")
	public static byte[] method1234(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = new byte[arg1];
		Static695.method5648(arg0, 0, local16, 0, arg1);
		return local16;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1235(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(29) char local29 = arg0.charAt(local21);
			if (local29 == '%' && local19 > local21 + 2) {
				local29 = arg0.charAt(local21 + 1);
				@Pc(81) int local81;
				if (local29 >= '0' && local29 <= '9') {
					local81 = local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local81 = local29 + '\n' - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local81 = local29 + 10 - 65;
				}
				local81 *= 16;
				local29 = arg0.charAt(local21 + 2);
				if (local29 >= '0' && local29 <= '9') {
					local81 += local29 - 48;
				} else if (local29 >= 'a' && local29 <= 'f') {
					local81 += local29 + '\n' - 97;
				} else {
					if (local29 < 'A' || local29 > 'F') {
						local9.append('%');
						continue;
					}
					local81 += local29 + '\n' - 65;
				}
				if (local81 != 0 && Static130.method2539((byte) local81)) {
					local9.append(Static383.method5912((byte) local81));
				}
				local21 += 2;
			} else if (local29 == '+') {
				local9.append(' ');
			} else {
				local9.append(local29);
			}
		}
		return local9.toString();
	}
}
