package a;

import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/e")
public class Class7 {

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "I")
	private static final int anInt214 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".length();

	@OriginalMember(owner = "mudclient!a/e", name = "g", descriptor = "[I")
	private static int[] anIntArray85 = new int[256];

	@OriginalMember(owner = "mudclient!a/e", name = "h", descriptor = "[I")
	private static int[] anIntArray86 = new int[256];

	@OriginalMember(owner = "mudclient!a/e", name = "y", descriptor = "[C")
	private static char[] aCharArray2 = new char[256];

	@OriginalMember(owner = "mudclient!a/e", name = "G", descriptor = "[I")
	private static int[] anIntArray87;

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "mudclient!a/e", name = "f", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "mudclient!a/e", name = "l", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "mudclient!a/e", name = "z", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "mudclient!a/e", name = "A", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "mudclient!a/e", name = "B", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "mudclient!a/e", name = "C", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "mudclient!a/e", name = "F", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "I")
	private int anInt216 = 3141592;

	@OriginalMember(owner = "mudclient!a/e", name = "e", descriptor = "I")
	private int anInt218 = 3141592;

	@OriginalMember(owner = "mudclient!a/e", name = "i", descriptor = "I")
	private int anInt220 = 5000;

	@OriginalMember(owner = "mudclient!a/e", name = "j", descriptor = "Z")
	protected boolean aBoolean42 = false;

	@OriginalMember(owner = "mudclient!a/e", name = "k", descriptor = "Ljava/lang/String;")
	protected String aString19 = "";

	@OriginalMember(owner = "mudclient!a/e", name = "m", descriptor = "I")
	private final int anInt222 = 61;

	@OriginalMember(owner = "mudclient!a/e", name = "n", descriptor = "I")
	private final int anInt223 = 59;

	@OriginalMember(owner = "mudclient!a/e", name = "o", descriptor = "I")
	private final int anInt224 = 42;

	@OriginalMember(owner = "mudclient!a/e", name = "p", descriptor = "I")
	private final int anInt225 = 43;

	@OriginalMember(owner = "mudclient!a/e", name = "q", descriptor = "I")
	private final int anInt226 = 44;

	@OriginalMember(owner = "mudclient!a/e", name = "r", descriptor = "I")
	private final int anInt227 = 45;

	@OriginalMember(owner = "mudclient!a/e", name = "s", descriptor = "I")
	private final int anInt228 = 46;

	@OriginalMember(owner = "mudclient!a/e", name = "t", descriptor = "I")
	private final int anInt229 = 47;

	@OriginalMember(owner = "mudclient!a/e", name = "u", descriptor = "I")
	private final int anInt230 = 92;

	@OriginalMember(owner = "mudclient!a/e", name = "v", descriptor = "I")
	private final int anInt231 = 32;

	@OriginalMember(owner = "mudclient!a/e", name = "w", descriptor = "I")
	private final int anInt232 = 124;

	@OriginalMember(owner = "mudclient!a/e", name = "x", descriptor = "I")
	private final int anInt233 = 34;

	@OriginalMember(owner = "mudclient!a/e", name = "D", descriptor = "I")
	private int anInt238 = 3;

	@OriginalMember(owner = "mudclient!a/e", name = "E", descriptor = "I")
	private int anInt239 = 8;

	static {
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			aCharArray2[local13] = (char) local13;
		}
		aCharArray2[61] = '=';
		aCharArray2[59] = ';';
		aCharArray2[42] = '*';
		aCharArray2[43] = '+';
		aCharArray2[44] = ',';
		aCharArray2[45] = '-';
		aCharArray2[46] = '.';
		aCharArray2[47] = '/';
		aCharArray2[92] = '\\';
		aCharArray2[124] = '|';
		aCharArray2[33] = '!';
		aCharArray2[34] = '"';
		anIntArray87 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	}

	@OriginalMember(owner = "mudclient!a/e", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "()V")
	public void method268() {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "()I")
	public int method269() throws IOException {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "()I")
	protected int method270() throws IOException {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(II[B)V")
	protected void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "([BII)V")
	protected void method272(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "()I")
	private int method273() throws IOException {
		return this.method269();
	}

	@OriginalMember(owner = "mudclient!a/e", name = "e", descriptor = "()I")
	private int method274() throws IOException {
		@Pc(2) int local2 = this.method273();
		@Pc(5) int local5 = this.method273();
		return local2 * 256 + local5;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "f", descriptor = "()I")
	public final int method275() throws IOException {
		@Pc(2) int local2 = this.method274();
		@Pc(5) int local5 = this.method274();
		return local2 * 65536 + local5;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I[B)V")
	public final void method276(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		this.method271(arg0, 0, arg1);
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "([B)I")
	public final int method277(@OriginalArg(0) byte[] arg0) {
		try {
			this.anInt235++;
			if (this.anInt236 > 0 && this.anInt235 > this.anInt236) {
				this.aBoolean42 = true;
				this.aString19 = "time-out";
				this.anInt236 += this.anInt236;
				return 0;
			}
			if (this.anInt234 == 0 && this.method270() >= 2) {
				this.anInt234 = this.method269();
				if (this.anInt234 >= 160) {
					this.anInt234 = (this.anInt234 - 160) * 256 + this.method269();
				}
			}
			if (this.anInt234 > 0 && this.method270() >= this.anInt234) {
				if (this.anInt234 >= 160) {
					this.method276(this.anInt234, arg0);
				} else {
					arg0[this.anInt234 - 1] = (byte) this.method269();
					if (this.anInt234 > 1) {
						this.method276(this.anInt234 - 1, arg0);
					}
				}
				@Pc(96) int local96 = this.anInt234;
				this.anInt234 = 0;
				this.anInt235 = 0;
				return local96;
			}
		} catch (@Pc(105) IOException local105) {
			this.aBoolean42 = true;
			this.aString19 = local105.getMessage();
		}
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I)V")
	public final void method278(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt238++] = (byte) arg0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "(I)V")
	public final void method279(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt238++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt238++] = (byte) arg0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "(I)V")
	public final void method280(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt238++] = (byte) (arg0 >> 24);
		this.aByteArray8[this.anInt238++] = (byte) (arg0 >> 16);
		this.aByteArray8[this.anInt238++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt238++] = (byte) arg0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(J)V")
	public final void method281(@OriginalArg(0) long arg0) {
		this.method280((int) (arg0 >> 32));
		this.method280((int) (arg0 & 0xFFFFFFFFFFFFFFFFL));
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(Ljava/lang/String;)V")
	public final void method282(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray8, this.anInt238);
		this.anInt238 += arg0.length();
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "([BII)V")
	public final void method283(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			this.aByteArray8[this.anInt238++] = arg0[arg1 + local1];
		}
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(Ljava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		@Pc(4) byte[] local4 = arg0.getBytes();
		@Pc(7) int local7 = local4.length;
		@Pc(10) byte[] local10 = new byte[15];
		for (@Pc(12) int local12 = 0; local12 < local7; local12 += 7) {
			local10[0] = (byte) (Math.random() * 127.0D + 1.0D);
			local10[1] = (byte) (Math.random() * 256.0D);
			local10[2] = (byte) (Math.random() * 256.0D);
			local10[3] = (byte) (Math.random() * 256.0D);
			Class11.method304(local10, 4, arg1);
			for (@Pc(54) int local54 = 0; local54 < 7; local54++) {
				if (local12 + local54 < local7) {
					local10[local54 + 8] = local4[local12 + local54];
				} else {
					local10[local54 + 8] = 32;
				}
			}
			@Pc(89) BigInteger local89 = new BigInteger(1, local10);
			@Pc(94) BigInteger local94 = local89.modPow(arg2, arg3);
			@Pc(97) byte[] local97 = local94.toByteArray();
			this.aByteArray8[this.anInt238++] = (byte) local97.length;
			for (@Pc(112) int local112 = 0; local112 < local97.length; local112++) {
				this.aByteArray8[this.anInt238++] = local97[local112];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(II)V")
	public final void method285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt219 = arg1;
		if (this.anInt237 > this.anInt220 * 4 / 5) {
			try {
				this.method289(0);
			} catch (@Pc(16) IOException local16) {
				this.aBoolean42 = true;
				this.aString19 = local16.getMessage();
			}
		}
		if (this.aByteArray8 == null) {
			this.aByteArray8 = new byte[this.anInt220];
		}
		this.aByteArray8[this.anInt237 + 2] = (byte) arg0;
		this.aByteArray8[this.anInt237 + 3] = 0;
		this.anInt238 = this.anInt237 + 3;
		this.anInt239 = 8;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I[I)I")
	public final int method286(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(6) int local6 = arg0 - this.anInt218 & 0xFF;
		@Pc(10) int local10 = arg1[local6];
		this.anInt217 = (this.anInt217 + local10) % anInt214;
		@Pc(23) char local23 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(this.anInt217);
		this.anInt218 = this.anInt218 * 3 + local23 + local10 & 0xFFFF;
		return local6;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "g", descriptor = "()V")
	public final void method287() {
		@Pc(11) int local11 = this.aByteArray8[this.anInt237 + 2] & 0xFF;
		this.aByteArray8[this.anInt237 + 2] = (byte) (local11 + this.anInt216);
		@Pc(26) int local26 = this.anInt219;
		this.anInt215 = (this.anInt215 + local26) % anInt214;
		@Pc(39) char local39 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(this.anInt215);
		this.anInt216 = this.anInt216 * 3 + local39 + local26 & 0xFFFF;
		if (this.anInt239 != 8) {
			this.anInt238++;
		}
		@Pc(69) int local69 = this.anInt238 - this.anInt237 - 2;
		if (local69 >= 160) {
			this.aByteArray8[this.anInt237] = (byte) (local69 / 256 + 160);
			this.aByteArray8[this.anInt237 + 1] = (byte) (local69 & 0xFF);
		} else {
			this.aByteArray8[this.anInt237] = (byte) local69;
			this.anInt238--;
			this.aByteArray8[this.anInt237 + 1] = this.aByteArray8[this.anInt238];
		}
		if (this.anInt220 <= 10000) {
			@Pc(135) int local135 = this.aByteArray8[this.anInt237 + 2] & 0xFF;
			@Pc(139) int local139 = anIntArray85[local135]++;
			anIntArray86[local135] += this.anInt238 - this.anInt237;
		}
		this.anInt237 = this.anInt238;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "h", descriptor = "()V")
	public final void method288() throws IOException {
		this.method287();
		this.method289(0);
	}

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "(I)V")
	public final void method289(@OriginalArg(0) int arg0) throws IOException {
		if (this.aBoolean42) {
			this.anInt237 = 0;
			this.anInt238 = 3;
			this.aBoolean42 = false;
			throw new IOException(this.aString19);
		}
		this.anInt221++;
		if (this.anInt221 < arg0) {
			return;
		}
		if (this.anInt237 > 0) {
			this.anInt221 = 0;
			this.method272(this.aByteArray8, 0, this.anInt237);
		}
		this.anInt237 = 0;
		this.anInt238 = 3;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "i", descriptor = "()Z")
	public final boolean method290() {
		return this.anInt237 > 0;
	}
}
