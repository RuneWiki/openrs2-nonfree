package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afd")
public class Class26_Sub1_Sub3_Sub1 extends Class26_Sub1_Sub3 implements Interface43 {

	@OriginalMember(owner = "client!afd", name = "z", descriptor = "[I")
	static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!afd", name = "j", descriptor = "[I")
	static final int[] anIntArray172 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!afd", name = "d", descriptor = "Lclient!rc;")
	Class426 aClass426_3;

	@OriginalMember(owner = "client!afd", name = "n", descriptor = "Lclient!sj;")
	Class457 aClass457_2;

	@OriginalMember(owner = "client!afd", name = "q", descriptor = "I")
	final int anInt1155;

	@OriginalMember(owner = "client!afd", name = "t", descriptor = "Z")
	final boolean aBoolean252;

	@OriginalMember(owner = "client!afd", name = "v", descriptor = "B")
	final byte aByte39;

	@OriginalMember(owner = "client!afd", name = "m", descriptor = "B")
	final byte aByte38;

	@OriginalMember(owner = "client!afd", name = "w", descriptor = "Z")
	boolean aBoolean250;

	@OriginalMember(owner = "client!afd", name = "o", descriptor = "Z")
	boolean aBoolean251;

	@OriginalMember(owner = "client!afd", name = "i", descriptor = "Z")
	boolean aBoolean249;

	@OriginalMember(owner = "client!afd", name = "e", descriptor = "Lclient!dh;")
	Class20 aClass20_1;

	@OriginalMember(owner = "client!afd", name = "r", descriptor = "Lclient!amd;")
	Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!afd", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIZ)V", line = 40)
	public Class26_Sub1_Sub3_Sub1(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class228.method24521(arg10, arg11));
		this.aClass457_2 = arg2;
		this.anInt1155 = arg3.anInt5092 * -298922813;
		this.aBoolean252 = arg9;
		this.aByte39 = (byte) arg10;
		this.aByte38 = (byte) arg11;
		this.aBoolean250 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.aBoolean251 = arg12;
		this.aBoolean249 = arg1.method17409() && arg3.aBoolean789 && !this.aBoolean252 && Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280() != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean251) {
			local68 |= 0x10000;
		}
		if (arg3.aBoolean786) {
			local68 |= 0x80000;
		}
		@Pc(90) Class576 local90 = this.method10200(arg1, local68, this.aBoolean249);
		if (local90 != null) {
			this.aClass20_1 = (Class20) local90.anObject27;
			this.aClass3_Sub1_Sub3_1 = (Class3_Sub1_Sub3) local90.anObject26;
			if (this.aBoolean251 || arg3.aBoolean786) {
				this.aClass20_1 = this.aClass20_1.method5430((byte) 0, local68, false);
				if (arg3.aBoolean786) {
					@Pc(123) Class368 local123 = client.aClass370_1.method27042();
					this.aClass20_1.method5373(local123.anInt4661 * -2109747821, local123.anInt4659 * -1459113035, local123.anInt4660 * 1674686799, local123.anInt4658 * -975644687);
				}
			}
		}
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afd", name = "bs", descriptor = "(B)Z", line = 68)
	@Override
	boolean method21472() {
		if (this.aClass20_1 == null) {
			return true;
		} else {
			return !this.aClass20_1.method5376();
		}
	}

	@OriginalMember(owner = "client!afd", name = "cp", descriptor = "()Z", line = 68)
	@Override
	boolean method21501() {
		if (this.aClass20_1 == null) {
			return true;
		} else {
			return !this.aClass20_1.method5376();
		}
	}

	@OriginalMember(owner = "client!afd", name = "cc", descriptor = "()Z", line = 68)
	@Override
	boolean method21491() {
		if (this.aClass20_1 == null) {
			return true;
		} else {
			return !this.aClass20_1.method5376();
		}
	}

	@OriginalMember(owner = "client!afd", name = "cs", descriptor = "()Z", line = 73)
	@Override
	boolean method21483() {
		return this.aClass20_1 == null ? false : this.aClass20_1.method5375();
	}

	@OriginalMember(owner = "client!afd", name = "cx", descriptor = "()Z", line = 73)
	@Override
	boolean method21468() {
		return this.aClass20_1 == null ? false : this.aClass20_1.method5375();
	}

	@OriginalMember(owner = "client!afd", name = "ct", descriptor = "()Z", line = 73)
	@Override
	boolean method21484() {
		return this.aClass20_1 == null ? false : this.aClass20_1.method5375();
	}

	@OriginalMember(owner = "client!afd", name = "bm", descriptor = "(I)Z", line = 73)
	@Override
	boolean method21467() {
		return this.aClass20_1 == null ? false : this.aClass20_1.method5375();
	}

	@OriginalMember(owner = "client!afd", name = "bd", descriptor = "(I)I", line = 78)
	@Override
	public int method21508() {
		return this.aClass20_1 == null ? 0 : this.aClass20_1.method5466();
	}

	@OriginalMember(owner = "client!afd", name = "cy", descriptor = "()I", line = 78)
	@Override
	public int method21527() {
		return this.aClass20_1 == null ? 0 : this.aClass20_1.method5466();
	}

	@OriginalMember(owner = "client!afd", name = "cb", descriptor = "()I", line = 78)
	@Override
	public int method21487() {
		return this.aClass20_1 == null ? 0 : this.aClass20_1.method5466();
	}

	@OriginalMember(owner = "client!afd", name = "by", descriptor = "(II)I", line = 82)
	static int method10199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class456.aClass456_5.anInt5061 * 821735799 || arg0 == Class456.aClass456_14.anInt5061 * 821735799 ? anIntArray172[arg1 & 0x3] : anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!afd", name = "bg", descriptor = "(II)I", line = 82)
	static int method10205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class456.aClass456_5.anInt5061 * 821735799 || arg0 == Class456.aClass456_14.anInt5061 * 821735799 ? anIntArray172[arg1 & 0x3] : anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!afd", name = "br", descriptor = "(II)I", line = 82)
	static int method10206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class456.aClass456_5.anInt5061 * 821735799 || arg0 == Class456.aClass456_14.anInt5061 * 821735799 ? anIntArray172[arg1 & 0x3] : anIntArray171[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!afd", name = "bl", descriptor = "(Lclient!de;I)Lclient!dh;", line = 87)
	Class20 method10202(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_1 != null && arg0.method17117(this.aClass20_1.method5327(), arg1) == 0) {
			return this.aClass20_1;
		} else {
			@Pc(19) Class576 local19 = this.method10200(arg0, arg1, false);
			return local19 == null ? null : (Class20) local19.anObject27;
		}
	}

	@OriginalMember(owner = "client!afd", name = "bt", descriptor = "(Lclient!de;II)Lclient!dh;", line = 87)
	Class20 method10204(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_1 != null && arg0.method17117(this.aClass20_1.method5327(), arg1) == 0) {
			return this.aClass20_1;
		} else {
			@Pc(19) Class576 local19 = this.method10200(arg0, arg1, false);
			return local19 == null ? null : (Class20) local19.anObject27;
		}
	}

	@OriginalMember(owner = "client!afd", name = "bi", descriptor = "(Lclient!de;I)Lclient!dh;", line = 87)
	Class20 method10208(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_1 != null && arg0.method17117(this.aClass20_1.method5327(), arg1) == 0) {
			return this.aClass20_1;
		} else {
			@Pc(19) Class576 local19 = this.method10200(arg0, arg1, false);
			return local19 == null ? null : (Class20) local19.anObject27;
		}
	}

	@OriginalMember(owner = "client!afd", name = "bu", descriptor = "(Lclient!de;I)Lclient!dh;", line = 87)
	Class20 method10209(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_1 != null && arg0.method17117(this.aClass20_1.method5327(), arg1) == 0) {
			return this.aClass20_1;
		} else {
			@Pc(19) Class576 local19 = this.method10200(arg0, arg1, false);
			return local19 == null ? null : (Class20) local19.anObject27;
		}
	}

	@OriginalMember(owner = "client!afd", name = "ba", descriptor = "(Lclient!de;I)Lclient!dh;", line = 87)
	Class20 method10210(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_1 != null && arg0.method17117(this.aClass20_1.method5327(), arg1) == 0) {
			return this.aClass20_1;
		} else {
			@Pc(19) Class576 local19 = this.method10200(arg0, arg1, false);
			return local19 == null ? null : (Class20) local19.anObject27;
		}
	}

	@OriginalMember(owner = "client!afd", name = "bk", descriptor = "(Lclient!de;IZI)Lclient!xi;", line = 94)
	Class576 method10200(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "bc", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 94)
	Class576 method10201(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "bo", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 94)
	Class576 method10203(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "be", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 94)
	Class576 method10207(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "bn", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 94)
	Class576 method10211(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "bx", descriptor = "(Lclient!de;IZ)Lclient!xi;", line = 94)
	Class576 method10212(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class467 local8 = this.aClass457_2.method28510(this.anInt1155 * 327453009);
		@Pc(18) Class17 local18;
		@Pc(24) Class17 local24;
		if (this.aBoolean252) {
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
		return local8.method28679(arg0, arg1, this.aByte39, this.aByte38, local18, local24, (int) local52.aFloat259, (int) local52.aFloat260, (int) local52.aFloat261, arg2, null);
	}

	@OriginalMember(owner = "client!afd", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 111)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_3 == null) {
			this.aClass426_3 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10204(arg0, 0));
		}
		return this.aClass426_3;
	}

	@OriginalMember(owner = "client!afd", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 111)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_3 == null) {
			this.aClass426_3 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10204(arg0, 0));
		}
		return this.aClass426_3;
	}

	@OriginalMember(owner = "client!afd", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 111)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class320 local3 = this.method21431().aClass320_61;
		if (this.aClass426_3 == null) {
			this.aClass426_3 = Class445.method28337((int) local3.aFloat259, (int) local3.aFloat260, (int) local3.aFloat261, this.method10204(arg0, 0));
		}
		return this.aClass426_3;
	}

	@OriginalMember(owner = "client!afd", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 117)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_1 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean250);
		@Pc(23) Class323 local23 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local23 == null) {
			this.aClass20_1.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_1.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afd", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 117)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_1 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean250);
		@Pc(23) Class323 local23 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local23 == null) {
			this.aClass20_1.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_1.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afd", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 117)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_1 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean250);
		@Pc(23) Class323 local23 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local23 == null) {
			this.aClass20_1.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_1.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afd", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 117)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_1 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean250);
		@Pc(23) Class323 local23 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local23 == null) {
			this.aClass20_1.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_1.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afd", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 117)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass20_1 == null) {
			return null;
		}
		@Pc(8) Class332 local8 = this.method21433();
		@Pc(13) Class446 local13 = Class508.method29569(this.aBoolean250);
		@Pc(23) Class323 local23 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local23 == null) {
			this.aClass20_1.method5352(local8, this.aClass136Array21[0], 0);
		} else {
			this.aClass20_1.method5352(local8, null, 0);
			arg0.method17082(local8, this.aClass136Array21[0], local23);
		}
		return local13;
	}

	@OriginalMember(owner = "client!afd", name = "fx", descriptor = "(Lclient!de;I)V", line = 129)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afd", name = "fq", descriptor = "(Lclient!de;)V", line = 129)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!afd", name = "fv", descriptor = "(Lclient!de;II)Z", line = 132)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10204(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afd", name = "fy", descriptor = "(Lclient!de;II)Z", line = 132)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10204(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afd", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 132)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class323 local9 = this.aClass457_2.method28510(this.anInt1155 * 327453009).aClass323_1;
		if (local9 != null) {
			return arg0.method17080(arg1, arg2, this.method21433(), local9);
		}
		@Pc(26) Class20 local26 = this.method10204(arg0, 131072);
		if (local26 == null) {
			return false;
		} else {
			@Pc(31) Class332 local31 = this.method21433();
			return local26.method5417(arg1, arg2, local31, false, 0);
		}
	}

	@OriginalMember(owner = "client!afd", name = "fe", descriptor = "()Z", line = 143)
	@Override
	boolean method21503() {
		return this.aBoolean251;
	}

	@OriginalMember(owner = "client!afd", name = "fu", descriptor = "(B)Z", line = 143)
	@Override
	boolean method21465() {
		return this.aBoolean251;
	}

	@OriginalMember(owner = "client!afd", name = "fw", descriptor = "()Z", line = 143)
	@Override
	boolean method21495() {
		return this.aBoolean251;
	}

	@OriginalMember(owner = "client!afd", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 147)
	@Override
	void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub3_Sub1) {
			@Pc(5) Class26_Sub1_Sub3_Sub1 local5 = (Class26_Sub1_Sub3_Sub1) arg1;
			if (this.aClass20_1 != null && local5.aClass20_1 != null) {
				this.aClass20_1.method5380(local5.aClass20_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class26_Sub1_Sub1_Sub3) {
			@Pc(28) Class26_Sub1_Sub1_Sub3 local28 = (Class26_Sub1_Sub1_Sub3) arg1;
			if (this.aClass20_1 != null && local28.aClass20_2 != null) {
				this.aClass20_1.method5380(local28.aClass20_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afd", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 147)
	@Override
	void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class26_Sub1_Sub3_Sub1) {
			@Pc(5) Class26_Sub1_Sub3_Sub1 local5 = (Class26_Sub1_Sub3_Sub1) arg1;
			if (this.aClass20_1 != null && local5.aClass20_1 != null) {
				this.aClass20_1.method5380(local5.aClass20_1, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof Class26_Sub1_Sub1_Sub3) {
			@Pc(28) Class26_Sub1_Sub1_Sub3 local28 = (Class26_Sub1_Sub1_Sub3) arg1;
			if (this.aClass20_1 != null && local28.aClass20_2 != null) {
				this.aClass20_1.method5380(local28.aClass20_2, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!afd", name = "fb", descriptor = "(I)V", line = 158)
	@Override
	void method21469() {
		this.aBoolean251 = false;
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5326(this.aClass20_1.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afd", name = "fo", descriptor = "()V", line = 158)
	@Override
	void method21481() {
		this.aBoolean251 = false;
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5326(this.aClass20_1.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afd", name = "fl", descriptor = "()V", line = 158)
	@Override
	void method21497() {
		this.aBoolean251 = false;
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5326(this.aClass20_1.method5327() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!afd", name = "p", descriptor = "(B)I", line = 163)
	@Override
	public int method11163() {
		return this.anInt1155 * 327453009;
	}

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "()I", line = 163)
	@Override
	public int method11153() {
		return this.anInt1155 * 327453009;
	}

	@OriginalMember(owner = "client!afd", name = "a", descriptor = "(B)I", line = 167)
	@Override
	public int method11146() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!afd", name = "m", descriptor = "()I", line = 167)
	@Override
	public int method11155() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!afd", name = "v", descriptor = "()I", line = 167)
	@Override
	public int method11164() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!afd", name = "b", descriptor = "()I", line = 171)
	@Override
	public int method11152() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!afd", name = "c", descriptor = "()I", line = 171)
	@Override
	public int method11151() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!afd", name = "g", descriptor = "(I)I", line = 171)
	@Override
	public int method11147() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!afd", name = "l", descriptor = "(B)V", line = 175)
	@Override
	public void method11148() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5328();
		}
	}

	@OriginalMember(owner = "client!afd", name = "z", descriptor = "()V", line = 175)
	@Override
	public void method11162() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5328();
		}
	}

	@OriginalMember(owner = "client!afd", name = "j", descriptor = "()V", line = 175)
	@Override
	public void method11157() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5328();
		}
	}

	@OriginalMember(owner = "client!afd", name = "n", descriptor = "()V", line = 175)
	@Override
	public void method11158() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method5328();
		}
	}

	@OriginalMember(owner = "client!afd", name = "x", descriptor = "(B)Z", line = 179)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!afd", name = "r", descriptor = "()Z", line = 179)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!afd", name = "d", descriptor = "()Z", line = 179)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!afd", name = "h", descriptor = "(I)Z", line = 183)
	@Override
	public boolean method11149() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!afd", name = "e", descriptor = "()Z", line = 183)
	@Override
	public boolean method11154() {
		return this.aBoolean249;
	}

	@OriginalMember(owner = "client!afd", name = "s", descriptor = "(Lclient!de;I)V", line = 187)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		@Pc(24) Class3_Sub1_Sub3 local24;
		if (this.aClass3_Sub1_Sub3_1 == null && this.aBoolean249) {
			@Pc(15) Class576 local15 = this.method10200(arg0, 262144, true);
			local24 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local24 = this.aClass3_Sub1_Sub3_1;
			this.aClass3_Sub1_Sub3_1 = null;
		}
		@Pc(35) Class320 local35 = this.method21431().aClass320_61;
		if (local24 != null) {
			this.aClass438_23.method28191(local24, this.aByte102, (int) local35.aFloat259, (int) local35.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afd", name = "t", descriptor = "(Lclient!de;)V", line = 187)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		@Pc(24) Class3_Sub1_Sub3 local24;
		if (this.aClass3_Sub1_Sub3_1 == null && this.aBoolean249) {
			@Pc(15) Class576 local15 = this.method10200(arg0, 262144, true);
			local24 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local24 = this.aClass3_Sub1_Sub3_1;
			this.aClass3_Sub1_Sub3_1 = null;
		}
		@Pc(35) Class320 local35 = this.method21431().aClass320_61;
		if (local24 != null) {
			this.aClass438_23.method28191(local24, this.aByte102, (int) local35.aFloat259, (int) local35.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afd", name = "u", descriptor = "(Lclient!de;B)V", line = 201)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		@Pc(24) Class3_Sub1_Sub3 local24;
		if (this.aClass3_Sub1_Sub3_1 == null && this.aBoolean249) {
			@Pc(15) Class576 local15 = this.method10200(arg0, 262144, true);
			local24 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local24 = this.aClass3_Sub1_Sub3_1;
			this.aClass3_Sub1_Sub3_1 = null;
		}
		@Pc(35) Class320 local35 = this.method21431().aClass320_61;
		if (local24 != null) {
			this.aClass438_23.method28084(local24, this.aByte102, (int) local35.aFloat259, (int) local35.aFloat261, null);
		}
	}

	@OriginalMember(owner = "client!afd", name = "q", descriptor = "(Lclient!de;)V", line = 201)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		@Pc(24) Class3_Sub1_Sub3 local24;
		if (this.aClass3_Sub1_Sub3_1 == null && this.aBoolean249) {
			@Pc(15) Class576 local15 = this.method10200(arg0, 262144, true);
			local24 = (Class3_Sub1_Sub3) (local15 == null ? null : local15.anObject26);
		} else {
			local24 = this.aClass3_Sub1_Sub3_1;
			this.aClass3_Sub1_Sub3_1 = null;
		}
		@Pc(35) Class320 local35 = this.method21431().aClass320_61;
		if (local24 != null) {
			this.aClass438_23.method28084(local24, this.aByte102, (int) local35.aFloat259, (int) local35.aFloat261, null);
		}
	}
}
