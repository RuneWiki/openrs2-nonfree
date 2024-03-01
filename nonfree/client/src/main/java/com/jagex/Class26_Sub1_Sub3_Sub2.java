package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afn")
public class Class26_Sub1_Sub3_Sub2 extends Class26_Sub1_Sub3 implements Interface43 {

	@OriginalMember(owner = "client!afn", name = "e", descriptor = "[I")
	static final int[] anIntArray177 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!afn", name = "r", descriptor = "[I")
	static final int[] anIntArray176 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!afn", name = "n", descriptor = "Lclient!rc;")
	Class426 aClass426_5;

	@OriginalMember(owner = "client!afn", name = "d", descriptor = "Z")
	boolean aBoolean271 = true;

	@OriginalMember(owner = "client!afn", name = "z", descriptor = "Lclient!pe;")
	public Class387 aClass387_3;

	@OriginalMember(owner = "client!afn", name = "j", descriptor = "Z")
	boolean aBoolean270;

	@OriginalMember(owner = "client!afn", name = "<init>", descriptor = "(Lclient!rp;Lclient!de;Lclient!sj;Lclient!su;IIIIIZIIII)V", line = 29)
	public Class26_Sub1_Sub3_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class457 arg2, @OriginalArg(3) Class467 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class27_Sub1.method7213(arg10, arg11));
		this.aClass387_3 = new Class387(arg1, arg2, arg3, arg10, arg11, arg5, this, arg9, arg12, arg13);
		this.aBoolean270 = arg3.anInt5082 * 1242646151 != 0 && !arg9;
		this.method21480(1);
	}

	@OriginalMember(owner = "client!afn", name = "bs", descriptor = "(B)Z", line = 36)
	@Override
	boolean method21472() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "cp", descriptor = "()Z", line = 36)
	@Override
	boolean method21501() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "cc", descriptor = "()Z", line = 36)
	@Override
	boolean method21491() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "bm", descriptor = "(I)Z", line = 40)
	@Override
	boolean method21467() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!afn", name = "cs", descriptor = "()Z", line = 40)
	@Override
	boolean method21483() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!afn", name = "ct", descriptor = "()Z", line = 40)
	@Override
	boolean method21484() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!afn", name = "cx", descriptor = "()Z", line = 40)
	@Override
	boolean method21468() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!afn", name = "bk", descriptor = "(II)I", line = 44)
	static int method10585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class456.aClass456_5.anInt5061 * 821735799 == arg0 || Class456.aClass456_14.anInt5061 * 821735799 == arg0 ? anIntArray176[arg1 & 0x3] : anIntArray177[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!afn", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 49)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_5;
	}

	@OriginalMember(owner = "client!afn", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 49)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_5;
	}

	@OriginalMember(owner = "client!afn", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 49)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return this.aClass426_5;
	}

	@OriginalMember(owner = "client!afn", name = "cb", descriptor = "()I", line = 53)
	@Override
	public int method21487() {
		return this.aClass387_3.method27367();
	}

	@OriginalMember(owner = "client!afn", name = "cy", descriptor = "()I", line = 53)
	@Override
	public int method21527() {
		return this.aClass387_3.method27367();
	}

	@OriginalMember(owner = "client!afn", name = "bd", descriptor = "(I)I", line = 53)
	@Override
	public int method21508() {
		return this.aClass387_3.method27367();
	}

	@OriginalMember(owner = "client!afn", name = "bb", descriptor = "(B)I", line = 57)
	@Override
	public int method21479() {
		return this.aClass387_3.method27369();
	}

	@OriginalMember(owner = "client!afn", name = "cz", descriptor = "()I", line = 57)
	@Override
	public int method21463() {
		return this.aClass387_3.method27369();
	}

	@OriginalMember(owner = "client!afn", name = "cn", descriptor = "()I", line = 57)
	@Override
	public int method21473() {
		return this.aClass387_3.method27369();
	}

	@OriginalMember(owner = "client!afn", name = "bl", descriptor = "(Lclient!sp;)V", line = 61)
	public void method10582(@OriginalArg(0) Class462 arg0) {
		this.aClass387_3.method27389(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "bt", descriptor = "(Lclient!sp;B)V", line = 61)
	public void method10583(@OriginalArg(0) Class462 arg0) {
		this.aClass387_3.method27389(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "by", descriptor = "(Lclient!sp;)V", line = 61)
	public void method10584(@OriginalArg(0) Class462 arg0) {
		this.aClass387_3.method27389(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "bg", descriptor = "(Lclient!sp;)V", line = 61)
	public void method10586(@OriginalArg(0) Class462 arg0) {
		this.aClass387_3.method27389(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "br", descriptor = "(Lclient!sp;)V", line = 61)
	public void method10587(@OriginalArg(0) Class462 arg0) {
		this.aClass387_3.method27389(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 65)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) Class446 local24 = Class508.method29569(this.aBoolean270);
		@Pc(31) int local31 = (int) local19.aClass320_61.aFloat259 >> 9;
		@Pc(38) int local38 = (int) local19.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class467 local55 = this.aClass387_3.method27370();
		if (local55.aClass323_1 == null) {
			local8.method5352(local16, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local16, null, 0);
			arg0.method17082(local16, this.aClass136Array21[0], local55.aClass323_1);
		}
		if (this.aClass387_3.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_3.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean271 = local8.method5375() || this.aClass387_3.aClass478_7 != null;
		if (this.aClass426_5 == null) {
			this.aClass426_5 = Class445.method28337((int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_5, (int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!afn", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 65)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) Class446 local24 = Class508.method29569(this.aBoolean270);
		@Pc(31) int local31 = (int) local19.aClass320_61.aFloat259 >> 9;
		@Pc(38) int local38 = (int) local19.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class467 local55 = this.aClass387_3.method27370();
		if (local55.aClass323_1 == null) {
			local8.method5352(local16, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local16, null, 0);
			arg0.method17082(local16, this.aClass136Array21[0], local55.aClass323_1);
		}
		if (this.aClass387_3.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_3.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean271 = local8.method5375() || this.aClass387_3.aClass478_7 != null;
		if (this.aClass426_5 == null) {
			this.aClass426_5 = Class445.method28337((int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_5, (int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!afn", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 65)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) Class446 local24 = Class508.method29569(this.aBoolean270);
		@Pc(31) int local31 = (int) local19.aClass320_61.aFloat259 >> 9;
		@Pc(38) int local38 = (int) local19.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class467 local55 = this.aClass387_3.method27370();
		if (local55.aClass323_1 == null) {
			local8.method5352(local16, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local16, null, 0);
			arg0.method17082(local16, this.aClass136Array21[0], local55.aClass323_1);
		}
		if (this.aClass387_3.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_3.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean271 = local8.method5375() || this.aClass387_3.aClass478_7 != null;
		if (this.aClass426_5 == null) {
			this.aClass426_5 = Class445.method28337((int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_5, (int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!afn", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 65)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) Class446 local24 = Class508.method29569(this.aBoolean270);
		@Pc(31) int local31 = (int) local19.aClass320_61.aFloat259 >> 9;
		@Pc(38) int local38 = (int) local19.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class467 local55 = this.aClass387_3.method27370();
		if (local55.aClass323_1 == null) {
			local8.method5352(local16, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local16, null, 0);
			arg0.method17082(local16, this.aClass136Array21[0], local55.aClass323_1);
		}
		if (this.aClass387_3.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_3.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean271 = local8.method5375() || this.aClass387_3.aClass478_7 != null;
		if (this.aClass426_5 == null) {
			this.aClass426_5 = Class445.method28337((int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_5, (int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!afn", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 65)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) Class446 local24 = Class508.method29569(this.aBoolean270);
		@Pc(31) int local31 = (int) local19.aClass320_61.aFloat259 >> 9;
		@Pc(38) int local38 = (int) local19.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local16, local31, local31, local38, local38, true);
		@Pc(55) Class467 local55 = this.aClass387_3.method27370();
		if (local55.aClass323_1 == null) {
			local8.method5352(local16, this.aClass136Array21[0], 0);
		} else {
			local8.method5352(local16, null, 0);
			arg0.method17082(local16, this.aClass136Array21[0], local55.aClass323_1);
		}
		if (this.aClass387_3.aClass478_7 != null) {
			@Pc(90) Class128 local90 = this.aClass387_3.aClass478_7.method28843();
			arg0.method17105(local90);
		}
		this.aBoolean271 = local8.method5375() || this.aClass387_3.aClass478_7 != null;
		if (this.aClass426_5 == null) {
			this.aClass426_5 = Class445.method28337((int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		} else {
			Class352.method26594(this.aClass426_5, (int) local19.aClass320_61.aFloat259, (int) local19.aClass320_61.aFloat260, (int) local19.aClass320_61.aFloat261, local8);
		}
		return local24;
	}

	@OriginalMember(owner = "client!afn", name = "fq", descriptor = "(Lclient!de;)V", line = 90)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 262144, true, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(17) Class322 local17 = this.method21431();
		@Pc(24) int local24 = (int) local17.aClass320_61.aFloat259 >> 9;
		@Pc(31) int local31 = (int) local17.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!afn", name = "fx", descriptor = "(Lclient!de;I)V", line = 90)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		@Pc(8) Class20 local8 = this.aClass387_3.method27399(arg0, 262144, true, true);
		if (local8 == null) {
			return;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(17) Class322 local17 = this.method21431();
		@Pc(24) int local24 = (int) local17.aClass320_61.aFloat259 >> 9;
		@Pc(31) int local31 = (int) local17.aClass320_61.aFloat261 >> 9;
		this.aClass387_3.method27385(arg0, local8, local14, local24, local24, local31, local31, false);
	}

	@OriginalMember(owner = "client!afn", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 101)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_3.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_3.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afn", name = "fv", descriptor = "(Lclient!de;II)Z", line = 101)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_3.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_3.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afn", name = "fy", descriptor = "(Lclient!de;II)Z", line = 101)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = this.aClass387_3.method27370();
		if (local4.aClass323_1 == null) {
			@Pc(27) Class20 local27 = this.aClass387_3.method27399(arg0, 131072, false, false);
			return local27 == null ? false : local27.method5417(arg1, arg2, this.method21433(), false, 0);
		} else {
			return arg0.method17080(arg1, arg2, this.method21433(), local4.aClass323_1);
		}
	}

	@OriginalMember(owner = "client!afn", name = "fu", descriptor = "(B)Z", line = 109)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "fe", descriptor = "()Z", line = 109)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "fw", descriptor = "()Z", line = 109)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!afn", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 113)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afn", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 113)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afn", name = "fb", descriptor = "(I)V", line = 117)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afn", name = "fl", descriptor = "()V", line = 117)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afn", name = "fo", descriptor = "()V", line = 117)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afn", name = "y", descriptor = "()I", line = 121)
	@Override
	public int method11153() {
		return this.aClass387_3.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!afn", name = "p", descriptor = "(B)I", line = 121)
	@Override
	public int method11163() {
		return this.aClass387_3.anInt4745 * -921030407;
	}

	@OriginalMember(owner = "client!afn", name = "u", descriptor = "(B)V", line = 124)
	public static void method10588() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) Class528.aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) Class528.aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!afn", name = "a", descriptor = "(B)I", line = 125)
	@Override
	public int method11146() {
		return this.aClass387_3.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afn", name = "m", descriptor = "()I", line = 125)
	@Override
	public int method11155() {
		return this.aClass387_3.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afn", name = "v", descriptor = "()I", line = 125)
	@Override
	public int method11164() {
		return this.aClass387_3.anInt4750 * -2124800661;
	}

	@OriginalMember(owner = "client!afn", name = "g", descriptor = "(I)I", line = 129)
	@Override
	public int method11147() {
		return this.aClass387_3.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afn", name = "b", descriptor = "()I", line = 129)
	@Override
	public int method11152() {
		return this.aClass387_3.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afn", name = "c", descriptor = "()I", line = 129)
	@Override
	public int method11151() {
		return this.aClass387_3.anInt4747 * -1918233657;
	}

	@OriginalMember(owner = "client!afn", name = "z", descriptor = "()V", line = 132)
	@Override
	public void method11162() {
	}

	@OriginalMember(owner = "client!afn", name = "j", descriptor = "()V", line = 132)
	@Override
	public void method11157() {
	}

	@OriginalMember(owner = "client!afn", name = "l", descriptor = "(B)V", line = 132)
	@Override
	public void method11148() {
	}

	@OriginalMember(owner = "client!afn", name = "n", descriptor = "()V", line = 132)
	@Override
	public void method11158() {
	}

	@OriginalMember(owner = "client!afn", name = "x", descriptor = "(B)Z", line = 135)
	@Override
	public boolean method11150() {
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "d", descriptor = "()Z", line = 135)
	@Override
	public boolean method11161() {
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "r", descriptor = "()Z", line = 135)
	@Override
	public boolean method11160() {
		return true;
	}

	@OriginalMember(owner = "client!afn", name = "e", descriptor = "()Z", line = 139)
	@Override
	public boolean method11154() {
		return this.aClass387_3.method27373();
	}

	@OriginalMember(owner = "client!afn", name = "h", descriptor = "(I)Z", line = 139)
	@Override
	public boolean method11149() {
		return this.aClass387_3.method27373();
	}

	@OriginalMember(owner = "client!afn", name = "s", descriptor = "(Lclient!de;I)V", line = 143)
	@Override
	public void method11156(@OriginalArg(0) Class21 arg0) {
		this.aClass387_3.method27374(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "t", descriptor = "(Lclient!de;)V", line = 143)
	@Override
	public void method11165(@OriginalArg(0) Class21 arg0) {
		this.aClass387_3.method27374(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "u", descriptor = "(Lclient!de;B)V", line = 147)
	@Override
	public void method11159(@OriginalArg(0) Class21 arg0) {
		this.aClass387_3.method27375(arg0);
	}

	@OriginalMember(owner = "client!afn", name = "q", descriptor = "(Lclient!de;)V", line = 147)
	@Override
	public void method11145(@OriginalArg(0) Class21 arg0) {
		this.aClass387_3.method27375(arg0);
	}
}
