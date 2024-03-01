import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
final class Class637 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "I")
	static int anInt5627;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	static int anInt5628;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	static int anInt5629;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Lloader!j;")
	static Class636 aClass636_5;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/CharSequence;)Ljava/lang/String;", line = 8)
	private static final String method33921(@OriginalArg(0) int arg0, @OriginalArg(1) CharSequence arg1) {
		anInt5628++;
		@Pc(8) int local8 = arg1.length();
		@Pc(13) StringBuilder local13 = new StringBuilder(local8);
		if (arg0 != 7605) {
			method33921(118, null);
		}
		for (@Pc(25) int local25 = 0; local25 < local8; local25++) {
			@Pc(32) char local32 = arg1.charAt(local25);
			if (local32 >= 97 && local32 <= 122 || !(local32 < 'A' || local32 > 90) || local32 >= 48 && local32 <= '9' || local32 == 46 || local32 == '-' || local32 == '*' || local32 == '_') {
				local13.append(local32);
			} else if (local32 == 32) {
				local13.append('+');
			} else {
				@Pc(140) byte local140;
				if (local32 > 0 && local32 < 128 || !(local32 < 160 || local32 > 255)) {
					local140 = (byte) local32;
				} else if (local32 == 8364) {
					local140 = -128;
				} else if (local32 == 8218) {
					local140 = -126;
				} else if (local32 == 402) {
					local140 = -125;
				} else if (local32 == 8222) {
					local140 = -124;
				} else if (local32 == 8230) {
					local140 = -123;
				} else if (local32 == 8224) {
					local140 = -122;
				} else if (local32 == 8225) {
					local140 = -121;
				} else if (local32 == 710) {
					local140 = -120;
				} else if (local32 == 8240) {
					local140 = -119;
				} else if (local32 == 352) {
					local140 = -118;
				} else if (local32 == 8249) {
					local140 = -117;
				} else if (local32 == 338) {
					local140 = -116;
				} else if (local32 == 381) {
					local140 = -114;
				} else if (local32 == 8216) {
					local140 = -111;
				} else if (local32 == 8217) {
					local140 = -110;
				} else if (local32 == 8220) {
					local140 = -109;
				} else if (local32 == 8221) {
					local140 = -108;
				} else if (local32 == 8226) {
					local140 = -107;
				} else if (local32 == 8211) {
					local140 = -106;
				} else if (local32 == 8212) {
					local140 = -105;
				} else if (local32 == 732) {
					local140 = -104;
				} else if (local32 == 8482) {
					local140 = -103;
				} else if (local32 == 353) {
					local140 = -102;
				} else if (local32 == 8250) {
					local140 = -101;
				} else if (local32 == 339) {
					local140 = -100;
				} else if (local32 == 382) {
					local140 = -98;
				} else if (local32 == 376) {
					local140 = -97;
				} else {
					local140 = 63;
				}
				local13.append('%');
				@Pc(431) int local431 = local140 >> 4 & 0xF;
				if (local431 >= 10) {
					local13.append((char) (local431 + 55));
				} else {
					local13.append((char) (local431 + 48));
				}
				local431 = local140 & 0xF;
				if (local431 < 10) {
					local13.append((char) (local431 + 48));
				} else {
					local13.append((char) (local431 + 55));
				}
			}
		}
		return local13.toString();
	}

	static {
		@Pc(103) Class636_Sub1 local103 = new Class636_Sub1(15);
		((Class636_Sub1) local103).anObject40 = "unsigned";
		aClass636_5 = local103;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 189)
	static final void method33922(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		anInt5627++;
		try {
			@Pc(15) String local15 = "";
			if (arg1 != null) {
				@Pc(22) Throwable local22 = arg1;
				@Pc(27) String local27;
				if (arg1 instanceof RuntimeException_Sub5) {
					@Pc(32) RuntimeException_Sub5 local32 = (RuntimeException_Sub5) arg1;
					local27 = local32.aString250 + " | ";
					local22 = local32.aThrowable2;
				} else {
					local27 = "";
				}
				@Pc(51) StringWriter local51 = new StringWriter();
				@Pc(56) PrintWriter local56 = new PrintWriter(local51);
				local22.printStackTrace(local56);
				local56.close();
				@Pc(64) String local64 = local51.toString();
				@Pc(72) BufferedReader local72 = new BufferedReader(new StringReader(local64));
				@Pc(75) String local75 = local72.readLine();
				while (true) {
					@Pc(78) String local78 = local72.readLine();
					if (local78 == null) {
						local27 = local27 + "| " + local75;
						local15 = local27;
						break;
					}
					@Pc(87) int local87 = local78.indexOf(40);
					@Pc(94) int local94 = local78.indexOf(41, local87 + 1);
					@Pc(102) String local102;
					if (local87 == -1) {
						local102 = local78;
					} else {
						local102 = local78.substring(0, local87);
					}
					local102 = local102.trim();
					local102 = local102.substring(local102.lastIndexOf(32) + 1);
					local102 = local102.substring(local102.lastIndexOf(9) - -1);
					local27 = local27 + local102;
					if (local87 != -1 && local94 != -1) {
						@Pc(151) int local151 = local78.indexOf(".java:", local87);
						if (local151 >= 0) {
							local27 = local27 + local78.substring(local151 + 5, local94);
						}
					}
					local27 = local27 + ' ';
				}
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg0;
			}
			Class638.method33923(119, local15);
			local15 = method33921(7605, local15);
			if (Class636_Sub1_Sub1_Sub1_Sub1.anApplet5 == null) {
				return;
			}
			@Pc(240) String local240 = "Unknown";
			@Pc(244) String local244 = "1.1";
			try {
				local240 = System.getProperty("java.vendor");
				local244 = System.getProperty("java.version");
			} catch (@Pc(256) Exception local256) {
			}
			@Pc(327) URL local327 = new URL(Class636_Sub1_Sub1_Sub1_Sub1.anApplet5.getCodeBase(), "clienterror.ws?c=" + Class635.anInt5605 * -666674645 + "&cs=" + anInt5629 * 421738521 + "&u=" + (ClassLoader_Sub1.aString249 == null ? "" + Class636_Sub1_Sub1_Sub1.aLong302 * -7487911166462894959L : method33921(7605, ClassLoader_Sub1.aString249)) + "&v1=" + method33921(7605, local240) + "&v2=" + method33921(7605, local244) + "&e=" + local15);
			@Pc(333) DataInputStream local333 = new DataInputStream(local327.openStream());
			local333.read();
			local333.close();
		} catch (@Pc(340) Exception local340) {
			local340.printStackTrace();
		}
	}
}
