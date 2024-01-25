import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_2;

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!dda", name = "D", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_5 = new Class212(5, 19);

	@OriginalMember(owner = "client!dda", name = "F", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_24 = new Class40("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIZ)I")
	public static int method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class5_Sub24 local10 = Static459.method6391(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray260.length; local28++) {
				if (arg0 == local10.anIntArray261[local28]) {
					local21 += local10.anIntArray260[local28];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1503(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static292.method4882(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static292.method4882(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(61) int local61 = local14 - local11;
		if (local61 < 1 || local61 > 12) {
			return null;
		}
		@Pc(74) StringBuffer local74 = new StringBuffer(local61);
		for (@Pc(76) int local76 = local11; local76 < local14; local76++) {
			@Pc(82) char local82 = arg0.charAt(local76);
			if (Static502.method6919(local82)) {
				@Pc(90) char local90 = Static401.method5839(local82);
				if (local90 != '\u0000') {
					local74.append(local90);
				}
			}
		}
		if (local74.length() == 0) {
			return null;
		} else {
			return local74.toString();
		}
	}
}
