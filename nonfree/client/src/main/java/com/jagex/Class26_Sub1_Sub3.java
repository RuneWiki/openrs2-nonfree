package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anl")
public abstract class Class26_Sub1_Sub3 extends Class26_Sub1 {

	@OriginalMember(owner = "client!anl", name = "w", descriptor = "I")
	public static final int anInt1196 = 16;

	@OriginalMember(owner = "client!anl", name = "m", descriptor = "I")
	public static final int anInt1197 = 2;

	@OriginalMember(owner = "client!anl", name = "v", descriptor = "I")
	public static final int anInt1198 = 4;

	@OriginalMember(owner = "client!anl", name = "t", descriptor = "I")
	public static final int anInt1199 = 8;

	@OriginalMember(owner = "client!anl", name = "q", descriptor = "I")
	public static final int anInt1200 = 1;

	@OriginalMember(owner = "client!anl", name = "o", descriptor = "I")
	public static final int anInt1201 = 32;

	@OriginalMember(owner = "client!anl", name = "i", descriptor = "I")
	public static final int anInt1202 = 64;

	@OriginalMember(owner = "client!anl", name = "f", descriptor = "I")
	public static final int anInt1203 = 128;

	@OriginalMember(owner = "client!anl", name = "k", descriptor = "[I")
	static final int[] anIntArray175 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!anl", name = "af", descriptor = "I")
	int anInt1204 = 0;

	@OriginalMember(owner = "client!anl", name = "ak", descriptor = "[Lclient!afz;")
	Class3_Sub15[] aClass3_Sub15Array11 = new Class3_Sub15[4];

	@OriginalMember(owner = "client!anl", name = "at", descriptor = "S")
	public short aShort55;

	@OriginalMember(owner = "client!anl", name = "<init>", descriptor = "(Lclient!rp;IIIIII)V", line = 21)
	Class26_Sub1_Sub3(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.aByte101 = (byte) arg4;
		this.aByte102 = (byte) arg5;
		this.aShort55 = (short) arg6;
		this.method21436(new Class320((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			this.aClass3_Sub15Array11[local34] = null;
		}
	}

	@OriginalMember(owner = "client!anl", name = "gl", descriptor = "([Lclient!afz;)I", line = 30)
	@Override
	int method21519(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			@Pc(16) int local16 = (int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935;
			@Pc(26) int local26 = (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935;
			@Pc(28) int local28 = 0;
			if (local16 == this.aClass438_23.anInt4909 * 357988515) {
				local28++;
			} else if (this.aClass438_23.anInt4909 * 357988515 < local16) {
				local28 += 2;
			}
			if (local26 == this.aClass438_23.anInt4922 * 1650039469) {
				local28 += 3;
			} else if (this.aClass438_23.anInt4922 * 1650039469 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray175[local28];
			if ((this.aShort55 & local66) == 0) {
				if (this.aShort55 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort55 == 4 && local16 <= this.aClass438_23.anInt4901 * 406964363) {
					local16++;
				} else if (this.aShort55 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort55 == 2 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local26++;
				} else if (this.aShort55 == 16 && local16 > 0 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local16--;
					local26++;
				} else if (this.aShort55 == 32 && local16 <= this.aClass438_23.anInt4901 * 406964363 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local16++;
					local26++;
				} else if (this.aShort55 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort55 == 64 && local16 <= this.aClass438_23.anInt4901 * 406964363 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1204 = this.method21478(local16, local26, this.aClass3_Sub15Array11) * 1473559773;
			this.aBoolean524 = false;
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt1204 * 1190001525; local200++) {
			arg0[local200] = this.aClass3_Sub15Array11[local200];
		}
		return this.anInt1204 * 1190001525;
	}

	@OriginalMember(owner = "client!anl", name = "fr", descriptor = "([Lclient!afz;I)I", line = 30)
	@Override
	int method21514(@OriginalArg(0) Class3_Sub15[] arg0) {
		if (this.aBoolean524) {
			@Pc(6) Class320 local6 = this.method21431().aClass320_61;
			@Pc(16) int local16 = (int) local6.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935;
			@Pc(26) int local26 = (int) local6.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935;
			@Pc(28) int local28 = 0;
			if (local16 == this.aClass438_23.anInt4909 * 357988515) {
				local28++;
			} else if (this.aClass438_23.anInt4909 * 357988515 < local16) {
				local28 += 2;
			}
			if (local26 == this.aClass438_23.anInt4922 * 1650039469) {
				local28 += 3;
			} else if (this.aClass438_23.anInt4922 * 1650039469 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray175[local28];
			if ((this.aShort55 & local66) == 0) {
				if (this.aShort55 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort55 == 4 && local16 <= this.aClass438_23.anInt4901 * 406964363) {
					local16++;
				} else if (this.aShort55 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort55 == 2 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local26++;
				} else if (this.aShort55 == 16 && local16 > 0 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local16--;
					local26++;
				} else if (this.aShort55 == 32 && local16 <= this.aClass438_23.anInt4901 * 406964363 && local26 <= this.aClass438_23.anInt4902 * 2009656297) {
					local16++;
					local26++;
				} else if (this.aShort55 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort55 == 64 && local16 <= this.aClass438_23.anInt4901 * 406964363 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1204 = this.method21478(local16, local26, this.aClass3_Sub15Array11) * 1473559773;
			this.aBoolean524 = false;
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt1204 * 1190001525; local200++) {
			arg0[local200] = this.aClass3_Sub15Array11[local200];
		}
		return this.anInt1204 * 1190001525;
	}

	@OriginalMember(owner = "client!anl", name = "gf", descriptor = "(Lclient!de;I)Z", line = 78)
	@Override
	boolean method21521(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28286(this, this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anl", name = "gs", descriptor = "(Lclient!de;)Z", line = 78)
	@Override
	boolean method21490(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28286(this, this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anl", name = "gw", descriptor = "(Lclient!de;)Z", line = 78)
	@Override
	boolean method21515(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28286(this, this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anl", name = "gc", descriptor = "(Lclient!de;)Z", line = 78)
	@Override
	boolean method21498(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aClass444_1.method28286(this, this.aByte102, (int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935, (int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935);
	}

	@OriginalMember(owner = "client!anl", name = "gi", descriptor = "()Z", line = 83)
	@Override
	boolean method21517() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anl", name = "gy", descriptor = "(B)Z", line = 83)
	@Override
	boolean method21475() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anl", name = "go", descriptor = "()Z", line = 83)
	@Override
	boolean method21516() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}

	@OriginalMember(owner = "client!anl", name = "gb", descriptor = "()Z", line = 83)
	@Override
	boolean method21518() {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		return this.aClass438_23.aBooleanArrayArray14[((int) local3.aFloat259 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565][((int) local3.aFloat261 >> this.aClass438_23.anInt4895 * 1563265935) - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565];
	}
}
