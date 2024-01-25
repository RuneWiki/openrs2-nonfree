import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dc", name = "oh", descriptor = "Lclient!bi;")
	public static Class31 aClass31_22;

	@OriginalMember(owner = "client!dc", name = "Ih", descriptor = "Lclient!hi;")
	public static final Class141 aClass141_2 = new Class141(4);

	@OriginalMember(owner = "client!dc", name = "di", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!dc", name = "ji", descriptor = "Lclient!db;")
	public static final Class64 aClass64_77 = new Class64(17, 2);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIILjava/lang/String;)I")
	public static int method2037(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(13) int local13 = arg2.length();
		@Pc(15) int local15 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg2.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local15++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg0[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg1;
	}
}
