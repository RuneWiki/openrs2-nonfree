package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ari")
public abstract class Class104_Sub1_Sub2 extends Class104_Sub1 {

	@OriginalMember(owner = "client!ari", name = "f", descriptor = "I")
	public static final int anInt1305 = 4;

	@OriginalMember(owner = "client!ari", name = "m", descriptor = "I")
	public static final int anInt1306 = 128;

	@OriginalMember(owner = "client!ari", name = "e", descriptor = "I")
	public static final int anInt1307 = 2;

	@OriginalMember(owner = "client!ari", name = "o", descriptor = "I")
	public static final int anInt1308 = 8;

	@OriginalMember(owner = "client!ari", name = "b", descriptor = "I")
	public static final int anInt1309 = 16;

	@OriginalMember(owner = "client!ari", name = "u", descriptor = "I")
	public static final int anInt1310 = 1;

	@OriginalMember(owner = "client!ari", name = "a", descriptor = "I")
	public static final int anInt1311 = 64;

	@OriginalMember(owner = "client!ari", name = "n", descriptor = "I")
	public static final int anInt1312 = 32;

	@OriginalMember(owner = "client!ari", name = "h", descriptor = "[I")
	static final int[] anIntArray137 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ari", name = "ai", descriptor = "I")
	int anInt1313 = 0;

	@OriginalMember(owner = "client!ari", name = "ag", descriptor = "[Lclient!ajv;")
	Class77_Sub22[] aClass77_Sub22Array8 = new Class77_Sub22[4];

	@OriginalMember(owner = "client!ari", name = "aj", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!ari", name = "<init>", descriptor = "(Lclient!tk;IIIIII)V", line = 21)
	Class104_Sub1_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort86 = (short) arg6;
		this.method24102(new Class447((float) arg1, (float) arg2, (float) arg3));
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			this.aClass77_Sub22Array8[local34] = null;
		}
	}

	@OriginalMember(owner = "client!ari", name = "gc", descriptor = "([Lclient!ajv;I)I", line = 30)
	@Override
	int method24145(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			@Pc(16) int local16 = (int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601;
			@Pc(26) int local26 = (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601;
			@Pc(28) int local28 = 0;
			if (this.aClass556_23.anInt5254 * -380604831 == local16) {
				local28++;
			} else if (this.aClass556_23.anInt5254 * -380604831 < local16) {
				local28 += 2;
			}
			if (this.aClass556_23.anInt5258 * -1709472547 == local26) {
				local28 += 3;
			} else if (this.aClass556_23.anInt5258 * -1709472547 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray137[local28];
			if ((this.aShort86 & local66) == 0) {
				if (this.aShort86 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort86 == 4 && local16 <= this.aClass556_23.anInt5248 * 1183912005) {
					local16++;
				} else if (this.aShort86 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort86 == 2 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local26++;
				} else if (this.aShort86 == 16 && local16 > 0 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local16--;
					local26++;
				} else if (this.aShort86 == 32 && local16 <= this.aClass556_23.anInt5248 * 1183912005 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local16++;
					local26++;
				} else if (this.aShort86 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort86 == 64 && local16 <= this.aClass556_23.anInt5248 * 1183912005 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1313 = this.method24126(local16, local26, this.aClass77_Sub22Array8) * -891850863;
			this.aBoolean544 = false;
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt1313 * -717409935; local200++) {
			arg0[local200] = this.aClass77_Sub22Array8[local200];
		}
		return this.anInt1313 * -717409935;
	}

	@OriginalMember(owner = "client!ari", name = "gx", descriptor = "([Lclient!ajv;)I", line = 30)
	@Override
	int method24169(@OriginalArg(0) Class77_Sub22[] arg0) {
		if (this.aBoolean544) {
			@Pc(6) Class447 local6 = this.method24085().aClass447_61;
			@Pc(16) int local16 = (int) local6.aFloat277 >> this.aClass556_23.anInt5243 * 941710601;
			@Pc(26) int local26 = (int) local6.aFloat278 >> this.aClass556_23.anInt5243 * 941710601;
			@Pc(28) int local28 = 0;
			if (this.aClass556_23.anInt5254 * -380604831 == local16) {
				local28++;
			} else if (this.aClass556_23.anInt5254 * -380604831 < local16) {
				local28 += 2;
			}
			if (this.aClass556_23.anInt5258 * -1709472547 == local26) {
				local28 += 3;
			} else if (this.aClass556_23.anInt5258 * -1709472547 > local26) {
				local28 += 6;
			}
			@Pc(66) int local66 = anIntArray137[local28];
			if ((this.aShort86 & local66) == 0) {
				if (this.aShort86 == 1 && local16 > 0) {
					local16--;
				} else if (this.aShort86 == 4 && local16 <= this.aClass556_23.anInt5248 * 1183912005) {
					local16++;
				} else if (this.aShort86 == 8 && local26 > 0) {
					local26--;
				} else if (this.aShort86 == 2 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local26++;
				} else if (this.aShort86 == 16 && local16 > 0 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local16--;
					local26++;
				} else if (this.aShort86 == 32 && local16 <= this.aClass556_23.anInt5248 * 1183912005 && local26 <= this.aClass556_23.anInt5265 * 60330541) {
					local16++;
					local26++;
				} else if (this.aShort86 == 128 && local16 > 0 && local26 > 0) {
					local16--;
					local26--;
				} else if (this.aShort86 == 64 && local16 <= this.aClass556_23.anInt5248 * 1183912005 && local26 > 0) {
					local16++;
					local26--;
				} else {
					throw new RuntimeException("");
				}
			}
			this.anInt1313 = this.method24126(local16, local26, this.aClass77_Sub22Array8) * -891850863;
			this.aBoolean544 = false;
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt1313 * -717409935; local200++) {
			arg0[local200] = this.aClass77_Sub22Array8[local200];
		}
		return this.anInt1313 * -717409935;
	}

	@OriginalMember(owner = "client!ari", name = "gy", descriptor = "(Lclient!dx;I)Z", line = 78)
	@Override
	boolean method24146(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31054(this, this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!ari", name = "gv", descriptor = "(Lclient!dx;)Z", line = 78)
	@Override
	boolean method24170(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31054(this, this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!ari", name = "gd", descriptor = "(Lclient!dx;)Z", line = 78)
	@Override
	boolean method24171(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31054(this, this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!ari", name = "gn", descriptor = "(Lclient!dx;)Z", line = 78)
	@Override
	boolean method24172(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aClass553_1.method31054(this, this.aByte99, (int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601, (int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601);
	}

	@OriginalMember(owner = "client!ari", name = "gz", descriptor = "(B)Z", line = 83)
	@Override
	boolean method24147() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}

	@OriginalMember(owner = "client!ari", name = "gg", descriptor = "()Z", line = 83)
	@Override
	boolean method24168() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}

	@OriginalMember(owner = "client!ari", name = "gs", descriptor = "()Z", line = 83)
	@Override
	boolean method24173() {
		@Pc(3) Class447 local3 = this.method24085().aClass447_61;
		return this.aClass556_23.aBooleanArrayArray14[((int) local3.aFloat277 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377][this.aClass556_23.anInt5259 * -1213435377 + (((int) local3.aFloat278 >> this.aClass556_23.anInt5243 * 941710601) - this.aClass556_23.anInt5258 * -1709472547)];
	}
}
