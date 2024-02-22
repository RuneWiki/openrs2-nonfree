package a;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/f")
public final class Class11 {

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "Ljava/net/URL;")
	public static URL anURL1 = null;

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "[I")
	private static int[] anIntArray95 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/InputStream;")
	public static InputStream method302(@OriginalArg(0) String arg0) throws IOException {
		@Pc(9) InputStream local9;
		if (anURL1 == null) {
			local9 = new BufferedInputStream(new FileInputStream(arg0));
		} else {
			@Pc(17) URL local17 = new URL(anURL1, arg0);
			local9 = local17.openStream();
		}
		return local9;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;[BI)V")
	public static void method303(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(2) InputStream local2 = method302(arg0);
		@Pc(7) DataInputStream local7 = new DataInputStream(local2);
		try {
			local7.readFully(arg1, 0, arg2);
		} catch (@Pc(14) EOFException local14) {
		}
		local7.close();
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "([BII)V")
	public static void method304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[arg1] = (byte) (arg2 >> 24);
		arg0[arg1 + 1] = (byte) (arg2 >> 16);
		arg0[arg1 + 2] = (byte) (arg2 >> 8);
		arg0[arg1 + 3] = (byte) arg2;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(B)I")
	public static int method305(@OriginalArg(0) byte arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "([BI)I")
	public static int method306(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return ((arg0[arg1] & 0xFF) << 8) + (arg0[arg1 + 1] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "([BI)I")
	public static int method307(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return ((arg0[arg1] & 0xFF) << 24) + ((arg0[arg1 + 1] & 0xFF) << 16) + ((arg0[arg1 + 2] & 0xFF) << 8) + (arg0[arg1 + 3] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "c", descriptor = "([BI)J")
	public static long method308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return (((long) method307(arg0, arg1) & 0xFFFFFFFFL) << 32) + ((long) method307(arg0, arg1 + 4) & 0xFFFFFFFFL);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "d", descriptor = "([BI)I")
	public static int method309(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = method305(arg0[arg1]) * 256 + method305(arg0[arg1 + 1]);
		if (local13 > 32767) {
			local13 -= 65536;
		}
		return local13;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "e", descriptor = "([BI)I")
	public static int method310(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return (arg0[arg1] & 0xFF) < 128 ? arg0[arg1] : ((arg0[arg1] & 0xFF) - 128 << 24) + ((arg0[arg1 + 1] & 0xFF) << 16) + ((arg0[arg1 + 2] & 0xFF) << 8) + (arg0[arg1 + 3] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "([BII)I")
	public static int method311(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 >> 3;
		@Pc(11) int local11 = 8 - (arg1 & 0x7);
		@Pc(13) int local13 = 0;
		while (arg2 > local11) {
			local13 += (arg0[local5++] & anIntArray95[local11]) << arg2 - local11;
			arg2 -= local11;
			local11 = 8;
		}
		if (arg2 == local11) {
			local13 += arg0[local5] & anIntArray95[local11];
		} else {
			local13 += arg0[local5] >> local11 - arg2 & anIntArray95[arg2];
		}
		return local13;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method312(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) String local3 = "";
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			if (local5 >= arg0.length()) {
				local3 = local3 + " ";
			} else {
				@Pc(26) char local26 = arg0.charAt(local5);
				if (local26 >= 'a' && local26 <= 'z') {
					local3 = local3 + local26;
				} else if (local26 >= 'A' && local26 <= 'Z') {
					local3 = local3 + local26;
				} else if (local26 >= '0' && local26 <= '9') {
					local3 = local3 + local26;
				} else {
					local3 = local3 + '_';
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method313(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		@Pc(4) String local4 = "";
		for (@Pc(6) int local6 = 0; local6 < local2.length() && local6 < arg1; local6++) {
			@Pc(12) char local12 = local2.charAt(local6);
			if (local12 >= 'a' && local12 <= 'z') {
				local4 = local4 + local12;
			}
			if (local12 >= '0' && local12 <= '9') {
				local4 = local4 + local12;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method314(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;)J")
	public static long method315(@OriginalArg(0) String arg0) {
		@Pc(3) String local3 = "";
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(11) char local11 = arg0.charAt(local5);
			if (local11 >= 'a' && local11 <= 'z') {
				local3 = local3 + local11;
			} else if (local11 >= 'A' && local11 <= 'Z') {
				local3 = local3 + (char) (local11 + 'a' - 65);
			} else if (local11 >= '0' && local11 <= '9') {
				local3 = local3 + local11;
			} else {
				local3 = local3 + ' ';
			}
		}
		local3 = local3.trim();
		if (local3.length() > 12) {
			local3 = local3.substring(0, 12);
		}
		@Pc(95) long local95 = 0L;
		for (@Pc(97) int local97 = 0; local97 < local3.length(); local97++) {
			@Pc(103) char local103 = local3.charAt(local97);
			local95 *= 37L;
			if (local103 >= 'a' && local103 <= 'z') {
				local95 += local103 + 1 - 97;
			} else if (local103 >= '0' && local103 <= '9') {
				local95 += local103 + 27 - 48;
			}
		}
		return local95;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(J)Ljava/lang/String;")
	public static String method316(@OriginalArg(0) long arg0) {
		if (arg0 < 0L) {
			return "invalid_name";
		}
		@Pc(9) String local9 = "";
		while (arg0 != 0L) {
			@Pc(16) int local16 = (int) (arg0 % 37L);
			arg0 /= 37L;
			if (local16 == 0) {
				local9 = " " + local9;
			} else if (local16 >= 27) {
				local9 = (char) (local16 + 48 - 27) + local9;
			} else if (arg0 % 37L == 0L) {
				local9 = (char) (local16 + 65 - 1) + local9;
			} else {
				local9 = (char) (local16 + 97 - 1) + local9;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;[B)I")
	public static int method317(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5 = method306(arg1, 0);
		@Pc(7) int local7 = 0;
		@Pc(10) String local10 = arg0.toUpperCase();
		for (@Pc(12) int local12 = 0; local12 < local10.length(); local12++) {
			local7 = local7 * 61 + local10.charAt(local12) - 32;
		}
		@Pc(35) int local35 = local5 * 10 + 2;
		for (@Pc(37) int local37 = 0; local37 < local5; local37++) {
			@Pc(85) int local85 = (arg1[local37 * 10 + 2] & 0xFF) * 16777216 + (arg1[local37 * 10 + 3] & 0xFF) * 65536 + (arg1[local37 * 10 + 4] & 0xFF) * 256 + (arg1[local37 * 10 + 5] & 0xFF);
			@Pc(119) int local119 = (arg1[local37 * 10 + 9] & 0xFF) * 65536 + (arg1[local37 * 10 + 10] & 0xFF) * 256 + (arg1[local37 * 10 + 11] & 0xFF);
			if (local85 == local7) {
				return local35;
			}
			local35 += local119;
		}
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;[B)I")
	public static int method318(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5 = method306(arg1, 0);
		@Pc(7) int local7 = 0;
		@Pc(10) String local10 = arg0.toUpperCase();
		for (@Pc(12) int local12 = 0; local12 < local10.length(); local12++) {
			local7 = local7 * 61 + local10.charAt(local12) - 32;
		}
		@Pc(35) int local35 = local5 * 10 + 2;
		for (@Pc(37) int local37 = 0; local37 < local5; local37++) {
			@Pc(85) int local85 = (arg1[local37 * 10 + 2] & 0xFF) * 16777216 + (arg1[local37 * 10 + 3] & 0xFF) * 65536 + (arg1[local37 * 10 + 4] & 0xFF) * 256 + (arg1[local37 * 10 + 5] & 0xFF);
			@Pc(119) int local119 = (arg1[local37 * 10 + 6] & 0xFF) * 65536 + (arg1[local37 * 10 + 7] & 0xFF) * 256 + (arg1[local37 * 10 + 8] & 0xFF);
			@Pc(153) int local153 = (arg1[local37 * 10 + 9] & 0xFF) * 65536 + (arg1[local37 * 10 + 10] & 0xFF) * 256 + (arg1[local37 * 10 + 11] & 0xFF);
			if (local85 == local7) {
				return local119;
			}
			local35 += local153;
		}
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I[B)[B")
	public static byte[] method319(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		return method320(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I[B[B)[B")
	private static byte[] method320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(15) int local15 = (arg2[0] & 0xFF) * 256 + (arg2[1] & 0xFF);
		@Pc(17) int local17 = 0;
		@Pc(20) String local20 = arg0.toUpperCase();
		for (@Pc(22) int local22 = 0; local22 < local20.length(); local22++) {
			local17 = local17 * 61 + local20.charAt(local22) - 32;
		}
		@Pc(45) int local45 = local15 * 10 + 2;
		for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
			@Pc(95) int local95 = (arg2[local47 * 10 + 2] & 0xFF) * 16777216 + (arg2[local47 * 10 + 3] & 0xFF) * 65536 + (arg2[local47 * 10 + 4] & 0xFF) * 256 + (arg2[local47 * 10 + 5] & 0xFF);
			@Pc(129) int local129 = (arg2[local47 * 10 + 6] & 0xFF) * 65536 + (arg2[local47 * 10 + 7] & 0xFF) * 256 + (arg2[local47 * 10 + 8] & 0xFF);
			@Pc(163) int local163 = (arg2[local47 * 10 + 9] & 0xFF) * 65536 + (arg2[local47 * 10 + 10] & 0xFF) * 256 + (arg2[local47 * 10 + 11] & 0xFF);
			if (local95 == local17) {
				if (arg3 == null) {
					arg3 = new byte[local129 + arg1];
				}
				if (local129 == local163) {
					for (@Pc(187) int local187 = 0; local187 < local129; local187++) {
						arg3[local187] = arg2[local45 + local187];
					}
				} else {
					Class8.method291(arg3, local129, arg2, local163, local45);
				}
				return arg3;
			}
			local45 += local163;
		}
		return null;
	}
}
