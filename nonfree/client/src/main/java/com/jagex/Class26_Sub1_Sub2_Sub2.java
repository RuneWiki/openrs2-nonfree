package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afr")
public class Class26_Sub1_Sub2_Sub2 extends Class26_Sub1_Sub2 implements Interface43 {

	@OriginalMember(owner = "client!afr", name = "e", descriptor = "Lclient!rc;")
	Class426 aClass426_7;

	@OriginalMember(owner = "client!afr", name = "z", descriptor = "Lclient!sj;")
	Class457 aClass457_4;

	@OriginalMember(owner = "client!afr", name = "r", descriptor = "I")
	final int anInt1210;

	@OriginalMember(owner = "client!afr", name = "q", descriptor = "Z")
	final boolean aBoolean288;

	@OriginalMember(owner = "client!afr", name = "d", descriptor = "B")
	final byte aByte53;

	@OriginalMember(owner = "client!afr", name = "m", descriptor = "Z")
	boolean aBoolean289;

	@OriginalMember(owner = "client!afr", name = "v", descriptor = "Z")
	boolean aBoolean287;

	@OriginalMember(owner = "client!afr", name = "t", descriptor = "Z")
	boolean aBoolean290;

	@OriginalMember(owner = "client!afr", name = "j", descriptor = "Lclient!dh;")
	Class20 aClass20_3;

	@OriginalMember(owner = "client!afr", name = "n", descriptor = "Lclient!amd;")
	Class3_Sub1_Sub3 aClass3_Sub1_Sub3_3;

