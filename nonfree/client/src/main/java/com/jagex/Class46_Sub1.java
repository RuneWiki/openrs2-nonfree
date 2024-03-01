package com.jagex;

import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aee")
public class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!aee", name = "at", descriptor = "I")
	static final int anInt950 = 250;

	@OriginalMember(owner = "client!aee", name = "z", descriptor = "B")
	static final byte aByte22 = 0;

	@OriginalMember(owner = "client!aee", name = "j", descriptor = "B")
	static final byte aByte23 = 1;

	@OriginalMember(owner = "client!aee", name = "n", descriptor = "B")
	static final byte aByte24 = -1;

	@OriginalMember(owner = "client!aee", name = "aa", descriptor = "I")
	static final int anInt953 = 1;

	@OriginalMember(owner = "client!aee", name = "k", descriptor = "I")
	static final int anInt954 = 1000;

	@OriginalMember(owner = "client!aee", name = "ak", descriptor = "I")
	static final int anInt957 = 0;

	@OriginalMember(owner = "client!aee", name = "ah", descriptor = "I")
	static final int anInt958 = 2;

	@OriginalMember(owner = "client!aee", name = "af", descriptor = "Ljava/util/zip/CRC32;")
	static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "Z")
	boolean aBoolean186;

	@OriginalMember(owner = "client!aee", name = "e", descriptor = "[B")
	byte[] aByteArray17;

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "Lclient!md;")
	Class316 aClass316_1;

	@OriginalMember(owner = "client!aee", name = "m", descriptor = "Z")
	boolean aBoolean188;

	@OriginalMember(owner = "client!aee", name = "r", descriptor = "I")
	int anInt951 = 0;

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "Lclient!xn;")
	Class581 aClass581_5 = new Class581(16);

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "I")
	int anInt952 = 0;

	@OriginalMember(owner = "client!aee", name = "o", descriptor = "Lclient!wk;")
	Class553 aClass553_14 = new Class553();

	@OriginalMember(owner = "client!aee", name = "f", descriptor = "J")
	long aLong25 = 0L;

	@OriginalMember(owner = "client!aee", name = "p", descriptor = "I")
	int anInt955;

	@OriginalMember(owner = "client!aee", name = "h", descriptor = "Lclient!qa;")
	Class403 aClass403_4;

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "Z")
	boolean aBoolean187;

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "Lclient!wk;")
	Class553 aClass553_13;

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "Lclient!qa;")
	Class403 aClass403_5;

	@OriginalMember(owner = "client!aee", name = "a", descriptor = "Lclient!nk;")
	Class51 aClass51_1;

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "Lclient!nl;")
	Class348 aClass348_1;

	@OriginalMember(owner = "client!aee", name = "l", descriptor = "Lclient!nj;")
	Class347 aClass347_1;

	@OriginalMember(owner = "client!aee", name = "u", descriptor = "I")
	int anInt949;

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "[B")
	byte[] aByteArray16;

	@OriginalMember(owner = "client!aee", name = "b", descriptor = "I")
	int anInt956;

	@OriginalMember(owner = "client!aee", name = "i", descriptor = "Z")
	boolean aBoolean189;

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "Lclient!amr;")
	Class3_Sub1_Sub12 aClass3_Sub1_Sub12_1;

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(ILclient!qa;Lclient!qa;Lclient!nk;Lclient!nl;Lclient!nj;I[BIZI)V", line = 44)
	Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) Class348 arg4, @OriginalArg(5) Class347 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt955 = arg0 * 591055057;
		this.aClass403_4 = arg1;
		if (this.aClass403_4 == null) {
			this.aBoolean187 = false;
		} else {
			this.aBoolean187 = true;
			this.aClass553_13 = new Class553();
		}
		this.aClass403_5 = arg2;
		this.aClass51_1 = arg3;
		this.aClass348_1 = arg4;
		this.aClass347_1 = arg5;
		this.anInt949 = arg6 * 365658485;
		this.aByteArray16 = arg7;
		this.anInt956 = arg8 * 3153689;
		this.aBoolean189 = arg9;
		if (this.aClass403_5 != null) {
			this.aClass3_Sub1_Sub12_1 = this.aClass347_1.method26537(this.anInt955 * -156594127, this.aClass403_5);
		}
	}

	@OriginalMember(owner = "client!aee", name = "aa", descriptor = "(I[BII)V", line = 64)
	void method8540(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method8539(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt949 = arg0 * 365658485;
		this.aByteArray16 = arg1;
		this.anInt956 = arg2 * 3153689;
		this.aClass316_1 = null;
		this.aClass3_Sub1_Sub12_1 = null;
		if (!this.aClass51_1.method9820()) {
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aee", name = "ah", descriptor = "(I[BII)V", line = 64)
	void method8541(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method8539(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt949 = arg0 * 365658485;
		this.aByteArray16 = arg1;
		this.anInt956 = arg2 * 3153689;
		this.aClass316_1 = null;
		this.aClass3_Sub1_Sub12_1 = null;
		if (!this.aClass51_1.method9820()) {
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "(I[BIII)V", line = 64)
	void method8546(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method8539(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt949 = arg0 * 365658485;
		this.aByteArray16 = arg1;
		this.anInt956 = arg2 * 3153689;
		this.aClass316_1 = null;
		this.aClass3_Sub1_Sub12_1 = null;
		if (!this.aClass51_1.method9820()) {
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aee", name = "aj", descriptor = "(I[BII)Z", line = 74)
	boolean method8537(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt949 * -1281980707 && this.anInt956 * -352006871 == arg2) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray16.length; local15++) {
				if (this.aByteArray16[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "(I[BIII)Z", line = 74)
	boolean method8539(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt949 * -1281980707 && this.anInt956 * -352006871 == arg2) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray16.length; local15++) {
				if (this.aByteArray16[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "an", descriptor = "(I[BII)Z", line = 74)
	boolean method8542(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt949 * -1281980707 && this.anInt956 * -352006871 == arg2) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray16.length; local15++) {
				if (this.aByteArray16[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aee", name = "as", descriptor = "()I", line = 88)
	public int method8525() {
		if (this.method8506() == null) {
			return this.aClass3_Sub1_Sub12_1 == null ? 0 : this.aClass3_Sub1_Sub12_1.method21155();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aee", name = "m", descriptor = "(I)I", line = 88)
	public int method8535() {
		if (this.method8506() == null) {
			return this.aClass3_Sub1_Sub12_1 == null ? 0 : this.aClass3_Sub1_Sub12_1.method21155();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aee", name = "h", descriptor = "()Lclient!md;", line = 96)
	@Override
	Class316 method8510() {
		if (this.aClass316_1 != null) {
			return this.aClass316_1;
		}
		if (this.aClass3_Sub1_Sub12_1 == null) {
			if (this.aClass51_1.method9820()) {
				return null;
			}
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_1.aBoolean516) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass3_Sub1_Sub12_1.method21157();
		if (this.aClass3_Sub1_Sub12_1 instanceof Class3_Sub1_Sub12_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
				if (this.anInt956 * -352006871 != this.aClass316_1.anInt4544 * 1108569511) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
			} catch (@Pc(126) RuntimeException local126) {
				this.aClass51_1.method9823(255, this.anInt955 * -156594127);
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass403_5 != null) {
				this.aClass347_1.method26520(this.anInt955 * -156594127, local40, this.aClass403_5);
			}
		}
		this.aClass3_Sub1_Sub12_1 = null;
		if (this.aClass403_4 != null) {
			this.aByteArray17 = new byte[this.aClass316_1.anInt4543 * 1691264643];
			this.anInt951 = 0;
		}
		return this.aClass316_1;
	}

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "()Lclient!md;", line = 96)
	@Override
	Class316 method8511() {
		if (this.aClass316_1 != null) {
			return this.aClass316_1;
		}
		if (this.aClass3_Sub1_Sub12_1 == null) {
			if (this.aClass51_1.method9820()) {
				return null;
			}
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_1.aBoolean516) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass3_Sub1_Sub12_1.method21157();
		if (this.aClass3_Sub1_Sub12_1 instanceof Class3_Sub1_Sub12_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
				if (this.anInt956 * -352006871 != this.aClass316_1.anInt4544 * 1108569511) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
			} catch (@Pc(126) RuntimeException local126) {
				this.aClass51_1.method9823(255, this.anInt955 * -156594127);
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass403_5 != null) {
				this.aClass347_1.method26520(this.anInt955 * -156594127, local40, this.aClass403_5);
			}
		}
		this.aClass3_Sub1_Sub12_1 = null;
		if (this.aClass403_4 != null) {
			this.aByteArray17 = new byte[this.aClass316_1.anInt4543 * 1691264643];
			this.anInt951 = 0;
		}
		return this.aClass316_1;
	}

	@OriginalMember(owner = "client!aee", name = "p", descriptor = "(I)Lclient!md;", line = 96)
	@Override
	Class316 method8506() {
		if (this.aClass316_1 != null) {
			return this.aClass316_1;
		}
		if (this.aClass3_Sub1_Sub12_1 == null) {
			if (this.aClass51_1.method9820()) {
				return null;
			}
			this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_1.aBoolean516) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass3_Sub1_Sub12_1.method21157();
		if (this.aClass3_Sub1_Sub12_1 instanceof Class3_Sub1_Sub12_Sub2) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
				if (this.anInt956 * -352006871 != this.aClass316_1.anInt4544 * 1108569511) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass316_1 = new Class316(local40, this.anInt949 * -1281980707, this.aByteArray16);
			} catch (@Pc(126) RuntimeException local126) {
				this.aClass51_1.method9823(255, this.anInt955 * -156594127);
				this.aClass316_1 = null;
				if (this.aClass51_1.method9820()) {
					this.aClass3_Sub1_Sub12_1 = null;
				} else {
					this.aClass3_Sub1_Sub12_1 = this.aClass51_1.method9818(255, this.anInt955 * -156594127, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass403_5 != null) {
				this.aClass347_1.method26520(this.anInt955 * -156594127, local40, this.aClass403_5);
			}
		}
		this.aClass3_Sub1_Sub12_1 = null;
		if (this.aClass403_4 != null) {
			this.aByteArray17 = new byte[this.aClass316_1.anInt4543 * 1691264643];
			this.anInt951 = 0;
		}
		return this.aClass316_1;
	}

	@OriginalMember(owner = "client!aee", name = "a", descriptor = "(II)[B", line = 145)
	@Override
	byte[] method8507(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub12 local5 = this.method8528(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method21157();
			local5.method33656();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aee", name = "u", descriptor = "(I)[B", line = 145)
	@Override
	byte[] method8512(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub12 local5 = this.method8528(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method21157();
			local5.method33656();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "(I)[B", line = 145)
	@Override
	byte[] method8519(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub12 local5 = this.method8528(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method21157();
			local5.method33656();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "(I)[B", line = 145)
	@Override
	byte[] method8518(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub12 local5 = this.method8528(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method21157();
			local5.method33656();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "(III)Lclient!amr;", line = 153)
	Class3_Sub1_Sub12 method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean515 && local6.aBoolean516) {
			local6.method33656();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass403_4 != null && this.aByteArray17[arg0] != -1) {
					local6 = this.aClass347_1.method26537(arg0, this.aClass403_4);
				} else if (this.aClass348_1 == null) {
					if (this.aClass51_1.method9820()) {
						return null;
					}
					local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass347_1.method26535(arg0, this.aClass403_4);
			} else if (arg1 == 2) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray17[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass348_1 != null) {
					return null;
				}
				if (this.aClass51_1.method9819()) {
					return null;
				}
				local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass581_5.method33241(local6, (long) arg0);
		}
		if (local6.aBoolean516) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method21157();
		@Pc(210) int local210;
		@Pc(239) byte[] local239;
		@Pc(248) byte[] local248;
		@Pc(250) int local250;
		@Pc(371) Class3_Sub1_Sub12_Sub1 local371;
		@Pc(398) Class3_Sub1_Sub12_Sub3 local398;
		if (!(local6 instanceof Class3_Sub1_Sub12_Sub2)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass348_1 != null) {
						local6.method33656();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (local210 != this.aClass316_1.anIntArray414[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
					local239 = this.aClass316_1.aByteArrayArray14[arg0];
					local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
					for (local250 = 0; local250 < 64; local250++) {
						if (local239[local250] != local248[local250]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass348_1 != null) {
					this.aClass51_1.anInt1113 = 0;
					this.aClass51_1.anInt1115 = 0;
				}
			} catch (@Pc(508) RuntimeException local508) {
				this.aClass51_1.method9823(this.anInt955 * -156594127, arg0);
				local6.method33656();
				if (local6.aBoolean515) {
					if (this.aClass348_1 == null) {
						if (!this.aClass51_1.method9820()) {
							local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
							this.aClass581_5.method33241(local398, (long) arg0);
						}
					} else if (!this.aClass348_1.method26544()) {
						local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
						if (local371 != null) {
							this.aClass581_5.method33241(local371, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass316_1.anIntArray418[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass316_1.anIntArray418[arg0];
			if (this.aClass403_4 != null) {
				this.aClass347_1.method26520(arg0, local182, this.aClass403_4);
				if (this.aByteArray17[arg0] != 1) {
					this.anInt951 += 1969862961;
					this.aByteArray17[arg0] = 1;
				}
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass316_1.anIntArray414[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
				local239 = this.aClass316_1.aByteArrayArray14[arg0];
				local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
				for (local250 = 0; local250 < 64; local250++) {
					if (local239[local250] != local248[local250]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(286) int local286 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.aClass316_1.anIntArray418[arg0] & 0xFFFF) != local286) {
				throw new RuntimeException();
			}
			if (this.aByteArray17[arg0] != 1) {
				if (this.aByteArray17[arg0] == 0) {
				}
				this.anInt951 += 1969862961;
				this.aByteArray17[arg0] = 1;
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		} catch (@Pc(330) Exception local330) {
			this.aByteArray17[arg0] = -1;
			local6.method33656();
			if (local6.aBoolean515) {
				if (this.aClass348_1 == null) {
					if (!this.aClass51_1.method9820()) {
						local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
						this.aClass581_5.method33241(local398, (long) arg0);
					}
				} else if (!this.aClass348_1.method26544()) {
					local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local371 != null) {
						this.aClass581_5.method33241(local371, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aee", name = "av", descriptor = "(II)Lclient!amr;", line = 153)
	Class3_Sub1_Sub12 method8534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean515 && local6.aBoolean516) {
			local6.method33656();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass403_4 != null && this.aByteArray17[arg0] != -1) {
					local6 = this.aClass347_1.method26537(arg0, this.aClass403_4);
				} else if (this.aClass348_1 == null) {
					if (this.aClass51_1.method9820()) {
						return null;
					}
					local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass347_1.method26535(arg0, this.aClass403_4);
			} else if (arg1 == 2) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray17[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass348_1 != null) {
					return null;
				}
				if (this.aClass51_1.method9819()) {
					return null;
				}
				local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass581_5.method33241(local6, (long) arg0);
		}
		if (local6.aBoolean516) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method21157();
		@Pc(210) int local210;
		@Pc(239) byte[] local239;
		@Pc(248) byte[] local248;
		@Pc(250) int local250;
		@Pc(371) Class3_Sub1_Sub12_Sub1 local371;
		@Pc(398) Class3_Sub1_Sub12_Sub3 local398;
		if (!(local6 instanceof Class3_Sub1_Sub12_Sub2)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass348_1 != null) {
						local6.method33656();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (local210 != this.aClass316_1.anIntArray414[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
					local239 = this.aClass316_1.aByteArrayArray14[arg0];
					local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
					for (local250 = 0; local250 < 64; local250++) {
						if (local239[local250] != local248[local250]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass348_1 != null) {
					this.aClass51_1.anInt1113 = 0;
					this.aClass51_1.anInt1115 = 0;
				}
			} catch (@Pc(508) RuntimeException local508) {
				this.aClass51_1.method9823(this.anInt955 * -156594127, arg0);
				local6.method33656();
				if (local6.aBoolean515) {
					if (this.aClass348_1 == null) {
						if (!this.aClass51_1.method9820()) {
							local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
							this.aClass581_5.method33241(local398, (long) arg0);
						}
					} else if (!this.aClass348_1.method26544()) {
						local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
						if (local371 != null) {
							this.aClass581_5.method33241(local371, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass316_1.anIntArray418[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass316_1.anIntArray418[arg0];
			if (this.aClass403_4 != null) {
				this.aClass347_1.method26520(arg0, local182, this.aClass403_4);
				if (this.aByteArray17[arg0] != 1) {
					this.anInt951 += 1969862961;
					this.aByteArray17[arg0] = 1;
				}
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass316_1.anIntArray414[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
				local239 = this.aClass316_1.aByteArrayArray14[arg0];
				local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
				for (local250 = 0; local250 < 64; local250++) {
					if (local239[local250] != local248[local250]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(286) int local286 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.aClass316_1.anIntArray418[arg0] & 0xFFFF) != local286) {
				throw new RuntimeException();
			}
			if (this.aByteArray17[arg0] != 1) {
				if (this.aByteArray17[arg0] == 0) {
				}
				this.anInt951 += 1969862961;
				this.aByteArray17[arg0] = 1;
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		} catch (@Pc(330) Exception local330) {
			this.aByteArray17[arg0] = -1;
			local6.method33656();
			if (local6.aBoolean515) {
				if (this.aClass348_1 == null) {
					if (!this.aClass51_1.method9820()) {
						local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
						this.aClass581_5.method33241(local398, (long) arg0);
					}
				} else if (!this.aClass348_1.method26544()) {
					local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local371 != null) {
						this.aClass581_5.method33241(local371, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aee", name = "ai", descriptor = "(II)Lclient!amr;", line = 153)
	Class3_Sub1_Sub12 method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean515 && local6.aBoolean516) {
			local6.method33656();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass403_4 != null && this.aByteArray17[arg0] != -1) {
					local6 = this.aClass347_1.method26537(arg0, this.aClass403_4);
				} else if (this.aClass348_1 == null) {
					if (this.aClass51_1.method9820()) {
						return null;
					}
					local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass347_1.method26535(arg0, this.aClass403_4);
			} else if (arg1 == 2) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray17[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass348_1 != null) {
					return null;
				}
				if (this.aClass51_1.method9819()) {
					return null;
				}
				local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass581_5.method33241(local6, (long) arg0);
		}
		if (local6.aBoolean516) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method21157();
		@Pc(210) int local210;
		@Pc(239) byte[] local239;
		@Pc(248) byte[] local248;
		@Pc(250) int local250;
		@Pc(371) Class3_Sub1_Sub12_Sub1 local371;
		@Pc(398) Class3_Sub1_Sub12_Sub3 local398;
		if (!(local6 instanceof Class3_Sub1_Sub12_Sub2)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass348_1 != null) {
						local6.method33656();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (local210 != this.aClass316_1.anIntArray414[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
					local239 = this.aClass316_1.aByteArrayArray14[arg0];
					local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
					for (local250 = 0; local250 < 64; local250++) {
						if (local239[local250] != local248[local250]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass348_1 != null) {
					this.aClass51_1.anInt1113 = 0;
					this.aClass51_1.anInt1115 = 0;
				}
			} catch (@Pc(508) RuntimeException local508) {
				this.aClass51_1.method9823(this.anInt955 * -156594127, arg0);
				local6.method33656();
				if (local6.aBoolean515) {
					if (this.aClass348_1 == null) {
						if (!this.aClass51_1.method9820()) {
							local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
							this.aClass581_5.method33241(local398, (long) arg0);
						}
					} else if (!this.aClass348_1.method26544()) {
						local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
						if (local371 != null) {
							this.aClass581_5.method33241(local371, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass316_1.anIntArray418[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass316_1.anIntArray418[arg0];
			if (this.aClass403_4 != null) {
				this.aClass347_1.method26520(arg0, local182, this.aClass403_4);
				if (this.aByteArray17[arg0] != 1) {
					this.anInt951 += 1969862961;
					this.aByteArray17[arg0] = 1;
				}
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass316_1.anIntArray414[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
				local239 = this.aClass316_1.aByteArrayArray14[arg0];
				local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
				for (local250 = 0; local250 < 64; local250++) {
					if (local239[local250] != local248[local250]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(286) int local286 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.aClass316_1.anIntArray418[arg0] & 0xFFFF) != local286) {
				throw new RuntimeException();
			}
			if (this.aByteArray17[arg0] != 1) {
				if (this.aByteArray17[arg0] == 0) {
				}
				this.anInt951 += 1969862961;
				this.aByteArray17[arg0] = 1;
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		} catch (@Pc(330) Exception local330) {
			this.aByteArray17[arg0] = -1;
			local6.method33656();
			if (local6.aBoolean515) {
				if (this.aClass348_1 == null) {
					if (!this.aClass51_1.method9820()) {
						local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
						this.aClass581_5.method33241(local398, (long) arg0);
					}
				} else if (!this.aClass348_1.method26544()) {
					local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local371 != null) {
						this.aClass581_5.method33241(local371, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aee", name = "aq", descriptor = "(II)Lclient!amr;", line = 153)
	Class3_Sub1_Sub12 method8545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean515 && local6.aBoolean516) {
			local6.method33656();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass403_4 != null && this.aByteArray17[arg0] != -1) {
					local6 = this.aClass347_1.method26537(arg0, this.aClass403_4);
				} else if (this.aClass348_1 == null) {
					if (this.aClass51_1.method9820()) {
						return null;
					}
					local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass347_1.method26535(arg0, this.aClass403_4);
			} else if (arg1 == 2) {
				if (this.aClass403_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray17[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass348_1 != null) {
					return null;
				}
				if (this.aClass51_1.method9819()) {
					return null;
				}
				local6 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass581_5.method33241(local6, (long) arg0);
		}
		if (local6.aBoolean516) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method21157();
		@Pc(210) int local210;
		@Pc(239) byte[] local239;
		@Pc(248) byte[] local248;
		@Pc(250) int local250;
		@Pc(371) Class3_Sub1_Sub12_Sub1 local371;
		@Pc(398) Class3_Sub1_Sub12_Sub3 local398;
		if (!(local6 instanceof Class3_Sub1_Sub12_Sub2)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass348_1 != null) {
						local6.method33656();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (local210 != this.aClass316_1.anIntArray414[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
					local239 = this.aClass316_1.aByteArrayArray14[arg0];
					local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
					for (local250 = 0; local250 < 64; local250++) {
						if (local239[local250] != local248[local250]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass348_1 != null) {
					this.aClass51_1.anInt1113 = 0;
					this.aClass51_1.anInt1115 = 0;
				}
			} catch (@Pc(508) RuntimeException local508) {
				this.aClass51_1.method9823(this.anInt955 * -156594127, arg0);
				local6.method33656();
				if (local6.aBoolean515) {
					if (this.aClass348_1 == null) {
						if (!this.aClass51_1.method9820()) {
							local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
							this.aClass581_5.method33241(local398, (long) arg0);
						}
					} else if (!this.aClass348_1.method26544()) {
						local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
						if (local371 != null) {
							this.aClass581_5.method33241(local371, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass316_1.anIntArray418[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass316_1.anIntArray418[arg0];
			if (this.aClass403_4 != null) {
				this.aClass347_1.method26520(arg0, local182, this.aClass403_4);
				if (this.aByteArray17[arg0] != 1) {
					this.anInt951 += 1969862961;
					this.aByteArray17[arg0] = 1;
				}
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass316_1.anIntArray414[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass316_1.aByteArrayArray14 != null && this.aClass316_1.aByteArrayArray14[arg0] != null) {
				local239 = this.aClass316_1.aByteArrayArray14[arg0];
				local248 = Class71_Sub3.method20105(local182, 0, local182.length - 2);
				for (local250 = 0; local250 < 64; local250++) {
					if (local239[local250] != local248[local250]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(286) int local286 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.aClass316_1.anIntArray418[arg0] & 0xFFFF) != local286) {
				throw new RuntimeException();
			}
			if (this.aByteArray17[arg0] != 1) {
				if (this.aByteArray17[arg0] == 0) {
				}
				this.anInt951 += 1969862961;
				this.aByteArray17[arg0] = 1;
			}
			if (!local6.aBoolean515) {
				local6.method33656();
			}
			return local6;
		} catch (@Pc(330) Exception local330) {
			this.aByteArray17[arg0] = -1;
			local6.method33656();
			if (local6.aBoolean515) {
				if (this.aClass348_1 == null) {
					if (!this.aClass51_1.method9820()) {
						local398 = this.aClass51_1.method9818(this.anInt955 * -156594127, arg0, (byte) 2, true);
						this.aClass581_5.method33241(local398, (long) arg0);
					}
				} else if (!this.aClass348_1.method26544()) {
					local371 = this.aClass348_1.method26546(this.anInt955 * -156594127, arg0, (byte) 2, true, this.aClass316_1.anIntArray414[arg0], this.aClass316_1.anIntArray418[arg0]);
					if (local371 != null) {
						this.aClass581_5.method33241(local371, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "(I)V", line = 305)
	void method8529() {
		if (this.aClass553_13 == null || this.method8506() == null) {
			return;
		}
		for (@Pc(13) Class3 local13 = this.aClass553_14.method32768(); local13 != null; local13 = this.aClass553_14.method32709()) {
			@Pc(22) int local22 = (int) (local13.aLong296 * -1930649055099428229L);
			if (local22 < 0 || local22 >= this.aClass316_1.anInt4543 * 1691264643 || this.aClass316_1.anIntArray416[local22] == 0) {
				local13.method33656();
			} else {
				if (this.aByteArray17[local22] == 0) {
					this.method8528(local22, 1);
				}
				if (this.aByteArray17[local22] == -1) {
					this.method8528(local22, 2);
				}
				if (this.aByteArray17[local22] == 1) {
					local13.method33656();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "(I)V", line = 320)
	void method8543() {
		if (this.aClass553_13 != null) {
			if (this.method8506() == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class3 local17;
			@Pc(26) int local26;
			if (this.aBoolean187) {
				local12 = true;
				for (local17 = this.aClass553_13.method32768(); local17 != null; local17 = this.aClass553_13.method32709()) {
					local26 = (int) (local17.aLong296 * -1930649055099428229L);
					if (this.aByteArray17[local26] == 0) {
						this.method8528(local26, 1);
					}
					if (this.aByteArray17[local26] == 0) {
						local12 = false;
					} else {
						local17.method33656();
					}
				}
				while (this.anInt952 * 1001361693 < this.aClass316_1.anIntArray416.length) {
					if (this.aClass316_1.anIntArray416[this.anInt952 * 1001361693] == 0) {
						this.anInt952 += -23217867;
					} else {
						if (this.aClass347_1.anInt4622 * 2144633215 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] == 0) {
							this.method8528(this.anInt952 * 1001361693, 1);
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] == 0) {
							local17 = new Class3();
							local17.aLong296 = (long) this.anInt952 * -9196763430629870777L;
							this.aClass553_13.method32702(local17);
							local12 = false;
						}
						this.anInt952 += -23217867;
					}
				}
				if (local12) {
					this.aBoolean187 = false;
					this.anInt952 = 0;
				}
			} else if (this.aBoolean186) {
				local12 = true;
				for (local17 = this.aClass553_13.method32768(); local17 != null; local17 = this.aClass553_13.method32709()) {
					local26 = (int) (local17.aLong296 * -1930649055099428229L);
					if (this.aByteArray17[local26] != 1) {
						this.method8528(local26, 2);
					}
					if (this.aByteArray17[local26] == 1) {
						local17.method33656();
					} else {
						local12 = false;
					}
				}
				while (this.anInt952 * 1001361693 < this.aClass316_1.anIntArray416.length) {
					if (this.aClass316_1.anIntArray416[this.anInt952 * 1001361693] == 0) {
						this.anInt952 += -23217867;
					} else {
						if (this.aClass51_1.method9819()) {
							local12 = false;
							break;
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] != 1) {
							this.method8528(this.anInt952 * 1001361693, 2);
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] != 1) {
							local17 = new Class3();
							local17.aLong296 = (long) this.anInt952 * -9196763430629870777L;
							this.aClass553_13.method32702(local17);
							local12 = false;
						}
						this.anInt952 += -23217867;
					}
				}
				if (local12) {
					this.aBoolean186 = false;
					this.anInt952 = 0;
				}
			} else {
				this.aClass553_13 = null;
			}
		}
		if (!this.aBoolean189 || Class176.method23413() < this.aLong25 * -7752909581443141785L) {
			return;
		}
		for (@Pc(313) Class3_Sub1_Sub12 local313 = (Class3_Sub1_Sub12) this.aClass581_5.method33221(); local313 != null; local313 = (Class3_Sub1_Sub12) this.aClass581_5.method33231()) {
			if (!local313.aBoolean516) {
				if (local313.aBoolean514) {
					if (!local313.aBoolean515) {
						throw new RuntimeException();
					}
					local313.method33656();
				} else {
					local313.aBoolean514 = true;
				}
			}
		}
		this.aLong25 = (Class176.method23413() + 1000L) * 601595626638982231L;
	}

	@OriginalMember(owner = "client!aee", name = "ax", descriptor = "()V", line = 320)
	void method8547() {
		if (this.aClass553_13 != null) {
			if (this.method8506() == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class3 local17;
			@Pc(26) int local26;
			if (this.aBoolean187) {
				local12 = true;
				for (local17 = this.aClass553_13.method32768(); local17 != null; local17 = this.aClass553_13.method32709()) {
					local26 = (int) (local17.aLong296 * -1930649055099428229L);
					if (this.aByteArray17[local26] == 0) {
						this.method8528(local26, 1);
					}
					if (this.aByteArray17[local26] == 0) {
						local12 = false;
					} else {
						local17.method33656();
					}
				}
				while (this.anInt952 * 1001361693 < this.aClass316_1.anIntArray416.length) {
					if (this.aClass316_1.anIntArray416[this.anInt952 * 1001361693] == 0) {
						this.anInt952 += -23217867;
					} else {
						if (this.aClass347_1.anInt4622 * 2144633215 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] == 0) {
							this.method8528(this.anInt952 * 1001361693, 1);
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] == 0) {
							local17 = new Class3();
							local17.aLong296 = (long) this.anInt952 * -9196763430629870777L;
							this.aClass553_13.method32702(local17);
							local12 = false;
						}
						this.anInt952 += -23217867;
					}
				}
				if (local12) {
					this.aBoolean187 = false;
					this.anInt952 = 0;
				}
			} else if (this.aBoolean186) {
				local12 = true;
				for (local17 = this.aClass553_13.method32768(); local17 != null; local17 = this.aClass553_13.method32709()) {
					local26 = (int) (local17.aLong296 * -1930649055099428229L);
					if (this.aByteArray17[local26] != 1) {
						this.method8528(local26, 2);
					}
					if (this.aByteArray17[local26] == 1) {
						local17.method33656();
					} else {
						local12 = false;
					}
				}
				while (this.anInt952 * 1001361693 < this.aClass316_1.anIntArray416.length) {
					if (this.aClass316_1.anIntArray416[this.anInt952 * 1001361693] == 0) {
						this.anInt952 += -23217867;
					} else {
						if (this.aClass51_1.method9819()) {
							local12 = false;
							break;
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] != 1) {
							this.method8528(this.anInt952 * 1001361693, 2);
						}
						if (this.aByteArray17[this.anInt952 * 1001361693] != 1) {
							local17 = new Class3();
							local17.aLong296 = (long) this.anInt952 * -9196763430629870777L;
							this.aClass553_13.method32702(local17);
							local12 = false;
						}
						this.anInt952 += -23217867;
					}
				}
				if (local12) {
					this.aBoolean186 = false;
					this.anInt952 = 0;
				}
			} else {
				this.aClass553_13 = null;
			}
		}
		if (!this.aBoolean189 || Class176.method23413() < this.aLong25 * -7752909581443141785L) {
			return;
		}
		for (@Pc(313) Class3_Sub1_Sub12 local313 = (Class3_Sub1_Sub12) this.aClass581_5.method33221(); local313 != null; local313 = (Class3_Sub1_Sub12) this.aClass581_5.method33231()) {
			if (!local313.aBoolean516) {
				if (local313.aBoolean514) {
					if (!local313.aBoolean515) {
						throw new RuntimeException();
					}
					local313.method33656();
				} else {
					local313.aBoolean514 = true;
				}
			}
		}
		this.aLong25 = (Class176.method23413() + 1000L) * 601595626638982231L;
	}

	@OriginalMember(owner = "client!aee", name = "az", descriptor = "()I", line = 402)
	public int method8526() {
		return this.aClass316_1 == null ? 0 : this.aClass316_1.anInt4545 * 486353521;
	}

	@OriginalMember(owner = "client!aee", name = "o", descriptor = "(B)I", line = 402)
	public int method8531() {
		return this.aClass316_1 == null ? 0 : this.aClass316_1.anInt4545 * 486353521;
	}

	@OriginalMember(owner = "client!aee", name = "al", descriptor = "()I", line = 402)
	public int method8548() {
		return this.aClass316_1 == null ? 0 : this.aClass316_1.anInt4545 * 486353521;
	}

	@OriginalMember(owner = "client!aee", name = "i", descriptor = "(I)I", line = 407)
	public int method8532() {
		return this.anInt951 * -625410095;
	}

	@OriginalMember(owner = "client!aee", name = "ao", descriptor = "()I", line = 407)
	public int method8549() {
		return this.anInt951 * -625410095;
	}

	@OriginalMember(owner = "client!aee", name = "ap", descriptor = "()I", line = 407)
	public int method8550() {
		return this.anInt951 * -625410095;
	}

	@OriginalMember(owner = "client!aee", name = "f", descriptor = "(I)I", line = 411)
	public int method8533() {
		if (this.aClass316_1 == null) {
			return 0;
		} else if (this.aBoolean187) {
			@Pc(18) Class3 local18 = this.aClass553_13.method32768();
			return local18 == null ? 0 : (int) (local18.aLong296 * -1930649055099428229L);
		} else {
			return this.aClass316_1.anInt4545 * 486353521;
		}
	}

	@OriginalMember(owner = "client!aee", name = "ab", descriptor = "()I", line = 411)
	public int method8551() {
		if (this.aClass316_1 == null) {
			return 0;
		} else if (this.aBoolean187) {
			@Pc(18) Class3 local18 = this.aClass553_13.method32768();
			return local18 == null ? 0 : (int) (local18.aLong296 * -1930649055099428229L);
		} else {
			return this.aClass316_1.anInt4545 * 486353521;
		}
	}

	@OriginalMember(owner = "client!aee", name = "k", descriptor = "(I)V", line = 419)
	public void method8538() {
		if (this.aClass348_1 != null || this.aClass403_4 == null) {
			return;
		}
		this.aBoolean186 = true;
		this.aBoolean188 = true;
		if (this.aClass553_13 == null) {
			this.aClass553_13 = new Class553();
		}
	}

	@OriginalMember(owner = "client!aee", name = "au", descriptor = "()V", line = 419)
	public void method8552() {
		if (this.aClass348_1 != null || this.aClass403_4 == null) {
			return;
		}
		this.aBoolean186 = true;
		this.aBoolean188 = true;
		if (this.aClass553_13 == null) {
			this.aClass553_13 = new Class553();
		}
	}

	@OriginalMember(owner = "client!aee", name = "ay", descriptor = "()V", line = 419)
	public void method8553() {
		if (this.aClass348_1 != null || this.aClass403_4 == null) {
			return;
		}
		this.aBoolean186 = true;
		this.aBoolean188 = true;
		if (this.aClass553_13 == null) {
			this.aClass553_13 = new Class553();
		}
	}

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "(II)V", line = 427)
	@Override
	void method8508(@OriginalArg(0) int arg0) {
		if (this.aClass403_4 == null) {
			return;
		}
		@Pc(8) Class3 local8;
		for (local8 = this.aClass553_14.method32768(); local8 != null; local8 = this.aClass553_14.method32709()) {
			if (local8.aLong296 * -1930649055099428229L == (long) arg0) {
				return;
			}
		}
		local8 = new Class3();
		local8.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_14.method32702(local8);
	}

	@OriginalMember(owner = "client!aee", name = "b", descriptor = "(I)V", line = 427)
	@Override
	void method8514(@OriginalArg(0) int arg0) {
		if (this.aClass403_4 == null) {
			return;
		}
		@Pc(8) Class3 local8;
		for (local8 = this.aClass553_14.method32768(); local8 != null; local8 = this.aClass553_14.method32709()) {
			if (local8.aLong296 * -1930649055099428229L == (long) arg0) {
				return;
			}
		}
		local8 = new Class3();
		local8.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_14.method32702(local8);
	}

	@OriginalMember(owner = "client!aee", name = "z", descriptor = "(I)V", line = 427)
	@Override
	void method8516(@OriginalArg(0) int arg0) {
		if (this.aClass403_4 == null) {
			return;
		}
		@Pc(8) Class3 local8;
		for (local8 = this.aClass553_14.method32768(); local8 != null; local8 = this.aClass553_14.method32709()) {
			if (local8.aLong296 * -1930649055099428229L == (long) arg0) {
				return;
			}
		}
		local8 = new Class3();
		local8.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_14.method32702(local8);
	}

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "(I)V", line = 427)
	@Override
	void method8513(@OriginalArg(0) int arg0) {
		if (this.aClass403_4 == null) {
			return;
		}
		@Pc(8) Class3 local8;
		for (local8 = this.aClass553_14.method32768(); local8 != null; local8 = this.aClass553_14.method32709()) {
			if (local8.aLong296 * -1930649055099428229L == (long) arg0) {
				return;
			}
		}
		local8 = new Class3();
		local8.aLong296 = (long) arg0 * 7335455165921340595L;
		this.aClass553_14.method32702(local8);
	}

	@OriginalMember(owner = "client!aee", name = "e", descriptor = "(I)I", line = 437)
	@Override
	int method8517(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		return local6 == null ? 0 : local6.method21155();
	}

	@OriginalMember(owner = "client!aee", name = "l", descriptor = "(II)I", line = 437)
	@Override
	int method8509(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		return local6 == null ? 0 : local6.method21155();
	}

	@OriginalMember(owner = "client!aee", name = "j", descriptor = "(I)I", line = 437)
	@Override
	int method8505(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		return local6 == null ? 0 : local6.method21155();
	}

	@OriginalMember(owner = "client!aee", name = "n", descriptor = "(I)I", line = 437)
	@Override
	int method8515(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		return local6 == null ? 0 : local6.method21155();
	}

	@OriginalMember(owner = "client!aee", name = "r", descriptor = "(I)I", line = 437)
	@Override
	int method8520(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub12 local6 = (Class3_Sub1_Sub12) this.aClass581_5.method33217((long) arg0);
		return local6 == null ? 0 : local6.method21155();
	}

	@OriginalMember(owner = "client!aee", name = "at", descriptor = "(I)Z", line = 443)
	public boolean method8530() {
		return this.aBoolean188;
	}

	@OriginalMember(owner = "client!aee", name = "ag", descriptor = "()Z", line = 443)
	public boolean method8554() {
		return this.aBoolean188;
	}

	@OriginalMember(owner = "client!aee", name = "am", descriptor = "()Z", line = 443)
	public boolean method8555() {
		return this.aBoolean188;
	}

	@OriginalMember(owner = "client!aee", name = "af", descriptor = "(ZI)V", line = 447)
	void method8536(@OriginalArg(0) boolean arg0) {
		this.aClass348_1.method26549(arg0);
	}

	@OriginalMember(owner = "client!aee", name = "ak", descriptor = "(B)Z", line = 451)
	boolean method8527() {
		return this.aClass348_1 != null;
	}

	@OriginalMember(owner = "client!aee", name = "ar", descriptor = "()Z", line = 451)
	boolean method8556() {
		return this.aClass348_1 != null;
	}

	@OriginalMember(owner = "client!aee", name = "ae", descriptor = "()Z", line = 451)
	boolean method8557() {
		return this.aClass348_1 != null;
	}
}
