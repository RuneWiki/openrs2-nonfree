import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	public static volatile int anInt1716 = -1;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "Lclient!th;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
	public static int anInt1729 = 0;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)[Lclient!vf;")
	public static Class1_Sub1_Sub8[] method1214() {
		@Pc(4) Class1_Sub1_Sub8[] local4 = new Class1_Sub1_Sub8[Static70.anInt1320];
		for (@Pc(16) int local16 = 0; local16 < Static70.anInt1320; local16++) {
			@Pc(26) int local26 = Static8.anIntArray20[local16] * Static101.anIntArray191[local16];
			@Pc(30) byte[] local30 = Static191.aByteArrayArray11[local16];
			if (Static165.aBooleanArray12[local16]) {
				@Pc(85) int[] local85 = new int[local26];
				@Pc(89) byte[] local89 = Static37.aByteArrayArray2[local16];
				for (@Pc(91) int local91 = 0; local91 < local26; local91++) {
					local85[local91] = (local89[local91] & 0xFF) << 24 | Static78.anIntArray127[local30[local91] & 0xFF];
				}
				local4[local16] = new Class1_Sub1_Sub8_Sub1_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local16], Static228.anIntArray507[local16], Static8.anIntArray20[local16], Static101.anIntArray191[local16], local85);
			} else {
				@Pc(37) int[] local37 = new int[local26];
				for (@Pc(39) int local39 = 0; local39 < local26; local39++) {
					local37[local39] = Static78.anIntArray127[local30[local39] & 0xFF];
				}
				local4[local16] = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local16], Static228.anIntArray507[local16], Static8.anIntArray20[local16], Static101.anIntArray191[local16], local37);
			}
		}
		Static216.method3375();
		return local4;
	}
}
