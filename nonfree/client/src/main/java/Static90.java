import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt4701;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1611 = Static64.method1101("Members only world");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1610 = aClass51_1611;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
	public static int anInt4703 = 0;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	public static int anInt4704 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)I")
	public static int method3683(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
