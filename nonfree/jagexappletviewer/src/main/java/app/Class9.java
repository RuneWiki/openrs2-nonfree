package app;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/g")
final class Class9 {

	@OriginalMember(owner = "jagexappletviewer!app/g", name = "a", descriptor = "[C")
	private static char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "jagexappletviewer!app/g", name = "b", descriptor = "[C")
	private static char[] aCharArray2;

	@OriginalMember(owner = "jagexappletviewer!app/g", name = "c", descriptor = "[I")
	private static int[] anIntArray3;

	@OriginalMember(owner = "jagexappletviewer!app/g", name = "a", descriptor = "([BB)Ljava/lang/String;")
	static final String method28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		return arg1 <= 23 ? (String) null : method29(arg0, (byte) -120, 0, arg0.length);
	}

	@OriginalMember(owner = "jagexappletviewer!app/g", name = "a", descriptor = "([BBII)Ljava/lang/String;")
	private static final String method29(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) StringBuffer local5 = new StringBuffer();
		for (@Pc(7) int local7 = arg2; local7 < arg2 + arg3; local7 += 3) {
			@Pc(18) int local18 = arg0[local7] & 0xFF;
			local5.append(aCharArray1[local18 >>> -550707454]);
			if (arg3 - 1 > local7) {
				@Pc(39) int local39 = arg0[local7 + 1] & 0xFF;
				local5.append(aCharArray1[local39 >>> -225036892 | (local18 & 0x3) << -1352870236]);
				if (arg3 - 2 > local7) {
					@Pc(66) int local66 = arg0[local7 + 2] & 0xFF;
					local5.append(aCharArray1[local39 << 902580418 & 0x3C | local66 >>> -925470394]).append(aCharArray1[local66 & 0x3F]);
				} else {
					local5.append(aCharArray1[(local39 & 0xF) << -685901150]).append("=");
				}
			} else {
				local5.append(aCharArray1[local18 << 1699602692 & 0x30]).append("==");
			}
		}
		if (arg1 != -120) {
			aCharArray2 = null;
		}
		return local5.toString();
	}

	static {
		@Pc(4) int local4;
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray1[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray1[local4] = (char) (local4 + 97 - 26);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray1[local4] = (char) (local4 - 4);
		}
		aCharArray1[62] = '+';
		aCharArray1[63] = '/';
		aCharArray2 = new char[64];
		for (local4 = 0; local4 < 26; local4++) {
			aCharArray2[local4] = (char) (local4 + 65);
		}
		for (local4 = 26; local4 < 52; local4++) {
			aCharArray2[local4] = (char) (local4 + 71);
		}
		for (local4 = 52; local4 < 62; local4++) {
			aCharArray2[local4] = (char) (local4 - 4);
		}
		aCharArray2[62] = '*';
		aCharArray2[63] = '-';
		anIntArray3 = new int[128];
		for (local4 = 0; local4 < anIntArray3.length; local4++) {
			anIntArray3[local4] = -1;
		}
		for (local4 = 65; local4 <= 90; local4++) {
			anIntArray3[local4] = local4 - 65;
		}
		for (local4 = 97; local4 <= 122; local4++) {
			anIntArray3[local4] = local4 + 26 - 97;
		}
		for (local4 = 48; local4 <= 57; local4++) {
			anIntArray3[local4] = local4 + 4;
		}
		anIntArray3[42] = anIntArray3[43] = 62;
		anIntArray3[45] = anIntArray3[47] = 63;
	}
}
