import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!k")
class Class707_Sub1_Sub1 extends Class707_Sub1 {

	@OriginalMember(owner = "loader!k", name = "h", descriptor = "I")
	static int anInt5914;

	@OriginalMember(owner = "loader!k", name = "f", descriptor = "[C")
	private static char[] aCharArray13 = new char[64];

	@OriginalMember(owner = "loader!k", name = "g", descriptor = "Ljava/lang/Object;")
	Object anObject40;

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 4)
	static final byte[] method36609(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt5914++;
		@Pc(12) int local12 = arg0 == null ? 0 : arg0.length();
		if (local12 == 0) {
			return new byte[0];
		}
		@Pc(26) int local26 = local12 + 3 & 0xFFFFFFFC;
		@Pc(32) int local32 = local26 / 4 * 3;
		if (arg1 != -22792) {
			aCharArray13 = null;
		}
		label27: {
			if (local12 > local26 + -2 && RuntimeException_Sub5.method36615(117, arg0.charAt(local26 + -2)) != -1) {
				if (local12 > local26 + -1 && RuntimeException_Sub5.method36615(114, arg0.charAt(local26 - 1)) != -1) {
					break label27;
				}
				local32--;
				if (!Class707.aBoolean876) {
					break label27;
				}
			}
			local32 -= 2;
		}
		@Pc(89) byte[] local89 = new byte[local32];
		Class707_Sub1_Sub1_Sub1.method36610(arg0, -1, 0, local89);
		return local89;
	}

	@OriginalMember(owner = "loader!k", name = "<init>", descriptor = "(I)V", line = 34)
	Class707_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	static {
		@Pc(25) int local25;
		for (local25 = 0; local25 < 26; local25++) {
			aCharArray13[local25] = (char) (local25 + 65);
		}
		for (local25 = 26; local25 < 52; local25++) {
			aCharArray13[local25] = (char) (-26 + 97 + local25);
		}
		for (local25 = 52; local25 < 62; local25++) {
			aCharArray13[local25] = (char) (local25 + -4);
		}
		aCharArray13[63] = '/';
		aCharArray13[62] = '+';
	}
}
