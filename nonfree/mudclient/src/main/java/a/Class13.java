package a;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/h")
public final class Class13 {

	@OriginalMember(owner = "mudclient!a/h", name = "a", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[100];

	@OriginalMember(owner = "mudclient!a/h", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "mudclient!a/h", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "mudclient!a/h", name = "a", descriptor = "([BII)Ljava/lang/String;")
	public static String method352(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(22) int local22;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			@Pc(16) int local16 = arg0[arg1++] & 0xFF;
			local22 = local16 >> 4 & 0xF;
			if (local5 != -1) {
				aCharArray3[local3++] = aCharArray4[(local5 << 4) + local22 - 195];
				local5 = -1;
			} else if (local22 < 13) {
				aCharArray3[local3++] = aCharArray4[local22];
			} else {
				local5 = local22;
			}
			local22 = local16 & 0xF;
			if (local5 != -1) {
				aCharArray3[local3++] = aCharArray4[(local5 << 4) + local22 - 195];
				local5 = -1;
			} else if (local22 < 13) {
				aCharArray3[local3++] = aCharArray4[local22];
			} else {
				local5 = local22;
			}
		}
		@Pc(100) boolean local100 = true;
		for (local22 = 0; local22 < local3; local22++) {
			@Pc(108) char local108 = aCharArray3[local22];
			if (local22 > 4 && local108 == '@') {
				aCharArray3[local22] = ' ';
			}
			if (local108 == '%') {
				aCharArray3[local22] = ' ';
			}
			if (local100 && local108 >= 'a' && local108 <= 'z') {
				aCharArray3[local22] = (char) (aCharArray3[local22] - 32);
				local100 = false;
			}
			if (local108 == '.' || local108 == '!') {
				local100 = true;
			}
		}
		return new String(aCharArray3, 0, local3);
	}

	@OriginalMember(owner = "mudclient!a/h", name = "a", descriptor = "(Ljava/lang/String;)I")
	public static int method353(@OriginalArg(0) String arg0) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		arg0 = arg0.toLowerCase();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = -1;
		for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < aCharArray4.length; local29++) {
				if (local25 == aCharArray4[local29]) {
					local27 = local29;
					break;
				}
			}
			if (local27 > 12) {
				local27 += 195;
			}
			if (local17 == -1) {
				if (local27 < 13) {
					local17 = local27;
				} else {
					aByteArray17[local15++] = (byte) local27;
				}
			} else if (local27 < 13) {
				aByteArray17[local15++] = (byte) ((local17 << 4) + local27);
				local17 = -1;
			} else {
				aByteArray17[local15++] = (byte) ((local17 << 4) + (local27 >> 4));
				local17 = local27 & 0xF;
			}
		}
		if (local17 != -1) {
			aByteArray17[local15++] = (byte) (local17 << 4);
		}
		return local15;
	}
}
