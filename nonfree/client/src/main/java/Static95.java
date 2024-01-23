import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	public static int anInt2288;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!ek;")
	public static Class42 aClass42_23;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public static int anInt2289 = -1;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString82 = "cyan:";

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	public static int method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I")
	public static int method1666(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(23) int local23 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCE) >>> 2);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1667(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) boolean local12 = false;
		for (@Pc(14) int local14 = 0; local14 < Static191.anInt4008; local14++) {
			@Pc(27) Class15_Sub2_Sub2 local27 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local14]];
			if (local27 != null && local27.aString184 != null && local27.aString184.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static211.aClass2_Sub16_Sub1_2.method2198(142);
					Static211.aClass2_Sub16_Sub1_2.method2183(Static246.anIntArray479[local14]);
					Static211.aClass2_Sub16_Sub1_2.method2168(0);
				} else if (arg1 == 4) {
					Static211.aClass2_Sub16_Sub1_2.method2198(227);
					Static211.aClass2_Sub16_Sub1_2.method2180(Static246.anIntArray479[local14]);
					Static211.aClass2_Sub16_Sub1_2.method2189(0);
				} else if (arg1 == 5) {
					Static211.aClass2_Sub16_Sub1_2.method2198(40);
					Static211.aClass2_Sub16_Sub1_2.method2183(Static246.anIntArray479[local14]);
					Static211.aClass2_Sub16_Sub1_2.method2168(0);
				} else if (arg1 == 6) {
					Static211.aClass2_Sub16_Sub1_2.method2198(127);
					Static211.aClass2_Sub16_Sub1_2.method2154(0);
					Static211.aClass2_Sub16_Sub1_2.method2183(Static246.anIntArray479[local14]);
				} else if (arg1 == 7) {
					Static211.aClass2_Sub16_Sub1_2.method2198(166);
					Static211.aClass2_Sub16_Sub1_2.method2183(Static246.anIntArray479[local14]);
					Static211.aClass2_Sub16_Sub1_2.method2189(0);
				}
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static315.method4765(Static197.aString139 + arg0);
		}
	}
}
