package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ary")
public abstract class Class104_Sub1_Sub1 extends Class104_Sub1 {

	@OriginalMember(owner = "client!ary", name = "a", descriptor = "I")
	int anInt3220 = 0;

	@OriginalMember(owner = "client!ary", name = "m", descriptor = "[Lclient!ajv;")
	Class77_Sub22[] aClass77_Sub22Array22 = new Class77_Sub22[4];

	@OriginalMember(owner = "client!ary", name = "u", descriptor = "S")
	public short aShort131;

	@OriginalMember(owner = "client!ary", name = "e", descriptor = "S")
	public short aShort129;

	@OriginalMember(owner = "client!ary", name = "f", descriptor = "S")
	public short aShort132;

	@OriginalMember(owner = "client!ary", name = "o", descriptor = "S")
	public short aShort130;

	@OriginalMember(owner = "client!ary", name = "b", descriptor = "Z")
	public boolean aBoolean545;

	@OriginalMember(owner = "client!ary", name = "n", descriptor = "B")
	byte aByte101;

	@OriginalMember(owner = "client!ary", name = "<init>", descriptor = "(Lclient!tk;IIIIIIIIIZB)V", line = 17)
	Class104_Sub1_Sub1(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11) {
		super(arg0);
		this.aByte100 = (byte) arg1;
		this.aByte99 = (byte) arg2;
		this.method24102(new Class447((float) arg3, (float) arg4, (float) arg5));
		this.aShort131 = (short) arg6;
		this.aShort129 = (short) arg7;
		this.aShort132 = (short) arg8;
		this.aShort130 = (short) arg9;
		this.aBoolean545 = arg10;
		this.aByte101 = arg11;
		for (@Pc(52) int local52 = 0; local52 < 4; local52++) {
			this.aClass77_Sub22Array22[local52] = null;
		}
	}

	@OriginalMember(owner = "client!ary", name = "dk", descriptor = "()V", line = 30)
	void method24175() {
	}

	@OriginalMember(owner = "client!ary", name = "dp", descriptor = "()V", line = 30)
	void method24176() {
	}

	@OriginalMember(owner = "client!ary", name = "de", descriptor = "()V", line = 30)
	void method24177() {
	}

	@OriginalMember(owner = "client!ary", name = "du", descriptor = "()V", line = 30)
	void method24178() {
	}

	@OriginalMember(owner = "client!ary", name = "ds", descriptor = "()V", line = 30)
	void method24179() {
	}

	@OriginalMember(owner = "client!ary", name = "bh", descriptor = "(I)V", line = 30)
	void method24180() {
	}

