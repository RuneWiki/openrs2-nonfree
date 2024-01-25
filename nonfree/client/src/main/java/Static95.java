import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!es", name = "g", descriptor = "I")
	public static int anInt2335;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)Lclient!kl;")
	public static Class142 method1831(@OriginalArg(1) int arg0) {
		@Pc(13) Class142[] local13 = Static347.method4768();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt3974 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V")
	public static void method1833(@OriginalArg(1) int arg0) {
		if (!Static16.method318(arg0)) {
			return;
		}
		@Pc(14) Class68[] local14 = Static60.aClass68ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class68 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2210 = 0;
				local22.anInt2231 = 1;
				local22.anInt2224 = 0;
			}
		}
	}
}
