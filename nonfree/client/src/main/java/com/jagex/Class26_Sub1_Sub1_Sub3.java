package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afm")
public class Class26_Sub1_Sub1_Sub3 extends Class26_Sub1_Sub1 implements Interface43 {

	@OriginalMember(owner = "client!afm", name = "e", descriptor = "Lclient!rc;")
	Class426 aClass426_4;

	@OriginalMember(owner = "client!afm", name = "z", descriptor = "Lclient!sj;")
	Class457 aClass457_3;

	@OriginalMember(owner = "client!afm", name = "r", descriptor = "I")
	final int anInt1194;

	@OriginalMember(owner = "client!afm", name = "m", descriptor = "Z")
	final boolean aBoolean263;

	@OriginalMember(owner = "client!afm", name = "d", descriptor = "B")
	final byte aByte43;

	@OriginalMember(owner = "client!afm", name = "q", descriptor = "B")
	final byte aByte44;

	@OriginalMember(owner = "client!afm", name = "v", descriptor = "Z")
	boolean aBoolean264;

	@OriginalMember(owner = "client!afm", name = "t", descriptor = "Z")
	boolean aBoolean262;

	@OriginalMember(owner = "client!afm", name = "w", descriptor = "Z")
	boolean aBoolean261;

	@OriginalMember(owner = "client!afm", name = "o", descriptor = "Z")
	final boolean aBoolean265;

	@OriginalMember(owner = "client!afm", name = "j", descriptor = "Lclient!dh;")
	Class20 aClass20_2;

	@OriginalMember(owner = "client!afm", name = "n", descriptor = "Lclient!amd;")
	Class3_Sub1_Sub3 aClass3_Sub1_Sub3_2;

