package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afs")
public class Class26_Sub1_Sub4_Sub2 extends Class26_Sub1_Sub4 implements Interface43 {

	@OriginalMember(owner = "client!afs", name = "e", descriptor = "Lclient!rc;")
	Class426 aClass426_8;

	@OriginalMember(owner = "client!afs", name = "z", descriptor = "Lclient!sj;")
	Class457 aClass457_5;

	@OriginalMember(owner = "client!afs", name = "r", descriptor = "I")
	final int anInt1212;

	@OriginalMember(owner = "client!afs", name = "m", descriptor = "Z")
	final boolean aBoolean296;

	@OriginalMember(owner = "client!afs", name = "q", descriptor = "B")
	final byte aByte56;

	@OriginalMember(owner = "client!afs", name = "d", descriptor = "B")
	final byte aByte57;

	@OriginalMember(owner = "client!afs", name = "v", descriptor = "Z")
	boolean aBoolean297;

	@OriginalMember(owner = "client!afs", name = "t", descriptor = "Z")
	boolean aBoolean295;

	@OriginalMember(owner = "client!afs", name = "j", descriptor = "Lclient!dh;")
	Class20 aClass20_4;

	@OriginalMember(owner = "client!afs", name = "n", descriptor = "Lclient!amd;")
	Class3_Sub1_Sub3 aClass3_Sub1_Sub3_4;

