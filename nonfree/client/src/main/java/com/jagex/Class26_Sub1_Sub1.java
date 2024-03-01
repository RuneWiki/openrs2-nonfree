package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ano")
public abstract class Class26_Sub1_Sub1 extends Class26_Sub1 {

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "I")
	int anInt2893 = 0;

	@OriginalMember(owner = "client!ano", name = "f", descriptor = "[Lclient!afz;")
	Class3_Sub15[] aClass3_Sub15Array22 = new Class3_Sub15[4];

	@OriginalMember(owner = "client!ano", name = "q", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!ano", name = "m", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!ano", name = "v", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!ano", name = "t", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!ano", name = "w", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!ano", name = "o", descriptor = "B")
	byte aByte103;

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!rp;IIIIIIIIIZB)V", line = 17)
	Class26_Sub1_Sub1(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11) {
		super(arg0);
		this.aByte101 = (byte) arg1;
		this.aByte102 = (byte) arg2;
		this.method21436(new Class320((float) arg3, (float) arg4, (float) arg5));
		this.aShort94 = (short) arg6;
		this.aShort92 = (short) arg7;
		this.aShort93 = (short) arg8;
		this.aShort91 = (short) arg9;
		this.aBoolean526 = arg10;
		this.aByte103 = arg11;
		for (@Pc(52) int local52 = 0; local52 < 4; local52++) {
			this.aClass3_Sub15Array22[local52] = null;
		}
	}

	@OriginalMember(owner = "client!ano", name = "dx", descriptor = "()V", line = 30)
	void method21530() {
	}

	@OriginalMember(owner = "client!ano", name = "bi", descriptor = "(I)V", line = 30)
	void method21531() {
	}

	@OriginalMember(owner = "client!ano", name = "fr", descriptor = "([Lclient!afz;I)I", line = 33)
	@Override
	int method21514(@OriginalArg(0) Class3_Sub15[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean524) {
			this.anInt2893 = 0;
			local10 = Math.max(0, this.aShort94);
			@Pc(23) int local23 = Math.min(this.aClass438_23.aLongArrayArrayArray1[this.aByte101].length - 1, this.aShort92);
			@Pc(28) int local28 = Math.max(0, this.aShort93);
			@Pc(43) int local43 = Math.min(this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local10].length - 1, this.aShort91);
			@Pc(74) int local74;
			@Pc(86) int local86;
			label127: while (local10 <= local23) {
				while (local28 <= local43) {
					@Pc(60) long local60 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local10][local28];
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
							@Pc(84) Class431 local84 = this.aClass438_23.aClass431Array1[local74 - 1];
							for (local86 = 0; local86 < this.anInt2893 * 817862015; local86++) {
								if (local84.aClass3_Sub15_3 == this.aClass3_Sub15Array22[local86]) {
									local62 += 16L;
									continue label119;
								}
							}
							this.aClass3_Sub15Array22[(this.anInt2893 += -527291777) * 817862015 - 1] = local84.aClass3_Sub15_3;
							if (this.anInt2893 * 817862015 == 4) {
								break label127;
							}
							local62 += 16L;
						}
					}
					local28++;
				}
				local10++;
			}
			for (@Pc(143) int local143 = this.anInt2893 * 817862015; local143 < 4; local143++) {
				this.aClass3_Sub15Array22[local143] = null;
			}
			if (this.aByte103 != 0) {
				local74 = this.aShort94 - this.aClass438_23.anInt4909 * 357988515;
				@Pc(174) int local174 = this.aShort93 - this.aClass438_23.anInt4922 * 1650039469;
				@Pc(189) int local189;
				@Pc(197) short local197;
				@Pc(184) short local184;
				@Pc(194) int local194;
				if (this.aByte103 == 1) {
					if (local174 > local74) {
						local184 = this.aShort94;
						local189 = this.aShort93 - 1;
						local194 = this.aShort94 + 1;
						local197 = this.aShort93;
					} else {
						local184 = this.aShort94;
						local189 = this.aShort93 + 1;
						local194 = this.aShort94 - 1;
						local197 = this.aShort93;
					}
				} else if (local174 > -local74) {
					local184 = this.aShort94;
					local189 = this.aShort93 - 1;
					local194 = this.aShort94 - 1;
					local197 = this.aShort93;
				} else {
					local184 = this.aShort94;
					local189 = this.aShort93 + 1;
					local194 = this.aShort94 + 1;
					local197 = this.aShort93;
				}
				label91: for (local86 = 0; local86 < this.anInt2893 * 817862015; local86++) {
					@Pc(271) long local271 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local184][local189];
					@Pc(286) Class431 local286;
					while (local271 != 0L) {
						local286 = this.aClass438_23.aClass431Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass3_Sub15Array22[local86] == local286.aClass3_Sub15_3) {
							continue label91;
						}
					}
					local271 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local194][local197];
					while (local271 != 0L) {
						local286 = this.aClass438_23.aClass431Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass3_Sub15Array22[local86] == local286.aClass3_Sub15_3) {
							continue label91;
						}
					}
					for (@Pc(340) int local340 = local86; local340 < this.anInt2893 * 817862015 - 1; local340++) {
						this.aClass3_Sub15Array22[local340] = this.aClass3_Sub15Array22[local340 + 1];
					}
					this.anInt2893 -= -527291777;
				}
			}
			this.aBoolean524 = false;
		}
		for (local10 = 0; local10 < this.anInt2893 * 817862015; local10++) {
			arg0[local10] = this.aClass3_Sub15Array22[local10];
		}
		return this.anInt2893 * 817862015;
	}

	@OriginalMember(owner = "client!ano", name = "gl", descriptor = "([Lclient!afz;)I", line = 33)
	@Override
	int method21519(@OriginalArg(0) Class3_Sub15[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean524) {
			this.anInt2893 = 0;
			local10 = Math.max(0, this.aShort94);
			@Pc(23) int local23 = Math.min(this.aClass438_23.aLongArrayArrayArray1[this.aByte101].length - 1, this.aShort92);
			@Pc(28) int local28 = Math.max(0, this.aShort93);
			@Pc(43) int local43 = Math.min(this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local10].length - 1, this.aShort91);
			@Pc(74) int local74;
			@Pc(86) int local86;
			label127: while (local10 <= local23) {
				while (local28 <= local43) {
					@Pc(60) long local60 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local10][local28];
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
							@Pc(84) Class431 local84 = this.aClass438_23.aClass431Array1[local74 - 1];
							for (local86 = 0; local86 < this.anInt2893 * 817862015; local86++) {
								if (local84.aClass3_Sub15_3 == this.aClass3_Sub15Array22[local86]) {
									local62 += 16L;
									continue label119;
								}
							}
							this.aClass3_Sub15Array22[(this.anInt2893 += -527291777) * 817862015 - 1] = local84.aClass3_Sub15_3;
							if (this.anInt2893 * 817862015 == 4) {
								break label127;
							}
							local62 += 16L;
						}
					}
					local28++;
				}
				local10++;
			}
			for (@Pc(143) int local143 = this.anInt2893 * 817862015; local143 < 4; local143++) {
				this.aClass3_Sub15Array22[local143] = null;
			}
			if (this.aByte103 != 0) {
				local74 = this.aShort94 - this.aClass438_23.anInt4909 * 357988515;
				@Pc(174) int local174 = this.aShort93 - this.aClass438_23.anInt4922 * 1650039469;
				@Pc(189) int local189;
				@Pc(197) short local197;
				@Pc(184) short local184;
				@Pc(194) int local194;
				if (this.aByte103 == 1) {
					if (local174 > local74) {
						local184 = this.aShort94;
						local189 = this.aShort93 - 1;
						local194 = this.aShort94 + 1;
						local197 = this.aShort93;
					} else {
						local184 = this.aShort94;
						local189 = this.aShort93 + 1;
						local194 = this.aShort94 - 1;
						local197 = this.aShort93;
					}
				} else if (local174 > -local74) {
					local184 = this.aShort94;
					local189 = this.aShort93 - 1;
					local194 = this.aShort94 - 1;
					local197 = this.aShort93;
				} else {
					local184 = this.aShort94;
					local189 = this.aShort93 + 1;
					local194 = this.aShort94 + 1;
					local197 = this.aShort93;
				}
				label91: for (local86 = 0; local86 < this.anInt2893 * 817862015; local86++) {
					@Pc(271) long local271 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local184][local189];
					@Pc(286) Class431 local286;
					while (local271 != 0L) {
						local286 = this.aClass438_23.aClass431Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass3_Sub15Array22[local86] == local286.aClass3_Sub15_3) {
							continue label91;
						}
					}
					local271 = this.aClass438_23.aLongArrayArrayArray1[this.aByte101][local194][local197];
					while (local271 != 0L) {
						local286 = this.aClass438_23.aClass431Array1[(int) ((local271 & 0xFFFFL) - 1L)];
						local271 >>>= 0x10;
						if (this.aClass3_Sub15Array22[local86] == local286.aClass3_Sub15_3) {
							continue label91;
						}
					}
					for (@Pc(340) int local340 = local86; local340 < this.anInt2893 * 817862015 - 1; local340++) {
						this.aClass3_Sub15Array22[local340] = this.aClass3_Sub15Array22[local340 + 1];
					}
					this.anInt2893 -= -527291777;
				}
			}
			this.aBoolean524 = false;
		}
		for (local10 = 0; local10 < this.anInt2893 * 817862015; local10++) {
			arg0[local10] = this.aClass3_Sub15Array22[local10];
		}
		return this.anInt2893 * 817862015;
	}

	@OriginalMember(owner = "client!ano", name = "gf", descriptor = "(Lclient!de;I)Z", line = 123)
	@Override
	boolean method21521(@OriginalArg(0) Class21 arg0) {
		return this.aClass438_23.aClass444_1.method28288(this.aByte102, this.aShort94, this.aShort92, this.aShort93, this.aShort91, this.method21474(arg0));
	}

	@OriginalMember(owner = "client!ano", name = "gs", descriptor = "(Lclient!de;)Z", line = 123)
	@Override
	boolean method21490(@OriginalArg(0) Class21 arg0) {
		return this.aClass438_23.aClass444_1.method28288(this.aByte102, this.aShort94, this.aShort92, this.aShort93, this.aShort91, this.method21474(arg0));
	}

	@OriginalMember(owner = "client!ano", name = "gc", descriptor = "(Lclient!de;)Z", line = 123)
	@Override
	boolean method21498(@OriginalArg(0) Class21 arg0) {
		return this.aClass438_23.aClass444_1.method28288(this.aByte102, this.aShort94, this.aShort92, this.aShort93, this.aShort91, this.method21474(arg0));
	}

	@OriginalMember(owner = "client!ano", name = "gw", descriptor = "(Lclient!de;)Z", line = 123)
	@Override
	boolean method21515(@OriginalArg(0) Class21 arg0) {
		return this.aClass438_23.aClass444_1.method28288(this.aByte102, this.aShort94, this.aShort92, this.aShort93, this.aShort91, this.method21474(arg0));
	}

	@OriginalMember(owner = "client!ano", name = "go", descriptor = "()Z", line = 127)
	@Override
	boolean method21516() {
		for (@Pc(2) int local2 = this.aShort94; local2 <= this.aShort92; local2++) {
			for (@Pc(9) int local9 = this.aShort93; local9 <= this.aShort91; local9++) {
				@Pc(27) int local27 = local2 - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565;
				if (local27 >= 0 && local27 < this.aClass438_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565;
					if (local50 >= 0 && local50 < this.aClass438_23.aBooleanArrayArray14.length && this.aClass438_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ano", name = "gy", descriptor = "(B)Z", line = 127)
	@Override
	boolean method21475() {
		for (@Pc(2) int local2 = this.aShort94; local2 <= this.aShort92; local2++) {
			for (@Pc(9) int local9 = this.aShort93; local9 <= this.aShort91; local9++) {
				@Pc(27) int local27 = local2 - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565;
				if (local27 >= 0 && local27 < this.aClass438_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565;
					if (local50 >= 0 && local50 < this.aClass438_23.aBooleanArrayArray14.length && this.aClass438_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ano", name = "gi", descriptor = "()Z", line = 127)
	@Override
	boolean method21517() {
		for (@Pc(2) int local2 = this.aShort94; local2 <= this.aShort92; local2++) {
			for (@Pc(9) int local9 = this.aShort93; local9 <= this.aShort91; local9++) {
				@Pc(27) int local27 = local2 - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565;
				if (local27 >= 0 && local27 < this.aClass438_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565;
					if (local50 >= 0 && local50 < this.aClass438_23.aBooleanArrayArray14.length && this.aClass438_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ano", name = "gb", descriptor = "()Z", line = 127)
	@Override
	boolean method21518() {
		for (@Pc(2) int local2 = this.aShort94; local2 <= this.aShort92; local2++) {
			for (@Pc(9) int local9 = this.aShort93; local9 <= this.aShort91; local9++) {
				@Pc(27) int local27 = local2 - this.aClass438_23.anInt4909 * 357988515 + this.aClass438_23.anInt4912 * 555856565;
				if (local27 >= 0 && local27 < this.aClass438_23.aBooleanArrayArray14.length) {
					@Pc(50) int local50 = local9 - this.aClass438_23.anInt4922 * 1650039469 + this.aClass438_23.anInt4912 * 555856565;
					if (local50 >= 0 && local50 < this.aClass438_23.aBooleanArrayArray14.length && this.aClass438_23.aBooleanArrayArray14[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