	@OriginalMember(owner = "client!afm", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIIIIIZZ)V", line = 39)
	public Class26_Sub1_Sub1_Sub3(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) boolean arg17) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5087 * 2055542599 == 1, Class552.method32700(arg14, arg15));
		this.aClass457_3 = arg2;
		this.anInt1194 = arg3.anInt5092 * 2086983207;
		this.aByte102 = (byte) arg5;
		this.aBoolean263 = arg9;
		this.aByte43 = (byte) arg14;
		this.aByte44 = (byte) arg15;
		this.aBoolean264 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.aBoolean262 = arg16;
		this.aBoolean261 = arg1.method17409() && arg3.aBoolean789 && !this.aBoolean263 && Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		this.aBoolean265 = arg17;
		@Pc(88) int local88 = 2048;
		if (this.aBoolean262) {
			local88 |= 0x10000;
		}
		if (arg3.aBoolean786) {
			local88 |= 0x80000;
		}
		@Pc(110) Class576 local110 = this.method10453(arg1, local88, this.aBoolean261);
		if (local110 != null) {
			this.aClass20_2 = (Class20) local110.anObject27;
			this.aClass3_Sub1_Sub3_2 = (Class3_Sub1_Sub3) local110.anObject26;
			if (this.aBoolean262 || arg3.aBoolean786) {
				this.aClass20_2 = this.aClass20_2.method5430((byte) 0, local88, false);
				if (arg3.aBoolean786) {
					@Pc(144) Class368 local144 = client.aClass370_1.method27042();
					this.aClass20_2.method5373(local144.anInt4661 * -2109747821, local144.anInt4659 * -1459113035, local144.anInt4660 * 1674686799, local144.anInt4658 * -975644687);
				}
			}
		}
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afm", name = "bs", descriptor = "(B)Z", line = 69)
	@Override
	boolean method21472() {
		if (this.aClass20_2 == null) {
			return true;
		} else {
			return !this.aClass20_2.method5376();
		}
	}

	@OriginalMember(owner = "client!afm", name = "cc", descriptor = "()Z", line = 69)
	@Override
	boolean method21491() {
		if (this.aClass20_2 == null) {
			return true;
		} else {
			return !this.aClass20_2.method5376();
		}
	}

	@OriginalMember(owner = "client!afm", name = "cp", descriptor = "()Z", line = 69)
	@Override
	boolean method21501() {
		if (this.aClass20_2 == null) {
			return true;
		} else {
			return !this.aClass20_2.method5376();
		}
	}

	@OriginalMember(owner = "client!afm", name = "cx", descriptor = "()Z", line = 74)
	@Override
	boolean method21468() {
		return this.aClass20_2 == null ? false : this.aClass20_2.method5375();
	}

	@OriginalMember(owner = "client!afm", name = "bm", descriptor = "(I)Z", line = 74)
	@Override
	boolean method21467() {
		return this.aClass20_2 == null ? false : this.aClass20_2.method5375();
	}

	@OriginalMember(owner = "client!afm", name = "cs", descriptor = "()Z", line = 74)
	@Override
	boolean method21483() {
		return this.aClass20_2 == null ? false : this.aClass20_2.method5375();
	}

	@OriginalMember(owner = "client!afm", name = "ct", descriptor = "()Z", line = 74)
	@Override
	boolean method21484() {
		return this.aClass20_2 == null ? false : this.aClass20_2.method5375();
	}

	@OriginalMember(owner = "client!afm", name = "br", descriptor = "(II)B", line = 79)
	static byte method10449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "by", descriptor = "(II)B", line = 79)
	static byte method10452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bl", descriptor = "(II)B", line = 79)
	static byte method10455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bd", descriptor = "(I)I", line = 85)
	@Override
	public int method21508() {
		return this.aClass20_2 == null ? 0 : this.aClass20_2.method5466();
	}

	@OriginalMember(owner = "client!afm", name = "cb", descriptor = "()I", line = 85)
	@Override
	public int method21487() {
		return this.aClass20_2 == null ? 0 : this.aClass20_2.method5466();
	}

	@OriginalMember(owner = "client!afm", name = "cy", descriptor = "()I", line = 85)
	@Override
	public int method21527() {
		return this.aClass20_2 == null ? 0 : this.aClass20_2.method5466();
	}

	@OriginalMember(owner = "client!afm", name = "bt", descriptor = "(Lclient!de;II)Lclient!dh;", line = 89)
	Class20 method10448(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_2 != null && arg0.method17117(this.aClass20_2.method5327(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(20) Class576 local20 = this.method10453(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afm", name = "ba", descriptor = "(Lclient!de;I)Lclient!dh;", line = 89)
	Class20 method10451(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_2 != null && arg0.method17117(this.aClass20_2.method5327(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(20) Class576 local20 = this.method10453(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bc", descriptor = "(Lclient!de;I)Lclient!dh;", line = 89)
	Class20 method10454(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_2 != null && arg0.method17117(this.aClass20_2.method5327(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(20) Class576 local20 = this.method10453(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bu", descriptor = "(Lclient!de;I)Lclient!dh;", line = 89)
	Class20 method10456(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_2 != null && arg0.method17117(this.aClass20_2.method5327(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(20) Class576 local20 = this.method10453(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bo", descriptor = "(Lclient!de;I)Lclient!dh;", line = 89)
	Class20 method10457(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_2 != null && arg0.method17117(this.aClass20_2.method5327(), arg1) == 0) {
			return this.aClass20_2;
		} else {
			@Pc(20) Class576 local20 = this.method10453(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afm", name = "bk", descriptor = "(Lclient!de;IZI)Lclient!xi;", line = 96)
	Class576 method10453(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_3.method28510(this.anInt1194 * 1750958229);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean263) {
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
		return local8.method28679(arg0, arg1, Class456.aClass456_22.anInt5061 * 821735799 == this.aByte43 ? Class456.aClass456_21.anInt5061 * 821735799 : this.aByte43, this.aByte43 == Class456.aClass456_22.anInt5061 * 821735799 ? this.aByte44 + 4 : this.aByte44, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afm", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 113)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_4 == null) {
			this.aClass426_4 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10448(arg0, 0));
		}
		return this.aClass426_4;
	}

	@OriginalMember(owner = "client!afm", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 113)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_4 == null) {
			this.aClass426_4 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10448(arg0, 0));
		}
		return this.aClass426_4;
	}

	@OriginalMember(owner = "client!afm", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 113)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_4 == null) {
			this.aClass426_4 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10448(arg0, 0));
		}
		return this.aClass426_4;
	}

	@OriginalMember(owner = "client!afm", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 119)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = this.method21433();
		@Pc(12) Class446 local12 = Class508.method29569(this.aBoolean264);
		@Pc(22) Class323 local22 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local22 == null) {
			this.aClass20_2.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_2.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local22);
		}
		return local12;
	}

	@OriginalMember(owner = "client!afm", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 119)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = this.method21433();
		@Pc(12) Class446 local12 = Class508.method29569(this.aBoolean264);
		@Pc(22) Class323 local22 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local22 == null) {
			this.aClass20_2.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_2.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local22);
		}
		return local12;
	}

	@OriginalMember(owner = "client!afm", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 119)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = this.method21433();
		@Pc(12) Class446 local12 = Class508.method29569(this.aBoolean264);
		@Pc(22) Class323 local22 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local22 == null) {
			this.aClass20_2.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_2.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local22);
		}
		return local12;
	}

	@OriginalMember(owner = "client!afm", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 119)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = this.method21433();
		@Pc(12) Class446 local12 = Class508.method29569(this.aBoolean264);
		@Pc(22) Class323 local22 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local22 == null) {
			this.aClass20_2.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_2.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local22);
		}
		return local12;
	}

	@OriginalMember(owner = "client!afm", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 119)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_2 == null) {
			return null;
		}
		@Pc(7) Class332 local7 = this.method21433();
		@Pc(12) Class446 local12 = Class508.method29569(this.aBoolean264);
		@Pc(22) Class323 local22 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local22 == null) {
			this.aClass20_2.method5352(local7, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_2.method5352(local7, null, 0);
			arg0.method17082(local7, this.aClass136Array21[0], local22);
		}
		return local12;
	}

	@OriginalMember(owner = "client!afm", name = "fx", descriptor = "(Lclient!de;I)V", line = 131)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "fq", descriptor = "(Lclient!de;)V", line = 131)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afm", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 134)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10448(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local26.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fv", descriptor = "(Lclient!de;II)Z", line = 134)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10448(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local26.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fy", descriptor = "(Lclient!de;II)Z", line = 134)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_3.method28510(this.anInt1194 * 1750958229).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10448(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local26.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fu", descriptor = "(B)Z", line = 145)
	@Override
	boolean method21465() {
		return this.aBoolean262;
	}

	@OriginalMember(owner = "client!afm", name = "fw", descriptor = "()Z", line = 145)
	@Override
	boolean method21495() {
		return this.aBoolean262;
	}

	@OriginalMember(owner = "client!afm", name = "fe", descriptor = "()Z", line = 145)
	@Override
	boolean method21503() {
		return this.aBoolean262;
	}

	@OriginalMember(owner = "client!afm", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 149)
	@Override
	void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub3_Sub1) {
			@Pc(5) Class26_Sub1_Sub3_Sub1 local5 = (Class26_Sub1_Sub3_Sub1) arg1;
			if (this.aClass20_2 != null && local5.aClass20_1 != null) {
				this.aClass20_2.method5380(local5.aClass20_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class26_Sub1_Sub1_Sub3) {
			@Pc(27) Class26_Sub1_Sub1_Sub3 local27 = (Class26_Sub1_Sub1_Sub3) arg1;
			if (this.aClass20_2 != null && local27.aClass20_2 != null) {
				this.aClass20_2.method5380(local27.aClass20_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 149)
	@Override
	void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub3_Sub1) {
			@Pc(5) Class26_Sub1_Sub3_Sub1 local5 = (Class26_Sub1_Sub3_Sub1) arg1;
			if (this.aClass20_2 != null && local5.aClass20_1 != null) {
				this.aClass20_2.method5380(local5.aClass20_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class26_Sub1_Sub1_Sub3) {
			@Pc(27) Class26_Sub1_Sub1_Sub3 local27 = (Class26_Sub1_Sub1_Sub3) arg1;
			if (this.aClass20_2 != null && local27.aClass20_2 != null) {
				this.aClass20_2.method5380(local27.aClass20_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afm", name = "fb", descriptor = "(I)V", line = 160)
	@Override
	void method21469() {
		this.aBoolean262 = false;
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5326(this.aClass20_2.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fo", descriptor = "()V", line = 160)
	@Override
	void method21481() {
		this.aBoolean262 = false;
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5326(this.aClass20_2.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afm", name = "fl", descriptor = "()V", line = 160)
	@Override
	void method21497() {
		this.aBoolean262 = false;
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5326(this.aClass20_2.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afm", name = "p", descriptor = "(B)I", line = 165)
	@Override
	public int method11163() {
		return this.anInt1194 * 1750958229;
	}

	@OriginalMember(owner = "client!afm", name = "y", descriptor = "()I", line = 165)
	@Override
	public int method11153() {
		return this.anInt1194 * 1750958229;
	}

	@OriginalMember(owner = "client!afm", name = "a", descriptor = "(B)I", line = 169)
	@Override
	public int method11146() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!afm", name = "v", descriptor = "()I", line = 169)
	@Override
	public int method11164() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!afm", name = "m", descriptor = "()I", line = 169)
	@Override
	public int method11155() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!afm", name = "b", descriptor = "()I", line = 173)
	@Override
	public int method11152() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!afm", name = "c", descriptor = "()I", line = 173)
	@Override
	public int method11151() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!afm", name = "g", descriptor = "(I)I", line = 173)
	@Override
	public int method11147() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!afm", name = "l", descriptor = "(B)V", line = 177)
	@Override
	public void method11148() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5328();
		}
	}

	@OriginalMember(owner = "client!afm", name = "z", descriptor = "()V", line = 177)
	@Override
	public void method11162() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5328();
		}
	}

	@OriginalMember(owner = "client!afm", name = "j", descriptor = "()V", line = 177)
	@Override
	public void method11157() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5328();
		}
	}

	@OriginalMember(owner = "client!afm", name = "n", descriptor = "()V", line = 177)
	@Override
	public void method11158() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method5328();
		}
	}

	@OriginalMember(owner = "client!afm", name = "r", descriptor = "()Z", line = 181)
	@Override
	public boolean method11160() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!afm", name = "x", descriptor = "(B)Z", line = 181)
	@Override
	public boolean method11150() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!afm", name = "d", descriptor = "()Z", line = 181)
	@Override
	public boolean method11161() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!afm", name = "h", descriptor = "(I)Z", line = 185)
	@Override
	public boolean method11149() {
		return this.aBoolean261;
	}

	@OriginalMember(owner = "client!afm", name = "e", descriptor = "()Z", line = 185)
	@Override
	public boolean method11154() {
		return this.aBoolean261;
	}

	@OriginalMember(owner = "client!afm", name = "s", descriptor = "(Lclient!de;I)V", line = 189)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_2 == null && this.aBoolean261) {
			@Pc(14) Class576 local14 = this.method10453(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_2;
			this.aClass3_Sub1_Sub3_2 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28191(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afm", name = "t", descriptor = "(Lclient!de;)V", line = 189)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_2 == null && this.aBoolean261) {
			@Pc(14) Class576 local14 = this.method10453(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_2;
			this.aClass3_Sub1_Sub3_2 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28191(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afm", name = "u", descriptor = "(Lclient!de;B)V", line = 203)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_2 == null && this.aBoolean261) {
			@Pc(15) Class576 local15 = this.method10453(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_2;
			this.aClass3_Sub1_Sub3_2 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28084(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afm", name = "q", descriptor = "(Lclient!de;)V", line = 203)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		@Pc(23) Class3_Sub1_Sub3 local23;
		if (this.aClass3_Sub1_Sub3_2 == null && this.aBoolean261) {
			@Pc(15) Class576 local15 = this.method10453(arg0, 262144, true);
			local23 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local23 = this.aClass3_Sub1_Sub3_2;
			this.aClass3_Sub1_Sub3_2 = null;
		}
		@Pc(34) Class320 local34 = this.method21431().aClass320_61;
		if (local23 != null) {
			this.aClass438_23.method28084(local23, this.aByte102, (int) local34.aFloat259, (int) local34.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afm", name = "bg", descriptor = "(I)I", line = 217)
	public int method10450() {
		return this.aClass20_2 == null ? 15 : this.aClass20_2.method5355() / 4;
	}

	@OriginalMember(owner = "client!afm", name = "bn", descriptor = "()I", line = 217)
	public int method10458() {
		return this.aClass20_2 == null ? 15 : this.aClass20_2.method5355() / 4;
	}

	@OriginalMember(owner = "client!afm", name = "aob", descriptor = "(Lclient!vs;B)V", line = 11551)
	static final void method10459(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13717() == 2 ? 1 : 0;
	}
}
