package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asw")
public abstract class Class132_Sub1_Sub2 extends Class132_Sub1 {

	@OriginalMember(owner = "client!asw", name = "b", descriptor = "I")
	public static final int anInt1432 = 2;

	@OriginalMember(owner = "client!asw", name = "h", descriptor = "I")
	public static final int anInt1433 = 4;

	@OriginalMember(owner = "client!asw", name = "a", descriptor = "I")
	public static final int anInt1434 = 8;

	@OriginalMember(owner = "client!asw", name = "g", descriptor = "I")
	public static final int anInt1435 = 16;

	@OriginalMember(owner = "client!asw", name = "j", descriptor = "I")
	public static final int anInt1436 = 64;

	@OriginalMember(owner = "client!asw", name = "t", descriptor = "I")
	public static final int anInt1437 = 128;

	@OriginalMember(owner = "client!asw", name = "i", descriptor = "I")
	public static final int anInt1438 = 32;

	@OriginalMember(owner = "client!asw", name = "x", descriptor = "I")
	public static final int anInt1440 = 1;

	@OriginalMember(owner = "client!asw", name = "ae", descriptor = "[I")
	static final int[] anIntArray170 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!asw", name = "ah", descriptor = "I")
	int anInt1439 = 0;

	@OriginalMember(owner = "client!asw", name = "al", descriptor = "[Lclient!akf;")
	Class93_Sub16[] aClass93_Sub16Array9 = new Class93_Sub16[4];

	@OriginalMember(owner = "client!asw", name = "ag", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!asw", name = "<init>", descriptor = "(Lclient!tx;IIIIIILclient!oe;)V", line = 22)
	Class132_Sub1_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7) {
		super(arg0, arg7);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort84 = (short) arg6;
		if (arg7 != null) {
			this.method24222(arg7);
		}
		this.method24225((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
			this.aClass93_Sub16Array9[local37] = null;
		}
	}

	@OriginalMember(owner = "client!asw", name = "gy", descriptor = "([Lclient!akf;S)I", line = 34)
	@Override
	int method24309(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24229().aClass472_61;
			@Pc(16) int local16 = (int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(26) int local26 = (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(28) int local28 = 0;
			if (this.aClass585_23.anInt5440 * 1602382659 == local16) {
				local28++;
			} else if (this.aClass585_23.anInt5440 * 1602382659 < local16) {
				local28 += 2;
			}
			if (local26 == this.aClass585_23.anInt5459 * 1547517939) {
				local28 += 3;
			} else if (this.aClass585_23.anInt5459 * 1547517939 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray170[local28];
			if ((this.aShort84 & local66) == 0) {
				if (this.aShort84 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort84 == 4 && local16 <= this.aClass585_23.anInt5443 * -200159665) {
					local16++;
				} else if (this.aShort84 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort84 == 2 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local26++;
				} else if (this.aShort84 == 16 && local16 > 0 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16--;
					local26++;
				} else if (this.aShort84 == 32 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16++;
					local26++;
				} else if (this.aShort84 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort84 == 64 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1439 = this.method24274(local16, local26, this.aClass93_Sub16Array9) * 858024109;
			this.aBoolean560 = false;
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt1439 * 951139109; local199++) {
			arg0[local199] = this.aClass93_Sub16Array9[local199];
		}
		return this.anInt1439 * 951139109;
	}

	@OriginalMember(owner = "client!asw", name = "gv", descriptor = "([Lclient!akf;)I", line = 34)
	@Override
	int method24264(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24229().aClass472_61;
			@Pc(16) int local16 = (int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(26) int local26 = (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(28) int local28 = 0;
			if (this.aClass585_23.anInt5440 * 1602382659 == local16) {
				local28++;
			} else if (this.aClass585_23.anInt5440 * 1602382659 < local16) {
				local28 += 2;
			}
			if (local26 == this.aClass585_23.anInt5459 * 1547517939) {
				local28 += 3;
			} else if (this.aClass585_23.anInt5459 * 1547517939 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray170[local28];
			if ((this.aShort84 & local66) == 0) {
				if (this.aShort84 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort84 == 4 && local16 <= this.aClass585_23.anInt5443 * -200159665) {
					local16++;
				} else if (this.aShort84 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort84 == 2 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local26++;
				} else if (this.aShort84 == 16 && local16 > 0 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16--;
					local26++;
				} else if (this.aShort84 == 32 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16++;
					local26++;
				} else if (this.aShort84 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort84 == 64 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1439 = this.method24274(local16, local26, this.aClass93_Sub16Array9) * 858024109;
			this.aBoolean560 = false;
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt1439 * 951139109; local199++) {
			arg0[local199] = this.aClass93_Sub16Array9[local199];
		}
		return this.anInt1439 * 951139109;
	}

	@OriginalMember(owner = "client!asw", name = "gm", descriptor = "([Lclient!akf;)I", line = 34)
	@Override
	int method24302(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24229().aClass472_61;
			@Pc(16) int local16 = (int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(26) int local26 = (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793;
			@Pc(28) int local28 = 0;
			if (this.aClass585_23.anInt5440 * 1602382659 == local16) {
				local28++;
			} else if (this.aClass585_23.anInt5440 * 1602382659 < local16) {
				local28 += 2;
			}
			if (local26 == this.aClass585_23.anInt5459 * 1547517939) {
				local28 += 3;
			} else if (this.aClass585_23.anInt5459 * 1547517939 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray170[local28];
			if ((this.aShort84 & local66) == 0) {
				if (this.aShort84 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort84 == 4 && local16 <= this.aClass585_23.anInt5443 * -200159665) {
					local16++;
				} else if (this.aShort84 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort84 == 2 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local26++;
				} else if (this.aShort84 == 16 && local16 > 0 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16--;
					local26++;
				} else if (this.aShort84 == 32 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 <= this.aClass585_23.anInt5444 * -1943751559) {
					local16++;
					local26++;
				} else if (this.aShort84 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort84 == 64 && local16 <= this.aClass585_23.anInt5443 * -200159665 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1439 = this.method24274(local16, local26, this.aClass93_Sub16Array9) * 858024109;
			this.aBoolean560 = false;
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt1439 * 951139109; local199++) {
			arg0[local199] = this.aClass93_Sub16Array9[local199];
		}
		return this.anInt1439 * 951139109;
	}

	@OriginalMember(owner = "client!asw", name = "ga", descriptor = "(Lclient!dh;S)Z", line = 82)
	@Override
	boolean method24270(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aClass598_2.method31796(this, this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!asw", name = "gj", descriptor = "(Lclient!dh;)Z", line = 82)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aClass598_2.method31796(this, this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!asw", name = "gn", descriptor = "(I)Z", line = 87)
	@Override
	boolean method24273() {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939)];
	}

	@OriginalMember(owner = "client!asw", name = "gw", descriptor = "()Z", line = 87)
	@Override
	boolean method24258() {
		@Pc(3) Class472 local3 = this.method24229().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939)];
	}
}
