import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
class Class636_Sub1_Sub1 extends Class636_Sub1 {

	@OriginalMember(owner = "loader!h", name = "g", descriptor = "[I")
	static int[] anIntArray532 = new int[128];

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "[C")
	private static char[] aCharArray12;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "Ljava/lang/Object;")
	Object anObject41;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(I)V", line = 3)
	Class636_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < anIntArray532.length; local4++) {
			anIntArray532[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray532[local4] = local4 + -65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray532[local4] = 26 + -97 + local4;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray532[local4] = local4 + 52 - 48;
		}
		anIntArray532[43] = 62;
		@Pc(63) int[] local63 = anIntArray532;
		local63[42] = 62;
		@Pc(69) int[] local69 = anIntArray532;
		anIntArray532[47] = 63;
		local69[45] = 63;
		aCharArray12 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray12[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray12[local4] = (char) (71 - -local4);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray12[local4] = (char) (local4 + 48 + -52);
		}
		aCharArray12[63] = '/';
		aCharArray12[62] = '+';
	}
}