	@OriginalMember(owner = "client!afs", name = "p", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 11)
	public static String method11175(@OriginalArg(0) String arg0) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '%' && local6 > local8 + 2) {
				local15 = arg0.charAt(local8 + 1);
				@Pc(41) int local41;
				if (local15 >= '0' && local15 <= '9') {
					local41 = local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 = local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 = local15 + '\n' - 65;
				}
				local41 *= 16;
				local15 = arg0.charAt(local8 + 2);
				if (local15 >= '0' && local15 <= '9') {
					local41 += local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 += local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 += local15 + '\n' - 65;
				}
				if (local41 != 0 && Class431.method27963((byte) local41)) {
					local3.append(Class380.method27288((byte) local41));
				}
				local8 += 2;
			} else if (local15 == '+') {
				local3.append(' ');
			} else {
				local3.append(local15);
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!afs", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIII)V", line = 35)
	public Class26_Sub1_Sub4_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.aClass457_5 = arg2;
		this.anInt1212 = arg3.anInt5092 * 692025181;
		this.aBoolean296 = arg9;
		this.aByte56 = (byte) arg13;
		this.aByte57 = (byte) arg12;
		this.aBoolean297 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.aBoolean295 = arg1.method17409() && arg3.aBoolean789 && !this.aBoolean296 && Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		@Pc(62) int local62 = 2048;
		if (arg3.aBoolean786) {
			local62 |= 0x80000;
		}
		@Pc(77) Class576 local77 = this.method11166(arg1, local62, this.aBoolean295);
		if (local77 != null) {
			this.aClass20_4 = (Class20) local77.anObject27;
			this.aClass3_Sub1_Sub3_4 = (Class3_Sub1_Sub3) local77.anObject26;
			if (arg3.aBoolean786) {
				this.aClass20_4 = this.aClass20_4.method5430((byte) 0, local62, false);
				if (arg3.aBoolean786) {
					@Pc(108) Class368 local108 = client.aClass370_1.method27042();
					this.aClass20_4.method5373(local108.anInt4661 * -2109747821, local108.anInt4659 * -1459113035, local108.anInt4660 * 1674686799, local108.anInt4658 * -975644687);
				}
			}
		}
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afs", name = "cp", descriptor = "()Z", line = 61)
	@Override
	boolean method21501() {
		if (this.aClass20_4 == null) {
			return true;
		} else {
			return !this.aClass20_4.method5376();
		}
	}

	@OriginalMember(owner = "client!afs", name = "cc", descriptor = "()Z", line = 61)
	@Override
	boolean method21491() {
		if (this.aClass20_4 == null) {
			return true;
		} else {
			return !this.aClass20_4.method5376();
		}
	}

	@OriginalMember(owner = "client!afs", name = "bs", descriptor = "(B)Z", line = 61)
	@Override
	boolean method21472() {
		if (this.aClass20_4 == null) {
			return true;
		} else {
			return !this.aClass20_4.method5376();
		}
	}

	@OriginalMember(owner = "client!afs", name = "cs", descriptor = "()Z", line = 66)
	@Override
	boolean method21483() {
		return this.aClass20_4 == null ? false : this.aClass20_4.method5375();
	}

	@OriginalMember(owner = "client!afs", name = "ct", descriptor = "()Z", line = 66)
	@Override
	boolean method21484() {
		return this.aClass20_4 == null ? false : this.aClass20_4.method5375();
	}

	@OriginalMember(owner = "client!afs", name = "cx", descriptor = "()Z", line = 66)
	@Override
	boolean method21468() {
		return this.aClass20_4 == null ? false : this.aClass20_4.method5375();
	}

	@OriginalMember(owner = "client!afs", name = "bm", descriptor = "(I)Z", line = 66)
	@Override
	boolean method21467() {
		return this.aClass20_4 == null ? false : this.aClass20_4.method5375();
	}

	@OriginalMember(owner = "client!afs", name = "bd", descriptor = "(I)I", line = 71)
	@Override
	public int method21508() {
		return this.aClass20_4 == null ? 0 : this.aClass20_4.method5466();
	}

	@OriginalMember(owner = "client!afs", name = "cy", descriptor = "()I", line = 71)
	@Override
	public int method21527() {
		return this.aClass20_4 == null ? 0 : this.aClass20_4.method5466();
	}

	@OriginalMember(owner = "client!afs", name = "cb", descriptor = "()I", line = 71)
	@Override
	public int method21487() {
		return this.aClass20_4 == null ? 0 : this.aClass20_4.method5466();
	}

	@OriginalMember(owner = "client!afs", name = "bg", descriptor = "(Lclient!de;I)Lclient!dh;", line = 75)
	Class20 method11168(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_4 != null && arg0.method17117(this.aClass20_4.method5327(), arg1) == 0) {
			return this.aClass20_4;
		} else {
			@Pc(20) Class576 local20 = this.method11166(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afs", name = "bf", descriptor = "(Lclient!de;II)Lclient!dh;", line = 75)
	Class20 method11169(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_4 != null && arg0.method17117(this.aClass20_4.method5327(), arg1) == 0) {
			return this.aClass20_4;
		} else {
			@Pc(20) Class576 local20 = this.method11166(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afs", name = "bk", descriptor = "(Lclient!de;I)Lclient!dh;", line = 75)
	Class20 method11171(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_4 != null && arg0.method17117(this.aClass20_4.method5327(), arg1) == 0) {
			return this.aClass20_4;
		} else {
			@Pc(20) Class576 local20 = this.method11166(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afs", name = "bt", descriptor = "(Lclient!de;IZB)Lclient!xi;", line = 82)
	Class576 method11166(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_5.method28510(this.anInt1212 * 1227135823);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean296) {
			local18 = this.aClass438_23.aClass17Array2[this.aByte102];
			local24 = this.aClass438_23.aClass17Array1[0];
		} else {
			local18 = this.aClass438_23.aClass17Array1[this.aByte102];
			if (this.aByte102 < 3) {
				local24 = this.aClass438_23.aClass17Array1[this.aByte102 + 1];
			} else {
				local24 = null;
			}
		}
		@Pc(52) Class320 local52 = this.method21431().aClass320_61;
		return local8.method28679(arg0, arg1, this.aByte57, this.aByte56, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afs", name = "bl", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 82)
	Class576 method11167(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_5.method28510(this.anInt1212 * 1227135823);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean296) {
			local18 = this.aClass438_23.aClass17Array2[this.aByte102];
			local24 = this.aClass438_23.aClass17Array1[0];
		} else {
			local18 = this.aClass438_23.aClass17Array1[this.aByte102];
			if (this.aByte102 < 3) {
				local24 = this.aClass438_23.aClass17Array1[this.aByte102 + 1];
			} else {
				local24 = null;
			}
		}
		@Pc(52) Class320 local52 = this.method21431().aClass320_61;
		return local8.method28679(arg0, arg1, this.aByte57, this.aByte56, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afs", name = "br", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 82)
	Class576 method11170(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_5.method28510(this.anInt1212 * 1227135823);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean296) {
			local18 = this.aClass438_23.aClass17Array2[this.aByte102];
			local24 = this.aClass438_23.aClass17Array1[0];
		} else {
			local18 = this.aClass438_23.aClass17Array1[this.aByte102];
			if (this.aByte102 < 3) {
				local24 = this.aClass438_23.aClass17Array1[this.aByte102 + 1];
			} else {
				local24 = null;
			}
		}
		@Pc(52) Class320 local52 = this.method21431().aClass320_61;
		return local8.method28679(arg0, arg1, this.aByte57, this.aByte56, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afs", name = "by", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 82)
	Class576 method11172(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_5.method28510(this.anInt1212 * 1227135823);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean296) {
			local18 = this.aClass438_23.aClass17Array2[this.aByte102];
			local24 = this.aClass438_23.aClass17Array1[0];
		} else {
			local18 = this.aClass438_23.aClass17Array1[this.aByte102];
			if (this.aByte102 < 3) {
				local24 = this.aClass438_23.aClass17Array1[this.aByte102 + 1];
			} else {
				local24 = null;
			}
		}
		@Pc(52) Class320 local52 = this.method21431().aClass320_61;
		return local8.method28679(arg0, arg1, this.aByte57, this.aByte56, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afs", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 99)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_8 == null) {
			this.aClass426_8 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11169(arg0, 0));
		}
		return this.aClass426_8;
	}

	@OriginalMember(owner = "client!afs", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 99)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_8 == null) {
			this.aClass426_8 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11169(arg0, 0));
		}
		return this.aClass426_8;
	}

	@OriginalMember(owner = "client!afs", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 99)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_8 == null) {
			this.aClass426_8 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11169(arg0, 0));
		}
		return this.aClass426_8;
	}

	@OriginalMember(owner = "client!afs", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 105)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_4 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = arg0.method17098();
		local7.method26235(this.method21433());
		local7.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(25) Class446 local25 = Class508.method29569(this.aBoolean297);
		@Pc(35) Class323 local35 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local35 == null) {
			this.aClass20_4.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_4.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local35);
		}
		return local25;
	}

	@OriginalMember(owner = "client!afs", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 105)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_4 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = arg0.method17098();
		local7.method26235(this.method21433());
		local7.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(25) Class446 local25 = Class508.method29569(this.aBoolean297);
		@Pc(35) Class323 local35 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local35 == null) {
			this.aClass20_4.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_4.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local35);
		}
		return local25;
	}

	@OriginalMember(owner = "client!afs", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 105)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_4 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = arg0.method17098();
		local7.method26235(this.method21433());
		local7.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(25) Class446 local25 = Class508.method29569(this.aBoolean297);
		@Pc(35) Class323 local35 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local35 == null) {
			this.aClass20_4.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_4.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local35);
		}
		return local25;
	}

	@OriginalMember(owner = "client!afs", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 105)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_4 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = arg0.method17098();
		local7.method26235(this.method21433());
		local7.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(25) Class446 local25 = Class508.method29569(this.aBoolean297);
		@Pc(35) Class323 local35 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local35 == null) {
			this.aClass20_4.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_4.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local35);
		}
		return local25;
	}

	@OriginalMember(owner = "client!afs", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 105)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_4 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = arg0.method17098();
		local7.method26235(this.method21433());
		local7.method26203((float) this.aShort62, 0.0F, (float) this.aShort61);
		@Pc(25) Class446 local25 = Class508.method29569(this.aBoolean297);
		@Pc(35) Class323 local35 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local35 == null) {
			this.aClass20_4.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_4.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local35);
		}
		return local25;
	}

	@OriginalMember(owner = "client!afs", name = "fx", descriptor = "(Lclient!de;I)V", line = 119)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afs", name = "fq", descriptor = "(Lclient!de;)V", line = 119)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afs", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 122)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method11169(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afs", name = "fv", descriptor = "(Lclient!de;II)Z", line = 122)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method11169(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afs", name = "fy", descriptor = "(Lclient!de;II)Z", line = 122)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_5.method28510(this.anInt1212 * 1227135823).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method11169(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afs", name = "p", descriptor = "(B)I", line = 133)
	@Override
	public int method11163() {
		return this.anInt1212 * 1227135823;
	}

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "()I", line = 133)
	@Override
	public int method11153() {
		return this.anInt1212 * 1227135823;
	}

	@OriginalMember(owner = "client!afs", name = "a", descriptor = "(B)I", line = 137)
	@Override
	public int method11146() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!afs", name = "m", descriptor = "()I", line = 137)
	@Override
	public int method11155() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!afs", name = "v", descriptor = "()I", line = 137)
	@Override
	public int method11164() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!afs", name = "g", descriptor = "(I)I", line = 141)
	@Override
	public int method11147() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!afs", name = "b", descriptor = "()I", line = 141)
	@Override
	public int method11152() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!afs", name = "c", descriptor = "()I", line = 141)
	@Override
	public int method11151() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!afs", name = "z", descriptor = "()V", line = 145)
	@Override
	public void method11162() {
		if (this.aClass20_4 != null) {
			this.aClass20_4.method5328();
		}
	}

	@OriginalMember(owner = "client!afs", name = "n", descriptor = "()V", line = 145)
	@Override
	public void method11158() {
		if (this.aClass20_4 != null) {
			this.aClass20_4.method5328();
		}
	}

	@OriginalMember(owner = "client!afs", name = "j", descriptor = "()V", line = 145)
	@Override
	public void method11157() {
		if (this.aClass20_4 != null) {
			this.aClass20_4.method5328();
		}
	}

	@OriginalMember(owner = "client!afs", name = "l", descriptor = "(B)V", line = 145)
	@Override
	public void method11148() {
		if (this.aClass20_4 != null) {
			this.aClass20_4.method5328();
		}
	}

	@OriginalMember(owner = "client!afs", name = "d", descriptor = "()Z", line = 149)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "r", descriptor = "()Z", line = 149)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "x", descriptor = "(B)Z", line = 149)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!afs", name = "e", descriptor = "()Z", line = 153)
	@Override
	public boolean method11154() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!afs", name = "h", descriptor = "(I)Z", line = 153)
	@Override
	public boolean method11149() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!afs", name = "t", descriptor = "(Lclient!de;)V", line = 157)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_4 == null && this.aBoolean295) {
			@Pc(15) Class576 local15 = this.method11166(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_4;
			this.aClass3_Sub1_Sub3_4 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28191(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afs", name = "s", descriptor = "(Lclient!de;I)V", line = 157)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_4 == null && this.aBoolean295) {
			@Pc(15) Class576 local15 = this.method11166(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_4;
			this.aClass3_Sub1_Sub3_4 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28191(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afs", name = "q", descriptor = "(Lclient!de;)V", line = 171)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_4 == null && this.aBoolean295) {
			@Pc(14) Class576 local14 = this.method11166(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_4;
			this.aClass3_Sub1_Sub3_4 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28084(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afs", name = "u", descriptor = "(Lclient!de;B)V", line = 171)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_4 == null && this.aBoolean295) {
			@Pc(14) Class576 local14 = this.method11166(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_4;
			this.aClass3_Sub1_Sub3_4 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28084(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afs", name = "dl", descriptor = "(II)V", line = 737)
	static void method11174(@OriginalArg(0) int arg0) {
		Class161.anInt3445 = arg0 * 634470607;
		Class58_Sub1.anInt1435 = 1239823265;
		Class58_Sub1.anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!afs", name = "acl", descriptor = "(Lclient!vs;I)V", line = 9098)
	static final void method11173(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class53_Sub6.method11237((long) arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] * 60000L, Class469.aClass530_2.method33765(), true) + " UTC";
	}

	@OriginalMember(owner = "client!afs", name = "adw", descriptor = "(Lclient!vs;S)V", line = 9254)
	static final void method11176(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class498.aClass579_1.method33185(local13).method33043(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class498.aClass579_1.method33185(local13).method33038(local23, local28.anInt5585 * 100041865);
		}
	}
}