	@OriginalMember(owner = "client!ary", name = "gc", descriptor = "([Lclient!ajv;I)I", line = 33)
	@Override
	int method24145(@OriginalArg(0) Class77_Sub22[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean544) {
			this.anInt3220 = 0;
			local10 = Math.max(0, this.aShort131);
			@Pc(23) int local23 = Math.min(this.aClass556_23.aLongArrayArrayArray1[this.aByte100].length - 1, this.aShort129);
			@Pc(28) int local28 = Math.max(0, this.aShort132);
			@Pc(43) int local43 = Math.min(this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local10].length - 1, this.aShort130);
			@Pc(74) int local74;
			@Pc(86) int local86;
			label127: while (local10 <= local23) {
				while (local28 <= local43) {
					@Pc(60) long local60 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local10][local28];
					@Pc(62) long local62 = 0L;
					label121: while (true) {
						label119: while (true) {
							if (local62 > 48L) {
								break label121;
							}
							local74 = (int) (local60 >>> (int) local62 & 0xFFFFL);
							if (local74 <= 0) {
								break label121;
							}
							@Pc(84) Class561 local84 = this.aClass556_23.aClass561Array1[local74 - 1];
							for (local86 = 0; local86 < this.anInt3220 * 1409643337; local86++) {
								if (this.aClass77_Sub22Array22[local86] == local84.aClass77_Sub22_3) {
									local62 += 16L;
									continue label119;
								}
							}
							this.aClass77_Sub22Array22[(this.anInt3220 += -1268912391) * 1409643337 - 1] = local84.aClass77_Sub22_3;
							if (this.anInt3220 * 1409643337 == 4) {
								break label127;
							}
							local62 += 16L;
						}
					}
					local28++;
				}
				local10++;
			}
			for (@Pc(143) int local143 = this.anInt3220 * 1409643337; local143 < 4; local143++) {
				this.aClass77_Sub22Array22[local143] = null;
			}
			if (this.aByte101 != 0) {
				local74 = this.aShort131 - this.aClass556_23.anInt5254 * -380604831;
				@Pc(174) int local174 = this.aShort132 - this.aClass556_23.anInt5258 * -1709472547;
				@Pc(189) int local189;
				@Pc(197) short local197;
				@Pc(184) short local184;
				@Pc(194) int local194;
				if (this.aByte101 == 1) {
					if (local174 > local74) {
						local184 = this.aShort131;
						local189 = this.aShort132 - 1;
						local194 = this.aShort131 + 1;
						local197 = this.aShort132;
					} else {
						local184 = this.aShort131;
						local189 = this.aShort132 + 1;
						local194 = this.aShort131 - 1;
						local197 = this.aShort132;
					}
				} else if (local174 > -local74) {
					local184 = this.aShort131;
					local189 = this.aShort132 - 1;
					local194 = this.aShort131 - 1;
					local197 = this.aShort132;
				} else {
					local184 = this.aShort131;
					local189 = this.aShort132 + 1;
					local194 = this.aShort131 + 1;
					local197 = this.aShort132;
				}
				label91: for (local86 = 0; local86 < this.anInt3220 * 1409643337; local86++) {
					@Pc(271) long local271 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local184][local189];
					@Pc(286) Class561 local286;
					while (local271 != 0L) {
						local286 = this.aClass556_23.aClass561Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (local286.aClass77_Sub22_3 == this.aClass77_Sub22Array22[local86]) {
							continue label91;
						}
					}
					local271 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local194][local197];
					while (local271 != 0L) {
						local286 = this.aClass556_23.aClass561Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass77_Sub22Array22[local86] == local286.aClass77_Sub22_3) {
							continue label91;
						}
					}
					for (@Pc(340) int local340 = local86; local340 < this.anInt3220 * 1409643337 - 1; local340++) {
						this.aClass77_Sub22Array22[local340] = this.aClass77_Sub22Array22[local340 + 1];
					}
					this.anInt3220 -= -1268912391;
				}
			}
			this.aBoolean544 = false;
		}
		for (local10 = 0; local10 < this.anInt3220 * 1409643337; local10++) {
			arg0[local10] = this.aClass77_Sub22Array22[local10];
		}
		return this.anInt3220 * 1409643337;
	}

	@OriginalMember(owner = "client!ary", name = "gx", descriptor = "([Lclient!ajv;)I", line = 33)
	@Override
	int method24169(@OriginalArg(0) Class77_Sub22[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean544) {
			this.anInt3220 = 0;
			local10 = Math.max(0, this.aShort131);
			@Pc(23) int local23 = Math.min(this.aClass556_23.aLongArrayArrayArray1[this.aByte100].length - 1, this.aShort129);
			@Pc(28) int local28 = Math.max(0, this.aShort132);
			@Pc(43) int local43 = Math.min(this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local10].length - 1, this.aShort130);
			@Pc(74) int local74;
			@Pc(86) int local86;
			label127: while (local10 <= local23) {
				while (local28 <= local43) {
					@Pc(60) long local60 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local10][local28];
					@Pc(62) long local62 = 0L;
					label121: while (true) {
						label119: while (true) {
							if (local62 > 48L) {
								break label121;
							}
							local74 = (int) (local60 >>> (int) local62 & 0xFFFFL);
							if (local74 <= 0) {
								break label121;
							}
							@Pc(84) Class561 local84 = this.aClass556_23.aClass561Array1[local74 - 1];
							for (local86 = 0; local86 < this.anInt3220 * 1409643337; local86++) {
								if (this.aClass77_Sub22Array22[local86] == local84.aClass77_Sub22_3) {
									local62 += 16L;
									continue label119;
								}
							}
							this.aClass77_Sub22Array22[(this.anInt3220 += -1268912391) * 1409643337 - 1] = local84.aClass77_Sub22_3;
							if (this.anInt3220 * 1409643337 == 4) {
								break label127;
							}
							local62 += 16L;
						}
					}
					local28++;
				}
				local10++;
			}
			for (@Pc(143) int local143 = this.anInt3220 * 1409643337; local143 < 4; local143++) {
				this.aClass77_Sub22Array22[local143] = null;
			}
			if (this.aByte101 != 0) {
				local74 = this.aShort131 - this.aClass556_23.anInt5254 * -380604831;
				@Pc(174) int local174 = this.aShort132 - this.aClass556_23.anInt5258 * -1709472547;
				@Pc(189) int local189;
				@Pc(197) short local197;
				@Pc(184) short local184;
				@Pc(194) int local194;
				if (this.aByte101 == 1) {
					if (local174 > local74) {
						local184 = this.aShort131;
						local189 = this.aShort132 - 1;
						local194 = this.aShort131 + 1;
						local197 = this.aShort132;
					} else {
						local184 = this.aShort131;
						local189 = this.aShort132 + 1;
						local194 = this.aShort131 - 1;
						local197 = this.aShort132;
					}
				} else if (local174 > -local74) {
					local184 = this.aShort131;
					local189 = this.aShort132 - 1;
					local194 = this.aShort131 - 1;
					local197 = this.aShort132;
				} else {
					local184 = this.aShort131;
					local189 = this.aShort132 + 1;
					local194 = this.aShort131 + 1;
					local197 = this.aShort132;
				}
				label91: for (local86 = 0; local86 < this.anInt3220 * 1409643337; local86++) {
					@Pc(271) long local271 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local184][local189];
					@Pc(286) Class561 local286;
					while (local271 != 0L) {
						local286 = this.aClass556_23.aClass561Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (local286.aClass77_Sub22_3 == this.aClass77_Sub22Array22[local86]) {
							continue label91;
						}
					}
					local271 = this.aClass556_23.aLongArrayArrayArray1[this.aByte100][local194][local197];
					while (local271 != 0L) {
						local286 = this.aClass556_23.aClass561Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass77_Sub22Array22[local86] == local286.aClass77_Sub22_3) {
							continue label91;
						}
					}
					for (@Pc(340) int local340 = local86; local340 < this.anInt3220 * 1409643337 - 1; local340++) {
						this.aClass77_Sub22Array22[local340] = this.aClass77_Sub22Array22[local340 + 1];
					}
					this.anInt3220 -= -1268912391;
				}
			}
			this.aBoolean544 = false;
		}
		for (local10 = 0; local10 < this.anInt3220 * 1409643337; local10++) {
			arg0[local10] = this.aClass77_Sub22Array22[local10];
		}
		return this.anInt3220 * 1409643337;
	}

	@OriginalMember(owner = "client!ary", name = "gn", descriptor = "(Lclient!dx;)Z", line = 123)
	@Override
	boolean method24172(@OriginalArg(0) Class86 arg0) {
		return this.aClass556_23.aClass553_1.method31059(this.aByte99, this.aShort131, this.aShort129, this.aShort132, this.aShort130, this.method24144(arg0));
	}

	@OriginalMember(owner = "client!ary", name = "gy", descriptor = "(Lclient!dx;I)Z", line = 123)
	@Override
	boolean method24146(@OriginalArg(0) Class86 arg0) {
		return this.aClass556_23.aClass553_1.method31059(this.aByte99, this.aShort131, this.aShort129, this.aShort132, this.aShort130, this.method24144(arg0));
	}

	@OriginalMember(owner = "client!ary", name = "gv", descriptor = "(Lclient!dx;)Z", line = 123)
	@Override
	boolean method24170(@OriginalArg(0) Class86 arg0) {
		return this.aClass556_23.aClass553_1.method31059(this.aByte99, this.aShort131, this.aShort129, this.aShort132, this.aShort130, this.method24144(arg0));
	}

	@OriginalMember(owner = "client!ary", name = "gd", descriptor = "(Lclient!dx;)Z", line = 123)
	@Override
	boolean method24171(@OriginalArg(0) Class86 arg0) {
		return this.aClass556_23.aClass553_1.method31059(this.aByte99, this.aShort131, this.aShort129, this.aShort132, this.aShort130, this.method24144(arg0));
	}

	@OriginalMember(owner = "client!ary", name = "gz", descriptor = "(B)Z", line = 127)
	@Override
	boolean method24147() {
		for (@Pc(2) int local2 = this.aShort131; local2 <= this.aShort129; local2++) {
			for (@Pc(9) int local9 = this.aShort132; local9 <= this.aShort130; local9++) {
				@Pc(27) int local27 = local2 - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377;
				if (local27 >= 0 && local27 < this.aClass556_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = this.aClass556_23.anInt5259 * -1213435377 + (local9 - this.aClass556_23.anInt5258 * -1709472547);
					if (local50 >= 0 && local50 < this.aClass556_23.aBooleanArrayArray14.length && this.aClass556_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ary", name = "gg", descriptor = "()Z", line = 127)
	@Override
	boolean method24168() {
		for (@Pc(2) int local2 = this.aShort131; local2 <= this.aShort129; local2++) {
			for (@Pc(9) int local9 = this.aShort132; local9 <= this.aShort130; local9++) {
				@Pc(27) int local27 = local2 - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377;
				if (local27 >= 0 && local27 < this.aClass556_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = this.aClass556_23.anInt5259 * -1213435377 + (local9 - this.aClass556_23.anInt5258 * -1709472547);
					if (local50 >= 0 && local50 < this.aClass556_23.aBooleanArrayArray14.length && this.aClass556_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ary", name = "gs", descriptor = "()Z", line = 127)
	@Override
	boolean method24173() {
		for (@Pc(2) int local2 = this.aShort131; local2 <= this.aShort129; local2++) {
			for (@Pc(9) int local9 = this.aShort132; local9 <= this.aShort130; local9++) {
				@Pc(27) int local27 = local2 - this.aClass556_23.anInt5254 * -380604831 + this.aClass556_23.anInt5259 * -1213435377;
				if (local27 >= 0 && local27 < this.aClass556_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = this.aClass556_23.anInt5259 * -1213435377 + (local9 - this.aClass556_23.anInt5258 * -1709472547);
					if (local50 >= 0 && local50 < this.aClass556_23.aBooleanArrayArray14.length && this.aClass556_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ary", name = "aeo", descriptor = "(Lclient!yf;I)V", line = 9936)
	static final void method24181(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt66 * 1112381535;
	}
}