	@OriginalMember(owner = "client!afr", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIZ)V", line = 37)
	public Class26_Sub1_Sub2_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5112 * 404164357);
		this.aClass457_4 = arg2;
		this.anInt1210 = arg3.anInt5092 * 1041406705;
		this.aBoolean288 = arg9;
		this.aByte53 = (byte) arg10;
		this.aBoolean289 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.aBoolean287 = arg11;
		this.aBoolean290 = arg1.method17409() && arg3.aBoolean789 && !this.aBoolean288 && Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean287) {
			local63 |= 0x10000;
		}
		if (arg3.aBoolean786) {
			local63 |= 0x80000;
		}
		@Pc(85) Class576 local85 = this.method11042(arg1, local63, this.aBoolean290);
		if (local85 != null) {
			this.aClass20_3 = (Class20) local85.anObject27;
			this.aClass3_Sub1_Sub3_3 = (Class3_Sub1_Sub3) local85.anObject26;
			if (this.aBoolean287 || arg3.aBoolean786) {
				this.aClass20_3 = this.aClass20_3.method5430((byte) 0, local63, false);
				if (arg3.aBoolean786) {
					@Pc(119) Class368 local119 = client.aClass370_1.method27042();
					this.aClass20_3.method5373(local119.anInt4661 * -2109747821, local119.anInt4659 * -1459113035, local119.anInt4660 * 1674686799, local119.anInt4658 * -975644687);
				}
			}
		}
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afr", name = "cp", descriptor = "()Z", line = 64)
	@Override
	boolean method21501() {
		if (this.aClass20_3 == null) {
			return true;
		} else {
			return !this.aClass20_3.method5376();
		}
	}

	@OriginalMember(owner = "client!afr", name = "cc", descriptor = "()Z", line = 64)
	@Override
	boolean method21491() {
		if (this.aClass20_3 == null) {
			return true;
		} else {
			return !this.aClass20_3.method5376();
		}
	}

	@OriginalMember(owner = "client!afr", name = "bs", descriptor = "(B)Z", line = 64)
	@Override
	boolean method21472() {
		if (this.aClass20_3 == null) {
			return true;
		} else {
			return !this.aClass20_3.method5376();
		}
	}

	@OriginalMember(owner = "client!afr", name = "bm", descriptor = "(I)Z", line = 69)
	@Override
	boolean method21467() {
		return this.aClass20_3 == null ? false : this.aClass20_3.method5375();
	}

	@OriginalMember(owner = "client!afr", name = "cs", descriptor = "()Z", line = 69)
	@Override
	boolean method21483() {
		return this.aClass20_3 == null ? false : this.aClass20_3.method5375();
	}

	@OriginalMember(owner = "client!afr", name = "ct", descriptor = "()Z", line = 69)
	@Override
	boolean method21484() {
		return this.aClass20_3 == null ? false : this.aClass20_3.method5375();
	}

	@OriginalMember(owner = "client!afr", name = "cx", descriptor = "()Z", line = 69)
	@Override
	boolean method21468() {
		return this.aClass20_3 == null ? false : this.aClass20_3.method5375();
	}

	@OriginalMember(owner = "client!afr", name = "bd", descriptor = "(I)I", line = 74)
	@Override
	public int method21508() {
		return this.aClass20_3 == null ? 0 : this.aClass20_3.method5466();
	}

	@OriginalMember(owner = "client!afr", name = "cb", descriptor = "()I", line = 74)
	@Override
	public int method21487() {
		return this.aClass20_3 == null ? 0 : this.aClass20_3.method5466();
	}

	@OriginalMember(owner = "client!afr", name = "cy", descriptor = "()I", line = 74)
	@Override
	public int method21527() {
		return this.aClass20_3 == null ? 0 : this.aClass20_3.method5466();
	}

	@OriginalMember(owner = "client!afr", name = "bf", descriptor = "(Lclient!de;IB)Lclient!dh;", line = 78)
	Class20 method11041(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_3 != null && arg0.method17117(this.aClass20_3.method5327(), arg1) == 0) {
			return this.aClass20_3;
		} else {
			@Pc(20) Class576 local20 = this.method11042(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afr", name = "bk", descriptor = "(Lclient!de;I)Lclient!dh;", line = 78)
	Class20 method11043(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_3 != null && arg0.method17117(this.aClass20_3.method5327(), arg1) == 0) {
			return this.aClass20_3;
		} else {
			@Pc(20) Class576 local20 = this.method11042(arg0, arg1, false);
			return local20 == null ? null : (Class20) local20.anObject27;
		}
	}

	@OriginalMember(owner = "client!afr", name = "bt", descriptor = "(Lclient!de;IZI)Lclient!xi;", line = 85)
	Class576 method11042(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_4.method28510(this.anInt1210 * -1610493469);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean288) {
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
		return local8.method28679(arg0, arg1, Class456.aClass456_23.anInt5061 * 821735799, this.aByte53, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afr", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 102)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_7 == null) {
			this.aClass426_7 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11041(arg0, 0));
		}
		return this.aClass426_7;
	}

	@OriginalMember(owner = "client!afr", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 102)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_7 == null) {
			this.aClass426_7 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11041(arg0, 0));
		}
		return this.aClass426_7;
	}

	@OriginalMember(owner = "client!afr", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 102)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_7 == null) {
			this.aClass426_7 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method11041(arg0, 0));
		}
		return this.aClass426_7;
	}

	@OriginalMember(owner = "client!afr", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 108)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean289);
		@Pc(23) Class323 local23 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local23 == null) {
			this.aClass20_3.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_3.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afr", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 108)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean289);
		@Pc(23) Class323 local23 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local23 == null) {
			this.aClass20_3.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_3.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afr", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 108)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean289);
		@Pc(23) Class323 local23 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local23 == null) {
			this.aClass20_3.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_3.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afr", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 108)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean289);
		@Pc(23) Class323 local23 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local23 == null) {
			this.aClass20_3.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_3.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afr", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 108)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean289);
		@Pc(23) Class323 local23 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local23 == null) {
			this.aClass20_3.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_3.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afr", name = "fx", descriptor = "(Lclient!de;I)V", line = 120)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afr", name = "fq", descriptor = "(Lclient!de;)V", line = 120)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afr", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 123)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(27) Class20 local27 = this.method11041(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local27.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afr", name = "fv", descriptor = "(Lclient!de;II)Z", line = 123)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(27) Class20 local27 = this.method11041(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local27.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afr", name = "fy", descriptor = "(Lclient!de;II)Z", line = 123)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_4.method28510(this.anInt1210 * -1610493469).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(27) Class20 local27 = this.method11041(arg0, 131072);
		if (local27 == null) {
			return false;
		} else {
			@Pc(32) Class332 local32 = this.method21433();
			return local27.method5417(arg1, arg2, local32, false, 0);
		}
	}

	@OriginalMember(owner = "client!afr", name = "fw", descriptor = "()Z", line = 134)
	@Override
	boolean method21495() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!afr", name = "fu", descriptor = "(B)Z", line = 134)
	@Override
	boolean method21465() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!afr", name = "fe", descriptor = "()Z", line = 134)
	@Override
	boolean method21503() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!afr", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 138)
	@Override
	void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub2_Sub2) {
			@Pc(5) Class26_Sub1_Sub2_Sub2 local5 = (Class26_Sub1_Sub2_Sub2) arg1;
			if (this.aClass20_3 != null && local5.aClass20_3 != null) {
				this.aClass20_3.method5380(local5.aClass20_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afr", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 138)
	@Override
	void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub2_Sub2) {
			@Pc(5) Class26_Sub1_Sub2_Sub2 local5 = (Class26_Sub1_Sub2_Sub2) arg1;
			if (this.aClass20_3 != null && local5.aClass20_3 != null) {
				this.aClass20_3.method5380(local5.aClass20_3, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afr", name = "fo", descriptor = "()V", line = 145)
	@Override
	void method21481() {
		this.aBoolean287 = false;
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5326(this.aClass20_3.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afr", name = "fb", descriptor = "(I)V", line = 145)
	@Override
	void method21469() {
		this.aBoolean287 = false;
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5326(this.aClass20_3.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afr", name = "fl", descriptor = "()V", line = 145)
	@Override
	void method21497() {
		this.aBoolean287 = false;
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5326(this.aClass20_3.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afr", name = "y", descriptor = "()I", line = 150)
	@Override
	public int method11153() {
		return this.anInt1210 * -1610493469;
	}

	@OriginalMember(owner = "client!afr", name = "p", descriptor = "(B)I", line = 150)
	@Override
	public int method11163() {
		return this.anInt1210 * -1610493469;
	}

	@OriginalMember(owner = "client!afr", name = "a", descriptor = "(B)I", line = 154)
	@Override
	public int method11146() {
		return Class456.aClass456_23.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!afr", name = "m", descriptor = "()I", line = 154)
	@Override
	public int method11155() {
		return Class456.aClass456_23.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!afr", name = "v", descriptor = "()I", line = 154)
	@Override
	public int method11164() {
		return Class456.aClass456_23.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!afr", name = "g", descriptor = "(I)I", line = 158)
	@Override
	public int method11147() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!afr", name = "c", descriptor = "()I", line = 158)
	@Override
	public int method11151() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!afr", name = "b", descriptor = "()I", line = 158)
	@Override
	public int method11152() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!afr", name = "j", descriptor = "()V", line = 162)
	@Override
	public void method11157() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5328();
		}
	}

	@OriginalMember(owner = "client!afr", name = "l", descriptor = "(B)V", line = 162)
	@Override
	public void method11148() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5328();
		}
	}

	@OriginalMember(owner = "client!afr", name = "z", descriptor = "()V", line = 162)
	@Override
	public void method11162() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5328();
		}
	}

	@OriginalMember(owner = "client!afr", name = "n", descriptor = "()V", line = 162)
	@Override
	public void method11158() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method5328();
		}
	}

	@OriginalMember(owner = "client!afr", name = "x", descriptor = "(B)Z", line = 166)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!afr", name = "d", descriptor = "()Z", line = 166)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!afr", name = "r", descriptor = "()Z", line = 166)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!afr", name = "h", descriptor = "(I)Z", line = 170)
	@Override
	public boolean method11149() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!afr", name = "e", descriptor = "()Z", line = 170)
	@Override
	public boolean method11154() {
		return this.aBoolean290;
	}

	@OriginalMember(owner = "client!afr", name = "s", descriptor = "(Lclient!de;I)V", line = 174)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_3 == null && this.aBoolean290) {
			@Pc(14) Class576 local14 = this.method11042(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_3;
			this.aClass3_Sub1_Sub3_3 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28191(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afr", name = "t", descriptor = "(Lclient!de;)V", line = 174)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_3 == null && this.aBoolean290) {
			@Pc(14) Class576 local14 = this.method11042(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_3;
			this.aClass3_Sub1_Sub3_3 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28191(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afr", name = "u", descriptor = "(Lclient!de;B)V", line = 188)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_3 == null && this.aBoolean290) {
			@Pc(14) Class576 local14 = this.method11042(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_3;
			this.aClass3_Sub1_Sub3_3 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28084(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afr", name = "q", descriptor = "(Lclient!de;)V", line = 188)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		@Pc(22) Class3_Sub1_Sub3 local22;
		if (this.aClass3_Sub1_Sub3_3 == null && this.aBoolean290) {
			@Pc(14) Class576 local14 = this.method11042(arg0, 262144, true);
			local22 = (Class3_Sub1_Sub3) (local14 == null ? null : local14.anObject26);
		} else {
			local22 = this.aClass3_Sub1_Sub3_3;
			this.aClass3_Sub1_Sub3_3 = null;
		}
		@Pc(33) Class320 local33 = this.method21431().aClass320_61;
		if (local22 != null) {
			this.aClass438_23.method28084(local22, this.aByte102, (int) local33.aFloat259, (int) local33.aFloat261, null);
		}
	}
}
