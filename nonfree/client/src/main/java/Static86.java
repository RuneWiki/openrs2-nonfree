import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public static int anInt1916;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!sba;")
	public static final Class3_Sub47 aClass3_Sub47_1 = new Class3_Sub47(0, 0);

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_27 = new Class126(60, 3);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB[BLjava/lang/String;)I")
	public static int method1785(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(21) int local21 = 0; local21 < local10; local21 += 4) {
			@Pc(29) int local29 = Static215.method5251(arg2.charAt(local21));
			@Pc(48) int local48 = local10 <= local21 + 1 ? -1 : Static215.method5251(arg2.charAt(local21 + 1));
			@Pc(67) int local67 = local10 > local21 + 2 ? Static215.method5251(arg2.charAt(local21 + 2)) : -1;
			@Pc(86) int local86 = local21 + 3 >= local10 ? -1 : Static215.method5251(arg2.charAt(local21 + 3));
			arg1[arg0++] = (byte) (local29 << 2 | local48 >>> 4);
			if (local67 == -1) {
				break;
			}
			arg1[arg0++] = (byte) (local67 >>> 2 | (local48 & 0xF) << 4);
			if (local86 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local67 & 0x3) << 6 | local86);
		}
		return arg0;
	}
}
